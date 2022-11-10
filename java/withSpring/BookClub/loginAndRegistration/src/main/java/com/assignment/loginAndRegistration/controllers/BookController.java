package com.assignment.loginAndRegistration.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.loginAndRegistration.models.Book;
import com.assignment.loginAndRegistration.services.BookService;
import com.assignment.loginAndRegistration.services.UserService;



@Controller
public class BookController {
	
	@Autowired
	private UserService userServ;
	
	@Autowired
	private BookService bookService;
	

	 
	@GetMapping("/books")
	public String books(HttpSession session, Model model) {
	 
		// If no userId is found, redirect to logout
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		
		// We get the userId from our session (we need to cast the result to a Long as the 'session.getAttribute("userId")' returns an object
		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("user", userServ.findById(userId));
		
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
		
	    return "books.jsp";
	    
	}
	 
	@RequestMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model model,
			HttpSession session
			) throws IOException {
	     Book book = bookService.findBook(id);
	     if(book.getTitle() != null) {
	    	 model.addAttribute("book", book);
	     }
		 Long userId = (Long) session.getAttribute("userId");
		 model.addAttribute("userId", userServ.findById(userId));
	     return "show.jsp";
	 }
	 
	@GetMapping("/addBook")
	public String addBook(
			HttpSession session, 
			Model model,
			@ModelAttribute("book") Book book
			) {
		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("user", userServ.findById(userId));
	    return "add.jsp";
	}
	
	@PostMapping("/newBook")
	public String createBook(
		@Valid @ModelAttribute("book") Book book,
		BindingResult result) throws SQLException {
        if (result.hasErrors()) {
    	    return "add.jsp";
        } else {
        	bookService.createBook(book, result);
            return "redirect:/books";
        }
	    
	}

    @GetMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "edit.jsp";
    }
	   
    @PutMapping("/updateBook/{id}")
    public String updateDojo(@Valid @ModelAttribute("book") Book book,
		BindingResult result,
		@ModelAttribute("id") Long id,
		@RequestParam(value="title") String title,
		@RequestParam(value="author") String author,
		@RequestParam(value="thought") String thought
		)throws SQLException {
    	
    	if (result.hasErrors())  {
           return "edit.jsp";
           
       } else {
    	   bookService.updateBook(id, title, author, thought);
           return "redirect:/show/{id}";
       }
    	
    }
    
    @DeleteMapping("/deleteBook/{id}")
    public String destroyBook(@Valid @PathVariable("id") Long id) {
 	   bookService.deleteBook(id);
        return "redirect:/books";
    }

    
}

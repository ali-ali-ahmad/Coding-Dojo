package com.assignment.loginAndRegistration.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.assignment.loginAndRegistration.models.Book;
import com.assignment.loginAndRegistration.repositories.BookRepository;



@Service
public class BookService {
 // adding the book repository as a dependency
	private final BookRepository bookRepository;
	 
	 public BookService(BookRepository bookRepository) {
	     this.bookRepository = bookRepository;
	 }
	 
	 // returns all the books
	 public List<Book> allBooks() {
	     return bookRepository.findAll();
	 }
	 
	 // creates a book
	 public Book createBook(Book b, BindingResult result) {
		 
    	if(result.hasErrors()) {
    		return null;
    	}
    	else {
        	return bookRepository.save(b);
    	}

	 }
	 
	 // retrieves a book
	 public Book findBook(Long id) {
	     Optional<Book> optionalBook = bookRepository.findById(id);
	     if(optionalBook.isPresent()) {
	         return optionalBook.get();
	     } else {
	         return null;
	     }
	 }
	 
	public Book updateBook(Long id, String title, String author, String thought) {
	     Book book = findBook(id);
	     if(book.getId()==id) {
	    	 book.setTitle(title);
	    	 book.setAuthor(author);
	    	 book.setThought(thought);
	    	 return createBook(book, null);
	     }
	     else {
	    	 return null;
	     }
	}

	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}

}



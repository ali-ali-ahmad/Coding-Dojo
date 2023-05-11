package com.assignment.savetravels.controller;




import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

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

import com.assignment.savetravels.models.Expense;
import com.assignment.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	 private final ExpenseService expenseService;
	 public ExpenseController(ExpenseService expenseService){
	     this.expenseService = expenseService;
	 }
	 
	 
	 
	 
	@GetMapping("/")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
      List<Expense> expenses = expenseService.allExpenses();
      model.addAttribute("expenses", expenses);
	    return "index.jsp";
	}
	
	@PostMapping("/new")
	public String create(
			@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result) {
	        if (result.hasErrors()) {
	    	    return "index.jsp";
	        } else {
	            expenseService.createExpense(expense);
	            return "redirect:/";
	        }
	    
	}

	
    @GetMapping("/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Expense expense = expenseService.findExpense(id);
        model.addAttribute("expense", expense);
        return "edit.jsp";
    }
    
    @PutMapping("/{id}/edit")
    public String update(@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result,
			@ModelAttribute("id") Long id,
			@RequestParam(value="name") String name,
			@RequestParam(value="vendor") String vendor,
			@RequestParam(value="amount") Double amount,
			@RequestParam(value="description") String desc)
    		throws SQLException {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
        	expenseService.updateExpense(id, name, vendor, amount, desc);
            return "redirect:/{id}";
        }
    }
    
//    @PutMapping("/{id}/edit")
//    public String update(@Valid @ModelAttribute("id") Long id, BindingResult result1, @RequestParam(value="name") String name, @RequestParam(value="vendor") String vendor, @RequestParam(value="amount") Double amount, @RequestParam(value="description") String desc)
//    		throws SQLException {
//        if (result1.hasErrors()) {
//        	System.out.println("hiiiiiiiiiiiiiiiiiiiii");
//            return "edit.jsp";
//        } else {
//        	expenseService.updateExpense(id, name, vendor, amount, desc);
//            return "redirect:/{id}";
//        }
//    }
    
    @DeleteMapping("/delete/{id}")
    public String destroy(@Valid @PathVariable("id") Long id) {
    	expenseService.deleteExpense(id);
        return "redirect:/";
    }
    

	 @RequestMapping("/show/{id}")
	 public String show(@PathVariable("id") Long id, Model model) throws IOException {
	     Expense expense = expenseService.findExpense(id);
	     if(expense.getName() != null) {
	    	 model.addAttribute("name", expense.getName());
	    	 model.addAttribute("vendor", expense.getVendor());
	    	 model.addAttribute("amount", expense.getAmount());
	    	 model.addAttribute("desc", expense.getDescription());
	     }
	     return "show.jsp";
	 }


}

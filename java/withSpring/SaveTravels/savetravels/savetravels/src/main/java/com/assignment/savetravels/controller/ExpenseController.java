package com.assignment.savetravels.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

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
//	    	expenseService.createExpense(expense);
	        if (result.hasErrors()) {
	    	    return "index.jsp";
	        } else {
	            expenseService.createExpense(expense);
	            return "redirect:/";
	        }
	    
	}
//    @RequestMapping("/")
//    public String index(Model model) throws IOException {
//    	
//        List<Expense> expenses = expenseService.allExpenses();
//        model.addAttribute("expenses", expenses);
//
//        return "index.jsp";
//    }
//    
//    
//    @PostMapping("/expenses")
//    public String create(
//    	    @RequestParam("name") String name,
//    	    @RequestParam("vendor") String vendor,
//    	    @RequestParam("amount") Integer amount,
//    	    @RequestParam("description") String description)
//    {
//
//	        Expense expense = new Expense(name, vendor, amount, description);
//	        expenseService.createExpense(expense);
//	        return "redirect:/";
//    }

}

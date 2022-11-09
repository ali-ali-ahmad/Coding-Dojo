package com.assignment.productsAndCategories.controllers;


import java.sql.SQLException;
import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.productsAndCategories.models.Category;
import com.assignment.productsAndCategories.models.Product;
import com.assignment.productsAndCategories.services.CategoryService;
import com.assignment.productsAndCategories.services.ProductService;



@Controller
public class MainController {
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	 public MainController(ProductService productService, CategoryService categoryService){
	     this.productService = productService;
	     this.categoryService = categoryService;
	 }
	 
	 
	@GetMapping("/")
	public String index(
			@ModelAttribute("product") Product product,
			@ModelAttribute("category") Category category,
			Model model) {
     List<Product> products = productService.allProducts();
     List<Category> categories = categoryService.allCategories();
     
//     List<Product> productsCategory = productService.allByCategories(category);
//     List<Category> categoriesProduct = categoryService.allByProducts(product);
     model.addAttribute("products", products);
     model.addAttribute("categories", categories);
//     model.addAttribute("productsCategory", productsCategory);
//     model.addAttribute("categoriesProduct", categoriesProduct);
	    return "index.jsp";
	}
	
	@PostMapping("/newProduct")
	public String create_product(
		@Valid @ModelAttribute("product") Product product,
		BindingResult result) throws SQLException {
        if (result.hasErrors()) {
    	    return "index.jsp";
        } else {
        	productService.createProduct(product);
            return "redirect:/";
        }
	    
	}
	
	@PostMapping("/newCategory")
	public String create_category(
			@Valid @ModelAttribute("category") Category category,
			BindingResult result) throws SQLException {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			categoryService.createCategory(category);
			return "redirect:/";
		}
		
	}
	
//	@GetMapping("/showProduct/{id}")
//	public String showProduct(
//			Model model,
//			@ModelAttribute("product") Product product, 
//			@ModelAttribute("category") Category category,
//			@PathVariable("id") Long id
//			) {
//     model.addAttribute("products", productService.findProduct(id));
//	    return "showProduct.jsp";
//	}
//	
//	@GetMapping("/showCategory/{id}")
//	public String showCategory(
//			Model model,
//			@ModelAttribute("product") Product product, 
//			@ModelAttribute("category") Category category,
//			@PathVariable("id") Long id
//			) {
//		model.addAttribute("categories", categoryService.findCategory(id));
//		return "showCategory.jsp";
//	}

	   @GetMapping("/editProduct/{id}")
	   public String editProduct(@PathVariable("id") Long id, Model model) {
		   Product product = productService.findProduct(id);
	       model.addAttribute("product", product);
		    List<Category> categories = categoryService.allCategories();
		    model.addAttribute("categories", categories);
	       return "editProduct.jsp";
	   }
	   
	   
	   @PutMapping("/updateProduct/{id}")
	   public String updateProduct(@Valid @ModelAttribute("product") Product product,
				BindingResult result,
				@ModelAttribute("id") Long id,
				@RequestParam(value="name") String name,
				@RequestParam(value="description") String description,
				@RequestParam(value="price") Double price,
				@RequestParam(value="category") List<Category> category
				)throws SQLException {
	       if (result.hasErrors())  {
	           return "editproduct.jsp";
	       } else {
	    	   productService.updateProduct(id, name, description, price, category);
	           return "redirect:/";
	       }
	   }
	   
	   @GetMapping("/editCategory/{id}")
	   public String editCategory(@PathVariable("id") Long id, Model model) {
		   Category category = categoryService.findCategory(id);
		   List<Product> products = productService.allProducts();
		     model.addAttribute("products", products);
		   model.addAttribute("category", category);
		   return "editCategory.jsp";
	   }


		
	   @PutMapping("/updateCategory/{id}")
	   public String updateCategory(@Valid @ModelAttribute("category") Category category,
			   BindingResult result,
			   @ModelAttribute("id") Long id,
			   @RequestParam(value="name") String name,
			   @RequestParam(value="product") List<Product> product
			   ) throws SQLException {
		   if (result.hasErrors())  {
			   return "editcategory.jsp";
		   } else {
			   categoryService.updateCategory(id, name, product);
			   return "redirect:/show/{id}";
		   }
	   }
   
   
   
   @DeleteMapping("/deleteProduct/{id}")
   public String destroyProduct(@Valid @PathVariable("id") Long id) {
	   productService.deleteProduct(id);
       return "redirect:/";
   }
   
   @DeleteMapping("/deleteCategory/{id}")
   public String destroyCategory(@Valid @PathVariable("id") Long id) {
	   categoryService.deleteCategory(id);
	   return "redirect:/show/{id}";
   }
   
	
}




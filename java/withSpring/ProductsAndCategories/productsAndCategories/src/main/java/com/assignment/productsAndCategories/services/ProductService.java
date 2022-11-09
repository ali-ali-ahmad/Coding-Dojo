package com.assignment.productsAndCategories.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assignment.productsAndCategories.models.Category;
import com.assignment.productsAndCategories.models.Product;
import com.assignment.productsAndCategories.repositories.ProductRepository;






@Service
public class ProductService {

	private final ProductRepository productRepository;
    
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> allProducts() {
        return productRepository.findAll();
    }
    
    public List<Product> allByCategories(Category category) {
    	return productRepository.findAllByCategories(category);
    }
    
    public List<Product> productsNotContains(Category category) {
    	return productRepository.findByCategoriesNotContains(category);
    }

    public Product createProduct(Product b) {
        return productRepository.save(b);
    }

    public Product findProduct(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            return null;
        }
    }
    
	public Product updateProduct(Long id, String name, String description, Double price, List<Category> category) {
		Product product = findProduct(id);
	     if(product.getId()==id) {
	    	 product.setName(name);
	    	 product.setDescription(description);
	    	 product.setPrice(price);
//	    	 product.getCategories().add(category);
	    	 product.setCategories(category);
	    	 return createProduct(product);
	     }
	     else {
	    	 return null;
	     }
	}
	
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
}




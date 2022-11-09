package com.assignment.productsAndCategories.services;




import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assignment.productsAndCategories.models.Category;
import com.assignment.productsAndCategories.models.Product;
import com.assignment.productsAndCategories.repositories.CategoryRepository;


@Service
public class CategoryService {

	private final CategoryRepository categoryRepository;
    
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }
    
    public List<Category> allByProducts(Product product) {
    	return categoryRepository.findAllByProducts(product);
    }
    
    public List<Category> productsNotContains(Product product) {
    	return categoryRepository.findByProductsNotContains(product);
    }

    public Category createCategory(Category b) {
        return categoryRepository.save(b);
    }

    public Category findCategory(Long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isPresent()) {
            return optionalCategory.get();
        } else {
            return null;
        }
    }
    
	public Category updateCategory(Long id, String name, List<Product> product) {
		Category category = findCategory(id);
	     if(category.getId()==id) {
	    	 category.setName(name);
	    	 category.getProducts().add((Product) product);
//	    	 category.setProducts(product);
	    	 return createCategory(category);
	     }
	     else {
	    	 return null;
	     }
	}
	
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}




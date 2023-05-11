<h1>Products and Categories</h1>

<p>In this assignment, you will be creating an application that will keep track of products and categories</p>

<p>Objectives:</p>
<ul>
    <li>Implement a typical many-to-many relationship</li>
    <li>Become more familiar with JPA methods as applied to n:m relationships.</li>
</ul>

<p><strong>ERD and Wireframe</strong></p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/withSpring/ProductsAndCategories/screenshots/pic1.jpg"/>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/withSpring/ProductsAndCategories/screenshots/pic2.jpg"/>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/withSpring/ProductsAndCategories/screenshots/pic3.jpg"/>

<h2>CategoryRepository</h2>

<p>Some derived queries you may need to get you started...</p>

```java
    // Retrieves a list of all categories for a particular product
    List<Category> findAllByProducts(Product product);
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Category> findByProductsNotContains(Product product);
```

<h3>Note: No Middle Model Needed</h3>

<p>For this assignment you need only implement two models: <code>Product</code> and <code>Category</code>. Since there is no extra data required for the relationship, you do not need a middle model, that is, you do not need a class to handle the joiner table in the database.</p>

<p>To Do List:</p>
<ul>
    <li>Allow users to create a product.</li>
    <li>Allow users to create a new category.</li>
    <li>In the products show page, allow users to add a category to a specific product.</li>
    <li>In the categories show page, allow users to add a product to a specific category</li>
</ul>



<h1>Rendering All Books</h1>

<p>Objectives:</p>
<ul>
    <li>Practice retrieving records from the database</li>
    <li>Become more familiar with the data format of JPA queries (Lists and objects)</li>
    <li>Be able to pass lists of objects to the view model and render a list of objects from a JSP page to display in the browser.</li>
    <li>Practice using JSTL <code>forEach</code> loops to render data dynamically in html format.</li>
</ul>

<h3>All Books</h3>

<p>Let's add a new route to our BookController, "/books". When a user visits "/books", we want to show them all the books that we have in our database.</p>

<p><strong>src/main/java/com/codingdojo/mvc/controllers/BooksController.java</strong></p>

```java
// ... imports removed for brevity
@Controller
public class BooksController {
    private final BookService bookService;
    
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "/books/index.jsp";
    }
}
```

<h2>Putting Everything on the Table</h2>

<p>Next let's show each book as a row in a table on the page that includes the ID, title, language and number of pages. Here's an example of what your page should look like, rendering book data, dynamically from your database.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/withSpring/RenderingAllBooks/screenshots/pic1.jpg"/>

<p>For a review of how to write JSTL for loops make sure to revisit the JSTL Loops And You lesson and review your Fruity Loops assignment.</p>

<p><strong>src/main/webapp/WEB-INF/books/index.jsp</strong></p>

```html
<%@taglib prefix="c" uri="<a href="http://java.sun.com/jsp/jstl/core">http://java.sun.com/jsp/jstl/core</a>"%>    
<h1>All Books</h1>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
         <!-- loop over all the books to show the details as in the wireframe! -->
    </tbody>
</table>
```

<h2>Ninja Bonus:</h2>

<p>As an extra challenge, make the title for each book be an anchor tag that navigates to the details for the book using your "/books/2" route!</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/withSpring/RenderingAllBooks/screenshots/pic2.jpg"/>

<p>To Do List:</p>
<ul>
    <li>Add a route /books that calls on the service to retrieve all the books.</li>
    <li>Use the view model to make all the books available to render in your index.jsp</li>
    <li>Build a JSTL forEach loop to render each row of the table with the information about a book.</li>
    <li>Ninja Bonus: Make each title a link that navigates to the details page for that particular book.</li>
</ul>



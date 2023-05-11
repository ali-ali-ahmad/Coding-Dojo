<h1>Hopper's Receipt</h1>

<p>Grace Hopper is giving a talk at MIT. But first she needs to order some thin metal wires to <a href="https://en.wikipedia.org/wiki/Grace_Hopper#Anecdotes">represent nanoseconds</a> to help her audience understand the speed of signals. As it happens, Market2, a new third-party purchasing app has all her needs covered, as well as anyone else who needs to order from a small local business.</p>

<h2>Assignment:</h2>

<p>For this assignment we will take data from our controller and render it to show a receipt for a single item purchase.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/withSpring/HoppersReceipt/screenshots/pic.jpg"/>

<h2>Controller starter code:</h2>

```java
// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
    
        return "index.jsp";
    }
    //...
    
```

<h2>Quick Tips for Debugging:</h2>

<ul>
    <li>Check that you've added the correct dependencies for rendering JSP and JSTL in both your <code>pom.xml</code> and <code>index.jsp</code> files.</li>
</ul>

```xml
    	<dependency>
                <groupId>org.apache.tomcat.embed</groupId>
                <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
		<dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>jstl</artifactId>
        </dependency>
```

<p>And in your <strong>index.jsp</strong>:</p>

```jsp
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
```

<ul>
    <li>Be sure you have a <code>WEB-INF</code> folder within your webapp folder, and that it is added to the configurations in your <code>application.properties</code> file so Tomcat knows where to look:</li>
</ul>

```
spring.mvc.view.prefix=/WEB-INF/
```

<ul>
    <li>Double check the <code>@Controller</code> annotation in your controller is presen</li>
    <li>Check your imports.</li>
    <li>If values aren't showing up on the page, double check the key value pair names from your controller to the variable names used in your template (index.jsp) and also double-check the <code>c:out</code> tag syntax.</li>
</ul>

<p>To Do List:</p>
<ul>
    <li>Create a new Spring Starter Project.</li>
    <li>Create a controllers package and a controller within it</li>
    <li>Go through all the set up requirements for adding JSP and JSTL to your project</li>
    <li>Render the purchase information on the page.</li>
    <li>Change the variable values from "Grace Hopper" etc. to other values to thoroughly test your code.</li>
</ul>



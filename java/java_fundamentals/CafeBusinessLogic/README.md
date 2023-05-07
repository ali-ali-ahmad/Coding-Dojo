<h1>Cafe Business Logic</h1>

<p>Now that you've familiarized yourself with Java a bit, you decided you really wanted to try and find an internship working on Cafe Java's dev team. After applying, you were sent descriptions of requested behavior for each of the methods needed for creating the <code>CafeUtil</code> library for their application, as well as some sample test cases.</p>

<p>Objectives:</p>
<ul>
    <li>Write methods to solve basic business logic problems in Java.</li>
    <li>Practice <code>Array</code> and <code>ArrayList</code>.</li>
    <li>Practice <code>loops</code>.</li>
    <li>Understand the difference between printing and returning a value from a method.</li>
    <li>Create your own methods file</li>
    <li>Write a test file, and create an instance of another class to test the functionality.</li>
</ul>

<hr>

<h2>CafeUtil File and TestCafe File</h2>

<p>For this assignment you will have two files, <code>CafeUtil.java</code> and <code>TestCafe.java</code>. You will be writing all your methods inside the <code>CafeUtil</code> class. The second file is a test file, <code>TestCafe.java</code> that includes the <code>main</code> method. We have provided the code in its entirety for testing, and you can copy and paste from it from the bottom of this module, but be sure to instantiate your class in the testing file!</p>

<h2>Assignment:</h2>

<p>Implement the four methods below. Important: Code all of the following methods in your <code>CafeUtil.java</code> file. </p>

<hr/>

<p><strong>int getStreakGoal()</strong></p>
<p>Each week, a customer needs to purchase 1 more drink than they bought the previous week to get some free drinks after 10 weeks. For this method, <strong>sum together every integer from 1 to 10 and return the sum</strong> after it has been calculated. </p>
<p><strong>Ninja Bonus:</strong>  Add a parameter, <code>numWeeks</code> so that an admin can change the number from 10 to whatever they want.</p>

<hr/>

<p><strong>double getOrderTotal(double[] prices)</strong></p>
<p>Given an array of order prices, sum the prices and return the total.</p>

<hr/>

<p><strong>void displayMenu(ArrayList&lt;String&gt; menuItems)</strong></p>
<p>Given an <code>ArrayList</code> of menu items (strings), print out each index and menu item.</p>
<p>Sample output, with the argument <code>{ "drip coffee", "cappuccino", "latte", "mocha" }</code> :</p>

```
0 drip coffee
1 cappuccino
2 latte
3 mocha
```
<h3>Re-cap of ArrayList Syntax:</h3>

```java
String name = myArray.get(0); // to access an element in an ArrayList using an index
```

<hr/>

<p><strong>addCustomer(ArrayList&lt;String&gt;)</strong></p>
<p>For this method:</p>
1. <p>Print this string to the console: "Please enter your name:"</p>
2. <p>Then add this line of code to get their answer and store it in the variable <code>userName</code>:</p>

```java
String userName = System.console().readLine();
```
3. <p>Next print the userName to the console, saying "Hello, [user name here]!"</p>
4. <p>Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)</p>
5. <p>Then, add the customer's name to the given customers list. And print the list.</p>
6. <p>No need to return anything.</p>

<p><strong>Re-cap of ArrayList Syntax:</strong></p>

```java
myArray.add("Heidi"); // to add an item to an ArrayList
```

<hr/>

<h2>How to Test: Test Early and Test Often</h2>

<p>Write and test each method one at a time. A good strategy for developing software is to code only a little and test. As they say, "Test early and test often." Go ahead and use the following code in your TestCafe.java file to test your methods by uncommenting the method you are testing. Test one at a time.</p>

<p>Note:   <code>//</code> are for single line comments and   <code>/* ...comments... */</code>  are for multi-line comments.</p>

<p><strong>TestCafe.java</strong></p>

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    public static void main(String[] args) {
        
    /* 
      You will need add 1 line to this file to create an instance 
      of the CafeUtil class. 
      Hint: it will need to correspond with the variable name used below..
    */
    	
        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());
    
        // System.out.println("----- Order Total Test-----");
        // double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        // System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        // System.out.println("----- Display Menu Test-----");
        
        // List<String> loadMenu = Arrays.asList(
        //     "drip coffee",
        //     "cappucino",
        //     "latte",
        //     "mocha"
        // );
        // ArrayList<String> menu = new ArrayList<String>();
        // menu.addAll(loadMenu);
        // appTest.displayMenu(menu);
    
        // System.out.println("\n----- Add Customer Test-----");
        // ArrayList<String> customers = new ArrayList<String>();
        // // --- Test 4 times ---
        // for (int i = 0; i < 4; i++) {
        //     appTest.addCustomer(customers);
        //     System.out.println("\n");
        // }
    }
}
```

<h3>Testing Example</h3>

<p>Note: The output does not need to be formatted exactly the same as the given examples, as long as all the information is provided.</p>

![Alt Text](https://github.com/alirabah93/Coding-Dojo/blob/master/java/java_fundamentals/CafeBusinessLogic/screenshots/gif.gif)

<h2>Ninja Bonuses!</h2>

<hr/>

<h2>void printPriceChart(String product, double price, int maxQuantity)</h2>

<p>Given a <code>product</code>, <code>price</code> and a <code>maxQuantity</code>, create a method that prints the cost for buying 1, then the price for buying 2, then for 3.. and so on, up to the max. For example, if the <code>product</code> is "Columbian Coffee Grounds" with a <code>price</code> of 15.0 and <code>maxQuantity</code> of 3, you should print:</p>

```
Columbian Coffee Grounds
1 - $15.00
2 - $30.00
3 - $45.00
```

<p>Tip: You can use the escape character <code>\n </code>within your string for line breaks.</p>

<p><strong>Sensei bonus:</strong>  Format the prices as currency.</p>

<p>Hint: <a href="https://docs.oracle.com/javase/tutorial/java/data/numberformat.html">number format</a></p>

<p><strong>Senpai Bonus:</strong> Take $0.50 more off of the original price every time the quantity increases. Example: Given a $2.00 price and 4 max, where the prices would normally be $2, $4, $6 and $8, the discount would yield $2, $3.50, $5, and $6.50, progressively taking off $0.50, then $1, then $1.50 from the group tag price:</p>

```
1 - $2.00
2 - $3.50 
3 - $5.00 
4 - $6.50
```

<hr/>

<h2>boolean displayMenu(ArrayList;String&gt; menuItems, ArrayList&lt;Double&gt; prices)</h2>

<p>Let's overload the display menu! Given 2 arrays, an ArrayList of menu items (strings), and an ArrayList of prices (doubles) print a menu! </p>

<p>However, first check:  if the arrays are not the same size, immediately return false.</p>

<p>To print the menu, iterate from 0 to the last index. Each time through, print on the same line:</p>

<ul>
    <li>a.) The index, b.) The menu item at that index, and c.) The price at that index.</li>
</ul>

<p>Finally, return true.</p>

<p>Sample output:</p>

```
0 drip coffee -- $1.50
1 cappucino -- $3.50
2 latte -- $4.50
3 mocha -- $3.50 
```

<hr/>

<h3>Sensei Bonus!</h3>

<p>Make a method <code>addCustomers</code> where a barista can enter multiple customers. Hint: You can use a while loop and ask the user to type "q" when they are finished entering names.</p>

<p>To Do List:</p>
<ul>
    <li>Create a CafeUtil class and a testing file.</li>
    <li>Implement the getStreakGoal method and test.</li>
    <li>Implement the printPriceChart method and test.</li>
    <li>Implement the getOrderTotal method and test.</li>
    <li>Implement the displayMenu method and test.</li>
    <li>Implement the addCustomer method and test.</li>
</ul>



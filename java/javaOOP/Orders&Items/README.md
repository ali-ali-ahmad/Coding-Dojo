<h1>Orders & Items</h1>

<p>Objectives:</p>
<ul>
    <li>Use another class file to help store data related to the app in a more organized way.</li>
    <li>Understand the value of grouping data together in a class to perform similar operations.</li>
    <li>Set member variables inside a class file</li>
    <li>Be able to instantiate a new instance of a class (initialize a custom data type).</li>
</ul>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/javaOOP/Orders%26Items/screenshots/pic.jpg"/>

<p>Let's take Cafe Java to the next level and add in some custom data types! Create 2 new classes <code>Order</code> and <code>Item</code>. They should have the following member variables:</p>

<h2>Item class member variables:</h2>

<ul>
    <li>String name</li>
    <li>double price</li>
</ul>

<h2>Order class member variables:</h2>

<ul>
    <li>String name</li>
    <li>double total</li>
    <li>boolean ready</li>
    <li>ArrayList&lt;Item&gt; items</li>
</ul>

<p>Of course, you will also need to demo its capabilities for the dev team, so make a <code>TestOrders</code> class to do this. Tip! When creating <code>new</code> instances don't forget the new keyword for instantiating objects!</p>

```java
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    
        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
```

<p>To Do List:</p>
<ul>
    <li>Create the Item class with the member variables listed above.</li>
    <li>Create the Order class with the member variables listed above.</li>
    <li>Create the testing file TestOrders and complete the rest of the tasks inside the testing file.</li>
    <li>Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc.</li>
    <li>Set the price and the name for each -- "mocha", "latte", "drip coffee" and "capuccino" (price is up to you!)</li>
    <li>Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2 etc.</li>
    <li>Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam".</li>
    <li>Print the order1 variable to the console to see what happens.</li>
    <li>Predict what will happen if you print order1.total</li>
    <li>Add item1 to order2's item list and increment the order's total.</li>
    <li>order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.</li>
    <li>order4 added a latte. Update accordingly.</li>
    <li>Cindhuri’s order is now ready. Update her status.</li>
    <li>Sam ordered more drinks - 2 lattes. Update their order as well.</li>
    <li>Jimmy’s order is now ready. Update his status.</li>
</ul>



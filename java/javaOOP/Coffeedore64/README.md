<h1>Coffeedore 64</h1>

<p>So far, we've modularized our original Cafe Java and Business Logic code so that the codebase stores data in a tidy way that is more analogous to real life. We now are storing specific types of things that can do stuff, or rather, object instances that can invoke class methods. Now we're going to make our interactions between these objects a bit more dynamic, by adding user interactivity!</p>

<p>Objectives:</p>
<ul>
    <li>Be able to use multiple classes together</li>
    <li>Instantiate object instances of classes within a different class.</li>
    <li>Use class methods to manipulate object instances within a different class.</li>
    <li>Use overloaded constructors</li>
    <li>Implement user interactivity</li>
</ul>

<h2>Assignment</h2>

<p>Now that you've shown the capabilities of your code, the Cafe Java owners want you to make it a full-fledged interactive app. However, they want it to be retro, like an old computer, an Apple II or Commodore 64, where users are shown some text questions in a terminal and can answer or press 'q' to quit. Here's an example of what it will look like:</p>

![Alt Text](https://github.com/alirabah93/Coding-Dojo/blob/master/java/javaOOP/Coffeedore64/screenshots/gif.gif)

<p>We'll be using the code base we already have but will be adding one member variable to the <code>Item</code> class, <code>int index</code>. Don't forget to give it a getter and setter.</p>

<p>To tie it all together and add some interactivity, you will create a new class called <code>CoffeeKiosk</code></p>

<h2>Adding a New CoffeeKiosk Class:</h2>

<h4>Member variables:</h4>

<ul>
    <li>ArrayList&lt;Item&gt; menu</li>
    <li>ArrayList&lt;Order&gt; orders</li>
</ul>

<h4>Constructors:</h4>

<ul>
    <li>Constructor - no params, initializes items and orders to empty arrays.</li>
</ul>

<h4>Methods:</h4>

<ul>
    <li>
        <p><code>addMenuItem</code></p>
        <ul>
            <li>The addMenuItem method should create a new item object with the given name and price.</li>
            <li>Add the new Item object to the menu items array.</li>
            <li>The new menu item itself will also need to be assigned an index property. The value should be its position, its index, in the menu array.</li>
        </ul>
    </li>
</ul>

<ul>
    <li>
        <p><code>displayMenu</code></p>
        <ul>
            <li>Now with an array of items you can display the menu without needing separate arrays of names and prices!</li>
            <li>The displayMenu method should display all of the items from the menu array like so:</li>
        </ul>
    </li>
</ul>

```
0 banana -- $2.00 
1 coffee -- $1.50 
2 latte -- $4.50 
3 capuccino -- $3.00 
4 muffin -- $4.00
```

<ul>
    <li>
        <p><code>newOrder</code></p>
        <ul>
            <li>The newOrder method will take input from the user in the terminal to create a new order instance and add it to the orders array. We have given you some code to get you started.</li>
            <li>
                <p>Tips:</p>
                <ul>
                    <li>The console input will be of type <code>String</code>, no matter what the user types into the console.</li>
                    <li>You can use the built in String <code>.equals()</code> method to do string comparison, rather than the <code>==</code> comparison operator.</li>
                    <li>To cast the string to an integer, use the <code>Integer.parseInt()</code> method.</li>
                    <li>Flex those Documentation reading skills!</li>
                </ul>
            </li>
        </ul>
    </li>
</ul>

```java
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        
    }
```

<h4>NINJA BONUS:</h4>

<ul>
    <li>
        <p><code>addMenuItemByInput</code>
        <ul>
            <li>Create a method that lets an admin add menu items manually, using what you now know about getting user input.</li>
        </ul>
    </li>
</ul>

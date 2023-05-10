<h1>Barista's Challenge</h1>


<p>Now that you have made the <code>Order</code> and <code>Item</code> classes, and the data is better organized and easier to manipulate, we're going to refactor your business logic even further to be able to perform the some of that simulated functionality inside of the <code>Order</code> class by adding methods, constructors, setters and getters. </p>

<p>Since we'll be doing the same sorts of actions with every order, we can define methods within the <code>Order</code> class that will work on any order, with distinct customer names, items and totals. Each time a method gets called, it will manipulate only the data stored for that particular order.</p>

<h2>Inside the Item class:</h2>

<h4>Private Member Variables:</h4>

<ul>
    <li>Set the member variables to <code>private</code> instead of  <code>public</code>.</li>
</ul>

<h4>Accessors & Mutators (Getters and Setters):</h4>

<ul>
    <li>Create getters and setters for all the member variables.</li>
</ul>

<h4>Constructor:</h4>

<ul>
    <li>Add a constructor to your <code>Item</code> class that takes a <code>String</code> <code>name</code> and  <code>double</code> <code>price</code> as arguments to set the name and price for that object on instantiation.</li>
</ul>

<hr/>

<h2>Inside the Order class:</h2>

<h4>Private Member Variables:</h4>

<ul>
    <li>Set the member variables to <code>private</code> instead of  <code>public</code>.</li>
    <li>This time do not include the <code>total</code> member variable, as we will be using a method for getting the total.</li>
</ul>

<h4>Constructor:</h4>

<ul>
    <li>Add a constructor to your <code>Order</code> class that takes no arguments, but sets the name to "Guest" and initializes the items array to an empty <code>ArrayList&lt;Item&gt;</code></li>
</ul>

<h4>Overloaded Constructor:</h4>

<ul>
    <li>Add an overloaded constructor for <code>Order</code> that takes <code>String</code> <code>name</code> as an argument, so you can create an instance with a name.</li>
</ul>

<h4>Accessors & Mutators (Getters and Setters)</h4>

<ul>
    <li>Create getters and setters for all the member variables, using good naming convention for boolean accessors.</li>
</ul>

<h3>Class Methods:</h3>

<h4>addItem</h4>

<ul>
    <li>Create a method called <code>addItem</code>  that takes an <code>Item</code> object as an argument and adds the item to the order's <code>items</code> array. No need to return anything.</li>
</ul>
<p>Hint: How do you get the price of a given item from outside the Item class?</p>

<h4>getStatusMessage</h4>

<ul>
    <li>Create a method called <code>getStatusMessage</code> that returns a String message. If the order is ready, return "Your order is ready.", if not, return "Thank you for waiting. Your order will be ready soon."</li>
</ul>

<h4>display</h4>

<ul>
    <li>Similar to the displayMenu function from the Cafe Business Logic assignment, create a method called <code>display</code> that prints out the order information like so:</li>
</ul>

```
    Customer Name: Cindhuri
    drip coffee - $1.50
    capuccino - $3.50
    Total: $5.00
```

<h4>getOrderTotal</h4>

<ul>
    <li>Similar to the <code>getOrderTotal</code> method from the Cafe Business Logic assignment, create a method called <code>getOrderTotal</code> that sums together each of the item's prices, and returns the total amount.</li>
</ul>

<p>Note: This time, you do not need to pass in a list of prices, because each item object in <code>this</code> order's <code>items</code> array has its own price, that you can access using a getter!</p>

<code></code>

<p>To Do List:</p>
<ul>
    <li>Implement the Order and Item classes as described above.</li>
    <li>Create 2 orders for unspecified guests (without specifying a name);</li>
    <li>Create 3 orders using the overloaded constructor to give each a name for the order.</li>
    <li>Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);</li>
    <li>Test the results and the display method by calling the display method on all of your orders, like so: order3.display();</li>
    <li>Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());</li>
</ul>



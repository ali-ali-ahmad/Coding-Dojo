<h1>Dojo Pizzeria</h1>

<h3>Objectives</h3>

<ul>
    <li>Practice making JavaScript objects</li>
    <li>Practice using <code>Math.random()</code></li>
</ul>

<h2>A Sandwich Factory</h2>

<p>In this assignment we'll be making pizzas in JavaScript! And if we're going to just make one pizza we can define it all at once like the sandwich we see below.</p>

```javaScript
var sandwich = {
    bread:    "sourdough",
    protein:  "london broil",
    cheese:   "lacey swiss cheese",
    toppings: ["romaine lettuce", "heirloom tomatoes", "horseradish sauce"]
};
    
console.log(sandwich);
```
<p>But what if we wanted to make multiple sandwiches? We could define a function that allows us to craft a sandwich!</p>

```javaScript
function sandwichFactory(bread, protein, cheese, toppings) {
    var sandwich = {};
    sandwich.bread = bread;
    sandwich.protein = protein;
    sandwich.cheese = cheese;
    sandwich.toppings = toppings;
    return sandwich;
}
    
var s1 = sandwichFactory("wheat", "turkey", "provolone", ["mustard", "fried onions", "arugula"]);
console.log(s1);
```
<h2>The Pizza Oven</h2>

<p>Create a <code>function</code> called pizzaOven. We should feel free to customize what information we keep track of for our pizza, but let's make sure that we include the following: <code>crustType</code>, <code>sauceType</code>, <code>cheeses</code>, and <code>toppings</code>.</p>

<p>To Do List:</p>
<ul>
    <li>Create a <code>function</code> called pizzaOven that returns a JavaScript (Pizza) Object</li>
    <li>Create a pizza with: <code>"deep dish"</code>, <code>"traditional"</code>, <code>["mozzarella"]</code>, and <code>["pepperoni", "sausage"]</code></li>
    <li>Create a pizza with: <code>"hand tossed"</code>, <code>"marinara"</code>, <code>["mozzarella", "feta"]</code>, and <code>["mushrooms", "olives", "onions"]</code></li>
    <li>Create 2 more pizzas with any toppings we like!</li>
    <li>Bonus Challenge: Create a <code>function</code> called randomPizza that uses <code>Math.random()</code> to create a random pizza!</li>
</ul>



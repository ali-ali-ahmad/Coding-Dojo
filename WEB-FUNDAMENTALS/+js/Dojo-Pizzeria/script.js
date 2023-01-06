var pizza = {
    crustType:    "Stuffed Crust",
    sauceType:  "Garlic Ranch Sauce",
    cheeses:   "Gorgonzola",
    toppings: ["Onions", "Black Olives", "Mushrooms"]
};
    
console.log(pizza);

// 1.   Create a function called pizzaOven that returns a JavaScript (Pizza) Object
function pizzaOven(crustType, sauceType, cheeses, toppings) {
    var pizza = {};
    pizza.crustType = crustType;
    pizza.sauceType = sauceType;
    pizza.cheeses = cheeses;
    pizza.toppings = toppings;
    return pizza;
}

// 2. Create a pizza with: "deep dish", "traditional", ["mozzarella"], and ["pepperoni", "sausage"]
var p1 = pizzaOven("deep dish", "traditional", ["mozzarella", "Gorgonzola"], ["pepperoni", "sausage"]);
console.log(p1);

// 3. Create a pizza with: "hand tossed", "marinara", ["mozzarella", "feta"], and ["mushrooms", "olives", "onions"]
var p2 = pizzaOven("hand tossed", "marinara", ["mozzarella", "feta"], ["mushrooms", "olives", "onions"]);
console.log(p2);

// 4. Create 2 more pizzas with any toppings we like!
var p3 = pizzaOven("Cracker Crust", "White Garlic Sauce", "Aged Havarti", ["Chicken Cutlet Pizza", "pizza with red onions"]);
console.log(p3);

var p4 = pizzaOven("Wrapping It Up", "Buffalo Sauce", "Goat cheese", ["Spinach Pizza", "Bacon"]);
console.log(p4);

// 5. Bonus Challenge: Create a function called randomPizza that uses Math.random() to create a random pizza!

// solution from coding dojo
var crustTypes = [
    "deep dish",
    "hand tossed",
    "thin and crispy",
    "cauliflower",
    "gluten free",
    "hawaiian bread"
];

var sauceTypes = [
    "traditional",
    "marinara",
    "bbq",
    "white sauce",
    "nacho cheese",
    "tikka masala"
];

var cheeses = [
    "mozzarella",
    "cheddar",
    "feta",
    "swiss cheese",
    "blue cheese",
    "goat cheese",
    "provolone",
    "parmesan",
    "vegan cheese"
];

var toppings = [
    "pepperoni",
    "sausage",
    "chicken",
    "corn",
    "olives",
    "bell peppers",
    "onions",
    "mushrooms",
    "anchovies"
];

function randomRange(max, min) {
    return Math.floor(Math.random() * max - min) + min;
}

function randomPick(arr) {
    var i = Math.floor(arr.length * Math.random());
    return arr[i];
}

function randomPizza() {
    var pizza = {};
    pizza.crustType = randomPick(crustTypes);
    pizza.sauceType = randomPick(sauceTypes);
    pizza.cheeses = [];
    pizza.toppings = [];
    for(var i=0; i<randomRange(5, 1); i++) {
        pizza.cheeses.push(randomPick(cheeses));
    }
    for(var i=0; i<randomRange(4, 0); i++) {
        pizza.toppings.push(randomPick(toppings));
    }
    return pizza;
}

console.log(randomPizza());

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
// var pizza1 = {
//     crustType: ["Stuffed Crust", "deep dish", "hand tossed", "Cracker Crust", "Wrapping It Up"],
//     sauceType: ["Garlic Ranch Sauce", "traditional", "marinara", "White Garlic Sauce", "Buffalo Sauce"],
//     cheeses: ["Gorgonzola", "mozzarella", "Gorgonzola", "feta", "Aged Havarti", "Goat cheese"],
//     toppings: ["Onions", "Black Olives", "Mushrooms", "sausage", "pepperoni", "olives", "Chicken Cutlet Pizza", "pizza with red onions", "Spinach Pizza", "Bacon"]
// };
// function randomPizza(){
//     var pizza = {};
//         pizza1.crustType = crustType;
//         pizza1.sauceType = sauceType;
//         pizza1.cheeses = cheeses;
//         pizza1.toppings = toppings;
//     var array= Math.random() * 10;
//     for (var x = 0; x < array; x++ ){
//         pizza[Math.random()] = Math.random(); 
//     }
//     return pizza;
// }
// console.log(pizza);

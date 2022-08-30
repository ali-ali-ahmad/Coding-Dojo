var pizza = {
    crustType: ["Stuffed Crust", "deep dish", "hand tossed", "Cracker Crust", "Wrapping It Up"],
    sauceType: ["Garlic Ranch Sauce", "traditional", "marinara", "White Garlic Sauce", "Buffalo Sauce"],
    cheeses: ["Gorgonzola", "mozzarella", "Gorgonzola", "feta", "Aged Havarti", "Goat cheese"],
    toppings: ["Onions", "Black Olives", "Mushrooms", "sausage", "pepperoni", "olives", "Chicken Cutlet Pizza", "pizza with red onions", "Spinach Pizza", "Bacon"]
}
// Create a function called randomPizza that uses Math.random() to create a random pizza!



// I tried to use this but it didnt work, i also did a lot of research but still didnt get it
function randomPizza(){
    var pizza = {};
        pizza1.crustType = crustType;
        pizza1.sauceType = sauceType;
        pizza1.cheeses = cheeses;
        pizza1.toppings = toppings;
    var array= Math.random() * 10;
    for (var x = 0; x < array; x++ ){
        pizza[Math.random()] = Math.random(); 
    }
    return pizza;
}
console.log(pizza);

// whats your solution?????
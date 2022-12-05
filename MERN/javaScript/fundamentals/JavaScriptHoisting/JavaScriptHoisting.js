// Objectives:
// Practice reading JavaScript the same way as the interpreter reads it.
// Rewrite the code the way it would be seen by the interpreter and predict the output.

// -------------------------------------------------------------------------------
// 1)
console.log(hello);                                   
var hello = 'world';                                 

// prediction:
// hello is not defined.

// interpreter results:
// undefined

// -------------------------------------------------------------------------------
// 2)
var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
}

// prediction:
// magnet.

// interpreter results:
// magnet

// -------------------------------------------------------------------------------
// 3)
var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);

// prediction:
// super cool

// interpreter results:
// super cool
// -------------------------------------------------------------------------------
// 4)
var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}



// prediction:
// food is not defined
// chicken
// eat is not defined

// interpreter results:
// > var food = 'chicken';
// undefined
// > console.log(food);
// chicken
// undefined
// > eat();
// Uncaught ReferenceError: eat is not defined
// > function eat(){
// ...     food = 'half-chicken';
// ...     console.log(food);
// ...     var food = 'gone';
// ... }
// undefined


// -------------------------------------------------------------------------------
// 5)
mean();
console.log(food);
var mean = function() {
    food = "chicken";
    console.log(food);
    var food = "fish";
    console.log(food);
}
console.log(food);

// prediction:
// mean is not defined
// food is not defined
// food is not defined

// interpreter results:
// > mean();
// Uncaught ReferenceError: mean is not defined
// > console.log(food);
// Uncaught ReferenceError: food is not defined
// > var mean = function() {
// ...     food = "chicken";
// ...     console.log(food);
// ...     var food = "fish";
// ...     console.log(food);
// ... }
// undefined
// > console.log(food);
// Uncaught ReferenceError: food is not defined
// >

// -------------------------------------------------------------------------------
// 6)
console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);



// prediction:
// genre is not defined
// rewind is not defined
// disco

// interpreter results:
// > console.log(genre);
// Uncaught ReferenceError: genre is not defined
// > var genre = "disco";
// undefined
// > rewind();
// Uncaught ReferenceError: rewind is not defined
// > function rewind() {
// ...     genre = "rock";
// ...     console.log(genre);
// ...     var genre = "r&b";
// ...     console.log(genre);
// ... }
// undefined
// > console.log(genre);
// disco

// -------------------------------------------------------------------------------
// 7)
dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);

// prediction:
// san jose
// learn is not defined
// san jose

// interpreter results:
// > dojo = "san jose";
// 'san jose'
// > console.log(dojo);
// san jose
// undefined
// > learn();
// Uncaught ReferenceError: learn is not defined
// > function learn() {
// ...     dojo = "seattle";
// ...     console.log(dojo);
// ...     var dojo = "burbank";
// ...     console.log(dojo);
// ... }
// undefined
// > console.log(dojo);
// san jose

// -------------------------------------------------------------------------------
// 8)
console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students){
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if(dojo.students > 50){
        dojo.hiring = true;
    }
    else if(dojo.students <= 0){
        dojo = "closed for now";
    }
    return dojo;
}


// prediction:
// makeDojo is not defined
// makeDojo is not defined

// interpreter results:
// > console.log(makeDojo("Chicago", 65));
// Uncaught ReferenceError: makeDojo is not defined
// > console.log(makeDojo("Berkeley", 0));
// Uncaught ReferenceError: makeDojo is not defined
// > function makeDojo(name, students){
// ...     const dojo = {};
// ...     dojo.name = name;
// ...     dojo.students = students;
// ...     if(dojo.students > 50){
// ...         dojo.hiring = true;
// ...     }
// ...     else if(dojo.students <= 0){
// ...         dojo = "closed for now";
// ...     }
// ...     return dojo;
// ... }
<h1>Assignment: JavaScript Hoisting</h1>

<h2>Objectives:</h2>
<ol>
  <li>Practice reading JavaScript the same way as the interpreter reads it.</li>
</ol>

<hr/>

<p>Rewrite the code the way it would be seen by the interpreter and predict the output. An example is shown here:</p>

```js
// GIVEN
console.log(example);
var example = "I'm the example!";
AFTER HOISTING BY THE INTERPRETER
// var example;
// console.log(example); // logs undefined
// example = "I'm the example!";
```

<p>After you've made your prediction, run the original code to find out if you were right! If your predictions were incorrect, look back at how the code is hoisted by the interpreter.</p>

<h4><strong>Note</strong></h4>

<p>Run the same code as above with ES6 syntax and compare your results:</p>

```js
console.log(example);
let example = "I'm the example!";
```

<p>Even if <code>let</code> and <code>const</code> prevent a lot of the confusing behavior of JavaScript's hoisting, these are ES6 constructs and a huge amount of the world's live JavaScript code is still ES5. Understanding how ES5 hoists <code>var</code> and the rules of scoping are important for every JavaScript developer!</p>
1

```js
console.log(hello);                                   
var hello = 'world';                                 
```

2

```js
var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
}
```

3

```js
var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);
```

4

```js
var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}
```

5

```js
mean();
console.log(food);
var mean = function() {
    food = "chicken";
    console.log(food);
    var food = "fish";
    console.log(food);
}
console.log(food);
```

6

```js
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
```

7

```js
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
```

8 - Bonus ES6: const

```js
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
```

<h4>To Do List</h4>
<ul>
  <li>Rewrite the given code as it is seen by the interpreter</li>
  <li>Predict the outputs</li>
  <li>Run the original code and compare the outputs to your predictions</li>
</ul>
<h1>Array Challenges</h1>

<h3>Objectives</h3>

<ul>
    <li>Get comfortable with loops: <code>for</code> and <code>while</code>.</li>
    <li>Get comfortable with conditionals: <code>if/else</code>.</li>
</ul>

<p>Please work on the following challenges and upload your work when done.</p>


<h4>1. Always Hungry</h4>
<p>Write a function that is given an array and each time the value is <code>"food"</code> it should console log <code>"yummy"</code>. If <code>"food"</code> was not present in the array console log <code>"I'm hungry"</code> once.</p>

```javaScript
function alwaysHungry(arr) {
    // your code here 
}
alwaysHungry([3.14, "food", "pie", true, "food"]);
// this should console log "yummy", "yummy"
alwaysHungry([4, 1, 5, 7, 2]);
// this should console log "I'm hungry"
```

<h4>2. High Pass Filter</h4>
<p>Given an array and a value <code>cutoff</code>, return a new array containing only the values larger than <code>cutoff</code>.</p>

```javaScript
function highPass(arr, cutoff) {
    var filteredArr = [];
    // your code here
    return filteredArr;
}
var result = highPass([6, 8, 3, 10, -2, 5, 9], 5);
console.log(result); // we expect back [6, 8, 10, 9]
```

<h4>3. Better than average</h4>
<p>Given an array of numbers return a count of how many of the numbers are larger than the average.</p>

```javaScript
function betterThanAverage(arr) {
    var sum = 0;
    // calculate the average
    var count = 0
    // count how many values are greated than the average
    return count;
}
var result = betterThanAverage([6, 8, 3, 10, -2, 5, 9]);
console.log(result); // we expect back 4
```

<h4>4. Array Reverse</h4>
<p>Write a function that will reverse the values an array and return them.</p>

```javaScript
function reverse(arr) {
    // your code here
    return arr;
}
var result = reverse(["a", "b", "c", "d", "e"]);
console.log(result); // we expect back ["e", "d", "c", "b", "a"]
```

<h4>5. Fibonacci Array</h4>
<p><a href="https://en.wikipedia.org/wiki/Fibonacci_number">Fibonacci</a> numbers have been studied for years and appear often in nature. Write a function that will return an array of Fibonacci numbers up to a given length <code>n</code>. Fibonacci numbers are calculated by adding the last two values in the sequence together. So if the 4th value is <code>2</code> and the 5th value is <code>3</code> then the next value in the sequence is <code>5</code>.</p>

```javaScript
function fibonacciArray(n) {
    // the [0, 1] are the starting values of the array to calculate the rest from
    var fibArr = [0, 1];
    // your code here
    return fibArr;
}
var result = fibonacciArray(10);
console.log(result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
```
<h1>Assignment: JavaScript Hoisting</h1>

<p>For the following five blocks of code, predict the output. If a line of code will throw an error, state the error.</p>

<p>Problem 1</p>

```js
const cars = ['Tesla', 'Mercedes', 'Honda']
const [ randomCar ] = cars
const [ ,otherRandomCar ] = cars
//Predict the output
console.log(randomCar)
console.log(otherRandomCar)
```

<p>Problem 2</p>

```js
const employee = {
    name: 'Elon',
    age: 47,
    company: 'Tesla'
}
const { name: otherName } = employee;
//Predict the output
console.log(name);
console.log(otherName);
```

<p>Problem 3</p>

```js
const person = {
    name: 'Phil Smith',
    age: 47,
    height: '6 feet'
}
const password = '12345';
const { password: hashedPassword } = person;  
//Predict the output
console.log(password);
console.log(hashedPassword);
```

<p>Problem 4</p>

```js
const numbers = [8, 2, 3, 5, 6, 1, 67, 12, 2];
const [,first] = numbers;
const [,,,second] = numbers;
const [,,,,,,,,third] = numbers;
//Predict the output
console.log(first == second);
console.log(first == third);
```

<p>Problem 5</p>

```js
const lastTest = {
    key: 'value',
    secondKey: [1, 5, 1, 8, 3, 3]
}
const { key } = lastTest;
const { secondKey } = lastTest;
const [ ,willThisWork] = secondKey;
//Predict the output
console.log(key);
console.log(secondKey);
console.log(secondKey[0]);
console.log(willThisWork);
```

<h4>To Do List</h4>
<ul>
    <li>Predict the Output for Problem 1</li>
    <li>Predict the Output for Problem 2</li>
    <li>Predict the Output for Problem 3</li>
    <li>Predict the Output for Problem 4</li>
    <li>Predict the Output for Problem 5</li>
</ul>

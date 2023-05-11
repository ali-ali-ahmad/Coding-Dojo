<h1>Assignment: Super Ninja</h1>

<h4>Sensei Class</h4>

<p>Extend the Ninja class and create the Sensei class. A Sensei should have 200 Health, 10 speed, and 10 strength by default. In addition, a Sensei should have a new attribute called wisdom, and the default should be 10. Finally, add the <code>speakWisdom()</code> method. <code>speakWisdom()</code> should call the <code>drinkSake()</code> method from the Ninja class, before console.logging a wise message.</p>

```js
// example output
const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
// -> "What one programmer can do in one month, two programmers can do in two months."
superSensei.showStats();
// -> "Name: Master Splinter, Health: 210, Speed: 10, Strength: 10"
```


<h4>To Do List</h4>
<ul>
    <li>create a class Sensei that inherits from the Ninja class</li>
    <li>add an attribute: wisdom - default to 10</li>
    <li>create a method: speakWisdom()</li>
</ul>

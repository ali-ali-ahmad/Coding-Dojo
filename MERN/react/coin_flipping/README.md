<h1>Assignment: Coin Flipping</h1>

<p>Let's say we have a function that simulates flipping a coin...</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/react/coin_flipping/screenshots/code1.jpg"/>

<p>And we want to use it in a function that sees how long it will take to have a coin land on "heads" five times in a row.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/react/coin_flipping/screenshots/code2.jpg"/>

<p>This will take an indeterminate amount of time. If we run the synchronous function above, it will prevent any code that comes after from running while this is taking place.</p>

<p>Your mission is to rewrite the above function using Promises. Make sure your fiveHeads function will call the resolve function when the coin has flipped "heads" five times in a row.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/react/coin_flipping/screenshots/code3.jpg"/>

<hr/>

<p>To do list</p>
<ul>
    <li>Complete the fiveHeads function so that it will resolve() when "heads" has been flipped five times</li>
    <li>Make the fiveHeads function reject() when the coin has been flipped more than 100 times</li>
</ul>


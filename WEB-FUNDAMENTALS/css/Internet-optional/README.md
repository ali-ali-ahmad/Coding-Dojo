<h1>Internet</h1>

<p>For this assignment, we want you to watch how many times you're using <div> tags. Whenever you have one element within a division, it means you don't need that division! For example, imagine you had a code like this</p>

```html
<div id="banner">
  <h1>Word Stream</h1>
</div>
<div id="left_nav">
  <div class="title">
    <h3>WordStream for PPC</h3>
  </div>
  <div class="heading">
     <div class="emphasis">Drive more Profits Through PPC!</div>
  </div>
</div>
```

<p>By looking at the code above, can you identify unnecessary divisions? We hope so! Again, whenever you have one element inside a division, it means that's redundant! Think about how you can refactor the code above to make it simpler. One possible way to refactor the code is to do something like below</p>

```html
<h1 id="banner">Word Stream</h1>
<div id="left_nav">
    <h3>WordStream for PPC</h3>
    <h4>Drive more Profits Through PPC!</h4>
</div>
```
<p>We hope you get the point.  <strong>Putting only one element in another element is like putting your Christmas gift in a box and then putting that box in another box that's slightly bigger (which means that the outer box was not necessary).</strong</p>

<p><strong>Great programmers always do things with less code</strong>, and we want you to practice reviewing your code and always striving to do things in the most simple manner possible. Fewer lines of code -- less text -- this is always better. Please remember that.</p>

<p>Now, duplicate the page below while considering what you've learned above.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/WEB-FUNDAMENTALS/css/Internet-optional/screenshots/pic.jpg"/>

<ul>
    <li>It's recommended that you reset and normalize the CSS attributes before you add your own CSS attributes.</li>
    <li>Use the images in the folder for this exercise.</li>
    <li>Make sure you've validated your HTML and that you're not using any float: left or right.</li>
    <li>Make sure you double checked your code for any redundant use of ids or classes. Make sure you don't have any single element within a division. </li>
    <li>Refactor your HTML code, if necessary.</li>
</ul>



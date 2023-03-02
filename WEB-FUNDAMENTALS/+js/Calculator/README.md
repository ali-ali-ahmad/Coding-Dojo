<h1>4 Function Calculator</h1>

<p>Using what we've learned about:</p>

<ul>
    <li>variables</li>
    <li>conditionals</li>
    <li>onclick</li>
</ul>

<p>And the following code snippets:</p>

<ul>
    <li><code>var displayDiv = document.querySelector("#display");</code></li>
    <li><code>displayDiv.innerText = "Some new value";</code></li>
</ul>

<p>Try to build a <strong style="text-decoration: underline; title="Addition, Substraction, Multiplication, Division"><u>4 Function Calculator</u></strong> from scratch.</p>

<p>We'll provide some HTML to get you started, and check out a working demo embedded below!</p>

<h4>Starter HTML</h4>

```html
<div id="calculator">
    <div id="display">0</div>
    <div class="row">
        <button onclick="press(7);">7</button>
        <button onclick="press(8);">8</button>
        <button onclick="press(9);">9</button>
        <button class="operator" onclick="setOP('/');">÷</button>
    </div>
    <div class="row">
        <button onclick="press(4);">4</button>
        <button onclick="press(5);">5</button>
        <button onclick="press(6);">6</button>
        <button class="operator" onclick="setOP('*');">×</button>
    </div>
    <div class="row">
        <button onclick="press(1);">1</button>
        <button onclick="press(2);">2</button>
        <button onclick="press(3);">3</button>
        <button class="operator" onclick="setOP('-');">−</button>
    </div>
    <div class="row">
        <button onclick="clr();">C</button>
        <button onclick="press(0);">0</button>
        <button onclick="press('.');">.</button>
        <button class="operator" onclick="setOP('+');">+</button>
    </div>
    <div class="row">
        <button id="equals" onclick="calculate()">=</div>
    </div>
<div>
```
## Demo Calculator

Click [here](https://codepen.io/wgoode3/full/pobBOzj) to view the demo on CodePen.

<h1>Playground</h1>

<p>Objectives:</p>
<ul>
    <li>Get comfortable passing information from the route to the template</li>
    <li>Understand how to display information passed from the route in the template file</li>
    <li>Get comfortable using for loops in the template file</li>
    <li>Get comfortable using if statements in the template file</li>
</ul>

<hr>

<h2>Internal Styling</h2>

<p>Just for this assignment, use an internal stylesheet or inline CSS (<a href="https://www.w3schools.com/css/css_howto.asp">review here</a>).</p>

<h3>Level 1</h3>
<p>When a user visits <strong>http://localhost:5000/play</strong>, have it render three beautiful looking blue boxes. Please use a template to render this.</p>
<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/flask/playGround/screenshots/pic1.jpg"></img>

<h3>Level 2</h3>
<p>When a user visits <strong>localhost:5000/play/(x)</strong>, have it display the beautiful looking blue boxes x times. For example, localhost:5000/play/7 should display these blue boxes 7 times. Calling localhost:5000/play/35 would display these blue boxes 35 times. Please remember that x originally is a string, and if you want to use it as an integer, you must first convert it to integer using int(). For example int("7") returns 7.</p>
<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/flask/playGround/screenshots/pic2.jpg"></img>

<h3>Level 3</h3>
<p>When a user visits <strong>localhost:5000/play/(x)/(color)</strong>, have it display beautiful looking boxes x times, but this time where the boxes appear in (color). For example, localhost:5000/play/5/green would display 5 beautiful green boxes. Calling localhost:5000/play/35/red would display 35 beautiful red boxes.</p>
<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/flask/playGround/screenshots/pic3.jpg"></img>


<p>To Do List:</p>
<ul>
    <li>Create a new Flask project</li>
    <li>Have the /play route render a template with 3 blue boxes</li>
    <li>Have the /play/(x) route render a template with x number of blue boxes</li>
    <li>Have the /play/(x)/(color) route render a template with x number of boxes the color of the provided value</li>
    <li>NINJA BONUS: Use only one template for the whole project</li>
</ul>



<h1>Checkerboard</h1>

<p>Objectives:</p>
<ul>
    <li>Continue to learn how to pass information from the url to the route</li>
    <li>Practice linking static files to templates</li>
    <li>Get comfortable passing information from the route to the template</li>
    <li>Understand how to use for loop properly in the template</li>
    <li>Recognize the value of creating a html/css first and then adding logic/code</li>
</ul>

<hr>


<p>Now let's practice linking static files to our template. For this project, we'll render a template that displays a checkerboard:</p>
<img src=""/>

<p>Your program should have the following output</p>

<ol>
    <li>http://localhost:5000 - should display 8 by 8 checkerboard</li>
    <li>http://localhost:5000/4 - should display 8 by 4 checkerboard</li>
    <li>http://localhost:5000/(x)/(y) - should display x by y checkerboard.  For example, http://localhost:5000/10/10 should display 10 by 10 checkerboard.  Before you pass x or y to Jinja, please remember to convert it to integer first (so that you can use x or y in a for loop)</li>
</ol>

<p><strong>HINT: Remember that values from urls come in as strings by default. If you want to use the value in a loop, you should convert it to an integer before passing it to Jinja.</strong></p>

<p>To Do List:</p>
<ul>
    <li>Create a new Flask project</li>
    <li>Have the root route render a template with a checkerboard on it</li>
    <li>Have the css in a separate stylesheet and link this to the template</li>
    <li>Have another route accept a single parameter (i.e. "/(x)") and render a checkerboard with x many rows, with alternating colors</li>
    <li>NINJA BONUS: Have another route accept 2 parameters (i.e. "/(x)/(y)") and render a checkerboard with x rows and y columns, with alternating colors</li>
    <li>SENSEI BONUS: Have another route accept 4 parameters (i.e. "/(x)/(y)/(color1)/(color2)") and render a checkerboard with x rows and y columns, with alternating colors, color1 and color2</li>
</ul>



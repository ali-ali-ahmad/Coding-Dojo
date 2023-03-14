<h1>Dojo Survey</h1>

<p>Objectives:</p>
<ul>
    <li>Practice creating a server with Flask from scratch</li>
    <li>Practice adding routes to a Flask app</li>
    <li>Practice having the client send data to the server with a form</li>
    <li>Practice having the server render a template using data provided by the client</li>
</ul>

<hr>

<p>Build a new Flask application that accepts a form submission and presents the submitted data on a results page.</p>

<p>The goal is to help you get familiar with sending POST requests through a form and displaying that information. Consider the below example as a guide.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/flask/dojo_survey/screenshots/pic.jpg"/>

<p>When you build this, please make sure that your program meets the following criteria:</p>

<ul>
    <li>http://localhost:5000 - have this display a nice looking HTML form.  The form should be submitted to '/result'</li>
    <li>http://localhost:5000/result - have this display a html with the information that was submitted by POST</li>
</ul>

<p><strong>Don't forget that any inputs we want to be able to access from the form submission need to have a name!</strong></p>

<p>It's always a good idea to print request.form to see if the form is delivering all the information you need in your routing method.</p>


<p>To Do List:</p>
<ul>
    <li>Create a new Flask application</li>
    <li>Have the root route ("/") show a page with the form</li>
    <li>Have the "/result" route display the information from the form on a new HTML page</li>
    <li>NINJA BONUS: Use a CSS framework to style your form</li>
    <li>NINJA BONUS: Include a set of radio buttons on your form</li>
    <li>SENSEI BONUS: Include a set of checkboxes on your form</li>
</ul>



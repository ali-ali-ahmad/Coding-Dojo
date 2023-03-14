<h1>Understanding Routing</h1>

<p>Objectives:</p>
<ul>
    <li>Practice building a server with Flask from scratch</li>
    <li>Get comfortable with routes and passing information to the routes</li>
</ul>

<hr>

<p>Create a server file that generates the specified responses for the following url requests:</p>

<ol>
    <li>localhost:5000<strong>/</strong> - have it say "Hello World!"</li>
    <li>localhost:5000<strong>/dojo</strong> - have it say "Dojo!"</li>
    <li>
        <p>Create one url pattern and function that can handle the following examples:</p>
        <ul>
            <li>localhost:5000<strong>/say/flask</strong> - have it say "Hi Flask!"</li>
            <li>localhost:5000<strong>/say/michael</strong> - have it say "Hi Michael!"</li>
            <li>localhost:5000<strong>/say/john</strong> - have it say "Hi John!"</li>
        </ul>
    </li>
    <li>
        <p>Create one url pattern and function that can handle the following examples (HINT: int() will come in handy! For example int("35") returns 35):</p>
        <ul>
            <li>localhost:5000<strong>/repeat/35/hello</strong> - have it say "hello" 35 times</li>
            <li>localhost:5000<strong>/repeat/80/bye</strong> - have it say "bye" 80 times</li>
            <li>localhost:5000<strong>/repeat/99/dogs</strong> - have it say "dogs" 99 times</li>
        </ul>
    </li>
</ol>

<p>We hope you are feeling more comfortable with routes now!</p>

<strong></strong>


<p>To Do List:</p>
<ul>
    <li>Create a root route ("/") that responds with "Hello World!"</li>
    <li>Create a route that responds with "Dojo!"</li>
    <li>Create a route that responds with "Hi" and whatever name is in the URL after /say/</li>
    <li>Create a route that responds with the given word repeated as many times as specified in the URL</li>
    <li>NINJA BONUS: For the 4th task, ensure the 2nd element in the URL is an integer (hint: http://exploreflask.com/en/latest/views.html#url-converters)</li>
    <li>SENSEI BONUS: Ensure that if the user types in any route other than the ones specified, they receive an error message saying "Sorry! No response. Try again."</li>
</ul>



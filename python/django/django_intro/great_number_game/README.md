<h1>Great Number Game</h1>

<p>Objectives:</p>
<ul>
    <li>Practice using session to store data about a client's history with the web app</li>
    <li>Practice clearing a session</li>
    <li>Practice having the server use data submitted by a client with a form</li>
</ul>

<hr>

<p>I'm thinking of a number between 1 and 100...</p>

<p>Create a site that allows a user to play this guessing game. Upon loading, the server should "pick" a random number between 1-100; store the number in session. Allow the user to guess the number--tell them when they are too high or too low. If they guess the correct number, notify them and offer to play again.</p>

<p>There are many different ways to do this assignment. When you finish the basic functionality, find a peer and compare your code!</p>

<h4>Reminder</h4>

<p>In order to generate a random number you can use the <a href="https://docs.python.org/3/library/random.html">random</a> Python module:</p>

```python
import random 	                # import the random module
random.randint(1, 100) 		# random number between 1-100
```

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/django/django_intro/great_number_game/screenshots/pic1.jpg"/>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/django/django_intro/great_number_game/screenshots/pic2.jpg"/>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/django/django_intro/great_number_game/screenshots/pic3.jpg"/>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/django/django_intro/great_number_game/screenshots/pic4.jpg"/>

<p>To Do List:</p>
<ul>
    <li>Create a new Django project called great_number_game</li>
    <li>In the root route, save a random number between 1 and 100 and display a form for the user to guess the number</li>
    <li>Create a route that determines whether the number submitted is too high, too low, or correct. Show this status on the HTML page.</li>
    <li>NINJA BONUS: Display the results as shown in the wireframe above (i.e. with appropriate colors and positioning)</li>
    <li>NINJA BONUS: Allow the user to keep guessing until they get it correct</li>
    <li>NINJA BONUS: Let the user know how many attempts they took before guessing the correct number</li>
    <li>SENSEI BONUS: Only allow the user to guess up to 5 times. If they don't guess it on their 5th attempt, display a "You Lose" message and allow them to try again.</li>
    <li>
SENSEI BONUS: If they win, allow the user to submit their name. Have a link to a leaderboard page that shows winners' names and how many attempts they took to guess correctly.</li>
</ul>



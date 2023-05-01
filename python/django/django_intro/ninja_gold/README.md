<h1>Ninja Gold</h1>

<p>Objectives:</p>
<ul>
    <li>Practice passing data to a template</li>
    <li>Practice using forms</li>
    <li>Practice using Django session</li>
</ul>

<hr>

<p>Recreate the Ninja Gold game, but this time with Django.</p>

<p>As a reminder, you're going to create a mini-game that helps a ninja make some money! When you start the game, your ninja should have 0 gold. The ninja can do activities at different places (farm, cave, house, quest) and earn different amounts of gold. In the case of a quest, your ninja can earn or lose up to 50 gold. Your job is to create a web app that allows this ninja to earn gold and to display past activities of this ninja.</p>

<h4>Guidelines</h4>

<ul>
    <li>Refer to the wireframe below.</li>
    <li>Have the four forms appear when the user goes to http://localhost:8000</li>
    <li>Use a hidden input tag in each form to pass the relevant location to the server</li>
    <li>Have <code>/process_money</code> determine how much gold the user should have</li>
    <li>For now, save the activity log in session</li>
</ul>

<img src=""/>

<p>To Do List:</p>
<ul>
    <li>Create a new project/app</li>
    <li>Have the root route render the main Ninja Gold page</li>
    <li>Have the "/process_money" POST route increase/decrease the user's gold by an appropriate amount and redirect to the root route</li>
    <li>
NINJA BONUS: Refactor your code so the location is being passed in the URL rather than via a form</li>
    <li>
SENSEI BONUS: Have the user specify the win conditions before starting, and then implement them in the game (# of moves, goal for gold)</li>
</ul>



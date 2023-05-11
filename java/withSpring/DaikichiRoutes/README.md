<h1>Daikichi Routes</h1>

<p>Daikichi (大吉) means "excellent luck" or "great blessing". We will be creating a website that will deliver a message of good fortune based on which url path is typed into the browser. For this assignment, you are going to practice routes in Spring Boot. The goal is to master writing method level <code>@RequestMapping</code> annotations and <code>@RequestMapping</code> class level annotation.</p>

<p>Objectives:</p>
<ul>
    <li>Create a Spring Boot application using Spring Tool Suite.</li>
    <li>Create a controller using the <code>@RestController</code> annotation.</li>
    <li>Use request mapping and <code>@RequestMapping</code> annotations to have distinct URL endpoints return different messages.</li>
</ul>

<h2>Assignment</h2>

<p>Create an app that will show in the browser either a welcome message or a fortune, based on which URL is typed in the browser. Please note, you may show simple text without any html formatting.</p>

<img src=""/>

<p>To Do List:</p>
<ul>
    <li>Start a new Spring Starter Project and create a package for your controllers</li>
    <li>Create a new controller called DaikichiController, and be sure you annotate it as a @RestController</li>
    <li>Have an http GET request to 'http://localhost:8080/daikichi' display text that says 'Welcome!'</li>
    <li>Have an http GET request to 'http://localhost:8080/daikichi/today' display text that says 'Today you will find luck in all your endeavors!'</li>
    <li>Have an http GET request to 'http://localhost:8080/daikichi/tomorrow' display text that says 'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'</li>
</ul>



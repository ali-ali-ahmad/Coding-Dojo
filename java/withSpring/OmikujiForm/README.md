<h1>Omikuji Form</h1>

<p>Omikuji (おみくじ) is a form of fortune telling written on small pieces of paper. Because they are chosen at random from many boxes of fortunes, one can only hope that their fortune will reveal good luck. In order to provide your friends with better odds, you will make an Omikuji app that will produce fortunes based on questions you ask them, so that their fortune will never be like the one below!</p>

<p>Objectives:</p>
<ul>
    <li>Get more comfortable with POST and passing information via a form</li>
    <li>Be completely comfortable referencing static css</li>
    <li>Note the importance of making your key assignments/projects look better</li>
    <li>Understand why rendering HTML on a URL that received a POST is a bad idea</li>
</ul>

<h2>Assignment:</h2>

<p>For this assignment you may either create a new project, or add this functionality to your Daikichi Assignment. You'll be adding 3 more routes, JSP, JSTL and static content.</p>

<p>The routes you will need:</p>

<ol>
    <li>A route to render the home page that shows the Omikuji form</li>
    <li>A POST route to process the form when the user hits "send"</li>
    <li>A route to render their fortune</li>
</ol>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/withSpring/OmikujiForm/screenshots/pic.jpg"/>

<p>To Do List:</p>
<ul>
    <li>Make a request mapping for the url /omikuji to render the main page showing the Omikuji form.</li>
    <li>Render the form as shown in the wireframe.</li>
    <li>Make a request mapping for the url /omikuji/show that renders a page with a blue box with a message. Include an anchor tag that goes back to /omikuji.</li>
    <li>Include a request mapping to handle processing the information from the form, store the form input into session and redirect to the /omikuji/show route.</li>
    <li>Dynamically render the template for the /omikuji/show route using the information saved in session.</li>
</ul>



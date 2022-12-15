<h1>Assignment: Luke APIwalker</h1>

<p>You have been given a task as a front-end developer to create a front-end app to navigate the <a href="https://swapi.dev/">Star Wars API</a>.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/react/luke_api_walker/screenshots/pic1.jpg"/>
<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/react/luke_api_walker/screenshots/pic2.jpg"/>
<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/react/luke_api_walker/screenshots/pic3.jpg"/>

<p>In addition to the index route, you should have a route to display specific characters and a route to display specific planets. Here are a couple considerations to keep in mind:</p>
<ul>
    <li>Since the search form is shown on every route and we want to preserve its state across route changes, does it need to be rendered inside each route component?</li>
    <li>Typically we pass an empty array as the second argument to our useEffect calls to ensure that the API request is only made once. How can we force the <code>useEffect</code> callback to also run when the ID for a given route pattern has changed? Hint: think about putting a variable inside that array.</li>
</ul>

<hr/>

<p>By reading the Star Wars API documentation, create a User Interface that does the following tasks:</p>
<ul>
    <li>Create a dropdown menu that allows the user to choose the resource they are looking for</li>
    <li>Next to the dropdown menu, create an input field that accepts a number that will be used to query a specific id.</li>
    <li>Add a button to allow them to send a request to the API.</li>
    <li>On submission, navigate to the appropriate route and render at least 4 attributes for that specific resource.</li>
    <li>If the request is unsuccessful, create an error message that says "These aren't the droids you're looking for" with a picture of Obi-Wan Kenobi.</li>
    <li>NINJA BONUS: If the resource is "people", output the name of the character's homeworld (you may need to make another request)</li>
    <li>NINJA BONUS: If the resource is "people" render a link to their homeworld (a specific planet). It's okay if the link text is simply "homeworld."</li>
    <li>NINJA BONUS: Add additional resources aside from people and planets to the dropdown.</li>
</ul>


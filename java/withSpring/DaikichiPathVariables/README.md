<h1>Daikichi Path Variables</h1>

<p>Now that you have created the Hello Human application using query parameters, you're going to handle information sent through the url another way, through path variables to return varying computed string responses back to the client.</p>

<p>Objectives:</p>
<ul>
    <li>Become familiar with creating a package in Spring Tool Suite.</li>
    <li>Use and understand <code>@RestController</code> annotation.</li>
    <li>Pass information from the client using <code>@RequestMapping</code> and URL path variables.</li>
    <li>Identify and use correctly the <code>@PathVariable</code> annotation and corresponding parameter declaration syntax.</li>
    <li>Use <code>@RequestMapping</code> to process information from the client to return conditional or varied responses.</li>
</ul>

<h2>Assignment:</h2>

<p>For this assignment we are going to add to our Daikichi Routes project. To review, the first three routes, from our Daikichi Routes assignment used the <code>@RequestMapping</code> annotation with static route urls. The last two routes will be dynamic, and use path variables, so you will also need to use the <code>@PathVariable</code> annotation.</p>

<p>Adding request mappings to your Daikichi project, complete the assignment tasks given. Here is some example output:</p>

<img src=""/>

<p>To Do List:</p>
<ul>
    <li>Add 2 new routes with corresponding method definitions in your Daikichi Routes project that will accept path variables.</li>
    <li>Have an http GET request to 'http://localhost:8080/daikichi/travel/kyoto' where the url will take any string for the city, and display text that says for example, 'Congratulations! You will soon travel to kyoto!'.</li>
    <li>Have an http GET request to 'http://localhost:8080/daikichi/lotto/8', where the url will take any integer. If the number is even, display text that says 'You will take a grand journey in the near future, but be weary of tempting offers'. If it is odd, display text that says "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends."</li>
</ul>



<h1>Assignment: Jokes API</h1>

<p>To solidify what we've read about mongoose commands and express, lets create a new express project from scratch called "Jokes."</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/MongoDB/jokes/screenshots/pic1.jpg"/>
<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/MongoDB/jokes/screenshots/pic2.jpg"/>
<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/MongoDB/jokes/screenshots/pic3.jpg"/>
<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/MongoDB/jokes/screenshots/pic4.jpg"/>
<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/MongoDB/jokes/screenshots/pic5.jpg"/>

<hr/>

<p>To do list:</p>
<ul>
    <li>Create a project folder named "Jokes"</li>
    <li>within "Jokes" create a modularized folder structure (server ==> controllers, routes, models, config, server.js)</li>
    <li>initialize a package json file using npm</li>
    <li>install express and mongoose</li>
    <li>create a mongoose.config.js file and setup your mongoose.connect function</li>
    <li>create a jokes.model.js, jokes.controller.js, and a jokes.routes.js in the applicable folders</li>
    <li>in the jokes.model file create a JokeSchema and export the mongoose.model("joke", JokeSchema)</li>
    <li>in the jokes.controller import your model from the models file</li>
    <li>Export a function to get all jokes</li>
    <li>Export a function to get a single joke</li>
    <li>Export a function to create a joke</li>
    <li>Export a function to update a joke</li>
    <li>Export a function to delete a joke</li>
    <li>in the jokes.routes file: import * from your controller file and add an express route for every route listed in the wireframe</li>
    <li>In your server.js file: setup express, import your joke routes, and run your server</li>
    <li>Use Postman to create new jokes and use the browser to view them</li>
    <li>Use Postman to perform the POST DELETE and PUT operations and use the browser to GET them</li>
</ul>


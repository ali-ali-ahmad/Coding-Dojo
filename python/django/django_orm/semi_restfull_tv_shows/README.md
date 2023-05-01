<h1>Semi-Restful TV Shows</h1>

<p>Objectives:</p>
<ul>
    <li>Practice ORM queries from the controller</li>
    <li>Practice RESTful routing</li>
    <li>Practice rendering query results to templates</li>
    <li>Practice using form input to create table data</li>
</ul>

<hr>

<p>Now that we've got a basic understanding of the flow between models, views, and templates, let's make sure we know how to implement all 4 CRUD commands!</p>

<p>Remember that restful routing is simply a guideline of generally accepted routing naming conventions so other consumers of our routes can easily navigate our application and anticipate what the response will be for any given route. Since many web applications perform CRUD operations, you can imagine how confusing this could get if everyone followed different conventions for creating routing and method names for these operations.</p>

<p>Restful routing also gives us a chance to practice being methodical in our approach to building an application. For each step of CRUD, we start with the HTML, then build the routes to show that page. We can then build out the routes that will process any form submissions.</p>

<p>Ultimately, it's up to you (or maybe your boss) whether you also follow these rules/conventions, but we strongly encourage you to get familiar with the following rules for RESTful routing, as you may be making requests to, or someday creating your own, API.</p>

<p>Create a new Django project following the specifications provided in this wireframe:</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/django/django_orm/semi_restfull_tv_shows/screenshots/pic.jpg"/>

<p>To Do List:</p>
<ul>
    <li>Complete each of the following routes:</li>
    <li>/shows/new- GET - method should return a template containing the form for adding a new TV show</li>
    <li>/shows/create - POST - method should add the show to the database, then redirect to /shows/<id></li>
    <li>/shows/"id" - GET - method should return a template that displays the specific show's information</li>
    <li>/shows - GET - method should return a template that displays all the shows in a table</li>
    <li>/shows/"id"/edit - GET - method should return a template that displays a form for editing the TV show with the id specified in the url</li>
    <li>/shows/"id"/update - POST - method should update the specific show in the database, then redirect to /shows/"id"</li>
    <li>/shows/"id"/destroy - POST - method should delete the show with the specified id from the database, then redirect to /shows</li>
    <li>Have your root route redirect to /shows</li>
</ul>



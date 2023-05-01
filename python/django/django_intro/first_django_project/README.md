<h1>First Django Project</h1>

<p>Objectives:</p>
<ul>
    <li>Practice setting up a new Django project</li>
    <li>Practice setting up a new Django app</li>
    <li>Practice routing in Django</li>
    <li>Familiarity with views and how to return a response</li>
</ul>

<hr>

<p>It's time to practice routing! Use the checklist below to add routes to your project. </p>

<p>***Note*** for the assignment, the show, edit, and delete methods will require the use of Route Parameters.</p>

<p>***Bonus*** result:</p>

<img src=""/>

<p>To Do List:</p>
<ul>
    <li>Create a new project with a single app</li>
    <li>/ - redirects to the "/blogs" route with a method called "root"</li>
    <li>/blogs - display the string "placeholder to later display a list of all blogs" with a method named "index"</li>
    <li>/blogs/new - display the string "placeholder to display a new form to create a new blog" with a method named "new"</li>
    <li>/blogs/create - redirect to the "/" route with a method called "create"</li>
    <li>/blogs/< number > - display the string "placeholder to display blog number: {number}" with a method named "show" (eg. localhost:8000/blogs/15 should display the message: 'placeholder to display blog number 15')</li>
    <li>/blogs/< number >/edit - display the string "placeholder to edit blog {number}" with a method named "edit"</li>
    <li>/blogs/< number >/delete - redirect to the "/blogs" route with a method called "destroy"</li>
    <li>(**Bonus**) /blogs/json - return a JsonResponse with title and content keys.</li>
</ul>



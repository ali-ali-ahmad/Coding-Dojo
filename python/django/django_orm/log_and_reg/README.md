<h1>Login and Registration</h1>

<p>Objectives:</p>
<ul>
    <li>Build a login and registration page with validations</li>
    <li>Practice Flash messages</li>
    <li>Practice session</li>
</ul>

<hr>

<p>It's time to build Login and Registration again, this time using Django.</p>

<p>We’ve learned how to integrate models, validations, and controllers to our projects. Our next goal is to create a fully functional login and registration app! This will combine your knowledge of MVC patterns, validations, and password encryption.</p>

<p>Registration should adhere to the following guidelines:</p>

<ul>
    <li>First Name - required; at least 2 characters; letters only</li>
    <li>Last Name - required; at least 2 characters; letters only</li>
    <li>Email - required; valid format</li>
    <li>Password - required; at least 8 characters; matches password confirmation</li>
</ul>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/django/django_orm/log_and_reg/screenshots/pic.jpg"/>

<h4>Something to Consider</h4>

<p><strong>User.objects.get(email = email)</strong></p>

<p>If there is not a matching email for a .get(), Django throws an error (try and except could come in handy), otherwise it returns the User object associated with the matching user. e.g. Userobject.</p>

<p><strong>User.objects.filter(email = email)</strong></p>

<p>Filter, on the other hand, returns a list, so if there is no user that matches, it returns an empty list. If there is a single matching user the list will contain a single User object: e.g. [Userobject].</p>

<p>To Do List:</p>
<ul>
    <li>Create a new Django project with a login app</li>
    <li>Have the root route render a page where users can register or log in</li>
    <li>Complete the registration method, including showing errors if the input is invalid</li>
    <li>Complete the login method, including showing errors if the input is invalid</li>
    <li>Upon successful registration or login, redirect to a success page, displaying the user's name and a message as shown above</li>
    <li>Have the logout link clear the session and redirect to the login/reg page</li>
    <li>Don't allow a user who is not logged in to reach the /success route (i.e. by making a GET request in the address bar)</li>
    <li>NINJA BONUS: Add a birthday field and validate that the user's birthday is in the past</li>
    <li>NINJA BONUS: Validate that the email provided for registration is unique</li>
    <li>SENSEI BONUS: Add a birthday field and validate that the user is at least 13 years old (COPPA compliant!)</li>
    <li>SENSEI BONUS: Validate the email uniqueness with AJAX</li>
    <li>SENSEI BONUS: Use JavaScript to perform client-side validations</li>
    <li>SENSEI BONUS: In addition to server side validations, use JavaScript to perform client-side validations on required fields. Don't allow the form to be submitted unless fields are valid.</li>
</ul>



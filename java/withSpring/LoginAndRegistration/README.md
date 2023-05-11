<h1>Login and Registration</h1>

<p>Objectives:</p>
<ul>
    <li>Build an application that requires both user authentication and validations</li>
    <li>Add server-side validations in addition to model-level validations</li>
    <li>Implement authentication logic</li>
    <li>Use Optionals to check if a user exists</li>
    <li>Import and use BCrypt to create hashes and compare hashed strings against the database.</li>
    <li>Use and manipulate transient member variables and non-entity classes</li>
    <li>Handle user logout and active session status</li>
    <li>Use session data to pull the current user's information</li>
</ul>

<hr/>

<p>In this assignment, you're going to build a Spring application that allows for login and registration.</p>

<img src=""/>

<h2>Registration</h2>

<p>The user inputs their information, we verify that the information is correct, insert it into the database and return back with a success message. If the information is not valid, redirect to the registration page and show the following requirements:</p>

<h3>Validations and Fields to Include</h3>
<ol>
    <li>User Name - letters only, at least 3 characters, not blank</li>
    <li>Email - valid Email format, does not already exist in the database, not blank</li>
    <li>Password - at least 8 characters, not blank</li>
    <li>Password Confirmation - matches password</li>
</ol>

<h3>Login</h3>

<p>When the user initially registers, we would log them in automatically, but for logging in, we need to validate in a different way:</p>
<ol>
    <li>Check whether the email provided is associated with a user in the database</li>
    <li>If it is, check whether the password matches what's saved in the database</li>
</ol>

<p><strong>But how do we keep track of them once they've logged in?</strong> I think you might already know...session! We can create a session variable that holds the user's id. From our study in database design, we know that if we have the id of any table, we can gather the rest of the information that is associated with that id. Storing a single session variable with the user's id is all we need to access all the information associated with that user.</p>

<h3>Logout</h3>

<p>On the success page, have a logout button or link. When a user logs out, their session should be cleared. If the user attempts to access the success page (i.e., making a GET request by typing in the url), redirect them back to the login and registration page.</p>

<h2>NINJA BONUSES:</h2>

<p>Add more fields to your registration form with different form elements. For example, include a drop-down menu, radio buttons, checkboxes, and a datepicker. Include validations for each field. Have users provide their birthday and require that they must be at least ten years old in order to register. Level up your password validations by requiring at least one capital letter and one number. Provide the user with several programming languages and require that they check at least one as an interest of theirs. Customize this assignment and get creative!</p>

<p>To Do List:</p>
<ul>
    <li>Create User and LoginUser models including all model-level validation annotations</li>
    <li>Create Login page JSP with both Login and Register forms</li>
    <li>Create hard-coded Success Page JSP with logout link (without url is fine for now)</li>
    <li>Build Controller with all the example mapped methods</li>
    <li>Add a route to render the success page.</li>
    <li>Test that the front-end runs (without authentication and validation logic)</li>
    <li>Set up the UserRepository</li>
    <li>Add CRUD methods to Service</li>
    <li>Build the UserService class file.</li>
    <li>Add extra server-level authentication and validations to register method.</li>
    <li>Add extra server-level authentication to login method.</li>
    <li>Call the service register and login methods from the controller in the appropriate routes.</li>
    <li>Thoroughly test validations and that validation messages show to the user, including on a second submission.</li>
    <li>Add a logout route to the controller and test to be sure a user cannot access the success page after having logged out.</li>
</ul>



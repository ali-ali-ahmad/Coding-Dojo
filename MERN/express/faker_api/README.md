<h1>Assignment: Faker API</h1>

<p>In this assignment, we will be using 2 Javascript libraries to create a simple API that generates User and Company objects depending on the requested route. The libraries we will be using are <strong>Express</strong> for the server and <strong>Faker</strong> for the random data generation. The goal is to start broadening our understanding of APIs.</p>

<p>For this assignment, you are tasked with creating User and Company objects</p>


<ul>
    <li>User Object
        <ul>
            <li>password</li>
            <li>email</li>
            <li>phoneNumber</li>
            <li>lastName</li>
            <li>firstName</li>
            <li>_id</li>
        </ul>
    </li>
    <li>Company Object
        <ul>
            <li>_id</li>
            <li>name</li>
            <li>address
                <ul>
                    <li>street</li>
                    <li>city</li>
                    <li>state</li>
                    <li>zipCode</li>
                    <li>country</li>
                </ul>
            </li>
        </ul>
    </li>
</ul>

<h2>Faker</h2>
<p>The faker library has a ton of methods we can use to populate specific fields with randomly generated data.</p>
<p><a href="https://github.com/faker-js/faker">You can find faker's installation instructions here, as well as some basic examples of the library in action.</a></p>
<p><strong>Here is an example of how we can use faker</strong></p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/express/faker_api/screenshots/pic.jpg"/>
<hr/>

<p>To Do List:</p>
<ul>
    <li>Create a new project folder "Faker_API" and with your terminal, navigate into your new folder</li>
    <li>Create a package.json file using the "npm init -y" command in your terminal</li>
    <li>install express and faker</li>
    <li>Create a server.js file</li>
    <li>In your server.js file, import express and bring in faker as shown in the example</li>
    <li>Create 2 functions: createUser, createCompany that return an object with the properties listed above</li>
    <li>Create an api route "/api/users/new" that returns a new user</li>
    <li>Create an api route "/api/companies/new" that returns a new company</li>
    <li>Create an api route "/api/user/company" that returns both a new user and a new company</li>
    <li>Run your server.js file using nodemon</li>
    <li>Using Postman, test your new GET routes</li>
</ul>


<h1>Friendships</h1>

<h3>Objectives:</h3>

<ol>
    <li>Practice designing ERDs with self joins</li>
</ol>

<hr>

<p>Create an ERD to represent the database for an application that tracks users and their friends.</p>

<p>Each user should have an id, first_name, last_name, created_at and updated_at. Create a self join relationship (many to many to same table), where a user can have a friend (another user from the same table). Use the MySQL Workbench for creating this diagram.</p>

<p>To Do List:</p>
<ul>
    <li>Create a new model (ERD)</li>
    <li>Name the schema friendships_schema</li>
    <li>Create a table called users and add the following fields: id, first_name, last_name, created_at and updated_at</li>
    <li>Create a many to many relationship to the users table and rename it friendships</li>
    <li>Add the following fields into the friendship table: id, created_at and updated_at</li>
    <li>Rename the relationship fields to user_id and friend_id</li>
    <li>Take a screen shot of the ERD and upload the .png file</li>
</ul>



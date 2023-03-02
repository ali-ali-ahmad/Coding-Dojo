<h1>Friendships</h1>

<h3>Objectives:</h3>

<ol>
    <li>Practice creating databases</li>
    <li>Practice SQL queries and self joins</li>
</ol>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/WEB-FUNDAMENTALS/MySQL/queries/friendships/screenshots/pic1.jpg"/>

<p>After adding users to the database and creating some relationships, your results should look like below:</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/WEB-FUNDAMENTALS/MySQL/queries/friendships/screenshots/pic2.jpg"/>

<p>Your actual query will look something similar to this:</p>

```MySQL
SELECT * FROM users 
JOIN friendships ON ____=____ 
LEFT JOIN users as user2 ON ____ = ____
```

<p>Take note that we're joining the users table again but we're specifying the second users table as user2.  You can then reference the second users by calling user2 (e.g. user2.id, user2.first_name, etc).</p>

<p>You can also rename the fields that are displayed on the result by using the as keyword, like the below example:</p>

```MySQL
SELECT user2.first_name as friend_first_name, user2.last_name as friend_last_name, ...  FROM ...
```

<p>To Do List:</p>
<ul>
    <li>Forward engineer the friendships_schema from the previous chapter</li>
    <li>Query: Create 6 new users</li>
    <li>Query: Have user 1 be friends with user 2, 4 and 6</li>
    <li>Query: Have user 2 be friends with user 1, 3 and 5</li>
    <li>Query: Have user 3 be friends with user 2 and 5</li>
    <li>Query: Have user 4 be friends with user 3</li>
    <li>Query: Have user 5 be friends with user 1 and 6</li>
    <li>Query: Have user 6 be friends with user 2 and 3</li>
    <li>Query: Display the relationships create as shown in the above image</li>
    <li>NINJA Query: Return all users who are friends with the first user, make sure their names are displayed in results.</li>
    <li>NINJA Query: Return the count of all friendships</li>
    <li>NINJA Query: Find out who has the most friends and return the count of their friends.</li>
    <li>NINJA Query: Return the friends of the third user in alphabetical order</li>
</ul>



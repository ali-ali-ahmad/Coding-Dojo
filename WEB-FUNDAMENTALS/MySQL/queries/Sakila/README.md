<h1>Sakila</h1>

<h3>Objectives:</h3>

<ol>
    <li>Practice SQL queries</li>
</ol>

<hr>

<p>Using the Sakila database, complete the below queries.</p>

<p>You can get the Sakila database and ERD here (<a href="https://github.com/alirabah93/Coding-Dojo/blob/master/WEB-FUNDAMENTALS/MySQL/queries/Sakila/startingFiles/sakila-data.sql">sakila-data.sql</a> and <a href="https://github.com/alirabah93/Coding-Dojo/blob/master/WEB-FUNDAMENTALS/MySQL/queries/Sakila/startingFiles/sakila-db-model.png">sakila-db-model.png</a>), please use these for reference.</p>

<h3>Note</h3>

<p>Earlier in this section, we recommended for students name their tables all lower case and have a primary key called 'id' in each table. These are the rules we follow, however not all developers follow these rules. The SQL file you'll be working with does NOT follow the rules we discussed, including naming the fields lower case. We still want you to follow the rules we taught, but use this as an opportunity to get comfortable with other SQL files that do not completely follow the rules of normalization.</p>

<h3>Queries</h3>

<ol>
    <li>What query would you run to get all the customers inside city_id = 312? Your query should return customer first name, last name, email, and address.</li>
    <li>What query would you run to get all comedy films? Your query should return film title, description, release year, rating, special features, and genre (category).</li>
    <li>What query would you run to get all the films joined by actor_id=5? Your query should return the actor id, actor name, film title, description, and release year.</li>
    <li>What query would you run to get all the customers in store_id = 1 and inside these cities (1, 42, 312 and 459)? Your query should return customer first name, last name, email, and address.</li>
    <li>What query would you run to get all the films with a "rating = G" and "special feature = behind the scenes", joined by actor_id = 15? Your query should return the film title, description, release year, rating, and special feature. Hint: You may use LIKE function in getting the 'behind the scenes' part.</li>
    <li>What query would you run to get all the actors that joined in the film_id = 369? Your query should return the film_id, title, actor_id, and actor_name.</li>
    <li>What query would you run to get all drama films with a rental rate of 2.99? Your query should return film title, description, release year, rating, special features, and genre (category).</li>
    <li>What query would you run to get all the action films which are joined by SANDRA KILMER? Your query should return film title, description, release year, rating, special features, genre (category), and actor's first name and last name.</li>
</ol>

<p>Note: You may download this PDF file displaying the expected results from the questions above - <a href="https://github.com/alirabah93/Coding-Dojo/blob/master/WEB-FUNDAMENTALS/MySQL/queries/Sakila/startingFiles/mysql_sakila_expected_output.pdf">Expected Result (Sakila)</a></p>

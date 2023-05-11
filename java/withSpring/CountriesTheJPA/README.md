<h1>Queries and Joins</h1>

<p>Objectives:</p>
<ul>
    <li>Execute advanced queries using JPA native queries</li>
</ul>

<hr/>

<p>In this assignment, you will create the queries for MySQL Countries using JPA native queries. If you do not have the world database yet, download it <a href="https://github.com/alirabah93/Coding-Dojo/tree/master/java/withSpring/CountriesTheJPA/StartFiles">here</a>, and run it in MySQL Workbench.</p>

<p><strong>World ERD:</strong></p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/withSpring/CountriesTheJPA/screenshots/pic1.jpg"/>

<p><strong>Display the data in 8 separate tables (one for each query):</strong></p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/java/withSpring/CountriesTheJPA/screenshots/pic2.jpg"/>

<p>Tasks:</p>
<ol>
    <li>What query would you run to get all the countries that speak Slovene? Your query should return the name of the country, language, and language percentage. Your query should arrange the result by language percentage in descending order.</li>
    <li>What query would you run to display the total number of cities for each country? Your query should return the name of the country and the total number of cities. Your query should arrange the result by the number of cities in descending order.</li>
    <li>What query would you run to get all the cities in Mexico with a population of greater than 500,000? Your query should arrange the result by population in descending order.</li>
    <li>What query would you run to get all languages in each country with a percentage greater than 89%? Your query should arrange the result by percentage in descending order.</li>
    <li>What query would you run to get all the countries with Surface Area below 501 and Population greater than 100,000?</li>
    <li>What query would you run to get countries with only Constitutional Monarchy with a surface area of more than 200 and a life expectancy greater than 75 years?</li>
    <li>What query would you run to get all the cities of Argentina inside the Buenos Aires district and have the population greater than 500, 000? The query should return the Country Name, City Name, District, and Population.</li>
    <li>What query would you run to summarize the number of countries in each region? The query should display the name of the region and the number of countries. Also, the query should arrange the result by the number of countries in descending order.</li>
</ol>

<p><strong>Reference table:</strong></p>

<table>
    <tr>
        <td><strong>MySQL Type</strong></td>
        <td><strong>Java Type</strong></td>
    </tr>
    <tr>
        <td>Char</td>
        <td>String</td>
    </tr>
    <tr>
        <td>VARCHAR</td>
        <td>String</td>
    </tr>
    <tr>
        <td>LONGVARCHAR</td>
        <td>String</td>
    </tr>
    <tr>
        <td>NUMERIC</td>
        <td>java.math.BigDecimal</td>
    </tr>
    <tr>
        <td>DECIMAL</td>
        <td>java.math.BigDecimal</td>
    </tr>
    <tr>
        <td>BIT</td>
        <td>boolean</td>
    </tr>
    <tr>
        <td>TINYBIT</td>
        <td>byte</td>
    </tr>
    <tr>
        <td>SMALLINT</td>
        <td>short</td>
    </tr>
    <tr>
        <td>INTEGER</td>
        <td>int</td>
    </tr>
    <tr>
        <td>BIGINT</td>
        <td>long</td>
    </tr>
    <tr>
        <td>REAL</td>
        <td>float</td>
    </tr>
    <tr>
        <td>FLOAT</td>
        <td>double</td>
    </tr>
    <tr>
        <td>DOUBLE</td>
        <td>double</td>
    </tr>
</table>

<p>Ninja Bonus help: <a href="https://docs.spring.io/spring-data/data-jpa/docs/current/reference/html/#repository-query-keywords">Spring JPA Keywords</a></p>

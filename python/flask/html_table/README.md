<h1>HTML Table</h1>

<p>Objectives:</p>
<ul>
    <li>Get comfortable passing information from the route to the template</li>
    <li>Get very comfortable iterating through a list of dictionaries to generate a html output.</li>
</ul>

<hr>


<p>Getting comfortable with iterating through a list of dictionaries is very important for all web development! Records returned from a database will almost always be in this format.</p>

<p>Create the following list of dictionaries and have it available for your route.</p>

```python
users = [
    {'first_name' : 'Michael', 'last_name' : 'Choi'},
    {'first_name' : 'John', 'last_name' : 'Supsupin'},
    {'first_name' : 'Mark', 'last_name' : 'Guillen'},
    {'first_name' : 'KB', 'last_name' : 'Tonel'}
]
```

<p>Pass users to your template and have your template output an HTML table like this:</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/flask/html_table/screenshots/pic.jpg"/>

<p>As you need to get into the habit of making your assignment look nice, we challenge you to use either <a href="https://getbootstrap.com/">Bootstrap</a> or <a href="https://get.foundation/">Foundation</a>. If you haven't dabbled with these frameworks, start by learning just enough to do this assignment (creating a nice looking table).</p>


<p>To Do List:</p>
<ul>
    <li>Start a new Flask project</li>
    <li>Create a route in which the data above is declared and then sent to the template engine to be rendered</li>
    <li>Create the template that displays the data in a table</li>
    <li>NINJA BONUS: Use a framework to format the table</li>
</ul>



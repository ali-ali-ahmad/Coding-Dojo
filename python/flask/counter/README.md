<h1>Counter</h1>

<p>Objectives:</p>
<ul>
    <li>Practice using session to store data about a particular client's history with the app</li>
    <li>Be able to check whether a session exists</li>
    <li>Be able to initialize a session</li>
    <li>Be able to modify a session</li>
</ul>

<hr>

<p>Build a flask application that counts the number of times the root route ('/') has been viewed. </p>

<p>This assignment is to test your understanding of session.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/python/flask/counter/screenshots/pic.jpg"/>

<p>As part of this assignment, please start with the following features first:</p>

<ul>
    <li>localhost:5000 - have the template render the number of times the client has visited this site</li>
    <li>localhost:5000/destroy_session - Clear the session. Once cleared, redirect to the root.</li>
</ul>

<h3>Some Helpful Tips</h3>

<p>We can't increment something that doesn't exist! Here's how to check if a key exists in session yet:</p>

```python
if 'key_name' in session:
    print('key exists!')
else:
    print("key 'key_name' does NOT exist")
```

<p>If we want to get rid of what is currently stored in session:</p>

```python
session.clear()		# clears all keys
session.pop('key_name')		# clears a specific key
```


<p>To Do List:</p>
<ul>
    <li>Create a new Flask project called counter</li>
    <li>Have the root route render a template that displays the number of times the client has visited this site. Refresh the page several times to ensure the counter is working.</li>
    <li>Add a "/destroy_session" route that clears the session and redirects to the root route. Test it.</li>
    <li>NINJA BONUS: Add a +2 button underneath the counter and a new route that will increment the counter by 2</li>
    <li>NINJA BONUS: Add a Reset button to reset the counter</li>
    <li>SENSEI BONUS: Add a form that allows the user to specify the increment of the counter and have the counter increment accordingly</li>
    <li>SENSEI BONUS: Adjust your code to display both how many times the user has actually visited the page, as well as the value of the counter, given the above functionality</li>
</ul>



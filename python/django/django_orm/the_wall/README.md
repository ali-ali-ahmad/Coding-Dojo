<h1>The Wall</h1>

<p>Objectives:</p>
<ul>
    <li>Practice connecting a Django application to a database</li>
    <li>Integrate the login app with another app</li>
    <li>Practice one-to-many relationships</li>
    <li>Practice validating user input and using flash messages</li>
</ul>

<hr>

<p>Create a wall page (think Facebook news feed) where users will be able to post messages and see the messages posted by other users. Follow the below wireframe.</p>

<p>This app will be integrated with our login app. After successfully logging in or registering, a user should be redirected to <code>localhost:8000/wall</code>, where the wall is displayed.</p>

<p>Download the <a href="https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/flask_wall.png">handout</a> for the wireframe/ERD:</p>

<img src=""/>

<p>Once you get the messages functionality working, allow users to post comments for any message. Comments should be in a separate database table from messages.</p>

<h4>Helpful Tip</h4>

<p>In Jinja, say that you made available a variable called 'messages' where 'messages' contained all the messages in the Wall.  For some reason, the following code would not work:</p>

```html
{% for comment in message.comments.all() %}
   <p>{{comment.comment}}</p>
{% endfor %}
```

<p>This however does work.</p>

```html
{% for comment in message.comments.all %}    # no parentheses!
   <p>{{comment.comment}}</p>
{% endfor %}
```

<h4>Extra Credit I (optional but highly recommended)</h4>

<p>Allow the user to delete his/her own messages.</p>

<h4>Extra Credit II (optional but highly recommended)</h4>

<p>Allow the user to delete his/her own message but only if the message was made in the last 30 minutes.</p>

<p>To Do List:</p>
<ul>
    <li>Create a new Django project and bring in your login app (or recreate it) and create a new wall app</li>
    <li>Set up the necessary models</li>
    <li>Allow users to post messages</li>
    <li>Display all messages on the main page</li>
    <li>Allow users to comment on each message</li>
    <li>Display all comments per message</li>
    <li>NINJA BONUS: Allow users to delete only their own messages</li>
    <li>SENSEI BONUS: Allow the user to delete their own messages only if the message was written within the last 30 minutes</li>
    <li>SENSEI BONUS: Use AJAX for adding comments, deleting messages, and deleting comments</li>
</ul>



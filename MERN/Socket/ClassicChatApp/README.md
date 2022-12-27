<h1>Assignment: Team Manager</h1>

<p>Building off of the previous assignment, your task is to create a fully functional chat application. Have your cohort mates help test your application throughout your development process.</p>
<p><strong>There is ONE unspoken, not found on the internet, hard to fix, not straightforward bug when building your chat app.</strong></p>
<p>On the client, when you are setting state inside of an event listener, you will need to set state in a very, very specific way. Below is what you need to know. When you call your "setter" function, instead of passing it the new value, you need to pass it a callback function that will compute the new value based on the existing value. See the diagram below for an example.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/Socket/ClassicChatApp/screenshots/pic1.jpg"/>

<p>Feel free to design your Chat App as you would like it, but for an example see the wireframe below.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/Socket/ClassicChatApp/screenshots/pic2.jpg"/>


<hr/>

<h4>Resources</h4>
<ul>
    <li><a href="https://socket.io/docs/v4/">socket.io docs</a></li>
    <li><a href="https://reactjs.org/docs/hooks-reference.html#functional-updates">Functional Updates</a></li>
</ul>
<p>To Do List:</p>
<ul>
    <li>Build a fully functional chat application</li>
    <li>Bonus: Keep the chat messages scrolled to the bottom by default</li>
    <li>Ninja Bonus: Add different chat rooms that users can join</li>
    <li>Sensei Bonus: Display chat messages from before a user has joined the chat when they join</li>
</ul>

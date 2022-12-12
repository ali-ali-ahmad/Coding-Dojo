<h1>Assignment: Todo List</h1>

<p>Ah, the todo list! A ubiquitous project for any respectable JavaScript framework. Your job is to create a small React application to store and modify a list of tasks. Each task will have a text string as well as a completed property, which will be set to false initially. As you check off items, they should appear slashed out on the page. Using what you know about state and iterating through lists, render a list of items, and give the user the option to remove each item and add new ones. There are different ways to implement the remove function. One way to do it is using the <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">built-in filter method</a>. Filter returns a new array when invoked and is a great way to stay true to the functional nature of React.</p>

<p>Hint: When updating the state, make sure to send in a brand new object or array; otherwise React won't update the view.</p>

<img src="https://github.com/alirabah93/Coding-Dojo/blob/master/MERN/react/to_do_list/screenshots/pic.jpg"/>

<hr/>

<p>To do list</p>
<ul>
    <li>Iterate through the existing tasks using the map method.</li>
    <li>Allow the user to add a new task, initially set to not completed.</li>
    <li>Allow the user to remove a task by clicking the delete button.</li>
    <li>Allow the user to toggle a task's completion property by clicking the checkbox next to it.</li>
    <li>Ninja Bonus: When updating the tasks' state, don't mutate the current task objects or the current task list.</li>
    <li>Sensei Bonus: Persist the todos list on page refreshes. Hint, consider combining the browser's localStorage with the useEffect hook.</li>
</ul>


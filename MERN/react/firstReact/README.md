<h1>First React</h1>

<p>Let's start jumping right into React. Since React is just a JavaScript library, we can plug it right into our html. First, go to a folder that you want to start creating your React project. Next, within that folder, create an index.html file. Then, copy the following code into your index.html file:</p>

```html
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Hello React</title>
    </head>
    <body>
        <div id="root">
            <h1>First React page rendering...</h1>
        </div>
        
        <script src="https://unpkg.com/react@18/umd/react.development.js" crossorigin></script>
        <script src="https://unpkg.com/react-dom@18/umd/react-dom.development.js" crossorigin></script>
    </body>
</html>
```

<p>If you open index.html in your browser, you should see an h1 tag that says "First React page rendering...". Also, we have included two scripts that we will need for React. We have not set up React in our index.html yet (other than including the external JavaScript), so you will be waiting for the rest of time if you want to wait for React to render. Next, let's actually add some custom React scripts to our file. We have already told our user that our React page is rendering, so let's actually render it. <strong>After the last external React script, create another script tag to contain our code. We will add the following:</strong></p>

```js
const domContainer = document.querySelector('#root');
const root = ReactDOM.createRoot(domContainer);
root.render(React.createElement("h1", {}, "Our First React page has rendered"));    
```

<p>What happened here? We created a new variable called <code>domContainer</code>, selecting an HTML element with the id of <code>root</code>. This is the HTML that React is in control of. Anything outside of that root div, React will not be able to touch. Then we created a root with <code>ReactDOM.createRoot</code>. It's a simple function that defines the entry point into our DOM. This is where and what React is allowed to interact with.</p>

<p>Finally we rendered some content with <code>root.render</code>, but what's more interesting is the function we passed inside.</p>

<p>On a simple React application like this, every time we want to create a new element and render it into our root, we run <code>React.createElement</code>. Using <code>React.createElement</code>, we're saying we want a new <code>h1</code> tag that contains a string of text. The empty curly braces <code>{}</code> we don't need to worry about right now, but that's for passing props and events.</p>

<p>We have just written our first React project. If you open your index.html, you should briefly see "First React page rendering..." before seeing "Our First React page has rendered". Our browser will first show the html we have written.</p>

<p>Then, after the React scripts load, our browser executes the script that will call the method <code>root.render</code>. This method will overwrite what we originally had in the div with id <code>root</code> with an <code>h1</code> that contains "Our First React page has rendered". If you continue to refresh your page, you can see it quickly change. Congratulations! You have created your first React project.</p>

<p><strong>IMPORTANT: Do not include the node_modules folder in your zip upload! The easiest way to do this is to highlight all the other files and folders in your project folder and compress them.</strong></p>

<h4>To Do List</h4>
<ul>
    <li>Create your first React App</li>
</ul>
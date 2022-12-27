<h1>Assignment: The Handshake</h1>

<p>To practice making the socket connection, follow the steps below to create a fresh MERN project and set up the socket connection between the client and the server. Once the connection is complete, and both your Node server and React server are running, you can ask other members of your cohort to connect to your server using your computer's ip address. To get ahold of your IP address:</p>
<p><strong>WINDOWS</strong> - open command prompt and type:</p>
<p><code>ipconfig</code></p>
<p>You should then get results showing some IP addresses. If you are connected to the internet using a wifi connection, choose the IP address listed under your WIFI adapter. If you are connected using a hard wire cable, choose the ip address listed under WIRED.</p>
<p><strong>MAC</strong> - open system settings and navigate to the Network Preferences window. There you will find your IP address.</p>
<p>Once you have your IP, have a cohort mate type your IP address and the port into his or her browser's address bar. For example:</p>
<p><code>192.168.1.89:3000</code></p>
<p>Opening up the browser's developer tools, he or she should see the message from the server in the console tab.</p>
<p>For every person that connects to your IP address, you will see a new log in your Node terminal.</p>
<p></p>

<hr/>

<p>To Do List:</p>
<ul>
    <li>Create a fresh, new MERN project</li>
    <li>SERVER - install socket.io and express</li>
    <li>SERVER - In your server.js file setup your express server and socket.io</li>
    <li>SERVER - Inside the io.("connection", socket => {}) function, add a console.log("Nice to meet you. (shake hand)")</li>
    <li>SERVER - After the console.log(), create a socket.emit() event and pass in a simple string welcome message</li>
    <li>CLIENT - Install socket.io-client</li>
    <li>CLIENT - create a Chat.jsx component (we will continue using this assignment through the next assignment)</li>
    <li>CLIENT - create a listener for the welcome event and console log the data</li>
</ul>

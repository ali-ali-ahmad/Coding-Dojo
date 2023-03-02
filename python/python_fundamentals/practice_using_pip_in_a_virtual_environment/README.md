<h1>Practice using pip in a virtual environment</h1>

<h3>Objectives:</h3>

<ol>
    <li>Get accustomed to using commands required to use pip modules</li>
    <li>Practice using a virtual environment</li>
</ol>

<hr>

<p>You will need to use your terminal to run these commands. Open up terminal, command prompt, or git bash to continue. Activate your virtual environment before running any of these commands! Remember that you can tell whether your virtual environment is activated by the prompt in your terminal. Here, we can see that the virtual environment py3Env is activated:</p>

<img scr="https://github.com/alirabah93/Coding-Dojo/blob/master/python/python_fundamentals/practice_using_pip_in_a_virtual_environment/screenshots/pic.jpg"/>

<p>Run these commands in the order instructed. Your assignment submission should be a .txt file that includes a short explanation of what you were able to learn about each command by doing a brief (1-2 min) web search for each term. If it is relevant, include the output of your command and your understanding of what it means. It is important to always read your terminal output and try to understand it.</p>

<p>Reminder: when your virtualenv is activated, you may use the <code>pip</code> command. If not, use <code>pip3</code>.</p>

<p><strong>Run the following commands:</strong></p>



<p><code>pip list</code></p>

<p><code>deactivate</code> (This will deactivate your virtual environment)</p>

<p><code>pip3 lis</code>t (How is the result different from when you ran <code>pip list</code> with the virtualenv activated? Hint, you should not have as many things listed when the virtualenv is deactivated. If your results are the same, go back and figure out what went wrong.)</p>

<p><code>source myEnvironments/py3Env/bin/activate</code> (Adjust the path as needed to re-activate the virtualenv; for windows <code>call myEnvironments/py3Env/Scripts/activate</code>)</p>

<p><code>pip install Django==2.2.4</code> (What information do you see returned in terminal after this command?)</p>

<p><code>pip freeze</code> (What's the difference between freeze and list?)</p>

<p>First cd into your Desktop directory (<code>cd ~/Desktop</code>), then run this command: <code>pip freeze > requirements.txt</code>. What do you see when you <code>ls</code>? What's inside this file?</p>

<p><code>pip uninstall Django</code></p>

<p><code>pip show Django</code></p>


<h1>Modular Practice</h1>

<p>Objectives:</p>
<ul>
    <li>Gain familiarity with modules</li>
    <li>Learn about the variable __name__</li>
    <li>Practice modularizing code</li>
</ul>

<hr>

<p>For this assignment, create a folder called modularizing and follow all the steps outlined below.</p>

<h3>Modularizing and Importing</h3>

<p>Remember modules are really just files. Create two Python files--call one parent and one child. We'll work with parent first. Open <code>parent.py</code> and insert the following:</p>

<h4>modularizing/parent.py</h4>

```python
local_val = "magical unicorns"
def square(x):
    return x * x
class User:
    def __init__(self, name):
        self.name = name
    def say_hello(self):
        return "hello"
```

<p>Now we have a document with a local variable, a function and a class. If we run this document from the command line, we will see no results. We haven't asked to print anything, nor have we called our function or class method. As we know, without printing, it's difficult to know what our code did when it ran. Let's look at our code by running our functions and printing the result.</p>

<h4>modularizing/parent.py</h4>

```python
# in the same file, add the following below the User class
print(square(5))
user = User("Anna")
print(user.name)
print(user.say_hello())
```

<p>Now, we can see in our terminal window whether our code runs as expected. Now let's see what happens when we import parent into child. In <code>child.py</code>:</p>

<h4>modularizing/child.py</h4>

```python
import parent
```

<p>Before writing anything else, run <code>child.py</code>. Check what's in your directory. What changed? You should see a directory called __pychache__ which contains a <code>.pyc</code> file. This file contains Python bytecode - the language the Python interpreter speaks. Since these files are in a language Python knows so we can run them like any other Python file: (e.g., python __pycache__/parent.cpython-36.pyc).</p>

<p>One way these <code>.pyc</code> files will be created is when a module is imported. This is why you may not have seen .pyc files before now. Once a <code>.pyc</code> file is generated, as long as we don't change that file, Python will not have to re-compile your code to bytecode, which may save processing time when working with large code bases.</p>

<p>You probably also noticed that all of your code from <code>parent.py</code> executed on the import statement. This means that every print statement and variable instantiation is still happening. That's fine, but let's use a concept called namespace and a built-in variable called <code>__name__</code> to clean up our code.</p>

<h3>Namespace:</h3>

<p>Namespace refers to which variables, functions, and classes are accessible to us at any given time during a program’s execution. Namespace is important because we have to know what variables we have access to. To see what variables are available in any given place, add the line <code>print(locals())</code> and see what variables are in your current namespace. The object that prints will be a dictionary where the variable names are keys and the objects they reference are the values. Understanding namespace will help you understand the next portion, where we will use namespace to control the functionality that is imported with our document.</p>

<p>Whenever we create a new file and execute it, the Python interpreter automatically creates several variables. We’ll look closer at one of them: the variable __name__. To learn how to use this variable in your own code, follow the steps below:</p>

<p>1. __name__ is not only automatically created, but is also assigned a value. In your document parent.py add this line:</p>
<h4>modularizing/parent.py</h4>

```python
print(__name__)
```
<p>2. execute <code>parent.py</code> from the command line</p>

<p>3. You should see __main__ printed to the console</p>
<p>4. In <code>child.py</code> you should already have imported parent, if not, add that line now</p>
<p>5. Execute <code>child.py</code> from the command line</p>
<p>6. You should see parent printed to the console.</p>
<p>7. In <code>parent.py</code> add the following:</p>
<h4>modularizing/parent.py</h4>

```python
if __name__ == "__main__":
    print("the file is being executed directly")
else:
    print("The file is being executed because it is imported by another file. The file is called: ", __name__)
```
<p>8. Now try running the file directly. You should see the file is being executed directly printed in the console.</p>
<p>9. Execute <code>child.py</code> You should see The file is being executed because it is imported by another file. The file is called: parent</p>

<p>10. How is this useful? We can use this conditional to prevent blocks of code from executing unless the file is being run directly. Why would we want to do this? Consider a situation where one class depends on another, as in the Users with Bank Accounts assignment. In our product document we might create a lot of test code to make sure we can create new products and execute methods. When we import products to the store file as a module, we don’t want to see all of those tests run every time we execute the store file, so inside of our product document, we might have something like below:</p>

```python
if __name__ == "__main__":
    product = Product([args])
    print(product)
    print(product.add_tax(0.18))
```
<h1>Chaining Methods</h1>

<p>Objectives:</p>
<ul>
    <li>Understand how to chain methods</li>
</ul>

<hr>

<p>In the last assignment, your code might have looked something like this:</p>

```python
guido.make_deposit(100)
guido.make_deposit(200)
guido.make_deposit(300)
guido.make_withdrawal(50)
guido.display_user_balance()
```

<p>This takes up a lot of space and we're repeating our call to guido many times. There is a way to call on guido just once and keep attaching new method calls to the end of the previous one, like so:</p>

```python
guido.make_deposit(100).make_deposit(200).make_deposit(300).make_withdrawal(50).display_user_balance()
```

<p>This is called <strong>chaining</strong>. In order for this to work, each method must return self. By returning self, if we recall how functions work, each method call will now be equal to the instance that called it.</p>

<p>For example if <code>guido.make_deposit(100)</code> returns its own instance (guido), then we can call one of that instance's methods after that call, like <code>guido.make_deposit(100).make_withdrawal(50)</code>.</p>

```python
class User:
    def make_deposit(self, amount):
        # your code goes here...
        return self
```


<p>The practice of having OOP return its own instance is pretty common and is done in other programming languages, though the variable name in some languages is not <code>self</code>, but instead <code>this</code>.</p>

<p>To Do List:</p>
<ul>
    <li>Update your previous assignment so that each instance's methods are chained</li>
</ul>



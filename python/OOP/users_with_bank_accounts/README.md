<h1>Users with Bank Accounts</h1>

<p>Objectives:</p>
<ul>
    <li>Practice writing classes with associations</li>
</ul>

<hr>

<p>Update your existing User class to have an association with the BankAccount class. You should not have to change anything in the BankAccount class. The method signatures of the User class (the first line of the method with the <code>def</code> keyword) should also remain the same.</p>


<p>For example, our User class currently has a method like this:</p>

```python
class User:
    # other methods
    def make_deposit(self, amount):
    	self.account_balance += amount	# hmmm...the User class doesn't have an account_balance attribute anymore
```

<p>But our User class no longer has a <code>self.account_balance</code> attribute. Instead, we have replaced this with an instance of a BankAccount by the name of <code>self.account</code>. That means our make_deposit (and other methods referencing self.account_balance) need to be updated! That's the goal of this assignment.</p>

<p>Remember in our User methods, we can now access the BankAccount class through our <code>self.account</code> attribute, like so:</p>

```python
class User:
    def example_method(self):
        self.account.deposit(100)		# we can call the BankAccount instance's methods
    	print(self.account.balance)		# or access its attributes
```

<p>To Do List:</p>
<ul>
    <li>Update the User class __init__ method</li>
    <li>Update the User class make_deposit method</li>
    <li>Update the User class make_withdrawal method</li>
    <li>Update the User class display_user_balance method</li>
    <li>SENSEI BONUS: Allow a user to have multiple accounts; update methods so the user has to specify which account they are withdrawing or depositing to</li>
</ul>



<h1>Bank Account</h1>

<p>Objectives:</p>
<ul>
    <li>Practice writing classes</li>
</ul>

<hr>

<p>As we continue thinking about our banking application, we realize that it would be more accurate to assign a balance not to the user directly, but that in the real world, users have accounts, and accounts have balances. This gives us the idea that maybe an account is its own class! But as we stated, it is not completely independent of a class; accounts only exist because users open them.</p>

<p>For this assignment, don't worry about putting any user information in the BankAccount class. We'll take care of that in the next lesson!</p>

<p>Let's first just get some more practice writing classes by writing a new BankAccount class.</p>

<p>The BankAccount class should have a balance. When a new BankAccount instance is created, if an amount is given, the balance of the account should initially be set to that amount; otherwise, the balance should start at $0. The account should also have an interest rate, saved as a decimal (i.e. 1% would be saved as 0.01), which should be provided upon instantiation. (Hint: when using default values in parameters, the order of parameters matters!)</p>

<p>The class should also have the following methods:</p>

<ul>
    <li><strong>deposit(self, amount)</strong> - increases the account balance by the given amount</li>
    <li><strong>withdraw(self, amount)</strong> - decreases the account balance by the given amount if there are sufficient funds; if there is not enough money, print a message "Insufficient funds: Charging a $5 fee" and deduct $5</li>
    <li><strong>display_account_info(self)</strong> - print to the console: eg. "Balance: $100"</li>
    <li><strong>yield_interest(self)</strong> - increases the account balance by the current balance * the interest rate (as long as the balance is positive)</li>
</ul>

<p>This means we need a class that looks something like this:</p>


```python
class BankAccount:
	def __init__(self, int_rate, balance): # don't forget to add some default values for these parameters!
		# your code here! (remember, this is where we specify the attributes for our class)
                # don't worry about user info here; we'll involve the User class soon
	def deposit(self, amount):
		# your code here
	def withdraw(self, amount):
		# your code here
	def display_account_info(self):
		# your code here
	def yield_interest(self):
		# your code here
```

<p>To Do List:</p>
<ul>
    <li>Create a BankAccount class with the attributes interest rate and balance</li>
    <li>Add a deposit method to the BankAccount class</li>
    <li>Add a withdraw method to the BankAccount class</li>
    <li>Add a display_account_info method to the BankAccount class</li>
    <li>Add a yield_interest method to the BankAccount class</li>
    <li>Create 2 accounts</li>
    <li>To the first account, make 3 deposits and 1 withdrawal, then yield interest and display the account's info all in one line of code (i.e. chaining)</li>
    <li>To the second account, make 2 deposits and 4 withdrawals, then yield interest and display the account's info all in one line of code (i.e. chaining)</li>
</ul>



class BankAccount:
    def __init__(self, int_rate=0.00, balance=0):
        self.interest_rate = int_rate
        self.balance = balance
        print(type(self))

    def deposit(self, amount):
        self.balance += amount
        return self

    def withdraw(self, amount):
        if self.balance < amount:
            self.balance -= 5
            print("Insufficient funds: Charging a $5 fee")
        else: self.balance -= amount
        return self

    def display_account_info(self):
        # print("The account balance is:", self.balance, "$")
        return self

    def yield_interest(self):
        self.balance += self.balance * self.interest_rate
        return self


class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.accounts = {'098765446': BankAccount()}

        # self.accounts['nis account']

    def create_new_account(self, int_rate, balance=0, accountNum):
        self.account[accountNum] = BankAccount(int_rate, balance)
        print(self.name, "has created a new account with interest rate:", int_rate, "and deposited:", balance, "$")

    def make_deposit(self, account_number, amount):
        self.accounts[account_number].deposit(amount)
        print(self.name, "made deposit of", self.account[account_number].balance, "$", "on account number:", account_number)

    def make_withdrawal(self, account_number, amount):
        self.accounts[account_number].withdraw(amount)
        print(self.name, "Made a withdrawal of", self.account[account_number].balance, "$", "from account number:", account_number)

    def display_user_balance(self, account_number):
        self.accounts[account_number].display_account_info()
        print(self.name, "Balance is:", self.account[account_number].balance, "$", "on account number:", account_number)

    def transferMoney(self, my_account_num, User, user_account_num, amount):
        self.accounts[my_account_num].withdraw(amount)
        User.accounts[user_account_num].deposit(amount)
        print(self.name, "transfered", amount, "$", "from account number:", my_account_num, "to:", User.name, "account number:", user_account_num, "$")



Ayesh = User("Ayesh", "Ayesh@gmail.com")
Ameer = User("Ameer", "Ameer@gmail.com")
Omer = User("Omer", "omer@gmail.com")

Ayesh.make_deposit(0, 1000)
Omer.make_deposit(0, 10342532)
Ameer.make_deposit(0, 73246)


Ayesh.make_withdrawal(0, 364)
Ameer.make_withdrawal(0, 2332)
Omer.make_withdrawal(0, 565)

Ayesh.display_user_balance(0)
Ameer.display_user_balance(0)
Omer.display_user_balance(0)

Ayesh.create_new_account(0.05, 3000)
Omer.create_new_account(0.04, 6534)
Ameer.create_new_account(0.03, 6546)

Ayesh.make_deposit(1, 104300)
Omer.make_deposit(1, 142532)
Ameer.make_deposit(1, 24436)

Ayesh.make_withdrawal(1, 3364)
Ameer.make_withdrawal(1, 322332)
Omer.make_withdrawal(1, 56532)

Ayesh.display_user_balance(1)
Ameer.display_user_balance(1)
Omer.display_user_balance(1)







Ameer.transferMoney(0, Ayesh, 1, 130)
Omer.transferMoney(1, Ayesh, 0, 9321)



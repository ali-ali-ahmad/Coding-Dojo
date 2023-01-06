class BankAccount:
    def __init__(self, int_rate = 0.00, balance = 0):
        self.interest_rate = int_rate
        self.balance = balance
        
    def deposit(self, amount):
        self.balance += amount
        return self

    def withdraw(self, amount):
        self.balance -= amount
        if self.balance<0:
            self.balance -= 5
            print("Insufficient funds: Charging a $5 fee")
        return self

    def display_account_info(self):
        print("The account balance is:", self.balance, "$")
        return self

    def yield_interest(self):
        self.balance += self.balance * self.interest_rate
        return self


account1 = BankAccount(0.02, 100)
account2 = BankAccount(0.01, 200)


account1.deposit(200).deposit(200).deposit(500).withdraw(500).yield_interest().display_account_info()
account2.deposit(300).deposit(100).withdraw(50).withdraw(150).withdraw(30).withdraw(500).yield_interest().display_account_info()


class User:
    def __init__(self, name):
        self.name = name
        self.balance = 0
        
    def make_deposit(self, amount):
        self.balance += amount
        print(self.name, "made deposit of", self.balance, "$")

    def make_withdrawal(self, amount):
        self.balance -= amount
        print(self.name, "Made withdrawal of", self.balance, "$")
    
    def display_user_balance(self):
        print(self.name, "Balance is:", self.balance, "$")

    def transferMoney(self, User, amount):
        self.make_withdrawal(amount)
        User.make_deposit(amount)
        print(self.name, "transfered to", User.name, amount, "$")


Ayesh = User("Ayesh")
Ameer = User("Ameer")
Omer = User("Omer")

Ayesh.make_deposit(1000)
Omer.make_deposit(10342532)
Ameer.make_deposit(73246)

Ayesh.make_withdrawal(364)
Ameer.make_withdrawal(2332)
Omer.make_withdrawal(565)

Ayesh.display_user_balance()
Ameer.display_user_balance()
Omer.display_user_balance()

Ameer.transferMoney(Ayesh, 130)
Omer.transferMoney(Ayesh, 9321)
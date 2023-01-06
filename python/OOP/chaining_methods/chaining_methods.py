class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.balance = 0
        
    def make_deposit(self, amount):
        self.balance += amount
        print(self.name, "made deposit of", self.balance, "$")
        return self

    def make_withdrawal(self, amount):
        self.balance -= amount
        print(self.name, "Made withdrawal of", self.balance, "$")
        return self
    
    def display_user_balance(self):
        print(self.name, "Balance is:", self.balance, "$")
        return self

    def transferMoney(self, User, amount):
        self.make_withdrawal(amount)
        User.make_deposit(amount)
        print(self.name, "transfered to", User.name, amount, "$")
        return self


Ayesh = User("Ayesh", "Ayesh@gmail.com")
Ameer = User("Ameer", "Ameer@gmail.com")
Omer = User("Omer", "omer@gmail.com")

Ayesh.make_deposit(1000).make_withdrawal(364).display_user_balance().transferMoney(Ameer, 123)
Omer.make_deposit(10342532).make_withdrawal(565).display_user_balance().transferMoney(Ayesh, 9321)
Ameer.make_deposit(73246).make_withdrawal(2332).display_user_balance().transferMoney(Ayesh, 130)
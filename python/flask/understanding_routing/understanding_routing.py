
# print("*"*80)
from email import message
from ssl import AlertDescription
from xml.dom.pulldom import ErrorHandler
from flask import Flask
print("*"*150)
app = Flask(__name__)
# print("*"*80)

@app.route('/')
def helloWorld():
    return "Hello World!"

@app.route('/dojo')
def dojo():
    return "Dojo!"

@app.route('/say/<name>')
def say(name):
    return "Hi, " + name

@app.route('/repeat/<int:times>/<name>')
def repeat(name, times):
    myList = " "
    for x in range(times):
        myList += name + " "
    return myList

@app.route('/<random>')
def random(random):
    try:
        int(random) #the code that raises the error
    except ValueError:
        raise ValueError("Sorry! No response. Try again.")
        
if __name__=="__main__":
    app.run(debug=True)


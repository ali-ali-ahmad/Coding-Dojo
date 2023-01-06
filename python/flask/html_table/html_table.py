from flask import Flask, render_template
print("*"*150)
app = Flask(__name__)
# print("*"*80)

@app.route('/')
def users_list():
    users_info = [
        {'id':1, 'first_name' : 'Michael', 'last_name' : 'Choi'},
        {'id':2, 'first_name' : 'John', 'last_name' : 'Supsupin'},
        {'id':3, 'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'id':4, 'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
    return render_template("index.html", users = users_info)

if __name__=="__main__":
    app.run(debug=True)


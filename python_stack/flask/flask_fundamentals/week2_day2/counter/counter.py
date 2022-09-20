from flask import Flask, render_template, request, redirect, session

app = Flask(__name__)
app.secret_key = 'codingdojo'
@app.route('/')
def counter():
    return render_template("index.html")

@app.route('/users', methods=['POST'])
def counter_page():
    print("Got Post Info")
    session['clicks_counter'] = request.form['clicks']
    session['default_value'] = request.form['reset']
    return redirect('/show')

@app.route('/show')
def show_user():
    return render_template('show.html', clicks_on_template=session['clicks'], rest_on_template=session['reset'])



if __name__ == "__main__":
    app.run(debug=True)
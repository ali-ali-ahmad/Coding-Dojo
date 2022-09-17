from flask import Flask, render_template
print("*"*150)
app = Flask(__name__)
# print("*"*80)

@app.route('/')
def main_page():
    print("*"*150)
    return render_template("index.html", boxesNum=1) 

@app.route('/play')
def ground1():
    return render_template("index.html", boxesNum=3, color = "blue") 

@app.route('/play/<int:x>')
def ground2(x):
    return render_template("index.html", boxesNum = x, color = "blue") 

@app.route('/play/<int:x>/<newColor>')
def ground3(x, newColor):
    return render_template("index.html", boxesNum = x, color = newColor) 

if __name__=="__main__":
    app.run(debug=True)


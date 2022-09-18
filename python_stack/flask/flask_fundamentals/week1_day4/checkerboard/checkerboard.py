from flask import Flask, render_template
print("*"*150)
app = Flask(__name__)
# print("*"*80)

@app.route('/')
def eigth_eigth():
    print("*"*150)
    return render_template("index.html", rows = 8, columns = 8, color1 = "red", color2 = "black") 

@app.route('/<int:x>')
def eight_four(x):
    return render_template("index.html", rows = x, columns = 8, color1 = "red", color2 = "black") 

@app.route('/<int:x>/<int:y>')
def x_y(x, y):
    return render_template("index.html", rows = x, columns = y, color1 = "red", color2 = "black") 

@app.route('/<int:x>/<int:y>/<newColor1>/<newColor2>')
def coloring(x, y, newColor1, newColor2):
    return render_template("index.html", rows = x, columns = y, color1 = newColor1, color2 = newColor2) 

if __name__=="__main__":
    app.run(debug=True)


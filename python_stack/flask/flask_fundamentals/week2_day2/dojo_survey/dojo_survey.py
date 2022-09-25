from asyncio.windows_events import NULL
from multiprocessing.sharedctypes import Value
from flask import Flask, render_template, request, redirect

app = Flask(__name__)
@app.route('/')
def fillingForm():
    return render_template("index.html")

@app.route('/result', methods=['POST'])
def submitingForm():
    name_form = request.form['name']
    gend_form = request.form['flexRadioDefault']
    location_form = request.form['city_select']
    program_form = request.form['program_select']
    checked1 = request.form["flexCheckboxDefault1"]
    checked2 = request.form["flexCheckboxDefault2"]
    checked3 = request.form["flexCheckboxDefault3"]
    comment_section_form = request.form['comment_section']
    return render_template("show.html", name_on_template=name_form, gender_on_template=gend_form, location_on_template=location_form, program_on_template=program_form, hobbies_on_template=(checked1, checked2, checked3),  comment_section_on_template=comment_section_form)



if __name__ == "__main__":
    app.run(debug=True)
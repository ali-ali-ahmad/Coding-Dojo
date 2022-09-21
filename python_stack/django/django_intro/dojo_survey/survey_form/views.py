from multiprocessing import context
from urllib import request
from django.shortcuts import render, redirect

def index(request):
    return render(request,"index.html")

def show_results(request):
    name = request.POST['name']
    gender = request.POST['flexRadioDefault']
    location = request.POST['city_select']
    program = request.POST['program_select']
    hobby = request.POST['flexCheckboxDefault']
    comment = request.POST['comment']
    context = {
        "name_on_template" : name,
        "gender_on_template" : gender,
        "location_on_template" : location,
        "program_on_template" : program,
        "hobby_on_template" : hobby,
        "comment_on_template" : comment,
    }
    print(context)
    return redirect("/results", "show.html", context)

def success(request):
    show_results(request, context)
    return render(request,"show.html", context)

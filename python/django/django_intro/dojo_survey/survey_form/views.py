from django.shortcuts import render, redirect

def index(request):

    return render(request,"index.html")


def results(request):

    request.session["name"] = request.POST['name']
    request.session["gender"] = request.POST['flexRadioDefault']
    request.session["location"] = request.POST['city_select']
    request.session["program"] = request.POST['program_select']
    request.session["hobby"] = request.POST['flexCheckboxDefault']
    request.session["comment"] = request.POST['comment']

    return redirect('results/show')


def show(request):

    return render(request, "show.html")

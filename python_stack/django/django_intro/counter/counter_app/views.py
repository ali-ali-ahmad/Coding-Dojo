from django.shortcuts import render, redirect

def index(request):
    counter = request.session.get('counter', 0)
    visits = request.session.get('visits', 0)
    request.session['visits'] = visits + 1 
    request.session['counter'] = counter + 1
    return render(request, 'index.html')

# def visits_fun(request):
#     counter = request.session.get('counter', 0)
#     request.session['counter'] = counter + 1
#     return redirect('/')

def destroy(request):
    del request.session['counter']
    del request.session['visits']
    return redirect('/')

def add_two(request):
    counter2 = request.session.get('counter', 0)
    request.session['counter'] = counter2 + 1
    visits = request.session.get('visits', 0)
    request.session['visits'] = visits + -1
    return redirect('/')

def any_number(request):
    counter3 = request.session.get('counter', 0)
    any_number = int(request.POST['newnumber'])
    request.session['counter'] = counter3 + any_number - 1
    visits = request.session.get('visits', 0)
    request.session['visits'] = visits + -1
    return redirect('/')
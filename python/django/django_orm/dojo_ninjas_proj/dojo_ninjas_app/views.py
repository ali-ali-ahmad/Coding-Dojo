from django.shortcuts import render

def index(request):
    print('helooo')
    return render(request, 'index.html')

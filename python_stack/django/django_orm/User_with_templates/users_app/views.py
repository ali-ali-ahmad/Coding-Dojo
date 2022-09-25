from django.shortcuts import render, redirect
from .models import Users
# import random


def index(request):
    context = {
        "users": Users.objects.all()
    }
    return render(request, "index.html", context)

def submit(request):
    Users.objects.create(first_name = request.POST['first_name'], last_name = request.POST['last_name'], email_address= request.POST['email_address'], age= request.POST['age'])
    return redirect('/')








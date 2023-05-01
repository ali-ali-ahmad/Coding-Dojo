from django.shortcuts import render, redirect
from .models import Book
from .models import Publisher

def index(request):

    
    # context = {
    #     "dojos": Dojo.objects.all(),
    #     "ninjas": Ninja.objects.all(),
    #     "counts": Ninja.objects.filter().count()
    # }

    return render(request, "index.html")


# def submit_dojo(request):

#     Dojo.objects.create(
#         name = request.POST['name'], 
#         city = request.POST['city'], 
#         state= request.POST['state']
#     )

#     return redirect('/')


# def sub_nin(request):

#     Ninja.objects.create(
#         dojo = Dojo.objects.get(id=request.POST['dojo_select']), 
#         first_name = request.POST['first_name'], 
#         last_name = request.POST['last_name']
#     )

#     return redirect('/')


# def delete(request):

#     c = Dojo.objects.get(id=request.POST['get_id'])
#     c.delete()
#     return redirect('/')

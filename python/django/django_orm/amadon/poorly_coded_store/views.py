from django.shortcuts import render, redirect
from .models import Order, Product

def index(request):
    context = {
        "all_products": Product.objects.all()
    }
    return render(request, "store/index.html", context)

# def buy(request):

#     Order.objects.create(
#         quantity_ordered = request.POST['quantity_ordered'],
#         total_price = request.POST['total_price']
#     )

def redirect(request):
    print("***************************")
    return redirect('/checkout')

def checkout(request):
    context = {
        "all_products": Product.objects.all()
    }
    quantity_from_form = int(request.POST["quantity"])
    product_id = int(request.POST["product_id"])
    # myProduct = Product.objects.filter(id=product_id).values()
    price = Product.objects.get(id=1).price
    print("***************************")
    total_charge = quantity_from_form * price
    print("Charging credit card...")
    Order.objects.create(quantity_ordered=quantity_from_form, total_price=total_charge)
    return render(request, "/store/checkout.html", context)



    # def submit_new(request):

    # errors = Show.objects.basic_validator(request.POST)
    # show_id = request.POST['show_id']

    # if len(errors) > 0:
    #     for key, value in errors.items():
    #         messages.error(request, value)
    #     return redirect('/shows/new')

    # # if len(errors) == 0:
    # #     for key, value in errors.items():
    # #         messages.error(request, value)
    # #     return redirect('/shows/new')

    # else:
    #     Show.objects.create(
    #     title = request.POST['title'],
    #     network = request.POST['network'],
    #     release_date = request.POST['release_date'],
    #     description = request.POST['description']
    # )
    #     return redirect('/shows/'+show_id)
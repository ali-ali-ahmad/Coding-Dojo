from django.shortcuts import render, redirect
from user_app.models import User
from book_app.models import Book
from .models import *

def book(request):

    context = {
        'logged_user': User.objects.get(id=request.session['userid']),
        'books': Book.objects.all()
    }
    return render(request, 'book.html', context)


# This method will do .....
# input parameters
# output result 
def add_book(request, book_id):

    Book.objects.create(
        title = request.POST['title'],
        description = request.POST['description'],
        uploaded_by = User.objects.get(id=request.session['userid'])
    )

    user_id = request.session['userid']
    User.objects.get(id=user_id).liked_books.add(Book.objects.get(id=book_id))

    return redirect("/book")


def add_to_favorite(request, book_id):

    user_id = request.session['userid']
    User.objects.get(id=user_id).liked_books.add(Book.objects.get(id=book_id))

    return redirect("/book")


def add_to_favorite_extra(request, book_id):

    print("this works here in the add favorite extra section")
    user_id = request.session['userid']
    User.objects.get(id=user_id).liked_books.add(Book.objects.get(id=book_id))

    return redirect("/book/book_display/"+book_id)


def remove_favorite(request, book_id):
    print("this works here in the remove favorite section")

    user_id = request.session['userid']
    User.objects.get(id=user_id).liked_books.remove(Book.objects.get(id=book_id))

    return redirect('/book/book_display/'+book_id)



def book_display(request, book_id):

    context = {
        'users': User.objects.all(),
        'books': Book.objects.all(),
        'logged_user': User.objects.get(id=request.session['userid']),
        'book_to_display': Book.objects.get(id=book_id),
        'rest_of_books': Book.objects.exclude(id=book_id)
        # 'is_favorite_book': len(User.objects.get(id=request.session['userid']).liked_books),
    }

    return render(request, 'book_display.html', context)


def edit_book(request, book_id):
    print("this works here in the edit section")
    models.edit_book(request, book_id)
    return redirect('/book/book_display/'+book_id)


def delete_book(request, book_id):

    print("this works here in the delete section")
    d = Book.objects.get(id=book_id)
    d.delete()

    return redirect("/book")








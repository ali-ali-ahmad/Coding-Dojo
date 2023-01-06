from django.shortcuts import render, redirect
from .models import Book
from .models import Publisher

def book(request):

    context = {
        "books": Book.objects.all(),
        "publishers": Publisher.objects.all()
    }
    
    return render(request, "book.html", context)


def submit_book(request):

    Book.objects.create(
        title = request.POST['title'], 
        description = request.POST['description']
    )
    return redirect('/')


def to_books(request, book_num):

    context = {
        'book_num':book_num,
        'books': Book.objects.get(id=book_num),
        'publishers': Publisher.objects.exclude(id__in=Book.objects.get(id=book_num).publishers.all())
    }
    return render(request, "books_display.html", context)


def add_publisher(request):

    book_id = request.POST['book_id']
    Book.objects.get(id=book_id).publishers.add(Publisher.objects.get(id=request.POST['publisher_id']))

    return redirect('/books/'+book_id)


def publisher(request):

    context = {
        "books": Book.objects.all(),
        "publishers": Publisher.objects.all()
    }

    return render(request, "publisher.html", context)


def submit_publisher(request):

    Publisher.objects.create(
        name = request.POST['name'], 
        notes = request.POST['notes']
    )
    return redirect('/publisher/')


def to_publishers(request, publisher_num):

    context = {
        'publisher_num':publisher_num,
        'publishers': Publisher.objects.get(id=publisher_num),
        'books': Book.objects.exclude(id__in=Publisher.objects.get(id=publisher_num).books.all())
    }
    return render(request, "publishers_display.html", context)


def add_book(request):

    publisher_id = request.POST['publisher_id']
    Publisher.objects.get(id=publisher_id).books.add(Book.objects.get(id=request.POST['book_id']))

    return redirect('/publishers/'+publisher_id)

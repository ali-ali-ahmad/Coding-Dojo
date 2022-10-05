from django.db import models
from user_app.models import User

class Book(models.Model):
    title = models.CharField(max_length=255)
    description = models.TextField()
    uploaded_by = models.ForeignKey(User, related_name="books_uploaded", on_delete=models.CASCADE, blank=True, null=True)
    users_who_like = models.ManyToManyField(User, related_name="liked_books")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


def edit_book(request, book_id):
    c = Book.objects.get(id=book_id)
    c.description = request.POST['description']
    c.save()

from django.urls import path     
from . import views

urlpatterns = [
    path('', views.book),
    path('submit_book/', views.submit_book),
    path('books/<int:book_num>/', views.to_books),
    path('books/', views.add_publisher),
    path('publisher/', views.publisher),
    path('submit_publisher/', views.submit_publisher),
    path('publishers/<int:publisher_num>/', views.to_publishers),
    path('publishers/', views.add_book),
]

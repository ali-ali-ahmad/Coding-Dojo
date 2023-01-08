from django.urls import path
from . import views

urlpatterns = [
    path('', views.book),
    path('add_book/', views.add_book),
    path('add_to_favorite/<int:book_id>/', views.add_to_favorite),
    path('<book_id>/add_to_favorite_extra/', views.add_to_favorite_extra),
    path('<book_id>/remove_favorite/', views.remove_favorite),
    path('book_display/<int:book_id>/', views.book_display),
    path('<book_id>/edit_book/', views.edit_book),
    path('<int:book_id>/delete_book/', views.delete_book),
]
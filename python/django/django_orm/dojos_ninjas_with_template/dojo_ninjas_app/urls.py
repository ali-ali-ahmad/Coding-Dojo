from django.urls import path     
from . import views

urlpatterns = [
    path('', views.index),
    path('submit_dojo/', views.submit_dojo),
    path('sub_nin/', views.sub_nin),
    path('delete/', views.delete),
]
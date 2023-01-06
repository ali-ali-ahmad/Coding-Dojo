from django.urls import path     
from . import views

urlpatterns = [
    # path('', views.gold_generater),
    path('', views.index),
    path('collect/', views.gold_counter),
    # path('collect/', views.gold_counter2),
    path('reset/', views.reset),
]
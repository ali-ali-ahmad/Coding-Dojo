from django.urls import path
from . import views

urlpatterns = [
    path('', views.wall),
    path('message_post/', views.message_post),
    path('message_comment/', views.message_comment),
    path('comment_delete/', views.comment_delete),
]
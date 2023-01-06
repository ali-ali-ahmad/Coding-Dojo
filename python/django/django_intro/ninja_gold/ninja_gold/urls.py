from django.urls import path, include 

urlpatterns = [
    path('', include('project_app.urls')),
]

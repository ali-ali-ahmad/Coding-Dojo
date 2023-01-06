from django.urls import path, include

urlpatterns = [
    path('', include('first_app.urls')),
    path('wall/', include('wall_app.urls')),
]

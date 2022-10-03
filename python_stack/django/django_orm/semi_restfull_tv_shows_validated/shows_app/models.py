from django.db import models
from datetime import datetime, date


class ShowManager(models.Manager):
    def basic_validator(self, post_data):
        # date_format = "%Y-%m-%d"  # %Y for year, %m for month and %d for day
        errors = {}
        if len(post_data['title']) == 0:
            errors["title"] = "Title is requerid"
        if len(post_data['network']) == 0:
            errors["network"] = "Network is a must"
        if len(post_data['description']) == 0:
            errors["description"] = "Description is preferable"
        if 0 < len(post_data['title']) < 2:
            errors["title"] = "Title should be at least 2 characters"
        if 0 < len(post_data['network']) < 3:
            errors["network"] = "Network should be at least 3 characters"
        if 0 < len(post_data['description']) < 10:
            errors["description"] = "Description should be at least 10 characters"

        return errors





class Show(models.Model):
    title = models.CharField(max_length=255)
    network = models.CharField(max_length=255)
    release_date = models.DateField()
    description = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()







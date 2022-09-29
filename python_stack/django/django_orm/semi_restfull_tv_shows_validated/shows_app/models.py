
from django.db import models


class ShowManager(models.Manager):
    def basic_validatorNew(self, post_data):
        errors = {}
        if  str(post_data['title']).isalpha() == False:
            errors['title'] = "The titles should contains characters only"
        if len(post_data['network']) < 3:
            errors["network"] = "Network should be at least 3 characters"
        if  str(post_data['network']).isalpha() == False:
            errors['network'] = "Network should contains characters only"
        if len(post_data['description']) < 3:
            errors["description"] = "description should be at least 10 characters"
        if  str(post_data['description']).isalpha() == False:
            errors['description'] = "Description should contains characters only"
        return errors

    def basic_validatorEdit(self, post_data):
        errors = {}
        if len(post_data['title']) < 2:
            errors['title'] = "The titles should contains characters only"
        if len(post_data['network']) < 3:
            errors["network"] = "Network should be at least 3 characters"
        if len(post_data['description']) < 3:
            errors["description"] = "description should be at least 10 characters"
        return errors



class Show(models.Model):
    title = models.CharField(max_length=255, blank=True, null = True)
    network = models.CharField(max_length=255)
    release_date = models.DateField()
    description = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()







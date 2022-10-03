from django.db import models


# class ShowManager(models.Manager):
#     def basic_validator(self, post_data):
#         errors = {}
#         if len(post_data['title']) == 0:
#             errors["title"] = "Title is requerid"
#         if len(post_data['network']) == 0:
#             errors["network"] = "Network is a must"
#         if len(post_data['description']) == 0:
#             errors["description"] = "Description is preferable"
#         if 0 < len(post_data['title']) < 2:
#             errors["title"] = "Title should be at least 2 characters"
#         if 0 < len(post_data['network']) < 3:
#             errors["network"] = "Network should be at least 3 characters"
#         if 0 < len(post_data['description']) < 10:
#             errors["description"] = "Description should be at least 10 characters"

#         return errors

class Product(models.Model):
    description = models.CharField(max_length=45)
    price = models.DecimalField(decimal_places=2, max_digits=5)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class Order(models.Model):
    quantity_ordered = models.IntegerField()
    total_price = models.DecimalField(decimal_places=2, max_digits=6)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    # objects = ShowManager()
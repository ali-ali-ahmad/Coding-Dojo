from django.test import TestCase

#  <!-- <form action="{% url 'set_timezone' %}" method="POST">
#         {% csrf_token %}
#             <label for="timezone">Time zone:</label>
#             <select name="timezone">
#             {% for city, tz in timezones %}
#             <option value="{{ tz }}"{% if tz == TIME_ZONE %} selected{% endif %}>{{ city }}</option>
#                 {% endfor %}
#             </select>
#             <input type="submit" value="Set">
#         </form> -->



    
    # def __init__(self, *args, **kwargs):
    #     super(ShowManager, self).__init__(*args, **kwargs)

    #     self.Show['title'].required = True
    #     self.fields['network'].required = True
    #     self.fields['release_date'].required = True
    #     self.fields['description'].required = False




    # def clean(self):
    #     cleaned_data = super(ShowManager, self).clean()
    #     # here all fields have been validated individually,
    #     # and so cleaned_data is fully populated
    #     my_date = cleaned_data.get('my_date')
    #     my_time = cleaned_data.get('my_time')
    #     if my_date and my_time:
    #         my_date_time = (my_date + ' ' + my_time + ':00')
    #         my_date_time = datetime.strptime(my_date_time, '%m/%d/%Y %H:%M:%S')
    #         if datetime.now() <= my_date_time:
    #             msg = u"Wrong Date time !"
    #             self.add_error('my_date', msg)
    #             self.add_error('my_time', msg)
    #     return cleaned_data



# class Show(models.Model):
#     title = models.CharField(max_length=255, blank=True, null = True)
#     network = models.CharField(max_length=255)
#     # release_date = models.DateField(auto_now_add=False, auto_now=False, blank=True)
#     description = models.TextField()
#     created_at = models.DateTimeField(auto_now_add=True)
#     updated_at = models.DateTimeField(auto_now=True)
#     objects = ShowManager()




    # class TimezoneMiddleware:
#     def __init__(self, get_response):
#         self.get_response = get_response

#     def __call__(self, request):
#         tzname = request.session.get('django_timezone')
#         if tzname:
#             timezone.activate(zoneinfo.ZoneInfo(tzname))
#         else:
#             timezone.deactivate()
#         return self.get_response(request)


# class MyForm(forms.ModelForm):  

#     def __init__(self, *args, **kwargs):
#         super(MyForm, self).__init__(*args, **kwargs)

#         self.fields['release_date'].required = True
#         self.fields['my_time'].required = True
#         ...

#     def clean(self):
#         cleaned_data = super(MyForm, self).clean()
#         # here all fields have been validated individually,
#         # and so cleaned_data is fully populated
#         my_date = cleaned_data.get('my_date')
#         my_time = cleaned_data.get('my_time')
#         if my_date and my_time:
#             my_date_time = (my_date + ' ' + my_time + ':00')
#             my_date_time = datetime.strptime(my_date_time, '%m/%d/%Y %H:%M:%S')
#             if datetime.now() <= my_date_time:
#                 msg = u"Wrong Date time !"
#                 self.add_error('my_date', msg)
#                 self.add_error('my_time', msg)
#         return cleaned_data

#     class Meta:
#         model = MyModel
#         fields = ['my_date', 'my_time', ...]



        # if len(postData['release_date']) >= localtime:
        #     errors["release_date"] = "Network should be at least 3 characters"




        # def update(request, id):
#     errors = Show.objects.basic_validator(request.POST)
#     if len(errors) > 0:
#         for key, value in errors.items():
#             messages.error(request, value, key)
#         return redirect('shows/new')
#     else:
#         show = Show.objects.get(id = id)
#         show.title = request.POST['title']
#         show.network = request.POST['network']
#         show.release_date = request.POST['release_date']
#         show.description = request.POST['description']
#         show.save()
#         messages.success(request, "Show successfully updated")

#         return redirect('/shows/')





# def set_timezone(request):
#     common_timezones = {
#     'London': 'Europe/London',
#     'Paris': 'Europe/Paris',
#     'New York': 'America/New_York',
#     }
#     if request.method == 'POST':
#         request.session['django_timezone'] = request.POST['timezone']
#         return redirect('/')
#     else:
#         return render(request, 'new.html', {'timezones': common_timezones})


    # def date_validator(self, *args, **kwargs):
    #     if self.release_date > datetime.date.today():
    #         raise ValidationError("The date cannot be in the future!")
    #     super(Show, self).date_validator(*args, **kwargs)



            # if post_data['release_date'] > datetime:
        #     errors["release_date"] = "Release Date Should be in the Past"
        # if datetime.datetime.today() < datetime.datetime.strptime(post_data['release_date'],date_format):
        #     errors['release_date'] = "Date is not accurate and must be in the past"
            
        
        # if  str(post_data['title']).isalpha() == False:
        #     errors['title'] = "The titles should contains characters only"
        # if  str(post_data['network']).isalpha() == False:
        #     errors['network'] = "Network should contains characters only"
        # if  str(post_data['description']).isalpha() == False:
        #     errors['description'] = "Description should contains characters only"




            # def basic_validator(self, post_data):
    #     errors = {}
    #     if len(post_data['title']) < 2:
    #         errors['title'] = "The titles should contains characters only"
    #     if len(post_data['network']) < 3:
    #         errors["network"] = "Network should be at least 3 characters"
    #     if len(post_data['description']) < 3:
    #         errors["description"] = "description should be at least 10 characters"
    #     return errors



    # auto_now_add=False, auto_now=False, blank=True
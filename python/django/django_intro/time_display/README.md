<h1>Assignment: Time Display</h1>

<p>Objectives:</p>
<ul>
    <li>Practice setting up a Django project</li>
    <li>Familiarity with passing data to a template</li>
    <li>Practice connecting to static files</li>
</ul>

<hr>

<p>Create a Django project with a single app called time_display. When you go to <code>localhost:8000</code> or <code>localhost:8000/time_display</code>, this should run a method in your controller file (views.py) that renders a template displaying the current date and time.</p>

<img src=""/>

<p>There are many ways to get the current time in Python. For example, you could have views.py import <code>gmtime, strftime</code> from 'time' and pass the appropriate string to the render method. For example, your views.py might look something like this:</p>

```python
from django.shortcuts import render
from time import gmtime, strftime
    
def index(request):
    context = {
        "time": strftime("%Y-%m-%d %H:%M %p", gmtime())
    }
    return render(request,'index.html', context)
```

<p>To learn more about strftime, see <a href="https://docs.python.org/3.6/library/time.html?highlight=time.strftime#time.strftime">strftime</a></p>
<p>Please also see <a href="https://stackoverflow.com/questions/466345/convert-string-jun-1-2005-133pm-into-datetime">datetime</a></p>

<p>Recognize that working with time - <a href="https://docs.djangoproject.com/en/2.2/topics/i18n/timezones/">especially timezones</a> - is among the more frustrating parts of computer programming. Do not spend more than 15 minutes exploring timezones. We will have numerous opportunities to discuss the challenges of timezones. Essentially, we want to store any timestamps in our database in UTC, and eventually use JavaScript to get the time from the user's browser to customize how times are displayed. For now, the easy fix is to set your Django settings to the timezone that works for you and move on. You have more important things to cover at this part of your career as a developer than timezones.</p>

<p>To Do List:</p>
<ul>
    <li>Create a new project with a single app</li>
    <li>Have the root route display the current date and time</li>
    <li>Incorporate your own custom stylesheet</li>
    <li>NINJA BONUS: Come up with a different way to retrieve the datetime</li>
</ul>



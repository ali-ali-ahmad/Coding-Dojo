# Generated by Django 2.2.4 on 2022-09-26 17:31

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('dojo_ninjas_app', '0006_auto_20220926_1926'),
    ]

    operations = [
        migrations.RenameField(
            model_name='ninja',
            old_name='dojo',
            new_name='dojo_id_key',
        ),
    ]
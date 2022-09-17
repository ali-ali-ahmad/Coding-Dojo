# var input = "googlds;mgm;kldfjl;gf";
# function palindrom(input){
#     for (var i=0; i<(input.length)/2; i++){
#         if(input[i] != input[(input.length)-i-1]){
#             return ("False");
#         } else continue;
#     } return ("True");
# }
# console.log(palindrom(input))
# // week4 /day 3 /morning session algorethim(palindrom)
# print("Hello World!")

# x = "Hello Python"
# print(x)
# y = 42
# print(y)

# name = "Zen"
# print("My name is", name)

# name = "Zen"
# print("My name is " + name)


# # F-Strings (Literal String Interpolation)
# # Python 3.6 introduced f-strings for string interpolation. To construct a f-string, place an f 
# # right before the opening quotation. Then within the string, place any variables within curly brackets.
# first_name = "Zen"
# last_name = "Coder"
# age = 27
# print(f"My name is {first_name} {last_name} and I am {age} years old.")


# # string.format()
# # Prior to f-strings, string interpolation was accomplished with the .format() method. If you're searching online, 
# # you will likely find code snippets using this method. To use it, type out the full string, replacing any words 
# # that will get their values from variables with {}. Then call the format method on the string, 
# # passing in arguments in the order in which they should fill the {} placeholders. 
# first_name = "Zen"
# last_name = "Coder"
# age = 27
# print("My name is {} {} and I am {} years old.".format(first_name, last_name, age))
# # output: My name is Zen Coder and I am 27 years old.
# print("My name is {} {} and I am {} years old.".format(age, first_name, last_name))
# # output: My name is 27 Zen and I am Coder years old.



# # %-formatting
# # There is an even older method of string interpolation that you may come across when troubleshooting or 
# # researching, so you should know about it. Rather than curly braces, the % symbol is used to indicate a 
# # placeholder, a %s for a string and %d for a number. After the string, a 
# # single % separates the string to be interpolated from the values to be inserted into the string
# hw = "Hello %s" % "world" 	# with literal values
# py = "I love Python %d" % 3 
# print(hw, py)
# # output: Hello world I love Python 3
# name = "Zen"
# age = 27
# print("My name is %s and I'm %d" % (name, age))		# or with variables
# # output: My name is Zen and I'm 27



# # Built-In String Methods
# # We've seen the format method, but there are several more 
# # methods that we can run on a string. Here's how to use them:


# x = "hello world"
# print(x.title())
# # output:
# "Hello World"



# # string.upper(): returns a copy of the string with all the characters in uppercase.
# # string.lower(): returns a copy of the string with all the characters in lowercase.
# # string.count(substring): returns number of occurrences of substring in string.
# # string.split(char): returns a list of values where string is split at the given character. Without a parameter the default split is at every space.
# # string.find(substring): returns the index of the start of the first occurrence of substring within string.
# # string.isalnum(): returns boolean depending on whether the string's length is > 0 and all characters are alphanumeric (letters and numbers only). Strings that include spaces and punctuation will return False for this method. Similar methods include .isalpha(), .isdigit(), .islower(), .isupper(), and so on. All return booleans.
# # string.join(list): returns a string that is all strings within our set (in this case a list) concatenated.
# # string.endswith(substring): returns a boolean based upon whether the last characters of string match substring.




# # check this out:
# # https://docs.python.org/3/library/stdtypes.html




# ?assignment codes: Hello world
# 1. TASK: print "Hello World"
# print("Hello World")
# # # 2. print "Hello Noelle!" with the name in a variable
# name = "Noelle"
# print("Hello", name)	# with a comma
# print("Hello" + name)	# with a +
# # # 3. print "Hello 42!" with the number in a variable
# name = 42
# print("Hello", name)	# with a comma
# # print("Hello" + name)	# with a +	-- this one should give us an error!
# # # 4. print "I love to eat sushi and pizza." with the foods in variables
# fave_food1 = "sushi"
# fave_food2 = "pizza"
# print("I love to eat {} and {}.".format(fave_food1, fave_food2)) # with .format()
# print(f"I love to eat {fave_food1} and {fave_food2}.") # with an f string




# Pass
# If we start a code block, there must be at least one line of indented code immediately following. 
# If we try to run a file with a hanging code block, we'll get a syntax error. Luckily, Python has 
# provided us with the pass statement 
# for situations where we know we need the block statement, but we aren't sure what to put in it yet.

# class EmptyClass:
#     pass

# for val in my_string:
#     pass

# The pass statement is a null operation; nothing happens when it executes. The pass is 
# almost never seen in final production, but can be useful in places where your code has not been completed yet.




# Data Types

# 1)Primitive data types
# These are the basic building blocks of a language. Most languages have these in common:

# Boolean Values - Assesses the truth value of something. 
# It has only two values: True and False (note the uppercase T and F)


# is_hungry = True
# has_freckles = False


# Numbers - Integers (whole numbers), floating point numbers 
# (commonly known as decimal numbers), and complex numbers

# age = 35 # storing an int
# weight = 160.57 # storing a float

# Strings - literal text
# name = "Joe Blue"




# 2)Composite types
# These are collections composed of the above primitive types.

# Tuples - A type of data that is immutable 
# (can't be modified after its creation) and can hold a group of values. Tuples can contain mixed data types.


# dog = ('Bruce', 'cocker spaniel', 19, False)
# print(dog[0])		# output: Bruce
# dog[1] = 'dachshund'	# ERROR: cannot be modified ('tuple' object does not support item assignment)

# Lists - A type of data that is mutable and 
# can hold a group of values. Usually meant to store a collection of related data.

# empty_list = []
# ninjas = ['Rozen', 'KB', 'Oliver']
# print(ninjas[2]) 	# output: Oliver
# ninjas[0] = 'Francis'
# ninjas.append('Michael')
# print(ninjas)	# output: ['Francis', 'KB', 'Oliver', 'Michael']
# ninjas.pop()
# print(ninjas)	# output: ['Francis', 'KB', 'Oliver']
# ninjas.pop(1)
# print(ninjas)	# output: ['Francis', 'Oliver']


# Dictionaries - A group of key-value pairs. Dictionary elements are indexed by unique keys 
# which are used to access values. When you're ready, you can find more built-in dictionary methods here.
# https://www.w3schools.com/python/python_ref_dictionary.asp

# empty_dict = {}
# new_person = {'name': 'John', 'age': 38, 'weight': 160.2, 'has_glasses': False}
# new_person['name'] = 'Jack'	# updates if the key exists
# new_person['hobbies'] = ['climbing', 'coding']	# adds a key-value pair if the key doesn't exist
# print(new_person)	
# # output: {'name': 'Jack', 'age': 38, 'weight': 160.2, 'has_glasses': False, 'hobbies': ['climbing', 'coding']}
# w = new_person.pop('weight')	# removes the specified key and returns the value
# print(w)		# output: 160.2
# print(new_person)	
# # output: {'name': 'Jack', 'age': 38, 'has_glasses': False, 'hobbies': ['climbing', 'coding']}        




# Common Functions
# If we're ever unsure of a value or variable's data type, we can use the type function to find out. For example:

# print(type(2.63))		# output: <class 'float'>
# print(type(new_person))		# output: <class 'dict'>


# For data types that have a length attribute 
# (eg. lists, dictionaries, tuples, strings), we can use the len function to get the length:

# print(len(new_person))		# output: 4 (the number of key-value pairs)
# print(len('Coding Dojo'))	# output: 11


# Type Casting or Explicit Type Conversion
# We may find ourselves wanting to change a value's data type from one type to another. 
# For example, in the Hello World assignment, trying to print a string plus a number resulted in a TypeError. 
# Python doesn't know how to add a string and a number, but it can add two strings together, 
# so if we can cast the number as a string, then we will be able to "add" the two values together, like so:

# print("Hello" + 42)			# output: TypeError
# print("Hello" + str(42))		# output: Hello 42



# Another example may be receiving a string input from a user that we want to treat as a number:

# total = 35
# user_val = "26"
# total = total + user_val		# output: TypeError
# total = total + int(user_val)		# total will be 61


# Conditional Statements
# Conditional statements allow us to run certain lines of code depending on whether certain conditions are met.  
# These statements control the flow our code is executed by the interpreter.  
# In Python, the keywords for conditional statements are if, elif, and else. Here are some examples:


    # x = 12
    # if x > 50:
    # 	print("bigger than 50")
    # else:
    # 	print("smaller than 50")
    # # because x is not greater than 50, the second print statement is the only one that will execute
    
    # x = 55
    # if x > 10:
    # 	print("bigger than 10")
    # elif x > 50:
    # 	print("bigger than 50")
    # else:
    # 	print("smaller than 10")
    # # even though x is greater than 10 and 50, the first true statement is the only one that will execute, so we will only see 'bigger than 10'
    
    # if x < 10:
    # 	print("smaller than 10")
    # # nothing happens, because the statement is false   


# Syntax
# The def keyword signifies the declaration of a function. This indicates that the following code is 
# a function and assigns a name to that function, so we can call it later. Parameters are inputs the 
# function is expecting and appear inside the parenthesis that follow the function name.

# Here's a basic example of a function:

# def add(a,b):	# function name: 'add', parameters: a and b
#     x = a + b	# process
#     return x	# return value: x


# new_val = add(3, 5)    # calling the add function, with arguments 3 and 5
# print(new_val)    # the result of the add function gets sent back to and saved into new_val, so we will see 8



# def say_hi(name):
#     print("Hi, " + name)

# # invoking the function 3 times, passing in one argument each time
# say_hi('Michael')
# say_hi('Anna')
# say_hi('Eli')


# def say_hi(name):
#     return "Hi " + name
# greeting = say_hi("Michael") # the returned value from say_hi function gets assigned to the 'greeting' variable
# print(greeting) # this will output 'Hi Michael'



# def add(a, b):
#     x = a + b
#     return x
# sum1 = add(4,6)
# sum2 = add(1,4)
# sum3 = sum1 + sum2
# print(sum3)

# y = 10
# if y > 50:
#     print("bigger than 50")
# else:
#     print("smaller than 50")

# ------------------------------------------------------
# for loops

# for x in range(0, 10, 1):
# for x in range(0, 10):	# increment of +1 is implied
# for x in range(10):	# increment of +1 and start at 0 is implied

# for x in range(0, 10, 2):
#     print(x)
# # output: 0, 2, 4, 6, 8
# for x in range(5, 1, -3):
#     print(x)
# # output: 5, 2


# my_list = ["abc", 123, "xyz"]
# for i in range(0, len(my_list)):
#     print(i, my_list[i])
# # output: 0 abc, 1 123, 2 xyz
    
# # OR 
    
# for v in my_list:
#     print(v)
# # output: abc, 123, xyz


# my_dict = { "name": "Noelle", "language": "Python" }
# for k in my_dict:
#     print(k)
# # output: name, language

# my_dict = { "name": "Noelle", "language": "Python" }
# for k in my_dict:
#     print(my_dict[k])
# # output: Noelle, Python

# capitals = {"Washington":"Olympia","California":"Sacramento","Idaho":"Boise","Illinois":"Springfield","Texas":"Austin","Oklahoma":"Oklahoma City","Virginia":"Richmond"}
# # another way to iterate through the keys
# for key in capitals.keys():
#      print(key)
# # output: Washington, California, Idaho, Illinois, Texas, Oklahoma, Virginia
# #to iterate through the values
# for val in capitals.values():
#      print(val)
# # output: Olympia, Sacramento, Boise, Springfield, Austin, Oklahoma City, Richmond
# #to iterate through both keys and values
# for key, val in capitals.items():
#      print(key, " = ", val)
# # output: Washington = Olympia, California = Sacramento, Idaho = Boise, etc

# ----------------------------------------------------------

# While Loops

# for count in range(0,5):
#     print("looping - ", count)

# count = 0
# while count < 5:
#     print("looping - ", count)
#     count += 1

# while <expression>:
#     # do something, including progress towards making the expression False. Otherwise we'
#     # ll never get out of here!

# ---------------------------------------------------
# Else
# There are certain conditions that we give for every loop that we have, but what if the 
# condition was not met and we still would like to do something if that happens? We can then 
# use an else statement with our while loop. Yes, that is right, else in a loop.

# y = 3
# while y > 0:
#     print(y)
#     y = y - 1
# else:
#     print("Final else statement")


# ---------------------------------------------------------

# Loop Control
# We were introduced to control flow in the previous tabs with if and else statements. 
# Loops, breaks, and continues are all a part of control flow as well. Control flow is the 
# cornerstone of most programming languages.

# 1)Break
# The break statement exits the current loop prematurely, resuming execution at the first 
# post-loop statement. The break statement can be used in both while and for loops.

# The most common use for the break is when some external condition is triggered, 
# requiring a hasty exit from a loop.

# for val in "string":
#     if val == "i":
#         break
#     print(val)
# # output: s, t, r


# 2)Continue
# The continue statement immediately returns control to the beginning of the loop. 
# In other words, the continue statement rejects, or skips, all the remaining statements in 
# the current iteration of the loop, and continues normal execution at the top of the loop.

# for val in "string":
#     if val == "i":
#         continue
#     print(val)
# # output: s, t, r, n, g
# # notice, no i in the output, but the loop continued after the i



# y = 3
# while y > 0:
#     print(y)
#     y = y - 1
#     if y == 0:
#         break
# else:		# only executes on a clean exit from the while loop (i.e. not a break)
#    print("Final else statement")
# # output: 3, 2, 1

# -------------------------------------------------------
# Slicing
# If we're interested in getting subsets of values from a sequence, Python provides a way 
# for slicing with [:]. We indicate the starting index on the left and the ending index (exclusive) 
# on the right. If we don't indicate a value on the left, it will start at index 0; if the value on 
# the right is not specified, it will assume the length of the sequence. Like the slice method in JavaScript, 
# utilizing this syntax returns a copy of the data type with the specified values.


# my_list = [99,4,2,5,-3]
# my_tuple = (99,4,2,5,-3)
# my_str = "sequoia"
# print(my_list[:])
# # output: [99,4,2,5,-3]
# print(my_tuple[1:])
# # output: (4,2,5,-3)
# print(my_str[:3])
# # output: "seq"
# print(my_tuple[2:4])
# # output: (2,5)
# print(my_list, my_tuple, my_str)
# # output: [99,4,2,5,-3] (99,4,2,5,-3) 'sequoia' -- note the original values have not changed


# Other Built-In Sequence Methods

# Here are a few commonly used built-in functions for sequences:

# max(sequence) returns the largest value in the sequence
# sum(sequence) returns the sum of all values in sequence
# map(function, sequence) applies the function to every item in the sequence you pass in. Returns a list of the results.
# min(sequence) returns the lowest value in a sequence.
# sorted(sequence) returns a sorted list of the sequence's values
# Click here to learn more about other built-in functions you can use with sequences



# This program performs palindrome check for a string #
# function which return reverse of a string 
  
# def isPalindrome(s): 
#     # Calling reverse function 
#    if len(s) <= 1 :
#       return True
#    if s[0] == s[len(s) - 1] :
#       return isPalindrome(s[1:len(s) - 1])
#    else :
#       return False
    

# # Driver code 
# Palindrome_input_Variable = [ ' AnnA ' , ' SoloS ' , ' RotatoR ' , ' RadaR ' , ' SagaS ' , ' RotoR ' , ' TenT ' , ' RepapeR ' , ' CiviC ' , ' KayaK ' , ' Lever ' , ' MadaM ' , ' RacecaR ' , ' StatS ' , ' Redder ' , ' Wow ' , ' MoM ' , ' RefeR ' , ' NooN ']

# print( " PALINDROME CHECK PROGRAM " )
# for i in Palindrome_input_Variable:
#    ans = isPalindrome(i) 
#    if ans == 1: 
#     print( " The given string  ", "'" , i , "' ","is a palindrome") 
#    else: 
#     print( " The given string  " , "'" , i , "' ","is not a palindrome")

input = ("dfsklhdslkhfs")
def palindrom(input):
    for x in range(len(input)/2):
        if input[x] != input[len(input)-x-1]:
            return (False)
        else: continue
    return (True)
palindrom(input)











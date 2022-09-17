# 1)Update Values in Dictionaries and Lists
x = [ [5,2,3], [10,8,9] ]
# A)Change the value 10 in x to 15. Once you're done, x should now be [ [5,2,3], [15,8,9] ].
x[1][0] = 15
print(x)
# --------------------------------
# B)Change the last_name of the first student from 'Jordan' to 'Bryant'
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
students[0]["last_name"]= "Bryant"
print(students)
# ------------------------------------
# C)In the sports_directory, change 'Messi' to 'Andres'
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
sports_directory["soccer"][0]="Andres"
print(sports_directory)
# ---------------------------------
# D)Change the value 20 in z to 30
z = [ {'x': 10, 'y': 20} ]
z[0]["y"]= 30
print(z)
# ---------------------------------------------------------
# ------------------------------------------------------------
# 2)Iterate Through a List of Dictionaries
# Create a function iterateDictionary(some_list) that, given a list of dictionaries, 
# the function loops through each dictionary in the list and prints each key and the associated value. 
# For example, given the following list:
students = [
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
def iterateDictionary(some_list):
    newList = ""
    for val in some_list:
        newList += (f"first_name - {val['first_name']}, last_name - {val['last_name']}\n")
    return newList
print(iterateDictionary(students))
# ------------------------------------------
# --------------------------------------------
# 3)Get Values From a List of Dictionaries
# Create a function iterateDictionary2(key_name, some_list) that, given a list of dictionaries and 
# a key name, the function prints the value stored in that key for each dictionary. For example,
#  iterateDictionary2('first_name', students) should output:
def iterateDictionary2(key_name, some_list):
    newList2 = ""
    for val in some_list:
        newList2 += f"{val[key_name]} \n"
    return newList2
print(iterateDictionary2("first_name", students))
print(iterateDictionary2("last_name", students))
# -----------------------------------------------------
# ------------------------------------------------------
# 4)Iterate Through a Dictionary with List Values
# Create a function printInfo(some_dict) that given a dictionary whose values are all lists, 
# prints the name of each key along with the size of its list, and then prints the associated 
# values within each key's list. For example:
dojo = {
'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
def printInfo(some_dict):
    for key in some_dict:
        print(f"{len(some_dict[key])} {key.upper()}")
        for val in some_dict[key]:
            print(val)
        print("")
printInfo(dojo)

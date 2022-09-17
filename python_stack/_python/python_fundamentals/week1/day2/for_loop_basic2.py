# 1)Biggie Size - Given a list, write a function that changes all positive numbers in the list to "big".
# Example: biggie_size([-1, 3, 5, -5]) returns that same list, but whose values are now [-1, "big", "big", -5]
print("result of task 1:")
list = [-1, 3, 5, -5]
def biggieSize(list):
    for x in range(len(list)):
        if list[x]>0:
            list[x] = ("big")
    print(list)
biggieSize(list)
# ----------------------------------------------------
# 2)Count Positives - Given a list of numbers, create a function to replace the last value
#  with the number of positive values. (Note that zero is not considered to be a positive number).
# Example: count_positives([-1,1,1,1]) changes the original list to [-1,1,1,3] and returns it
# Example: count_positives([1,6,-4,-2,-7,-2]) changes the list to [1,6,-4,-2,-7,2] and returns it
print("result of task 2:")
list = [1, 6, -4, -2, -7, -2, 30, 12]
def countPositives(list):
    sum = 0
    for x in range(len(list)):
        if list[x]>0:
            sum +=1
    list[len(list)-1] = sum
    return (list)
print(countPositives(list))
# --------------------------------------------
# 3)Sum Total - Create a function that takes a list and returns the sum of all the values in the list.
# Example: sum_total([1,2,3,4]) should return 10
# Example: sum_total([6,3,-2]) should return 7
print("result of task 3:")
list = [1, 3, 6, -4, 20]
def sumTotal(list):
    sum = 0
    for x in range(len(list)):
        sum += list[x]
    return sum
print(sumTotal(list))
# --------------------------------------------------------
# 4)Average - Create a function that takes a list and returns the average of all the values.x
# Example: average([1,2,3,4]) should return 2.5
print("result of task 4:")
list = [1,2,5,78,12]
def average(list):
    sum = 0
    for x in range(len(list)):
        sum += list[x]
    avg = sum /(len(list))
    return avg
print(average(list))
# -----------------------------------------------
# 5)Length - Create a function that takes a list and returns the length of the list.
# Example: length([37,2,1,-9]) should return 4
# Example: length([]) should return 0
print("result of task 5:")
list = [73,4,6,7,312]
def listLength(list):
    return (len(list))
print(listLength(list))
# ----------------------------------------------
# 6)Minimum - Create a function that takes a list of numbers and returns the minimum value in the list. 
# If the list is empty, have the function return False.
# Example: minimum([37,2,1,-9]) should return -9
# Example: minimum([]) should return False
print("result of task 6:")
list = [78,12,4,-4,-13]
def minimum(list):
    if len(list) == 0:
        return (False)
    minNum = list[0]
    for x in range(1, len(list)):
        if (list[x]< minNum):
            minNum = list[x]
    return minNum
print(minimum(list))
# -------------------------------------------------------------------
# 7)Maximum - Create a function that takes a list and returns the maximum value in the list. 
# If the list is empty, have the function return False.
# Example: maximum([37,2,1,-9]) should return 37
# Example: maximum([]) should return False
print("result of task 7:")
list = [34232,32,213,5,6,8798]
def maximum(list):
    if len(list) == 0:
        return (False)
    maxNum = list[0]
    for x in range(1, len(list)):
        if (list[x]> maxNum):
            maxNum = list[x]
    return maxNum
print(maximum(list))
# -----------------------------------------------------------
# 8)Ultimate Analysis - Create a function that takes a list and returns a dictionary that has the sumTotal, 
# average, minimum, maximum and length of the list.
# Example: ultimate_analysis([37,2,1,-9]) should return {'sumTotal': 31, 'average': 7.75, 'minimum': -9, 
# 'maximum': 37, 'length': 4 }
print("result of task 8:")
list = [37,2,1,9]
def ultimate_analysis(list):
    if len(list) == 0:
        return (False)
    sumTotal = 0
    minimum = list[0]
    maximum = list[0]
    length = len(list)
    for x in range(len(list)):
            sumTotal += list[x]
            if (list[x]< minimum):
                minimum = list[x]
            if (list[x]> maximum):
                maximum = list[x]
            average = sumTotal / (len(list))
    return {'sumTotal': sumTotal, 'average': average, 'minimum': minimum, 'maximum': maximum, 'length': length }
print(ultimate_analysis(list))
# ------------------------------------------------------
# 9)Reverse List - Create a function that takes a list and return that list with values reversed. 
# Do this without creating a second list. (This challenge is known to appear during basic technical interviews.)
# Example: reverse_list([37,2,1,-9]) should return [-9,1,2,37]
print("result of task 9:")
list = [37,2,1,-9,12,34,45]
def reverseList(list):
    for x in range(int(len(list)/2)):
        temp = list[x]
        list[x] = list[len(list)-1-x]
        list[len(list)-1-x] = temp
    return list
print(reverseList(list))



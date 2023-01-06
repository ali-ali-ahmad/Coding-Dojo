# 1) Basic - Print all integers from 0 to 150.

for allNum in range(151):
    print(allNum)
# ----------------------------------------
# 2)Multiples of Five - Print all the multiples of 5 from 5 to 1,000

for multFive in range(5, 1001, 5):
    print(multFive)
# ---------------------------------------------------
# 3)Counting, the Dojo Way - Print integers 1 to 100. If divisible by 5, 
# print "Coding" instead. If divisible by 10, print "Coding Dojo".

for count in range(1, 101, 1):
    if count%10 == 0:
        print("Coding Dojo")
    elif count%5 == 0:
        print("Coding")
# ------------------------------------------------

# 4)Whoa. That Sucker's Huge - Add odd integers from 0 to 500,000, and print the final sum.
sum = 0
for odd in range(0, 500001):
    if odd%2 != 0:
        sum += odd
print(sum)
# -------------------------------------------------------------
# 5)Countdown by Fours - Print positive numbers starting at 2018, counting down by fours.

for countDown in range(2018, 0, -4):
    print(countDown)
# --------------------------------------------------------------
# 6)Flexible Counter - Set three variables: lowNum, highNum, mult. Starting at 
# lowNum and going through highNum, print only the integers that are a multiple of mult. 
# For example, if lowNum=2, highNum=9, and mult=3, the loop should print 3, 6, 9 (on successive lines)

lowNum = 2
highNum = 9
mult = 3
for flexCounter in range(lowNum, highNum):
    if(flexCounter%mult == 0):
        print(flexCounter)
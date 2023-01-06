import random
def randInt(min= 0, max= 100):
    if max<0:
        print('sorry we need a max number greater than 0')
        return (False)
    elif min > max:
        print('sorry please give a max greater than the min')
        return (False)
    else: 
        if min != 0 or max != 100:
            return round(random.random()*(max-min)+min)
    return round(random.random()*max)
print(f"random integer between 0 to 100 = {randInt()}")
print(f"random integer between 0 to 50 = {randInt(max=50)}")
print(f"random integer between 50 to 100 = {randInt(min=50, max=100)}")
print(f"random integer between 50 and 500 = {randInt(min=50, max=500)}")
print(f"random integer if max < 0 = {randInt(max = -5)}")
print(f"random integer if min > max = {randInt(min=505, max=50)}")



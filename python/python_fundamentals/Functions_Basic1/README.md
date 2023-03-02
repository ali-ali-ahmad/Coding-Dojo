<h1>Functions Basic I</h1>

<h3>Objectives:</h3>

<ul>
    <li>Avoid common mistakes of using functions</li>
    <li>Really understand how to use T-diagram to correctly predict and debug codes</li>
</ul>

<hr>

<p>For each of the following code snippets, first predict the output (what you will see printed to the terminal). Once you've made a prediction, run the code snippet to see if you are correct!</p>

```python
#1
def a():
    return 5
print(a())
```

```python
#2
def a():
    return 5
print(a()+a())
```

```python
#3
def a():
    return 5
    return 10
print(a())
```

```python
#4
def a():
    return 5
    print(10)
print(a())
```

```python
#5
def a():
    print(5)
x = a()
print(x)
```

```python
#6
def a(b,c):
    print(b+c)
print(a(1,2) + a(2,3))
```

```python
#7
def a(b,c):
    return str(b)+str(c)
print(a(2,5))
```

```python
#8
def a():
    b = 100
    print(b)
    if b < 10:
        return 5
    else:
        return 10
    return 7
print(a())
```

```python
#9
def a(b,c):
    if b<c:
        return 7
    else:
        return 14
    return 3
print(a(2,3))
print(a(5,3))
print(a(2,3) + a(5,3))
```

```python
#10
def a(b,c):
    return b+c
    return 10
print(a(3,5))
```

```python
#11
b = 500
print(b)
def a():
    b = 300
    print(b)
print(b)
a()
print(b)
```

```python
#12
b = 500
print(b)
def a():
    b = 300
    print(b)
    return b
print(b)
a()
print(b)
```

```python
#13
b = 500
print(b)
def a():
    b = 300
    print(b)
    return b
print(b)
b=a()
print(b)
```

```python
#14
def a():
    print(1)
    b()
    print(2)
def b():
    print(3)
a()
```

```python
#15
def a():
    print(1)
    x = b()
    print(x)
    return 10
def b():
    print(3)
    return 5
y = a()
print(y)
```

<p>To Do:</p>
<ul>
    <li>Create a text file, or copy the code snippets into a Python file</li>
    <li>Predict the output for each of the 15 snippets, checking and comparing your predictions after each snippet</li>
    <li>Submit the text file or Python file with your predictions</li>
</ul>


<h1>Lists of Exceptions</h1>

<p>Your new PM knows you don't know Java too well. She wants you to familiarize yourself with generics and exceptions and figure out exactly how they work. First, she wants you to make an <code>ArrayList</code> with both numbers and strings in it.</p>

```java
ArrayList<Object> myList = new ArrayList<Object>();
myList.add("13");
myList.add("hello world");
myList.add(48);
myList.add("Goodbye World");
```

<p>You will loop through the list and try assigning each item to an int variable. To do this, you will also need to cast your list item as an <code>Integer</code>; you can do this like this:</p>

```java
for(int i = 0; i < myList.size(); i++) {
    Integer castedValue = (Integer) myList.get(i);
}
```

<p>After you have set up this code, try running it. It should throw a <code>ClassCastException</code>. Change the program above to utilize exception handling to print out the error messages, the index of the ArrayList where the error occurred, and the value of the object that triggered the error. The program should continue after printing this to the console.</p>

<h3>Objectives:</h3>
<ul>
    <li>Implement exception handling.</li>
</ul>

<h3>Tasks:</h3>
<ul>
    <li>Create ArrayList</li>
    <li>Try to cast each element to an <code>Integer</code></li>
    <li>Use try/catch blocks to handle the exceptions</li>
</ul>
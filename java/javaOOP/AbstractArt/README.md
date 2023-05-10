<h1>Abstract Art</h1>

<p>In this assignment we will practice using abstract classes by creating art. We will create an abstract <code>Art</code> class and inherit from it to create <code>Painting</code> and <code>Sculpture</code> classes.</p>

<hr/>

<ul>
    <li>Create an abstract class called Art</li>
</ul>

```java
// inside of Art.java
public abstract class Art {
    // TODO: implement Art class
}
```

<p>The Art class should have the following member variables and an abstract method called viewArt(). The <code>viewArt()</code> method should be implemented in the child classes and will be used to print information about the artwork.</p>

<table>
    <tr>
        <td>Member Variables</td>
        <td>Abstract Methods</td>
    </tr>
    <tr>
        <td>
            <ul>
                <li>String title</li>
                <li>String author</li>
                <li>String description</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>void viewArt()</li>
            </ul>
        </td>
    </tr>
</table>

<ul>
    <li>Create a class called Painting</li>
</ul>

```java
// inside of Painting.java
public class Painting extends Art {
    // TODO: implement Painting class
} 
```

<p>The painting class should inherit from Art, and it should also contain a new member variable called <code>paintType</code> (ex. Oil, Watercolor, Acrylic, etc.).</p>

<ul>
    <li>Create a class called Sculpture</li>
</ul>

```java
// inside of Sculpture.java
public class Sculpture extends Art {
    // TODO: implement Sculpture class
}
```

<p>The sculpture class should also inherit from Art, and it should contain a new member variable called <code>material</code> (ex. Marble, Bronze, Porcelain, etc.).</p>

<ul>
    <li>Inside of a class called Museum create 3 Paintings and 2 Sculptures</li>
</ul>

```java
// inside of Museum.java
public class Museum {
    public static void main(String[] args) {
        // TODO: create paintings and sculptures here
    }
}
```

<hr/>

<ul>
    <li><strong>Ninja Bonus:</strong> Store paintings and sculptures in a <code>Museum</code> class</li>
</ul>

<p>We have previously made Arrays and ArrayLists that contain data like String and Integer but we can actually store our own custom classes we've made as well.</p>

```java
ArrayList<Art> museum = new ArrayList<Art> ();
```

<ul>
    <li><strong>Ninja Bonus:</strong> Shuffle and print the information for each artwork in the museum</li>
</ul>

<p>To Do List:</p>
<ul>
    <li>Create an abstract class called Art with member variables: title, author, description</li>
    <li>Create an abstract method called viewArt()</li>
    <li>Create a Painting class that inherits Art and has an additional member variable paintType</li>
    <li>Create a Sculpture class that inherits Art and has an additional member variable material</li>
    <li>Create 3 instances of Painting</li>
    <li>Create 2 instances of Scupture</li>
    <li>Ninja Bonus: store the paintings and sculptures inside of an ArrayList called museum</li>
    <li>Ninja Bonus: use the viewArt() method of all of the artworks in the museum in a random order</li>
</ul>



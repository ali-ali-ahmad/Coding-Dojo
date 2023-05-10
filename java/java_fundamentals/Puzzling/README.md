<h1>Puzzling</h1>

<p>After you passed the first challenge, the company decided they wanted to give you a few puzzles to solve that apply to features the company uses in their client-side operations. As they put it: "The first challenge was just to check your familiarity with the language, now we want to see your problem-solving skills."</p>

<p>For this assignment, we are going to introduce a new class: <code>Random</code>. We are going to use it to create some chaos, okay, maybe not chaos, but to generate random values.</p>

<p>Objectives:</p>
<ul>
    <li>Implement different algorithms in Java</li>
    <li>Practice <code>Array</code> and <code>ArrayList</code></li>
    <li>Practice <code>loops</code></li>
    <li>Learn and use the <code>Random</code> class</li>
    <li>Call methods from within other methods in the same class</li>
</ul>

<hr>


<h2>Assignment:</h2>

<p>Work on the puzzles below. Be sure to read through all the problem descriptions first before tackling them one-by-one. Make your code as clean as possible. The class name should be <code>PuzzleJava</code>; you will need to create methods for each of the tasks below and test them in the <code>main</code> method in a separate test file.</p>

<p>Tip: To get a random integer, you can use the nextInt method of the <code>Random</code> class. <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html">Random Class documentation</a>. Here's some example code for using the Random library to get you started.</p>

```java
// You will need to import the Random library from java.util
import java.util.Random;
    
// To use methods from the Random library you will need to create an instance of Random
Random randMachine = new Random();
// From there you can use any of the methods listed in the documentation. For example:
randMachine.setSeed(35679); // <--- you won't need to use this method.
```


<h4>getTenRolls</h4>

<p>Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.</p>

<h4>getRandomLetter</h4>

<p>Write a method that will:</p>

<ol>
    <li>Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values).</li>
    <li>Generate a random index between 0-25 and use it to pull a random letter out of the array.</li>
    <li>Return the random letter.</li>
</ol>

<h4>generatePassword</h4>

<p>Write a method that uses the previous method to create a random string of eight characters and return that string.</p>

<h4>getNewPasswordSet</h4>

<p>Write a method that takes an <code>int</code> length as an argument and creates an array of random eight-character words. The array should be the length passed in as an <code>int</code>. Return the array of passwords.</p>

<hr/>

<h2>SENSEI BONUS:</h2>

<h4>shuffleArray</h4>

<p>Write a method that takes an array and mixes up all the values in a pseudo-random way. Hint: use random indexes within the array, and swap values repeatedly.</p>

<hr/>

<p>Here's a test file to get you started. But you will need to create your own PuzzleJava class file.</p>

<h3>TestPuzzleJava.java</h3>

```java
import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	        //..
		// Write your other test cases here.
		//..
	}
}
```
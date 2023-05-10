<h1>CareSoft Interfaces</h1>

<p>You’ve joined a team of developers that has built the software for a healthcare clinic management system called CareSoft. The codebase is already fully developed, but they are working on standardizing some of their business logic to streamline reporting requirements for the Healthcare Insurance Portability and Accountability Act (HIPAA) and maintain the security of electronic Personal Health Information (PHI or ePHI).</p>

<p>Objectives:</p>
<ul>
    <li>Become more comfortable using Spring Tool Suite (STS) tools</li>
    <li>Practice using packages and become more familiar with reverse domain name convention</li>
    <li>Review examples of how multiple classes may interact in a practical business scenario.</li>
    <li>Recognize classes and class interactions without explicitly knowing how each class is implemented</li>
    <li>Become more comfortable analyzing and contributing to a codebase with unfamiliar elements.</li>
    <li>Implement existing interfaces in existing classes</li>
    <li>Understand how interfaces and implementing interfaces differs from inheritance and extending another class.</li>
</ul>

<hr/>

<h3>New Interfaces</h3>

<p>Related to feature requests from the business, two interfaces have been added to the application, and they have asked you to start implementing them in the appropriate classes (also provided):</p>

<ul>
    <li><code>HIPAACompliantUser</code></li>
    <li><code>HIPAACompliantAdmin</code></li>
</ul>

<h2>Assignment</h2>

<p>Your task is to implement two given interfaces, <code>HIPAACompliantUser</code> and  <code>HIPAACompliantAdmin</code> as described in two given classes, <code>Physician</code> and <code>AdminUser</code>.</p>

<h2>Think a Lot, Code Very Little</h2>

<p>For this assignment, you will be copying and pasting from the code in this lesson to get familiar with creating files, classes and interfaces in STS. You will also need to add constructors and getters & setters where needed. Ultimately you won't do too much coding in the assignment, but you will take some time to do quite a bit of analyzing. </p>

<p>A common joke among developers: "Weeks of coding can save you hours of planning."</p>

<p>It's good to get into the habit early on of taking the steps to really understand the problem and existing code base, lay out possible solutions and plan implementation thoroughly before ever writing a line of code.</p>

<hr/>

<h2>Setup</h2>

<ol>
    <li>Create a new Java project in STS and a package in your src folder with the reverse domain name: <code>com.caresoft.clinicapp</code></li>
    <li>Next, in STS, in the package you just created, make a new interface called <code>HIPAACompliantUser</code>, empty for now.</li>
    <li>Then in that same package, create the <code>HIPAACompliantAdmin</code> interface, also empty for now.</li>
    <li>
        <p>Create the following 3 classes, empty for now, that will implement these new interfaces.</p>
        <ul>
            <li><code>User</code>  - None. (Leave as is, no implementations)</li>
            <li><code>Physician</code>  - Will implement  <code>HIPAACompliantUser</code> and extend <code>User</code></li>
            <li><code>AdminUser</code> - Will implement both  <code>HIPAACompliantUser</code> and <code>HIPAACompliantAdmin</code> and extend <code>User</code></li>
            <p><strong>Tip:</strong> Try using STS to inherit and extend when you make your classes! It will autogenerate some code for you. You can also auto-generate getters, setters and constructors by going to the "Source" menu. Yay STS! </p>
        </ul>
    </li>
    <li>Copy and paste the given code for each interface below.</li>
    <li>Copy and paste the code examples for each class file, but keep the method stubs created by STS. </li>
    <li>Follow the guidelines for writing the implemented methods in your classes.</li>
    <li>Created a Test file and use the testing code provided to test all your implementations.</li>
</ol>

<p>Remember the 20-minute rule! Don't stay stuck if you're unclear on anything.</p>

<hr/>

<h2>HIPAACompliantUser Interface</h2>

<p>The complete code to put inside the <code>HIPAACompliantUser</code> interface is given (below), and does not need to be altered.</p>

```java
public interface HIPAACompliantUser {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}
```

<h2>HIPAACompliantAdmin Interface</h2>

<p><code>HIPAACompliantAdmin</code> interface is also given, and does not need to be altered.</p>

<p><strong>Tip:</strong> To auto-import any dependencies in STS, use <code>shift</code> + <code>cmd</code> + O for Mac or  <code>shift</code> + <code>ctrl</code> + O for Windows.</p>

```java
import java.util.ArrayList;
public interface HIPAACompliantAdmin {
    
    abstract ArrayList<String> reportSecurityIncidents();
    
    // DEFAULT IMPLEMENTED METHODS
    // Used to print security incidents. 
    public default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }
    
    // QA Test, PASS/FAIL of reports against QA expected results
    public default boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }
    
}
```

<h4>User.java</h4>

<p>All you'll need to add to the User class is getters and setters and a constructor.</p>

```java
public class User {
    protected Integer id;
    protected int pin;
    
    // TO DO: Getters and setters
    // Implement a constructor that takes an ID
}
```

<hr/>

<h2>Your Task: Implement Some Interfaces!</h2>

<p>The codebase you are given includes two files that you'll be working in: <code>Physician</code> and <code>AdminUser</code>. You'll be adding code for the methods each class should implement from a respective interface.</p>

<h2>Physician</h2>

<table>
    <tr>
        <th>boolean assignPIN(int)</th>
        <th>
            <p>Pin must be exactly 4 digits, returns false if not.</p>
            <p>Expected to assign the pin to the user (as a member variable)</p>
        </th>
    </tr>
    <tr>
        <td>
            <p>boolean</p>
            <p>accessAuthorized(Integer)</p>
        </td>
        <td>
            <p>Checks the physician's id against the given id;</p>
            <p>returns true if they are a match, otherwise false.</p>
        </td>
    </tr>
</table>

<p></p>
<p></p>
<p></p>

<h4>Physician.java</h4>

```java
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters
```

<h2>AdminUser</h2>

<p>The <code>AdminUser</code> class implements the <code>HIPAACompliantUser</code> interface in the following ways:</p>

<table>
    <tr>
        <th>boolean assignPIN(int)</th>
        <th>
            <p>Pin must be 6 digits or more; returns false if not.</p>
            <p>Expected to assign the pin to the user (as a member variable)</p>
        </th>
    </tr>
    <tr>
        <td>
            <p>boolean</p>
            <p>accessAuthorized(Integer)</p>
        </td>
        <td>
            <p>Compares the ids, and if they are not a match,</p>
            <p>creates an incident report using the <code>authIncident</code> method,</p>
            <p>Returns true if ids match, false if not.</p>
        </td>
    </tr>
</table>

<p>The <code>AdminUser</code> class implements the <code>HIPAACompliantAdmin</code> interface in the following ways:</p>

<table>
    <tr>
        <td>ArrayList&lt;String&gt; reportSecurityIncidents()</td>
        <td>Returns a list of strings (incidents reported)</td>
    </tr>
</table>

<h4>AdminUser.java</h4>

```java
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
```

<h4>Test.java</h4>

```java
// .. Main method set up ... //
        Physician doctor10 = new Physician(1);
        AdminUser roseTyler = new AdminUser(2, "Companion");
        AdminUser donnaNoble = new AdminUser(3, "Companion");
        
        
        // Physician Implementation Tests
        System.out.println("\n==</span>======== Physician Tests ==========\n");
        String pinTest1 = doctor10.assignPin(42)? "FAIL" : "PASS";
        ="entity class from-rainbow">System.out.printf("Physician pin assign test 1: %s\n", pinTest1);
        
        String pinTest2 = doctor10.assignPin(4000)? "PASS" : "FAIL";
        System.out.printf("Physician pin assign test 2: %s\n", pinTest2);
        
        String authTest1 = doctor10.accessAuthorized(1234)? "FAIL" : "PASS";
        System.out.printf("Physician auth test 1: %s\n", authTest1);
        
        String authTest2 = doctor10.accessAuthorized(1)? "PASS" : "FAIL";
        System.out.printf("Physician auth test 2: %s\n", authTest2);
        
        // AdminUser Implementation Tests
        System.out.println("\n========== AdminUser Tests ==========\n");
        String pinTest3 = roseTyler.assignPin(42)? "FAIL" : "PASS";
        System.out.printf("Admin pin assign test 1: %s\n", pinTest3);
        
        String pinTest4 = roseTyler.assignPin(424242)? "PASS" : "FAIL";
        System.out.printf("Admin pin assign test 2: %s\n", pinTest4);
        
        String authTest3 = roseTyler.accessAuthorized(1234)? "FAIL" : "PASS";
        System.out.printf("Admin auth test 1: %s\n", authTest3);
        
        String authTest4 = roseTyler.accessAuthorized(1234)? "FAIL" : "PASS";
        System.out.printf("Admin auth test 1: %s\n", authTest4);
        
        String authTest5 = roseTyler.accessAuthorized(2)? "PASS" : "FAIL";
        System.out.printf("Admin auth test 2: %s\n\n", authTest5);
        
        donnaNoble.accessAuthorized(42);
        donnaNoble.accessAuthorized(4321);
        donnaNoble.accessAuthorized(7);
        donnaNoble.accessAuthorized(28);
        
        System.out.println(donnaNoble.reportSecurityIncidents());
```

<p>Your test results should look like the following:</p>

<img src=""/>
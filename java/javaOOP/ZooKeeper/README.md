<h1>Zookeeper</h1>

<p>Objectives:</p>
<ul>
    <li>Implement packages to namespace your project.</li>
    <li>Implement inheritance.</li>
</ul>

<hr/>

<p>A zookeeper has asked for your help creating a way for her to track her animals' energy levels. In particular, she is having difficulty tracking the mammals. Every mammal should have an energy level (default 100). They should all be able to display their energy levels when asked through the <code>displayEnergy</code> method, which should print and return the energy level.</p>

<p>Once this is done, she has asked that you also create a separate class of gorilla, which can throw things at people but will lose energy (-5) whenever this is done. The gorilla should also be able to <code>eatBananas</code> and regain energy (+10). The gorilla should also be able to climb at the expense of energy (-10).</p>

<p>She asks that you demonstrate that the class works as expected by having the gorilla throw things 3 times, eat bananas twice and climb once; then print the gorilla's energy level.</p>

<p>The zookeeper has also captured a rare specimen. Its default energy is much higher than most mammals, its energy level is 300. It also can do a lot more than climb - it can fly. Moreover, this specimen doesn't eat bananas, it eats humans... and it doesn't throw things, but attacks towns. The zookeeper has caught a giant Bat and wants your help to track its energy levels.</p>

<p>The bat should be tested by attacking three towns, eating two humans, flying twice, and then displaying its energy. Use the display energy from the superclass!</p>

<p>To Do List:</p>
<ul>
    <li>Create a Mammal class that has an energyLevel member variable and displayEnergy() method. The displayEnergy() method should show the animal's energy level as well as return it.</li>
    <li>Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()</li>
    <li>For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5</li>
    <li>For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10</li>
    <li>For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10</li>
    <li>Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.</li>
    <li>Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.</li>
    <li>For the fly() method, print the sound of a bat taking off and decrease its energy by 50.</li>
    <li>For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.</li>
    <li>For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.</li>
    <li>Create a BatTest class to instantiate a bat and have it attack three towns, eat two humans, and fly twice.</li>
</ul>



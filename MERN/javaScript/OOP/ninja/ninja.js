// parent Vehicle class
class Ninja {
    constructor(name, health) {
        this.name = name;
        this.health = health;
        this.speed = 3;
        this.strength = 3;
    }
    drinkSake() {
        this.health += 10;
        console.log(`You drank your sake and it now has ${this.health} health on it.`);
    }
    sayName(name) {
        this.name = name;
    }
    showStats(name, health) {
        this.name = name;
        this.health = health;
    }
    
}

    const ninja1 = new Ninja("Hyabusa", 100);
    ninja1.sayName();
    ninja1.showStats();
    console.log(ninja1);





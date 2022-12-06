class Ninja {
    constructor(name, health) {
        this.name = name;
        this.health = health;
        this.speed = 3;
        this.strength = 3;
    }

    sayName() {
        console.log(`My name is ${this.name}`);
        return this;
    }

    showStats() {
        console.log(`Name: ${this.name}`);
        console.log(`Health: ${this.health}`);
        console.log(`Speed: ${this.speed}`);
        console.log(`Stength: ${this.strength}`);
        return this;
    }

    drinkSake() {
        console.log(`${this.name} drank sake and gained 10 health units.`);
        this.health += 10;
        return this;
    }
}

const ninja1 = new Ninja("Hyabusa", 100);
ninja1.sayName();
ninja1.showStats();
ninja1.drinkSake();
ninja1.showStats();

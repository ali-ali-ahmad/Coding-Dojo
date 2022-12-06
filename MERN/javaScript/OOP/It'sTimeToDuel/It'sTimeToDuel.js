class Card {
    constructor(name, cost) {
        this.name = name;
        this.cost = cost;
    }

    // sayName() {
    //     console.log(`My name is ${this.name}`);
    //     return this;
    // }

    // showStats() {
    //     console.log(`Name: ${this.name}`);
    //     console.log(`Health: ${this.health}`);
    //     console.log(`Speed: ${this.speed}`);
    //     console.log(`Stength: ${this.strength}`);
    //     return this;
    // }

    // drinkSake() {
    //     console.log(`${this.name} drank sake and gained 10 health units.`);
    //     this.health += 10;
    //     return this;
    // }
}

class Unit extends Card {
    constructor(name, cost, power, res) {
        super(name, cost);
        this.power = power;
        this.res = res;

    }

}
const RedBeltNinja = new Unit("Red Belt Ninja", 3, 3, 4);
const BlackBeltNinja = new Unit("Black Belt Ninja", 4, 5, 4);


class Effect extends Card {
    constructor(name, cost, text, stat, magnitude) {
        super(name, cost);
        this.text = text;
        this.stat = stat;
        this.magnitude = magnitude;
        
    }

    play(target) {
        if( target instanceof Unit ) {
            // implement card text here
        } else {
            throw new Error( "Red Belt Ninja must be a unit!" );
        }
    }
    
}
const HardAlgorithm = new Unit("Hard Algorithm", 2, "increase target's resilience by 3", "resilience", +4);
const UnhandledPromiseRejection = new Unit("Unhandled Promise Rejection", 1, "reduce target's resilience by 2", "resilience", -2);
const PairProgramming = new Unit("Pair Programming", 3, "increase target's power by 2", "power", +2);
console.log()
    // displayText() {
    //     console.log(`My name is ${this.name}`);
    //     return this;
    // }


    




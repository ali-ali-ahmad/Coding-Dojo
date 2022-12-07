class Card {
    constructor(name, cost) {
        this.name = name;
        this.cost = cost;
    }

}

class Unit extends Card{
    constructor(name,cost,power,res){
        super(name,cost);
        this.power = power;
        this.res = res;
    }

    reduceRes(x){
        this.res-=x;
    }

    increaseRes(val){
        this.res+=val;
    }

    attack(target){
        console.log("Start the Fight......");
        console.log("Target resilience = " + target.res);
        target.reduceRes(this.power);
        console.log(`this ${this.name} decrease `+ target.name + " resilience by " + this.power);
        console.log(target.name + " resilience after the attack = " + target.res);
        console.log("End the Fight");
        console.log("-----------------------------------------------------------");
    }

}


class Effect extends Card {
    constructor(name, cost, text, stat, magnitude) {
        super(name, cost);
        this.text = text;
        this.stat = stat;
        this.magnitude = magnitude;
        
    }

    // powerManager(x) {
    //     this.power=x;
    // }

    // ResManager(x) {
    //     this.res=x;
    // }

    play(target) {
        if( target instanceof Unit ) {

            if(this.stat === "resilience") {
                // target.ResManager(this.magnitude);
                target.res+=this.magnitude;
                console.log("Playing " + this.name);
                console.log("Effect: " + this.text);
                console.log(target.name + " new resilience = " + target.res);
                console.log("-----------------------------------------------------------");
            }
            else if(this.stat === "power") {
                // target.powerManager(this.magnitude);
                target.power+=this.magnitude;
                console.log("Playing " + this.name);
                console.log("Effect: " + this.text);
                console.log(target.name + " new Power = " + target.power);
                console.log("-----------------------------------------------------------");
            }
            
            else {
                throw new Error( "Target must be a unit!" );
            }
            
        }
    }
}

const RedBeltNinja = new Unit("Red Belt Ninja", 3, 3, 4);
const BlackBeltNinja = new Unit("Black Belt Ninja", 4, 5, 4);

const HardAlgorithm = new Effect("Hard Algorithm", 2, "increase target's resilience by 3", "resilience", +4);
const UnhandledPromiseRejection = new Effect("Unhandled Promise Rejection", 1, "reduce target's resilience by 2", "resilience", -2);
const PairProgramming = new Effect("Pair Programming", 3, "increase target's power by 2", "power", +2);



HardAlgorithm.play(RedBeltNinja);
UnhandledPromiseRejection.play(RedBeltNinja);
PairProgramming.play(RedBeltNinja);
RedBeltNinja.attack(BlackBeltNinja);
BlackBeltNinja.attack(RedBeltNinja);

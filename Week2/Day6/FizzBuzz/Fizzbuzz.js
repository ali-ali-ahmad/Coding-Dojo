// for(var i=1; i<=100; i++) {
//             if(i % 3 == 0 && i % 5 == 0) {
//             z = "FizzBuzz";
//             console.log(z);
//             }
//             else if(i % 3 == 0) {
//                 x = "Fizz";
//                 console.log(x);
//             }
//             else if (i % 5 == 0) {
//                 y = "Buzz";
//                 console.log(y);
//             }
//             else {
//                 console.log(i);}          
// }

function d6() {
    var roll = Math.random() * 6;
    // your code here
    return roll;
}
    
var playerRoll = d6();
console.log("The player rolled: " + playerRoll);















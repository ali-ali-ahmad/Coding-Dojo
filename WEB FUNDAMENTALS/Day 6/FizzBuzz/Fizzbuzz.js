for(var i=1; i<=100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
            z = "FizzBuzz";
            console.log(z);
            }
            else if(i % 3 == 0) {
                x = "Fizz";
                console.log(x);
            }
            else if (i % 5 == 0) {
                y = "Buzz";
                console.log(y);
            }
            else {
                console.log(i);}          
}

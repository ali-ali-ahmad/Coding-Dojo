var xArray=[]; 
// var count =0;
for(var i=1; i<=20; i++){ 
        if(i % 2 != 0){
            //xArray[count] = i; 
            xArray.push(i);
            //count++;
        }
}
console.log("1- Odds number are: ["+xArray+"]");

// Print odds 1-20
var dec3Array=[];
for( var dec3=100; dec3>=0; dec3--){
    if(dec3 % 3 == 0) {
        dec3Array.push(dec3);
    }
}
console.log("2- The decreasing of 3 is: ["+dec3Array+"]");
// Decreasing Multiples of 3

var seqArray=[];
for(seq=4; seq>=-3.5; seq-=1.5){
    seqArray.push(seq);
}
console.log("3- The sequences are: ["+seqArray+"]");

// Print the sequence

var sumArray= [];
var sum= 0
for(siq=1; siq<=100; siq++){
    sum += siq;
    sumArray.push(sum);
}
console.log("4- The Sigma numbers are: ["+sumArray+"]");
// Sigma

var productArray=[];
var product = 1;
for(fac=1; fac<=12; fac++){
    product = product*fac;
    productArray.push(product);
}
console.log("5- The product resualt is: ["+productArray+"]");
// Factorial
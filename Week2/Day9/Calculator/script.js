// // (first bug-fix) Note for the reader: In this assignment, I used the original scripts from CodingDojo Calculator and 
// fixed the following bug at it: (accidently pressing "function setOP()" more than once will cause an error 
// in lines 12-16 in the old-script. calling the function twice will srt num2 value to nothing)
// (second bug-fix) in the previous script, when you try to make more Mathematical equation after 
// calculating it will show you "NaN" at the display 
const display = document.getElementById("display");
let num1 = "";
let num2 = "";
let num3 = "";
let num4 = "";
let num5 = "";
let op = "";

function press(num) {
  // num3 = "";
  num1 += num;
  num3 += num;
  num4 += num;
  display.innerHTML = num1;
  display.innerHTML = num2 + op + num1;
  console.log("number1:" + num1);
  console.log("number2:" + num2);
  console.log("number3:" + num3);
  console.log("number4:" + num4);
  console.log("number5:" + num5);
  console.log("action is:" + "first num");
}
// && num4 == num1
// || num5 == num1
function setOP(key) {
  
  if (num1 == num4){
    calculate();
    num4 = "";
    // num3 = num5;
  } else num2 = num3;
    op = key;
    num1 = "";
    num4 = "";
    
    display.innerHTML += op;
    console.log("number1:" + num1);
    console.log("number2:" + num2);
    console.log("number3:" + num3);
    console.log("number4:" + num4);
    console.log("number5:" + num5);
    console.log("action:" + op);
    
}

function clr() {
  num1 = "";
  num2 = "";
  num3 = "";
  op = "";
  display.innerHTML = "0";
}

function calculate() {
  let a = parseFloat(num2);
  let b = parseFloat(num1);
  let res = 0;
  switch(op) {
    case "+":
      res = a + b;
      break;
    case "-":
      res = a - b;
      break;
    case "*":
      res = a * b;
      break;
    case "/":
      res = a / b;
      break;
  }
  num1 = res;
  num5 = res;
  num2 = num5;
  // for (var i=0; i<100; i++){
  //   if (i % 2 == 0){
  //     num3 = "";
  //   } else num4 = "";
  // }
  // num3 = "";
  // num4 = "";
  op = "";
  display.innerHTML = res;
}
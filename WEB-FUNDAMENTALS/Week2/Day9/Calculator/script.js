// // Note for the reader: In this assignment, I used the original scripts from CodingDojo Calculator and 
// fixed the following bug at it: (accidently pressing "function setOP()" more than once will cause an error 
// in lines 12-16 in the old-script. calling the function twice will srt num2 value to nothing)
const display = document.getElementById("display");
let num1 = "";
let num2 = "";
let num3 = "";
let op = "";

function press(num) {
  num1 += num;
  num3 += num;
  display.innerHTML = num3;
  if (num1 !== num3){
    display.innerHTML = num2 + op + num1;
  }
}

function setOP(key) {
    op = key;
    num2 = num3;
    num1 = "";
    display.innerHTML += op;
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
  num3 = res;
  op = "";
  display.innerHTML = res;
}
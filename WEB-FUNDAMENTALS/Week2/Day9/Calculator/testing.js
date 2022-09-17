const display = document.getElementById("display");
let num1 = "";
let num2 = "2";
let num3 = "";
let num4 = "";
let op = "";


function press(num) {
    num1 += num;
    num3 += num;
    if (num2 == ""){
        num4 += num;
    }
    display.innerHTML = num1;
    console.log("number1:" + num1);
    console.log("number2:" + num2);
    console.log("number3:" + num3);
    console.log("number4:" + num4);
}

function setOP(key) {
    op = key;
    num2 = num1;
        if (num2 == ""){
        num2 = num3;
        // calculate();
        // num3 = "";
        // } else if (num4 == ""){
        //     num2 = num3;
        //     num3 = "";
    }
    num1 = "";
    console.log("number1:" + num1);
    console.log("number2:" + num2);
    console.log("number3:" + num3);
    console.log("number4:" + num4);
}

function clr() {
    num1 = "";
    num2 = "";
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
    // num1 = res;
    num4 = res
    num2 = num4;
    num3 = num4;
    op = "";
    display.innerHTML = res;
    console.log("number1:" + num1);
    console.log("number2:" + num2);
    console.log("number3:" + num3);
}
var connection1 = document.querySelector (".card-list-item1");
var decrease1 = document.querySelector (".badge1");
var increase1 = document.querySelector (".badge2");
var count1 = 2;
var count2 = 500;

function removeConnection1(){
connection1.remove();
count1--;
decrease1.innerText = count1;
}

var connection2 = document.querySelector (".card-list-item2");
function removeConnection2(){
connection2.remove();
count1--;
decrease1.innerText = count1;
}

function increaseConnections() {
    count2++;
increase1.innerText = count2 + "+";
}

var nameCatcher = document.querySelector("#newName");
function changeName(){
    nameCatcher.innerText = "Ali Ali";
}
var clicks1 = 0
function addOneLike1(){
    clicks1 = clicks1 + 1;
    var likesNum1 = document.querySelector(".likesNum1");
    if(clicks1 == 1){
        likesNum1.innerText = "You Liked this";
    }   else
    likesNum1.innerText = ["You and " + (clicks1 - 1) + " others liked this"];
}
function addStyle(element){
    element.classList.add("hover");
}
function removeStyle(element){
    element.classList.remove("hover");
}
var clicks2 = 0
function addOneLike2(){
    clicks2 = clicks2 + 1;
    var likesNum2 = document.querySelector(".likesNum2");
    if(clicks2 == 1){
        likesNum2.innerText = "You Liked this";
    }   else
    likesNum2.innerText = ["You and " + (clicks2 - 1) + " others liked this"];
}
var clicks3 = 0
function addOneLike3(){
    clicks3 = clicks3 + 1;
    var likesNum3 = document.querySelector(".likesNum3");
    if(clicks3 == 1){
        likesNum3.innerText = "You Liked this";
    }   else
    likesNum3.innerText = ["You and " + (clicks3 - 1) + " others liked this"];
}
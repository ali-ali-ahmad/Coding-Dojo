function login(element) {
    if(element.innerText == "Login"){
        element.innerText = "Logout";
    } else if(element.innerText == "Logout"){
        element.innerText = "Login";
    }
}
function hide(element) {
    element.remove();
}
function MyAlert() {
    alert("Ninja was liked");
}
var clicks = 17
function addOneLike(){
    clicks = clicks + 1;
    var clicksSpan = document.getElementById("clicksSpan");
    clicksSpan.innerText = clicks
}

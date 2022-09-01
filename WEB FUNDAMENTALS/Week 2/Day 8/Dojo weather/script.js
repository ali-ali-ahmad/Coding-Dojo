function showThisCity1() {
    document.querySelector(".burbank");
    alert("danger, danger, danger");
}
function showThisCity2() {
    document.querySelector(".chicago");
    alert("dont you dare press that buttom again");
}
function showThisCity3() {
    document.querySelector(".dallas");
    alert("you did it, didnt you, damn it");
}
function removeAlert() {
    var element = document.querySelector(".alert");
    element.remove();
}

function changeToC() {
    if (document.getElementById("toC").value == "24"){
        document.getElementById("maxtemp1").innerHTML = "24°C";
        document.getElementById("mintemp1").innerHTML = "18°C";
        document.getElementById("maxtemp2").innerHTML = "27°C";
        document.getElementById("mintemp2").innerHTML = "19°C";
        document.getElementById("maxtemp3").innerHTML = "21°C";
        document.getElementById("mintemp3").innerHTML = "16°C";
        document.getElementById("maxtemp4").innerHTML = "26°C";
        document.getElementById("mintemp4").innerHTML = "21°C";
    } if (document.getElementById("toC").value == "104"){
        document.getElementById("maxtemp1").innerHTML = "75.2°F";
        document.getElementById("mintemp1").innerHTML = "64.4°F";
        document.getElementById("maxtemp2").innerHTML = "80.6°F";
        document.getElementById("mintemp2").innerHTML = "66.2°F";
        document.getElementById("maxtemp3").innerHTML = "69.8°F";
        document.getElementById("mintemp3").innerHTML = "60.8°F";
        document.getElementById("maxtemp4").innerHTML = "78.8°F";
        document.getElementById("mintemp4").innerHTML = "69.8°F";
    }
}

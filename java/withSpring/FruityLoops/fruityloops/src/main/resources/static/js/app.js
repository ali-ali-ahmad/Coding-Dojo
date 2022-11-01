let isExecuted = confirm("Do you want to be informed about date or time?");

console.log(isExecuted); // Yes = true, No = false

var today = new Date();
var dd = String(today.getDate()).padStart(2, '0');
var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
var yyyy = today.getFullYear();
today = mm + '/' + dd + '/' + yyyy;
var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();



  function showConfirmBox() {
    document.getElementById("overlay").hidden = false;
  }
  function closeConfirmBox() {
    document.getElementById("overlay").hidden = true;
  }

  function isConfirm(answer) {
    if (answer) {
      alert("Today's date is: " + today);
    } else {
      alert("Time now is: " + time);
    }
    closeConfirmBox();
  }

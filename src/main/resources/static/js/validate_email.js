function validateEmail($email) {
  var emailReg = /^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
  return emailReg.test( $email );
}

function validate() {
  var $result = $("#result");
  var email = $("#email").val();
  $result.text("");
  if (validateEmail(email)) {
    document.getElementById("demo").innerHTML = email;
    sendEmail(email);
  } else {
   document.getElementById("demo").innerHTML = email;
  }
}

function sendEmail(email) {
   var message = $("#message").val();
   var url = "http://localhost:8080/message";
   var method = "POST";
   var shouldBeAsync = true;
   var request = new XMLHttpRequest();
   request.open(method, url, shouldBeAsync);
   request.setRequestHeader("Content-Type", "application/json");
   request.send(JSON.stringify({"email": email, "message": message}));
}






function validateAndSendMessage() {
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

function validateEmail($email) {
  var emailReg = /^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
  return emailReg.test( $email );
}









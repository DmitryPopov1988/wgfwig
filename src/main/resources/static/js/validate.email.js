function validateAndSendMessage() {
  var email = $("#email").val();
  if (validateEmail(email)) {
    alert(email);
    sendEmail(email);
  } else {
  }
}

function validateEmail($email) {
  var emailReg = /^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
  return emailReg.test( $email );
}









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
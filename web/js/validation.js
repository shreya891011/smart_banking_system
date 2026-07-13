function validateRegister() 
{

    var name = document.getElementsByName("name")[0].value.trim();
    var email = document.getElementsByName("email")[0].value.trim();
    var phone = document.getElementsByName("phone")[0].value.trim();
    var password = document.getElementById("password").value;
    var balance = document.getElementsByName("balance")[0].value;

    if (name === "") 
    {
        alert("Please enter your name.");
        return false;
    }

    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email))
    {
        alert("Please enter a valid email address.");
        return false;
    }

    if (!/^[0-9]{10}$/.test(phone)) 
    {
        alert("Phone number must be exactly 10 digits.");
        return false;
    }

    if (password.length < 6) {
        alert("Password must be at least 6 characters long.");
        return false;
    }

    if (balance <= 0) {
        alert("Initial deposit must be greater than 0.");
        return false;
    }

    return true;
}

function validateAmount()
{

    var amount = document.getElementById("amount").value;

    if (amount === "" || parseFloat(amount) <= 0) 
    {
        alert("Please enter a valid amount.");
        return false;
    }

    return true;
}
function togglePassword() {

    var x = document.getElementById("password");

    if (x.type === "password") {

        x.type = "text";

    } else {

        x.type = "password";

    }

}
function validateRegister(){

var phone=document.getElementsByName("phone")[0].value;

var password=document.getElementById("password").value;

var balance=document.getElementsByName("balance")[0].value;

if(phone.length!=10){

alert("Phone number must contain exactly 10 digits.");

return false;

}

if(password.length<6){

alert("Password should contain at least 6 characters.");

return false;

}

if(balance<=0){

alert("Initial Deposit should be greater than 0.");

return false;

}

return true;

}

function validateAmount(){

var amount=document.getElementById("amount").value;

if(amount<=0){

alert("Enter a valid amount.");

return false;

}

return true;

}
function validateTransfer() {

    var receiver = document.getElementsByName("receiver")[0].value.trim();

    var amount = document.getElementById("amount").value;

    if (receiver === "") {

        alert("Please enter receiver account number.");

        return false;

    }

    if (receiver.length < 6) {

        alert("Invalid receiver account number.");

        return false;

    }

    if (amount === "" || parseFloat(amount) <= 0) {

        alert("Please enter a valid transfer amount.");

        return false;

    }

    return true;

}
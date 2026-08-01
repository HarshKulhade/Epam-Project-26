let hovourCount= 0;
function alerter(){
    if(hovourCount<=0){
        alert("Thanks for Visting Our Application, Team SBI");
        hovourCount++;
    }
}

function hideSteps(){
    document.getElementById("steps").innerHTML = "";
}

let authStatus = false;
function validateCustomer(){
    let id =document.getElementById("custID").value;
    authStatus = id.includes("SBIN") || id.includes("sbin");
    if(authStatus)alert("Validated! Click on GetCoupon");
    else if(id==="")alert("Customer ID field should be Mandatory");
    else alert("You are Not a Valid Customer");
}

let genCount=0;
function generateCoupon(){
    let id =document.getElementById("custID").value;
    let coupon = "SBIGC"+Math.floor(Math.random()*100099);
    if(genCount++>=1)alert("Only One Coupon Valid per Customer,Thanks");
    else if(id===""){
        alert("Enter Customer ID/Enter a Valid Customer ID");
    }
    else if(authStatus){
       document.getElementById("res").innerHTML= "Your Coupon Code: "+coupon+"<br>Valid till 29-Aug-2026";
    }
    else document.getElementById("res").innerHTML= "Since, You are Not a Valid Customer, Coupon Cannot be Generated<br> OR Validate Yourself Before Clicking GetCoupon";
}
            
            
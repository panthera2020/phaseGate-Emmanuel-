let valueOfN = 1122333145;

let store = 0;
let counterStore = 0;
let counter = 0;
let consecutiveDigits = "";
let longestRun = "";
let number = valueOfN;

while(number > 0){

    let digit = number % 10;
    if(digit == store){
        counter++;
        consecutiveDigits += digit;
    }else{
        consecutiveDigits = "" + digit;
        counter = 1;
    }
    
    if(counter > counterStore){
        counterStore = counter;
        longestRun = consecutiveDigits;
    }
    
    store = digit;
    number = Math.floor(number / 10);
 
}

console.log("longest run is " + longestRun + " lenght " + longestRun.length);

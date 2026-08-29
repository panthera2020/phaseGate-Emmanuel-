const scanner = require("prompt-sync")();

console.log("Determine if number is an ArmstrongNumber");

let userNumber = Number(scanner("Enter Number: "));

console.log();

let storeOne = userNumber;
let storetwo = userNumber;
let product = 0;
let sum = 0;
let counter = 0;

while(storeOne != 0){
    let digits = storeOne % 10;
    
    counter++;
    
    storeOne = Math.floor(storeOne / 10);
}

while(storetwo != 0){
    let digits = storetwo % 10;
    
    product = Math.pow(digits, counter);
    
    sum += product;
    
    storetwo = Math.floor(storetwo / 10);
}

if(userNumber == sum){
    console.log(userNumber + " is an ArmstrongNumber");
}else{
    console.log(userNumber + " is not an ArmstrongNumber");
}

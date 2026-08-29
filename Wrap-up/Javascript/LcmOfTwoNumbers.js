const scanner = require("prompt-sync")();

console.log("Get LCM of Two Numbers");


let userFirstNumber = Number(scanner("Enter First Number: "));

console.log();

let userSecondNumber = Number(scanner("Enter Second Number: "));

console.log();

let largerNumber = 0;
let smallerNumber = 0;

if(userFirstNumber > userSecondNumber){
    largerNumber = userFirstNumber;
    smallerNumber = userSecondNumber;
    
    while(smallerNumber != 0){
        let remainder = largerNumber % smallerNumber;
        largerNumber = smallerNumber;
        smallerNumber = remainder;
    }
}
else if(userFirstNumber < userSecondNumber){
    largerNumber = userSecondNumber;
    smallerNumber = userFirstNumber;
    
    while(smallerNumber != 0){
        let remainder = largerNumber % smallerNumber;
        largerNumber = smallerNumber;
        smallerNumber = remainder;
    }
}

let greatestCommonDivisor = largerNumber;

let lowestCommonMultiple = (userFirstNumber * userSecondNumber) / greatestCommonDivisor;

console.log("The LCM -> " + lowestCommonMultiple);

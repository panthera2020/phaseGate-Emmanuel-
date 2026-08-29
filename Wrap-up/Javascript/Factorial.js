const scanner = require("prompt-sync")();

console.log("Get Factorial of Number");

let userNumber = Number(scanner("Enter Number: "));

console.log();

let factorial = 1;

for(let index = userNumber; index > 0; index--){
    factorial *= index;
}

console.log("Factorial of " + userNumber + " -> " + factorial);


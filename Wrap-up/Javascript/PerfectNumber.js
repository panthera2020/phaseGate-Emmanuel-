const scanner = require("prompt-sync")();

console.log("Determine if the number is a perfect Number");

let userNumber = Number(scanner("Enter Number: "));

console.log();

let sum = 0;

for(let count = 1; count < userNumber; count++){
    if(userNumber % count == 0){
        sum += count;
    }
}

if(userNumber == sum){
    console.log(userNumber + " is a PerfectNumber");
}else{
    console.log(userNumber + " is not a PerfectNumber");
}

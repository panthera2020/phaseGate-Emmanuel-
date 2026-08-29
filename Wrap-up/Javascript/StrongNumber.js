const scanner = require("prompt-sync")();

console.log("Determine if number is an Strong Number");

let userNumber = Number(scanner("Enter Number: "));

console.log();

let store = userNumber;
let product = 1;
let factorialSum = 0;

while(store != 0){
    let digits = store % 10;
    
    product = 1;
    for(let count = digits; count > 0; count--){
        product *= count;
    }
    
    factorialSum += product;
    
    store = Math.floor(store / 10);
}

if(userNumber == factorialSum){
    console.log(userNumber + " is a Strong Number");
}else{
    console.log(userNumber + " is not a Strong Number");
}

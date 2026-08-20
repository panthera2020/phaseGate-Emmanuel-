const scanner = require("prompt-sync")();

let total = 0;
let counter = 0;

for(let count = 0; count < 10; count++){
    let userScore = Number(scanner("Enter Score: "));
    counter++;
    if(counter == 2){
        if(userScore > 0){
            total += userScore;
        }
        counter = 0;
    }
    
}

console.log();
console.log("The sum of the scores at even index is: " + total);

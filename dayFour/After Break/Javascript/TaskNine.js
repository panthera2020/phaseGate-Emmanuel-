const scanner = require("prompt-sync")();

let total = 0;

for(let count = 0; count < 10; count++){
    let userScore = Number(scanner("Enter score: "));
    if(userScore > 0 && userScore <= 100){
        total += userScore;
    }
    
}

console.log();
console.log("The sum of the scores is: " + total);


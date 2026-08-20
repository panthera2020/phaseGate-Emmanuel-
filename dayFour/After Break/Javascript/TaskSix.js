const scanner = require("prompt-sync")();

let total = 0;
let counter = 0;

for(let count = 0; count < 10; count++){
    let userScore = Number(scanner("Enter Scores: "));
    if(userScore % 2 == 0){
        if(userScore > 0){
            total += userScore;
            counter++;
        }
    }
    
}

let average = total / counter; 

console.log();
console.log("The sum of the even scores is: " + total);
console.log();
console.log("The average of the even scores is: " + average);

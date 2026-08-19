let number = 20;
let divisorCounter = 0;

for(let count = 1; count <= number; count++){
    if(number % count == 0){
        divisorCounter++;
    }
}

console.log("The number of divisors of "+ number + " is " + divisorCounter);

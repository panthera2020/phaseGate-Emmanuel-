let valueOfN = 1122333145;

let store = 0;
let counterStore = 0;
let counter = 0;
let consecutiveDigits = "";
let number = valueOfN;

while(number > 0){

    let digit = number % 10;
    if(digit == store){
        counter++;
        if(counter > counterStore){
            consecutiveDigits += digit;   
        }
    }else{
        counterStore = counter;
        counter = 0;
    }
    
    store = digit;
    number /= 10;
 
}

console.log("longest run is " + consecutiveDigits + " lenght " + consecutiveDigits.length());

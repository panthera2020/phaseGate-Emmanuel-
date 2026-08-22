let checkNumberOfPrimeIn=(arrayOfNumbers)=>{
    let counter = 0;
    
    for(let index = 0; index < arrayOfNumbers.length; index++){
        let number = arrayOfNumbers[index];
        if(isPrime(number)){
            counter++;
        }
    }
    
    return counter;
}

let isPrime=(number)=>{
    let isPrime = false;
    let primeCounter = 0;
    
    for(let count = 1; count <= number; count++){
        if(number % count == 0){
            primeCounter++;
        }
    }
    
    if(primeCounter == 2){
        isPrime = true;
    }
    
    return isPrime;
}

let sortElementsIn=(arrayOfNumbers)=>{
    let store = 0;
    
    for(let index = 0; index < arrayOfNumbers.length; index++){
        for(let count = 0; count < arrayOfNumbers.length; count++){
            if(arrayOfNumbers[index] < arrayOfNumbers[count]){
                store = arrayOfNumbers[index];
                arrayOfNumbers[index] = arrayOfNumbers[count];
                arrayOfNumbers[count] = store;
            }
        }
    }
    
    return arrayOfNumbers;
}

let getPrimesIn=(arrayOfNumbers)=>{
    let arrayOfPrimes = [];
    
    for(let index = 0; index < arrayOfNumbers.length; index++){
        let number = arrayOfNumbers[index];
        
        if(isPrime(number)){
            arrayOfPrimes.push(arrayOfNumbers[index]);
        }
    }
    
    return arrayOfPrimes;
}


arrayOfNumbers = [5,4,3,9,2];

console.log(getPrimesIn(arrayOfNumbers));

console.log(sortElementsIn(getPrimesIn(arrayOfNumbers)));

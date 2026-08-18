let isPrime=(number)=>{
    let numberIsPrime = false;
    
    let primeCounter = 0;
    
    for(let count = 1; count < number; count++){
        if(number % count == 0){
            primeCounter++;
        }
    }
    if(primeCounter == 2){
        numberIsPrime = true;
    }else{
        numberIsPrime = false;
    }
    
return numberIsPrime;
}


let isPalindrome=(numberInput)=>{

    let number = numberInput;
    let reverse = 0;
    let numberIsPalindrome = false;
    
    while(number > 0){
        let digit = number % 10;
        
        reverse = (reverse * 10) + digit;
        
        number /= 10;
    }
    
    if(reverse == numberInput){
        numberIsPalindrome = true;
    }else{
        numberIsPalindrome = false;
    }
return numberIsPalindrome;
}

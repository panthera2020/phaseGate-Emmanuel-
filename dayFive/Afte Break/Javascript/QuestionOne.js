let addDigits(number){
    let sum = 0;
    let counter = 0; 
    
    while(number > 0){
        let digits = number % 10;
        
        sum += digits;
        
        number = Math.floor(number / 10);
        
        counter++;
        
        if (sum > 9 && counter > countDigits(number)){
            number = sum;
            sum = 0;
        }
    }
    return sum;
}


let countDigits(number){
    let counter = 1;
    
    while (number > 0){
        int digits = number % 10;
        
        counter++;
        
        number = Math.floor(number / 10);
    }
return counter;
}

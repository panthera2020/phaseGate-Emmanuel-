let singleDigitIn=(arrayOfNumbers)=>{
    let distinctElement = 0;
    let counter = 0;
    
    for(let count = 0; count < arrayOfNumbers.length; count++){
        counter = 0;
        for(let index = 0; index < arrayOfNumbers.length; index++){
            if(arrayOfNumbers[count] == arrayOfNumbers[index]){
                counter++;
            }
        }
        if(counter <= 1){
            distinctElement = arrayOfNumbers[count];
        }
    }
    
return distinctElement;
}

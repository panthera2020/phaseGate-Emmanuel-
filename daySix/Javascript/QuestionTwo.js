let replaceNegativeElementIn=(arrayOfNumbers)=>{
    
    for(let index = 0; index < arrayOfNumbers.length; index++){
        let number = arrayOfNumbers[index];
        if(number < 0){
            arrayOfNumbers[index] = 0;
        }
    }
    
    return arrayOfNumbers;
}


arrayOfNumbers = [5,-6,3,-9,2,-1]
console.log(replaceNegativeElementIn(arrayOfNumbers))

let moveZeroElementToEndOfArrayIn=(arrayOfNumbers)=>{
    let store = 0;
    
    for(let index = 0; index < arrayOfNumbers.length; index++){
        for(let count = 0; count < arrayOfNumbers.length; count++){
            if(arrayOfNumbers[index] > arrayOfNumbers[count]){
                store = arrayOfNumbers[index];
                arrayOfNumbers[index] = arrayOfNumbers[count];
                arrayOfNumbers[count] = store;
            }
        }
    }
    
    return arrayOfNumbers;
}

arrayOfNumbers = [5,0,3,0,2,0];
console.log(moveZeroElementToEndOfArrayIn(arrayOfNumbers));

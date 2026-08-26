let sortArray=(arrayOfNumbers)=>{
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

let isElementDuplicatedIn=(arrayOfNumbers)=>{
    
    let isDuplicate = false;
    let sortedArray = sortArray(arrayOfNumbers);
    let counter = 0;
    
    for(let index = 0; index < sortedArray.length; index++){
        counter = 0;
        for(let count = 0; count < sortedArray.length; count++){
            if(sortedArray[index] == sortedArray[count]){
                counter++;
            }
        }
        
        if(counter > 1){
            isDuplicate = true;
            break;
        }
    }
    
    return isDuplicate;
}


arrayOfNumbers = [1,2,2,1];

console.log(isElementDuplicatedIn(arrayOfNumbers));

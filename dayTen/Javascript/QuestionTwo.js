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

let countSimilarIn=(firstArray, secondArray)=>{

    let sortedFirstArray = sortArray(firstArray);
    let sortedSecondArray = sortArray(secondArray);
    let counter = 0;
    let store = 0;
    
    for(let index = 0; index < sortedFirstArray.length; index++){
        
        for(let count = 0; count < sortedSecondArray.length; count++){
            if((sortedFirstArray[index] != store) && (sortedFirstArray[index] == sortedSecondArray[count]) ){
                counter++;
                store = sortedFirstArray[index];
            }
        }
    }
    return counter;
}

let getSimilarIn=(firstArray, secondArray)=>{
    let newArray = new Array([countSimilarIn(firstArray,secondArray)]).fill(0);
    
    let sortedFirstArray = sortArray(firstArray);
    let sortedSecondArray = sortArray(secondArray);
    let counter = 0;
    let store = 0;
    
    for(let index = 0; index < sortedFirstArray.length; index++){
        
        for(let count = 0; count < sortedSecondArray.length; count++){
            if((sortedFirstArray[index] != store) && (sortedFirstArray[index] == sortedSecondArray[count]) ){
                newArray[counter] = sortedFirstArray[index];
                counter++;
                store = sortedFirstArray[index];
            }
        }
    }
    
    return newArray;
}



firstArray = [1,2,2,1];
secondArray = [2,2];

console.log(getSimilarIn(firstArray,secondArray));

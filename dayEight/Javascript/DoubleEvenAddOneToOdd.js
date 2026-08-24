let isEven(number){
    isEven = false;
    if(number % 2 == 0){
        isEven = true;
    }
    
    return isEven;
}

let doubleEvenAddOneToOdd(arrayOfNumbers){
    let changedArray = [];
    
    for(int index = 0; index < arrayOfNumbers.length; index++){
        if(isEven(arrayOfNumbers[index])){
            changedArray.push(arrayOfNumbers[index] * 2);
        }else{
            changedArray.push(arrayOfNumbers[index] + 1);
        }
    }
    
    return changedArray;
}

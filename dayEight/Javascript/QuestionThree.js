let getSumOfElementsInAnArrayOfAnArray=(multidimensionalArrayOfNumbers)=>{
    let arrayOfSum = []
    let sum = 0;
    
    for(let index = 0; index < multidimensionalArrayOfNumbers.length; index++){
        let elements = [multidimensionalArrayOfNumbers[index]];
        sum = 0;
        for(let count = 0; count < elements.length; count++){
            sum += elements[count];
        }
        arrayOfSum.push(sum);
    }
    
    return arrayOfSum;
}

let sortArrayOf=(arrayOfNumbers)=>{
    let store = 0;
    
    for(let count = 0; count < arrayOfNumbers.length; count++){
        for(let counter = 0; counter < arrayOfNumbers.length; counter++){
            if(arrayOfNumbers[count] > arrayOfNumbers[counter]){
                store = arrayOfNumbers[counter];
                arrayOfNumbers[counter] = arrayOfNumbers[count];
                arrayOfNumbers[count] = store;
            }
        }
            
    }
    
return arrayOfNumbers;
}


let countDuplicateElementsIn=(arrayOfNumbers)=>{
   
   let duplicateCounter = 0;
   let counter = 0;
   let store = 0;
   let sortArray = sortArrayOf(arrayOfNumbers);
   
   for(let index = 0; index < sortArray.length; index++){
           counter = 0;
       for(let count = 0; count < sortArray.length; count++){
           if(sortArray[index] == sortArray[count] && sortArray[index] != store){
               counter++;
           }
       }
       if(counter > 1){
           duplicateCounter++;
           store = sortArray[index];
       }
           
   }
   
return duplicateCounter;
}

let getArrayOfDuplicateElement=(arrayOfNumbers)=>{
   
   let counter = 0;
   let store = 0;
   let sortArray = sortArrayOf(arrayOfNumbers);
   let duplicateElementArray = [];
   
   for(let index = 0; index < sortArray.length; index++){
           counter = 0;
       for(let count = 0; count < sortArray.length; count++){
           if(sortArray[index] == sortArray[count] && sortArray[index] != store){
               counter++;
           }
       }
       if(counter > 1){
           store = sortArray[index];
           duplicateElementArray.push(sortArray[index]);
       }
           
   }
   
return duplicateElementArray;
}


arrayOfNumbers = [45,60,3,0,67,2,45,3,22,0];

console.log(getArrayOfDuplicateElement(arrayOfNumbers));

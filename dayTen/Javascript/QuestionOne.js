let addToLastElement=(arrayOfNumbers)=>{
    if((arrayOfNumbers[arrayOfNumbers.length -1]) >= 9){
        
            let newArray = new Array(arrayOfNumbers.length).fill(0);
            for(let count = 0; count < arrayOfNumbers.length; count++){
                newArray[count] = arrayOfNumbers[count];
            }
            
            arrayOfNumbers[arrayOfNumbers.length -1] = arrayOfNumbers[arrayOfNumbers.length - 1] + 1;  
            let digit = arrayOfNumbers[arrayOfNumbers.length - 1];

            let counter = (newArray.length - 1);
            
            while(digit != 0){
                let number = digit % 10;

                newArray[counter] = number;
                
                digit = Math.floor(digit / 10); 
                counter--;
                
                if(counter <= (arrayOfNumbers.length - 3)){
                    break;
                }
            }
            return newArray;
    
    }else{
        arrayOfNumbers[arrayOfNumbers.length -1] = arrayOfNumbers[arrayOfNumbers.length - 1] + 1;     
        return arrayOfNumbers;   
    }        
}


numbers = [1,2,3];

console.log(addToLastElement(numbers));

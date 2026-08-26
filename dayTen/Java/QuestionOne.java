public class QuestionOne {
    
    public static int[] addToLastElement(int [] arrayOfNumbers){
        if((arrayOfNumbers[arrayOfNumbers.length -1]) >= 9){
            
                int [] newArray = new int[arrayOfNumbers.length + 1];
                for(int count = 0; count < arrayOfNumbers.length; count++){
                    newArray[count] = arrayOfNumbers[count];

                }
                arrayOfNumbers[arrayOfNumbers.length -1] = arrayOfNumbers[arrayOfNumbers.length - 1] + 1;  
                int digit = arrayOfNumbers[arrayOfNumbers.length - 1];

                int counter = (newArray.length - 1);
                
                while(digit != 0){
                    int number = digit % 10;

                    newArray[counter] = number;
                    
                    digit /= 10; 
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
}

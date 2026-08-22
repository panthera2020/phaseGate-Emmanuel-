public class QuestionFour {

    private static int [] sortArrayOf(int [] arrayOfNumbers){
        
        int store = 0;
        
        for(int count = 0; count < arrayOfNumbers.length; count++){
            for(int counter = 0; counter < arrayOfNumbers.length; counter++){
                if(arrayOfNumbers[count] > arrayOfNumbers[counter]){
                    store = arrayOfNumbers[counter];
                    arrayOfNumbers[counter] = arrayOfNumbers[count];
                    arrayOfNumbers[count] = store;
                }
            }
                
        }
        
    return arrayOfNumbers;
    }
    
   
   public static int countDuplicateElementsIn(int [] arrayOfNumbers){
       
       int duplicateCounter = 0;
       int counter = 0;
       int store = 0;
       int [] sortArray = sortArrayOf(arrayOfNumbers);
       
       for(int index = 0; index < sortArray.length; index++){
               counter = 0;
           for(int count = 0; count < sortArray.length; count++){
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

   public static int [] getArrayOfDuplicateElement(int [] arrayOfNumbers){
       
       int counter = 0;
       int store = 0;
       int [] sortArray = sortArrayOf(arrayOfNumbers);
       int [] duplicateElementArray = new int[countDuplicateElementsIn(arrayOfNumbers)];
       int indexCounter = 0;
       
       for(int index = 0; index < sortArray.length; index++){
               counter = 0;
           for(int count = 0; count < sortArray.length; count++){
               if(sortArray[index] == sortArray[count] && sortArray[index] != store){
                   counter++;
               }
           }
           if(counter > 1){
               store = sortArray[index];
               duplicateElementArray[indexCounter] = sortArray[index];
               indexCounter++;
           }
               
       }
       
   return duplicateElementArray;
   }

} 

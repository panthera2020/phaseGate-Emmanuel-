public class QuestionThree {

    public static int [] sortArray(int[] arrayOfNumbers){
        int store = 0;
        
        for(int index = 0; index < arrayOfNumbers.length; index++){

            for(int count = 0; count < arrayOfNumbers.length; count++){
                if(arrayOfNumbers[index] < arrayOfNumbers[count]){
                    store = arrayOfNumbers[index];
                    arrayOfNumbers[index] = arrayOfNumbers[count];
                    arrayOfNumbers[count] = store;
                }
            }
        }
        return arrayOfNumbers;
    }
    
    public static boolean isElementDuplicatedIn(int [] arrayOfNumbers){
        
        boolean isDuplicate = false;
        int [] sortedArray = sortArray(arrayOfNumbers);
        int counter = 0;
        
        for(int index = 0; index < sortedArray.length; index++){
            counter = 0;
            for(int count = 0; count < sortedArray.length; count++){
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
}

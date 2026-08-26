public class QuestionTwo {

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

    public static int countSimilarIn(int[] firstArray, int [] secondArray){
    
        int [] sortedFirstArray = sortArray(firstArray);
        int [] sortedSecondArray = sortArray(secondArray);
        int counter = 0;
        int store = 0;
        
        for(int index = 0; index < sortedFirstArray.length; index++){
            
            for(int count = 0; count < sortedSecondArray.length; count++){
                if((sortedFirstArray[index] != store) && (sortedFirstArray[index] == sortedSecondArray[count]) ){
                    counter++;
                store = sortedFirstArray[index];
                }
            
            }
        }
        return counter;
    }
    
    public static int [] getSimilarIn(int [] firstArray, int [] secondArray){
        int [] newArray = new int[countSimilarIn(firstArray,secondArray)];
        
        int [] sortedFirstArray = sortArray(firstArray);
        int [] sortedSecondArray = sortArray(secondArray);
        int counter = 0;
        int store = 0;
        
        for(int index = 0; index < sortedFirstArray.length; index++){
            
            for(int count = 0; count < sortedSecondArray.length; count++){
                if((sortedFirstArray[index] != store) && (sortedFirstArray[index] == sortedSecondArray[count]) ){
                    newArray[counter] = sortedFirstArray[index];
                    counter++;
                    store = sortedFirstArray[index];
                }
            }
        }
        
        return newArray;
    }
}










public class QuestionThree {
    public static int [] moveZeroElementToEndOfArrayIn(int [] arrayOfNumbers){
        int store = 0;
        
        for(int index = 0; index < arrayOfNumbers.length; index++){
            for(int count = 0; count < arrayOfNumbers.length; count++){
                if(arrayOfNumbers[index] > arrayOfNumbers[count]){
                    store = arrayOfNumbers[index];
                    arrayOfNumbers[index] = arrayOfNumbers[count];
                    arrayOfNumbers[count] = store;
                }
            }
        }
        
        return arrayOfNumbers;
    }
}

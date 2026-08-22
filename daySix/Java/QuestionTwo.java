public class QuestionTwo {
    
    public static int [] replaceNegativeElementIn(int [] arrayOfNumbers){
        
        for(int index = 0; index < arrayOfNumbers.length; index++){
            int number = arrayOfNumbers[index];
            if(number < 0){
                arrayOfNumbers[index] = 0;
            }
        }
        
        return arrayOfNumbers;
    }
}

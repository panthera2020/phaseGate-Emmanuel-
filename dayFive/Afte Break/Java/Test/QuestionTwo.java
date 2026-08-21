public class QuestionTwo {
    public static String singleDigitIn(int [] arrayOfNumbers){
        String distinctElement = "";
        int counter = 0;
        
        for(int count = 0; count < arrayOfNumbers.length; count++){
            counter = 0;
            for(int index = 0; index < arrayOfNumbers.length; index++){
                if(arrayOfNumbers[count] == arrayOfNumbers[index]){
                    counter++;
                }
            }
            if(counter <= 1){
                distinctElement += arrayOfNumbers[count];
            }
        }
        
    return distinctElement;
    }
}

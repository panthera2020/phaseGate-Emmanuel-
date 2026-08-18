public class QuestionFive {
    public static void main(String... args){
        int valueOfN = 1122333145;
        
        int store = 0;
        int counterStore = 0;
        int counter = 0;
        String consecutiveDigits = "";
        String longestRun = "";
        int number = valueOfN;
        
        while(number > 0){

            int digit = number % 10;
            if(digit == store){
                counter++;
                consecutiveDigits += digit;   
            }else{
                consecutiveDigits = "" + digit;
                counter = 1;
            }
            
            if(counter > counterStore){
                counterStore = counter;
                longestRun = consecutiveDigits;
            }
            
            store = digit;
            number /= 10;
         
        }
        
        System.out.println("longest run is " + longestRun + " lenght " + longestRun.length());
    }
}


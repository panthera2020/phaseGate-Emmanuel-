public class QuestionFive {
    public static void main(String... args){
        int valueOfN = 1122333145;
        
        int store = 0;
        int counterStore = 0;
        int counter = 0;
        String consecutiveDigits = "";
        int number = valueOfN;
        
        while(number > 0){

            int digit = number % 10;
            if(digit == store){
                counter++;
                if(counter > counterStore){
                    consecutiveDigits += digit;   
                }
            }else{
                counterStore = counter;
                counter = 0;
            }
            
            store = digit;
            number /= 10;
         
        }
        
        System.out.println("longest run is " + consecutiveDigits + " lenght " + consecutiveDigits.length());
    }
}

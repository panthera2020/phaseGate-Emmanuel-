import java.util.Scanner;

public class QuestionOne {
    public static int addDigits(int number){
        int sum = 0;
        int counter = 0; 
        
        while(number > 0){
            int digits = number % 10;
            
            sum += digits;
            
            number /= 10;
            
            counter++;
            
            if (sum > 9 && counter > countDigits(number)){
                number = sum;
                sum = 0;
            }
        }
        return sum;
    }
    
    private static int countDigits(int number){
        int counter = 1;
        
        while (number > 0){
            int digits = number % 10;
            
            counter++;
            
            number /= 10;
        }
    return counter;
    }
}

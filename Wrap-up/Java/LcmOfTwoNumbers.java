import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        IO.println("Get LCM of Two Numbers");
        
        IO.println("Enter First Number: ");
        int userFirstNumber = input.nextInt();
        
        IO.println();
        
        IO.println("Enter Second Number: ");
        int userSecondNumber = input.nextInt();
        
        IO.println();
        
        int largerNumber = 0;
        int smallerNumber = 0;
        
        if(userFirstNumber > userSecondNumber){
            largerNumber = userFirstNumber;
            smallerNumber = userSecondNumber;
            
            while(smallerNumber != 0){
                int remainder = largerNumber % smallerNumber;
                largerNumber = smallerNumber;
                smallerNumber = remainder;
            }
        }
        else if(userFirstNumber < userSecondNumber){
            largerNumber = userSecondNumber;
            smallerNumber = userFirstNumber;
            
            while(smallerNumber != 0){
                int remainder = largerNumber % smallerNumber;
                largerNumber = smallerNumber;
                smallerNumber = remainder;
            }
        }
        
        int greatestCommonDivisor = largerNumber;
        
        int lowestCommonMultiple = (userFirstNumber * userSecondNumber) / greatestCommonDivisor;
        
        IO.println("The LCM -> " + lowestCommonMultiple);
    }
}

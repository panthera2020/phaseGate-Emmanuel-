import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        IO.println("Get The GCD of Two Numbers");
        
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
        
        IO.println("The Greatest Common Divisor -> " + greatestCommonDivisor);
    }
}

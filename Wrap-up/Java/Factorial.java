import java.util.Scanner;

public class Factorial {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        IO.println("Get Factorial of Number");
        
        IO.println("Enter Number: ");
        int userNumber = input.nextInt();
        
        IO.println();
        
        int factorial = 1;
        
        for(int index = userNumber; index > 0; index--){
            factorial *= index;
        }
        
        IO.println("Factorial of " + userNumber + " -> " + factorial);
    }
}

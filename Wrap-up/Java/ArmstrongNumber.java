import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        IO.println("Determine if number is an ArmstrongNumber");
        
        IO.println("Enter Number: ");
        int userNumber = input.nextInt();
        
        IO.println();
        
        int storeOne = userNumber;
        int storetwo = userNumber;
        int product = 0;
        int sum = 0;
        int counter = 0;
        
        while(storeOne != 0){
            int digits = storeOne % 10;
            
            counter++;
            
            storeOne /= 10;
        }
        
        while(storetwo != 0){
            int digits = storetwo % 10;
            
            product = (int)Math.pow(digits, counter);
            
            sum += product;
            
            storetwo /= 10;
        }
        
        if(userNumber == sum){
            IO.println(userNumber + " is an ArmstrongNumber");
        }else{
            IO.println(userNumber + " is not an ArmstrongNumber");
        }
    }
}

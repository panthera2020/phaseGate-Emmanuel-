import java.util.Scanner;

public class StrongNumber {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        IO.println("Determine if number is an Strong Number");
        
        IO.println("Enter Number: ");
        int userNumber = input.nextInt();
        
        IO.println();
        
        int store = userNumber;
        int product = 1;
        int factorialSum = 0;
        
        while(store != 0){
            int digits = store % 10;
            
            product = 1;
            for(int count = digits; count > 0; count--){
                product *= count;
            }
            
            factorialSum += product;
            
            store /= 10;
        }
        
        if(userNumber == factorialSum){
            IO.println(userNumber + " is a Strong Number");
        }else{
            IO.println(userNumber + " is not a Strong Number");
        }
    }
}

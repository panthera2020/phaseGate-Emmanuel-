import java.util.Scanner;

public class PerfectNumber {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        IO.println("Determine if the number is a perfect Number");
        
        IO.println("Enter Number: ");
        int userNumber = input.nextInt();
        
        IO.println();
        
        int sum = 0;
        
        for(int count = 1; count < userNumber; count++){
            if(userNumber % count == 0){
                sum += count;
            }
        }
        
        if(userNumber == sum){
            IO.println(userNumber + " is a PerfectNumber");
        }else{
            IO.println(userNumber + " is not a PerfectNumber");
        }
    }
}

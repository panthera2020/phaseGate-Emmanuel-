import java.util.Scanner;

public class Name {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String userName = input.nextLine();
        
        System.out.println();
        System.out.println("Hello, " + userName);
    }
}

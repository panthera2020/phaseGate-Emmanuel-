import java.util.Scanner;

public class NameAndDate {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String userName = input.nextLine();
        
        System.out.println('\"' + "My name is " + '\"' + userName + '\"' +'\"');
        System.out.println('\"' + "Today is 17/08/2026" + '\"');
    }
}

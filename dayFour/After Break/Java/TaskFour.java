import java.util.Scanner;

public class TaskFour {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int counter = 0;
        
        for(int count = 0; count < 10; count++){
            System.out.print("Enter Scores: ");
            int userScore = input.nextInt();
            counter++;
            if(counter == 2){
                if(userScore > 0){
                    total += userScore;
                }
                counter = 0;
            }
            
        }
        
        System.out.println();
        System.out.println("The sum of the scores at even index is: " + total);
    }
}

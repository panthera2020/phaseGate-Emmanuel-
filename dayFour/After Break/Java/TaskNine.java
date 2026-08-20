import java.util.Scanner;

public class TaskNine {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        
        for(int count = 0; count < 10; count++){
            System.out.println("Enter Scores");
            int userScore = input.nextInt();
            if(userScore > 0 && userScore <= 100){
                total += userScore;
            }
            
        }
        
        System.out.println();
        System.out.println("The sum of the scores is: " + total);
    }
}

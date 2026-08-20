import java.util.Scanner;

public class TaskTen {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        
        for(int count = 0; count < 10; count++){
            System.out.print("Enter Scores: ");
            int userScore = input.nextInt();
            if(userScore > 0 && userScore <= 100){
                total += userScore;
            }
            
        }
        
        double average = (double)total / 10;

        System.out.println();
        System.out.println("The average of the scores is: " + average);
    }
}

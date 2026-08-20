import java.util.Scanner;

public class TaskFive {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        
        for(int count = 0; count < 10; count++){
            System.out.print("Enter Scores: ");
            int userScore = input.nextInt();
            if(userScore % 2 == 0){
                if(userScore > 0){
                    total += userScore;
                }
            }
            
        }
        
        System.out.println();
        System.out.println("The sum of the even scores is: " + total);
    }
}

import java.util.Scanner;

public class TaskSix {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int counter = 0;
        
        for(int count = 0; count < 10; count++){
            System.out.print("Enter Scores: ");
            int userScore = input.nextInt();
            if(userScore % 2 == 0){
                if(userScore > 0){
                    total += userScore;
                    counter++;
                }
            }
            
        }
        
        double average = (double) total / counter; 
        
        System.out.println();
        System.out.println("The sum of the even scores is: " + total);
        System.out.println();
        System.out.println("The average of the even scores is: " + average);
    }
}

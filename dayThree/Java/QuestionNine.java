public class QuestionNine {
    public static void main(String... args){
        
        int number = 20;
        int divisorCounter = 0;
        
        for(int count = 1; count <= number; count++){
            if(number % count == 0){
                divisorCounter++;
            }
        }
        
        System.out.println("The number of divisors of "+ number + " is " + divisorCounter);
    }
}

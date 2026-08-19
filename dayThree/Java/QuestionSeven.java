public class QuestionSeven {
    public static void main(String... args){
        
        int sumTotal = 0;
        
        for(int count = 1; count <= 100; count++){
            sumTotal += count;
        }
        
        double average = (double)sumTotal / 100;
        
        System.out.println("The average of Number from 1 to 100 is " + average);
    }
}

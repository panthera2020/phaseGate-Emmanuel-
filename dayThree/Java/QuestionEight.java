public class QuestionEight {
    public static void main(String... args){
        
        int number = 20;
        
        for(int count = 1; count <= number; count++){
            if(number % count == 0){
                System.out.print(count + " ");
            }
        }
        
        System.out.println();
    }
}

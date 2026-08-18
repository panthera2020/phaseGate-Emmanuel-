public class QuestionThree {
    public static void main(String... args){
        
        int sum = 0;
        
        for(int count = 1; count <= 100; count++){
            int number = count;
            while(number > 0){
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            if(sum % 3 != 0){
                System.out.print(count + " ");
            }
        }
    }
}

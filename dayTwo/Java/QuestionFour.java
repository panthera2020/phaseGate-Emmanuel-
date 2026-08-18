public class QuestionFour {
    public static void main(String... args){
        
        for(int count = 1; count <= 100; count++){
            if(count % 3 == 0){
                System.out.print("hello ");
            }else if(count % 5 == 0){
                System.out.print("world ");
            }else if(count % 7 == 0){
                System.out.print("orions ");
            }else{
                int reverse = 0;
                int number = count;
                while(number > 0){
                    int digit = number % 10;
                    reverse = (reverse * 10) + digit;
                    number /= 10;
                }   
                
                System.out.print(reverse + " ");
            }
        }
    }
}

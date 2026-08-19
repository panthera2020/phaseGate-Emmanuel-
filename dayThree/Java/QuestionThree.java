public class QuestionThree {
    public static void main(String... args){
        
        String word = "AbdulAzeez";
        
        int counter = 0;
        
        for(int index = 0; index < word.length(); index++){
            char letter = word.charAt(index);
            if(letter >= 'a' && letter <= 'z'){
                counter++;
            }
        }
        
        System.out.println("The Number of LowerCase is " + counter);
    }
}

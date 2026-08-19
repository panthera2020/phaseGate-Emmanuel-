public class QuestionFour {
    public static void main(String... args){
        
        String word = "AbdulAzeez";
        
        int counter = 0;
        
        for(int index = 0; index < word.length(); index++){
            char letter = word.charAt(index);
            if(letter >= 'A' && letter <= 'Z'){
                counter++;
            }
        }
        
        System.out.println("The Number of UpperCase is " + counter);
    }
}

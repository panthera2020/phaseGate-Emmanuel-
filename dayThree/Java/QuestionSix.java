public class QuestionSix {
    public static void main(String... args){
    
        String word = "Baller";
        
        for(int index = 0; index < word.length(); index++){
            char letter = word.charAt(index);
            
            System.out.println(letter + "index is " + valueOf(letter));
        }
    }
}

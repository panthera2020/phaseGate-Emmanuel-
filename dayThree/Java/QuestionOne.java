public class QuestionOne {
    public static void main(String... args){
        
        String word = "Lover";
        String newWord = "";
        
        for(int index = word.length() - 1; index >= 0; index--){
            newWord += word.charAt(index);
        }
        
        System.out.println(newWord);
    }
}

public class QuestionFive {
    public static void main(String... args){
        
        String word = "Vladimr";
        
        int index = 0;
        
        for(int count = 0; count < word.length(); count++){
            char letter = word.toLowerCase().charAt(count);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                index = count;
                break;
            }
        }
        
        System.out.println("The index of the first vowel is " + index);
    }
}

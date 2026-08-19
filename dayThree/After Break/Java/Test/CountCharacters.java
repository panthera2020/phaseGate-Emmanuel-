public class CountCharacters {
    public static int countDistinctCharactersIn(String word){
        String wordToLowerCase = word.toLowerCase();
        
        int counter = 0;
        int distinctCharacterCounter = 0;
        
        for(int index = 0; index < wordToLowerCase.length(); index++){
            char letter = wordToLowerCase.charAt(index);
            counter = 0;
            for(int count = 0; count < wordToLowerCase.length(); count++){
                char lettersAgain = wordToLowerCase.charAt(count);
                if(letter == lettersAgain){
                    counter++;
                    }
                }
            if(counter > 2){
                distinctCharacterCounter++;
            }
        }

        
    return distinctCharacterCounter;
    }
}

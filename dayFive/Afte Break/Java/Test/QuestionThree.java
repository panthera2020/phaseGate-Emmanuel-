public class QuestionThree {
    public static String similarLeadingPrefixIn(String [] arrayOfStrings){
        String similarPrefix = "";
        String storeString = "";
        String similarLeadingPrefix = "";
        String firstWord = arrayOfStrings[0];
        
        for(int count = 1; count < arrayOfStrings.length; count++){
             String word = arrayOfStrings[count];
             storeString = "";
             similarPrefix = "";
             
            for(int index = 0; index < word.length(); index++){
                if(firstWord.charAt(index) == word.charAt(index) && index < firstWord.length()){
                    similarPrefix += firstWord.charAt(index);
                    
                }
                if(firstWord.charAt(index) != word.charAt(index)){
                break;
                }
            }

            firstWord = similarPrefix;
            storeString = similarPrefix;
            if(similarPrefix.equals(storeString)){
                similarLeadingPrefix = similarPrefix;
            }
        }
    return similarLeadingPrefix;
    }
}

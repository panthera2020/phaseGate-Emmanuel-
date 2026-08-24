public class QuestionTwo {

    public static boolean isBracketComplete(String brackets){
        int openBracketCounter = 0;
        int closeBracketCounter = 0;
        int openSquareBracketCounter = 0;
        int closeSquareBracketCounter = 0;
        int openCurlyBracesCounter = 0;
        int closeCurlyBracesCounter = 0;
        int openAngleBracketsCounter = 0;
        int closeAngleBracketsCounter = 0;
        boolean isComplete = false;
        
        for(int index = 0; index < brackets.length(); index++){

            
            if(brackets.charAt(index) == '('){
                openBracketCounter++;
            }
            if(brackets.charAt(index) == ')'){
                closeBracketCounter++;
            }
            if(brackets.charAt(index) == '['){
                openSquareBracketCounter++;
            }
            if(brackets.charAt(index) == ']'){
                closeSquareBracketCounter++;
            }
            if(brackets.charAt(index) == '{'){
                openCurlyBracesCounter++;
            }
            if(brackets.charAt(index) == '}'){
                closeCurlyBracesCounter++;
            }
            if(brackets.charAt(index) == '<'){
                openAngleBracketsCounter++;
            }
            if(brackets.charAt(index) == '>'){
                closeAngleBracketsCounter++;
            }
        }
        
        if((openAngleBracketsCounter == closeAngleBracketsCounter) && (openBracketCounter == closeBracketCounter) && (openCurlyBracesCounter == closeCurlyBracesCounter) && (openSquareBracketCounter == closeSquareBracketCounter)){
            isComplete = true;
        }
        
        return isComplete;
    }
}

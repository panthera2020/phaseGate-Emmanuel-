let isBracketComplete(brackets){
    let openBracketCounter = 0;
    let closeBracketCounter = 0;
    let openSquareBracketCounter = 0;
    let closeSquareBracketCounter = 0;
    let openCurlyBracesCounter = 0;
    let closeCurlyBracesCounter = 0;
    let openAngleBracketsCounter = 0;
    let closeAngleBracketsCounter = 0;
    let isComplete = false;
    
    for(let index = 0; index < brackets.length; index++){

        
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

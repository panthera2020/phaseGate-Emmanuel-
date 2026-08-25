def isBracketComplete(brackets):
    openBracketCounter = 0;
    closeBracketCounter = 0;
    openSquareBracketCounter = 0;
    closeSquareBracketCounter = 0;
    openCurlyBracesCounter = 0;
    closeCurlyBracesCounter = 0;
    openAngleBracketsCounter = 0;
    closeAngleBracketsCounter = 0;
    isComplete = false;
    
    for index in range(len(brackets)):

        
        if(brackets[index] == "("):
            openBracketCounter += 1
        
        if(brackets[index] == ")"):
            closeBracketCounter += 1
        
        if(brackets[index] == "["):
            openSquareBracketCounter += 1
        
        if(brackets[index] == "]"):
            closeSquareBracketCounter += 1
        
        if(brackets[index] == "{"):
            openCurlyBracesCounter += 1
        
        if(brackets[index] == "}"):
            closeCurlyBracesCounter += 1
        
        if(brackets[index] == "<"):
            openAngleBracketsCounter += 1
        
        if(brackets[index] == ">"):
            closeAngleBracketsCounter += 1
    
    if((openAngleBracketsCounter == closeAngleBracketsCounter) and (openBracketCounter == closeBracketCounter) and (openCurlyBracesCounter == closeCurlyBracesCounter) and (openSquareBracketCounter == closeSquareBracketCounter)):
        isComplete = true;
    
    
    return isComplete;


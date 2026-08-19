def countDistinctCharactersIn( word):
    wordToLowerCase = word.lower();
    
    counter = 0;
    distinctCharacterCounter = 0;
    
    for index in range(len(wordToLowerCase)):
        letter = wordToLowerCase[index]
        counter = 0
        for count in range(len(wordToLowerCase)):
            lettersAgain = wordToLowerCase[count]
            if(letter == lettersAgain):
                counter += 1
    
        if(counter > 2):
            distinctCharacterCounter += 1
    
    return distinctCharacterCounter;

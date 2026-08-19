let countDistinctCharactersIn=(word)=>{
    wordToLowerCase = word.toLowerCase();
    
    let counter = 0;
    let distinctCharacterCounter = 0;
    
    for(let index = 0; index < wordToLowerCase.length; index++){
        letter = wordToLowerCase.charAt(index);
        counter = 0;
        for(let count = 0; count < wordToLowerCase.length; count++){
            lettersAgain = wordToLowerCase.charAt(count);
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

word = "abcdef";

secondWord = "a111BAcd";

console.log(countDistinctCharactersIn(word));

console.log();

console.log(countDistinctCharactersIn(secondWord));


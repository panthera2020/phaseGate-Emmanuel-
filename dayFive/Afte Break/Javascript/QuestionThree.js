let similarLeadingPrefixIn=(arrayOfStrings)=>{
    let similarPrefix = "";
    let storeString = "";
    let similarLeadingPrefix = "";
    let firstWord = arrayOfStrings[0];
    
    for(let count = 1; count < arrayOfStrings.length; count++){
         let word = arrayOfStrings[count];
         storeString = "";
         similarPrefix = "";
         
        for(let index = 0; index < word.length; index++){
            if(firstWord.charAt(index) == word.charAt(index) && index < firstWord.length){
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

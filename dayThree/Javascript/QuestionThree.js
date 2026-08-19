let word = "AbdulAzeez";

let counter = 0;

for(let index = 0; index < word.length; index++){
    letter = word.charAt(index);
    if(letter >= 'a' && letter <= 'z'){
        counter++;
    }
}

console.log("The Number of LowerCase is " + counter);

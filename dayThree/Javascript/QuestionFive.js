let word = "Vladimr";

let index = 0;

for(let count = 0; count < word.length; count++){
    letter = word.toLowerCase().charAt(count);
    if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
        index = count;
        break;
    }
}

console.log("The index of the first vowel is " + index);

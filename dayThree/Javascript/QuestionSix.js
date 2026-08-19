let word = "Baller";

for(let index = 0; index < word.length; index++){
    let letter = word.charAt(index);
    let ascii = (Number)letter;
    
    System.out.println(letter + " index is " + ascii);
}

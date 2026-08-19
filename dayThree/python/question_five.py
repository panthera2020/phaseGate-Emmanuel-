word = "Vladimr"

index = 0

for count in range(len(word)):
    letter = word.lower()[count]
    if(letter == 'a' or letter == 'e' or letter == 'i' or letter == 'o' or letter == 'u'):
        index = count
        break
    

print("The index of the first vowel is ", index)

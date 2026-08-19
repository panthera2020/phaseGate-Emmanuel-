word = "AbdulAzeez"

counter = 0

for index in range(len(word)):
    letter = word[index]
    if(letter >= 'A' and letter <= 'Z'):
        counter += 1

print("The Number of UpperCase is ",counter)

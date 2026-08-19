word = "AbdulAzeez"

counter = 0

for index in range(len(word)):
    letter = word[index]
    if(letter >= 'a' and letter <= 'z'):
        counter += 1

print("The Number of LowerCase is ",counter)

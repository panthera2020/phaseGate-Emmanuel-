total = 0;
counter = 0;

for _ in range(10):
    userScore = int(input("Enter Scores: "))
    if(userScore % 2 == 0):
        if(userScore > 0):
            total += userScore
            counter += 1

average = total / counter; 

print();
print("The sum of the even scores is: ", total);
print();
print("The average of the even scores is: ", average);

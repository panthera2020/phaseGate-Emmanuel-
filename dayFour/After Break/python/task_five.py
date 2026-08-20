total = 0;

for _ in range(10):
    userScore = int(input("Enter Scores: "))
    if(userScore % 2 == 0):
        if(userScore > 0):
            total += userScore

print();
print("The sum of the even scores is: ", total);

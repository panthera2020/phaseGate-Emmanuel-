total = 0;

for _ in range(10):

    userScore = int(input("Enter Score: "))
    if(userScore > 0 and userScore <= 100):
        total += userScore

average = total / 10

print()
print("The average of the scores is: ", average)

total = 0
counter = 0

for _ in range(10):

    userScore = int(input("Enter Score: "))
    counter += 1
    if(counter == 2):
        if(userScore > 0):
            total += userScore
        counter = 0


print();
print("The sum of the scores at even index is: ", total);

number = 20

divisorCounter = 0

for count in range(1,number + 1):
    if(number % count == 0):
        divisorCounter += 1

print("The number of divisors of ", number," is ", divisorCounter)

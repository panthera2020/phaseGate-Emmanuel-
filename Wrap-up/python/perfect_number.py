print("Determine if the number is a perfect Number")

userNumber = int(input("Enter Number: "))

print()

sum = 0

for count in range (1,userNumber):
    if(userNumber % count == 0):
        sum += count
    

if(userNumber == sum):
    print(userNumber, " is a PerfectNumber")
else:
    print(userNumber, " is not a PerfectNumber")

import math

print("Determine if number is an ArmstrongNumber")

userNumber = int(input("Enter Number: "))

print()

storeOne = userNumber
storetwo = userNumber
product = 0
sum = 0
counter = 0

while(storeOne != 0):
    digits = storeOne % 10
    
    counter += 1
    
    storeOne = storeOne // 10


while(storetwo != 0):
    digits = storetwo % 10
    
    product = math.pow(digits, counter)
    
    sum += product
    
    storetwo = storetwo // 10


if(userNumber == sum):
    print(userNumber, " is an ArmstrongNumber")
else:
    print(userNumber, " is not an ArmstrongNumber")


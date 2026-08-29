print("Get The GCD of Two Numbers")

userFirstNumber = int(input("Enter First Number: "))

print()

userSecondNumber = int(input("Enter Second Number: "))

print()

largerNumber = 0
smallerNumber = 0

if(userFirstNumber > userSecondNumber):
    largerNumber = userFirstNumber
    smallerNumber = userSecondNumber
    
    while(smallerNumber != 0):
        remainder = largerNumber % smallerNumber
        largerNumber = smallerNumber
        smallerNumber = remainder
    
elif(userFirstNumber < userSecondNumber):
    largerNumber = userSecondNumber
    smallerNumber = userFirstNumber
    
    while(smallerNumber != 0):
        remainder = largerNumber % smallerNumber
        largerNumber = smallerNumber
        smallerNumber = remainder
    

greatestCommonDivisor = largerNumber

print("The Greatest Common Divisor -> ", greatestCommonDivisor)

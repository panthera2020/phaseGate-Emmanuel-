print("Determine if number is an Strong Number")

userNumber = int(input("Enter Number: "))

print()

store = userNumber
product = 1
factorialSum = 0

while(store != 0):
    digits = store % 10
    
    product = 1
    for count in range(digits , 0, -1):
        product *= count;
    
    
    factorialSum += product
    
    store = store // 10;


if(userNumber == factorialSum):
    print(userNumber," is a Strong Number")
else:
    print(userNumber," is not a Strong Number")

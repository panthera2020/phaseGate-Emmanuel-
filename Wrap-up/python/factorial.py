print("Get Factorial of Number")

userNumber = int(input("Enter Number: "))

print()

factorial = 1

for index in range (userNumber , 0 , -1):
    factorial *= index


print("Factorial of ", userNumber, " -> ", factorial)

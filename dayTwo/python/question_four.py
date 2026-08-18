

for count in range(1, 101):
    if(count % 3 == 0):
        print("hello ", end="")
    elif(count % 5 == 0):
        print("world ", end="")
    elif(count % 7 == 0):
        print("orions ", end="")
    else:
        reverse = 0
        number = count
        while(number > 0):
            digit = number % 10
            reverse = (reverse * 10) + digit
            number = number // 10
           
        
        print(reverse, end=" ")

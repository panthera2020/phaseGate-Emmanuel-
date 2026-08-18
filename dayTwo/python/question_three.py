total = 0

for count in range(1,101):
    total = 0
    number = count
    while(number > 0):
        digit = number % 10;
        total += digit
        number = number // 10;
    
    if(total % 3 != 0):
        print(count, " ", end=" " )
    


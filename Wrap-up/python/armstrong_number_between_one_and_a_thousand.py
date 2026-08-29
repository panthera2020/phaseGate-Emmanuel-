import math

for count in range (1, 1001):
    storeOne = count
    storetwo = count
    product = 0
    sum = 0
    counter = 0
    
    while(storeOne != 0):
        digits = storeOne % 10
        
        counter += 1
        
        storeOne = storeOne // 10
    
    
    while(storetwo != 0):
        digits = storetwo % 10;
        
        product = math.pow(digits, counter);
        
        sum += product;
        
        storetwo = storetwo // 10;
    
    
    if(count == sum):
        print(count, " ");
    



sum = 0

for count in range (1, 1001):
    sum = 0
    for index in range (1 , count):
        if(count % index == 0):
            sum += index;
        
    
    if(count == sum):
        print(count)
    

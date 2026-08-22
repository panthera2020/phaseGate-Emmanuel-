def replaceNegativeElementIn(arrayOfNumbers):
    
    for index in range(len(arrayOfNumbers)):
        number = arrayOfNumbers[index]
        if(number < 0):
            arrayOfNumbers[index] = 0   
    
    return arrayOfNumbers
    
    
    

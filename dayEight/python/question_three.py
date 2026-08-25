def getSumOfElementsInAnArrayOfAnArray(multidimensionalArrayOfNumbers):
    arrayOfSum = []
    total_sum = 0
    
    for index in range(len(multidimensionalArrayOfNumbers)):
        elements = multidimensionalArrayOfNumbers[index]
        total_sum = 0
        for count in range(len(elements)):
            total_sum += elements[count]
        
        arrayOfSum.append(total_sum)

    
    return arrayOfSum;


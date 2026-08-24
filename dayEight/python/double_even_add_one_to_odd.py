def isEven(number):
    isEven = False
    if(number % 2 == 0):
        isEven = True;
    
    return isEven;


def doubleEvenAddOneToOdd(arrayOfNumbers):
    changedArray = []
    
    for index in range(len(arrayOfNumbers)):
        if(isEven(arrayOfNumbers[index])):
            changedArray.append(arrayOfNumbers[index] * 2)
        else:
            changedArray.append(arrayOfNumbers[index] + 1)
        
    return changedArray;


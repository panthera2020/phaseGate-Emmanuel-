def sortArrayOf(arrayOfNumbers):
    store = 0
    
    for count in range(len(arrayOfNumbers)):
        for counter in range(len(arrayOfNumbers)):
            if(arrayOfNumbers[count] > arrayOfNumbers[counter]):
                store = arrayOfNumbers[counter]
                arrayOfNumbers[counter] = arrayOfNumbers[count]
                arrayOfNumbers[count] = store
    
    return arrayOfNumbers



def countDuplicateElementsIn(arrayOfNumbers):
   
   duplicateCounter = 0
   counter = 0
   store = 0
   sortArray = sortArrayOf(arrayOfNumbers)
   
   for index in range(len(sortArray)):
        counter = 0
        for count in range(len(sortArray)):
            if(sortArray[index] == sortArray[count] and sortArray[index] != store):
               counter += 1
           
        if(counter > 1):
           duplicateCounter += 1
           store = sortArray[index]
   return duplicateCounter


def getArrayOfDuplicateElement(arrayOfNumbers):
   
   counter = 0
   store = 0
   sortArray = sortArrayOf(arrayOfNumbers)
   duplicateElementArray = []
   
   for index in range(len(sortArray)):
        counter = 0
        for count in range (len(sortArray)):
           if(sortArray[index] == sortArray[count] and sortArray[index] != store):
               counter += 1
         
        if(counter > 1):
           store = sortArray[index]
           duplicateElementArray.append(sortArray[index])
           index_counter += 1
        
        
        return duplicateElementArray;


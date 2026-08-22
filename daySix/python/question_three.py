def moveZeroElementToEndOfArrayIn(array_Of_numbers):
    store = 0
    
    for index in range (len(array_Of_numbers)):
        for count in range (len(array_Of_numbers)):
            if(array_Of_numbers[index] > array_Of_numbers[count]):
                store = array_Of_numbers[index]
                array_Of_numbers[index] = array_Of_numbers[count]
                array_Of_numbers[count] = store
    
    return array_Of_numbers

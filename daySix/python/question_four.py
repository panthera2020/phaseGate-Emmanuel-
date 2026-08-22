def sort_array_of(array_of_numbers):
    store = 0
    
    for count in range(len(array_of_numbers)):
        for counter in range(len(array_of_numbers)):
            if(array_of_numbers[count] > array_of_numbers[counter]):
                store = array_of_numbers[counter]
                array_of_numbers[counter] = array_of_numbers[count]
                array_of_numbers[count] = store
    
    return array_of_numbers



def count_duplicate_elements_in(array_of_numbers):
   
   duplicate_counter = 0
   counter = 0
   store = 0
   sort_array = sort_array_of(array_of_numbers)
   
   for index in range(len(sort_array)):
        counter = 0
        for count in range(len(sort_array)):
            if(sort_array[index] == sort_array[count] and sort_array[index] != store):
               counter += 1
           
        if(counter > 1):
           duplicate_counter += 1
           store = sort_array[index]
   return duplicate_counter


def get_array_of_duplicate_element(array_of_numbers):
   
   counter = 0
   store = 0
   sort_array = sort_array_of(array_of_numbers)
   duplicate_element_array = []
   
   for index in range(len(sort_array)):
        counter = 0
        for count in range (len(sort_array)):
           if(sort_array[index] == sort_array[count] and sort_array[index] != store):
               counter += 1
         
        if(counter > 1):
           store = sort_array[index]
           duplicate_element_array.append(sort_array[index])
           index_counter += 1
        
        
        return duplicate_element_array;


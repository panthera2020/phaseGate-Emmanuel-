def check_number_of_prime_in(array_of_numbers):
    counter = 0
    
    for index in range(len(array_of_numbers)):
        number = array_of_numbers[index];
        if(is_prime(number)):
            counter += 1
    
    return counter


def is_prime(number):
    is_prime = False
    prime_counter = 0
    
    for count in range(1, number + 1):
        if(number % count == 0):
            prime_counter += 1
    
    if(prime_counter == 2):
        is_prime = True
   
    return is_prime


def sort_elements_in(array_of_numbers):
    store = 0
    
    for index in range (len(array_of_numbers)):
        for count in range (len(array_of_numbers)):
            if(array_of_numbers[index] < array_of_numbers[count]):
                store = array_of_numbers[index]
                array_of_numbers[index] = array_of_numbers[count]
                array_of_numbers[count] = store
    
    return array_of_numbers


def get_primes_in(array_of_numbers):
    array_of_primes = []
    counter = 0
    
    
    for index in range (len(array_of_numbers)):
        number = array_of_numbers[index]
        
        if(is_prime(number)):
            array_of_primes.append(array_of_numbers[index])
    
    return array_of_primes
    
    
    
    


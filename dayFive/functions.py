def add(first_number, second_number):
    return first_number + second_number
    
def isEven(number):
    isEven = False
    if number % 2 == 0 :
        isEven = True
    else:
        isEven = False
    return isEven
    
def square(number):
    square_of_number = number * number
    return square_of_number
    
def to_farenheit(celcius):
    farenheit = ((9 / 5) * celcius) + 32
    return farenheit
    
def is_prime(number):
    is_prime = False
    prime_counter = 0
    for _ in range(1,number + 1):
        if(number % _ == 0):
            prime_counter += 1
            
    if(prime_counter == 2):
        is_prime = True
    else:
        is_prime = False
    
    return is_prime 
    
def largest(first_number, second_number, third_number):
    largest = first_number
    
    if second_number > largest and second_number > third_number:
        largest = second_number
    elif third_number > largest and third_number > second_number:
        largest = third_number

    return largest
 
def simple_interest(principal, rate, time):
    simple_interest = (principal * rate * time) / 100 
    return simple_interest
    
def area_of_rectangle(length,height):
    area = length * height
    return area
    
def reverse(number):
    reverse = 0
    
    while(number > 0):
        digit = number % 10
        
        reverse = (reverse * 10) + digit
        
        number = number // 10
        
    return reverse
    
    
def count_character(word, character):
    counter = 0;
    for _ in range(len(word)):
        if character == word[_]:
            counter += 1
    
    return counter
    
    
    
    
    
    
    
    

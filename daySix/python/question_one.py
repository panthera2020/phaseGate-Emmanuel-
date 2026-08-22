def checkNumberOfPrimeIn(arrayOfNumbers):
    counter = 0
    
    for index in range(len(arrayOfNumbers)):
        number = arrayOfNumbers[index];
        if(isPrime(number)):
            counter += 1
    
    return counter


def isPrime(number):
    isPrime = False
    primeCounter = 0
    
    for count in range(1, number + 1):
        if(number % count == 0):
            primeCounter += 1
    
    if(primeCounter == 2):
        isPrime = True
   
    return isPrime


def sortElementsIn(arrayOfNumbers):
    store = 0
    
    for index in range (len(arrayOfNumbers)):
        for count in range (len(arrayOfNumbers)):
            if(arrayOfNumbers[index] < arrayOfNumbers[count]):
                store = arrayOfNumbers[index]
                arrayOfNumbers[index] = arrayOfNumbers[count]
                arrayOfNumbers[count] = store
    
    return arrayOfNumbers


def getPrimesIn(arrayOfNumbers):
    arrayOfPrimes = []
    counter = 0
    
    
    for index in range (len(arrayOfNumbers)):
        number = arrayOfNumbers[index]
        
        if(isPrime(number)):
            arrayOfPrimes.append(arrayOfNumbers[index])
    
    return arrayOfPrimes
    
    
    
    


public class QuesionOne {
    
    public static int checkNumberOfPrimeIn(int [] arrayOfNumbers){
        int counter = 0;
        
        for(int index = 0; index < arrayOfNumbers.length; index++){
            int number = arrayOfNumbers[index];
            if(isPrime(number)){
                counter++;
            }
        }
        
        return counter;
    }
    
    private static boolean isPrime(int number){
        boolean isPrime = false;
        int primeCounter = 0;
        
        for(int count = 1; count <= number; count++){
            if(number % count == 0){
                primeCounter++;
            }
        }
        
        if(primeCounter == 2){
            isPrime = true;
        }
        
        return isPrime;
    }
    
    public static int [] sortElementsIn(int [] arrayOfNumbers){
        int store = 0;
        
        for(int index = 0; index < arrayOfNumbers.length; index++){
            for(int count = 0; count < arrayOfNumbers.length; count++){
                if(arrayOfNumbers[index] < arrayOfNumbers[count]){
                    store = arrayOfNumbers[index];
                    arrayOfNumbers[index] = arrayOfNumbers[count];
                    arrayOfNumbers[count] = store;
                }
            }
        }
        
        return arrayOfNumbers;
    }
    
    public static int [] getPrimesIn(int [] arrayOfNumbers){
        int [] arrayOfPrimes = new int [checkNumberOfPrimeIn(arrayOfNumbers)];
        int counter = 0;
        
        
        for(int index = 0; index < arrayOfNumbers.length; index++){
            int number = arrayOfNumbers[index];
            
            if(isPrime(number)){
                arrayOfPrimes[counter] = arrayOfNumbers[index];
                counter++;
            }
        }
        
        return arrayOfPrimes;
    }
}

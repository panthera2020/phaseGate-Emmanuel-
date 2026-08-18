public class QuestionSix {
    public static boolean isPrime(int number){
        boolean numberIsPrime = false;
        
        int primeCounter = 0;
        
        for(int count = 1; count < number; count++){
            if(number % count == 0){
                primeCounter++;
            }
        }
        if(primeCounter == 2){
            numberIsPrime = true;
        }else{
            numberIsPrime = false;
        }
        
    return numberIsPrime;
    }
    
    public static boolean isPalindrome(int numberInput){
    
        int number = numberInput;
        int reverse = 0;
        boolean numberIsPalindrome = false;
        
        while(number > 0){
            int digit = number % 10;
            
            reverse = (reverse * 10) + digit;
            
            number /= 10;
        }
        
        if(reverse == numberInput){
            numberIsPalindrome = true;
        }else{
            numberIsPalindrome = false;
        }
    return numberIsPalindrome;
    }
}

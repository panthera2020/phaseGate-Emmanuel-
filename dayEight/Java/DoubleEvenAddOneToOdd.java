public class DoubleEvenAddOneToOdd {

    public static boolean isEven(int number){
        boolean isEven = false;
        if(number % 2 == 0){
            isEven = true;
        }
        
        return isEven;
    }
    
    public static int [] doubleEvenAddOneToOdd(int [] arrayOfNumbers){
        int [] changedArray = new int [arrayOfNumbers.length];
        
        for(int index = 0; index < arrayOfNumbers.length; index++){
            if(isEven(arrayOfNumbers[index])){
                changedArray[index] = arrayOfNumbers[index] * 2;
            }else{
                changedArray[index] = arrayOfNumbers[index] + 1;
            }
        }
        
        return changedArray;
    }
}

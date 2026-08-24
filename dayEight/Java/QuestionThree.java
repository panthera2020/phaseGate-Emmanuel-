public class QuestionThree {

    public static int [] getSumOfElementsInAnArrayOfAnArray(int [][] multidimensionalArrayOfNumbers){
        int [] arrayOfSum = new int[multidimensionalArrayOfNumbers.length];
        int sum = 0;
        
        for(int index = 0; index < multidimensionalArrayOfNumbers.length; index++){
            int [] elements = multidimensionalArrayOfNumbers[index];
            sum = 0;
            for(int count = 0; count < elements.length; count++){
                sum += elements[count];
            }
            arrayOfSum[index] = sum;
        }
        
        return arrayOfSum;
    }
}

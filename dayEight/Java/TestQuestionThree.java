import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionThree {

    @Test
    void TestThatWhenIEnterAmultidimensionalArrayOfIntegersIGetAnArrayOfTheSumOfEachOftheArrayElements(){
        //Given 
        int [][] multidimensionalArrayOfNumbers = {{3,5,7},{2,2,2},{4,1,9}};
        int [][] multidimensionalArrayOfNumbersTwo = {{3,9},{2,8},{0,6}};
        
        //When
        int [] actualArrayOfSum = QuestionThree.getSumOfElementsInAnArrayOfAnArray(multidimensionalArrayOfNumbers);
        int [] actualArrayOfSumTwo = QuestionThree.getSumOfElementsInAnArrayOfAnArray(multidimensionalArrayOfNumbersTwo);
        
        int [] expectedArrayOfSum = {15,6,14};
        int [] expectedArrayOfSumTwo = {12,10,6};
        
        //Check
        assertArrayEquals(expectedArrayOfSum, actualArrayOfSum);
        assertArrayEquals(expectedArrayOfSumTwo, actualArrayOfSumTwo);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionTwo {

    @Test
    void TestThatWhenICollectAnArrayOfNumbersItGetsSorted(){
        //Given
        int [] arrayOfNumbers = {4,9,5};
        
        //When
        int [] actualSortedArray = QuestionTwo.sortArray(arrayOfNumbers);
        
        int [] expectedSortedArray = {4,5,9};
        
        //Check
        assertArrayEquals(expectedSortedArray,actualSortedArray);
    }
    
    @Test
    void TestThatWhenIEnterTwoArrayIGetTheNumberOfSimilarNumbersInBothArray(){
        //Given
        int [] firstArray = {4,9,5};
        
        int [] secondArray = {9,4,9,8,5};
        
        //When
        int actualCount = QuestionTwo.countSimilarIn(firstArray,secondArray);
        
        int expectedCount = 3;
        
        //Check
        assertEquals(expectedCount,actualCount);
    }
    
    @Test
    void TestThatWhenIGetTwoArraysIGetAnArrayOfTheSimilarDistinctNumbersInBothArrays(){
        //Given
        int [] firstArray = {4,9,5};
        
        int [] secondArray = {9,4,9,8,5};
        
        //When
        int [] actualArray = QuestionTwo.getSimilarIn(firstArray,secondArray);
        
        int [] expectedArray = {4,5,9};
        
        //Check
        assertArrayEquals(expectedArray,actualArray);
    }
}

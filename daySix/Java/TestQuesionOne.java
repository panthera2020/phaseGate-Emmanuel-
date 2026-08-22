import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuesionOne {

    @Test
    void TestThatWhenIEnterAnArrayOfIntegersItReturnsTheNumberOfPrimeNumbersIntheArray(){
        //Given
        int [] arrayOfNumbers = {5,9,3,6,2};
        
        //When 
        int actualCountOfPrimes = QuesionOne.checkNumberOfPrimeIn(arrayOfNumbers);
        
        int expectedCountOfPrimes = 3;
        
        //Check
        assertEquals(expectedCountOfPrimes, actualCountOfPrimes); 
    }
    
    @Test
    void TestThatWhenIEnterAnArrayOfIntegerIGetAnArrayOfPrimes(){
        //Given
        int [] arrayOfNumbers = {5,9,3,6,2};
        
        //When
        int [] actualArrayOfPrimes = QuesionOne.getPrimesIn(arrayOfNumbers);
        
        int [] expectedArrayOfPrimes = {5,3,2};
        
        //Check
        assertArrayEquals(expectedArrayOfPrimes, actualArrayOfPrimes);
    }
    
    @Test
    void TestThatWhenIEnterAnArrayOfNumberIGetTheArraySorted(){
        //Given
        int [] arrayOfNumbers = {5,3,2};
        
        //When
        int [] actualSortedArray = QuesionOne.sortElementsIn(arrayOfNumbers);
        
        int [] expectedSortedArray = {2,3,5};
        
        //Check
        assertArrayEquals(expectedSortedArray, actualSortedArray);
    }
}

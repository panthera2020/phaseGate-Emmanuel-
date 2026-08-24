import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDoubleEvenAddOneToOdd {

    @Test
        void TestThatWhenIEnterANumberItreturnsTrueIfNumberIsEven(){
        //Given
        int number = 4;
        
        //When
        boolean actualAnswer = DoubleEvenAddOneToOdd.isEven(number);
        
        boolean expectedAnswer = true;
        
        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
    
    @Test
    void TestThatWhenIEnterAnArrayOfNumbersTheEvenNumbersGetDoubledAndOneIsAddedToOddNumbersAllReturnedInAnArray(){
        //Given
        int [] firstArrayOfNumbers = {12,17,39};
        int [] secondArrayOfNumbers = {-1,5,6,7,4};
        
        //When
        int [] actualFirstArrayOfNumbers = DoubleEvenAddOneToOdd.doubleEvenAddOneToOdd(firstArrayOfNumbers);
        int [] actualSecondArrayOfNumbers = DoubleEvenAddOneToOdd.doubleEvenAddOneToOdd(secondArrayOfNumbers);
        
        int [] expectedFirstArrayOfNumbers = {24,18,40};
        int [] expectedSecondArrayOfNumbers = {0,6,12,8,8};
        
        //Check
        assertArrayEquals(expectedFirstArrayOfNumbers, actualFirstArrayOfNumbers);
        assertArrayEquals(expectedSecondArrayOfNumbers, actualSecondArrayOfNumbers);
    }
} 

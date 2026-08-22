import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionTwo {

    @Test
    void TestThatWhenIEnterAnArrayOfIntegersItReturnsTheArrayWithAllTheNegativeElementsReplacedWithZero(){
        //Given
        int [] arrayOfNumbers = {5, -9, 3, -6, 2, -11};
        
        //When
        int [] actualReplacedArray = QuestionTwo.replaceNegativeElementIn(arrayOfNumbers);
        
        int [] expectedReplacedArray = {5,0,3,0,2,0};
        
        //Check
        assertArrayEquals(expectedReplacedArray, actualReplacedArray);
    }
}

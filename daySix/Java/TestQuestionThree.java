import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionThree {
    
    @Test
    void TestThatWhenIEnterAnArrayOfIntegersAllTheZeroElementsAreMovedToTheEndOfTheArray(){
        //Given
        int [] arrayOfNumbers = {5,0,3,0,2,0};
        
        //When
        int [] actualSortedArray = QuestionThree.moveZeroElementToEndOfArrayIn(arrayOfNumbers);
        
        int [] expectedSortedArray = {5,3,2,0,0,0};
        
        //Check
        assertArrayEquals(expectedSortedArray, actualSortedArray);
    }
}

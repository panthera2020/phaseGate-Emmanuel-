import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionOne {

    @Test
    void TestThatWhenInputAnArrayOfIntegersOneIsAddedToTheLastElement(){
        //Given
        int [] digits = {1,2,9};
        
        //When
        int [] actualArray = QuestionOne.addToLastElement(digits);
        
        int [] expectedArray = {1,2,1,0};
        
        //Check
        assertArrayEquals(expectedArray,actualArray);
    }
    
    @Test
    void TestThatIfTheArrayOfNumbersIsASingleNumberAndAddingOneLeadsToADoubleDigitSplitItIntoTwoElementsInTheArray(){
        //Given
        int [] digit = {1,9};
        
        //When
        int [] actualArray = QuestionOne.addToLastElement(digit);
        
        int [] expectedArray = {1,1,0};
        
        //Check
        assertArrayEquals(expectedArray,actualArray);
    }
}

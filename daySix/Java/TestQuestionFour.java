import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionFour {

    @Test
    void TestThatIfIEnterAnArrayOfIntegersIGetTheNumberOfDuplicateInElementsInTheArray(){
        //Given
        int [] arrayOfNumbers = {45,60,3,0,67,2,45,3,22,0};
        
        //When
        int actualCountOfDuplicateElements = QuestionFour.countDuplicateElementsIn(arrayOfNumbers);
        
        int expectedCountOfDuplicateElements = 3;
        
        //Check
        assertEquals(expectedCountOfDuplicateElements, actualCountOfDuplicateElements);
    }
    
    @Test
    void TestThatWhenIGetAnArrayOfIntegersIGetAnArrayOfTheElementsThatAreDuplicated(){
        //Given
        int [] arrayOfNumbers = {45,60,3,0,67,2,45,3,22,0};
        
        //When 
        int [] actualArrayOfDuplicatedElements = QuestionFour.getArrayOfDuplicateElement(arrayOfNumbers);
        
        int [] expectedArrayOfDuplicatedElements = {45,3,0};
        
        //Check
        assertArrayEquals(expectedArrayOfDuplicatedElements, actualArrayOfDuplicatedElements);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionTwo {

    @Test
    void TestThatWhenIEnterAnArrayOfNumbersIGetTheOnlyNonRepeatedElement(){
    //Given 
    int [] arrayOfNumbers = {2,2,1};
    
    //When
    String actualElement = QuestionTwo.singleDigitIn(arrayOfNumbers);
    
    String expectedElement = "1";
    
    //Check
    assertEquals(expectedElement, actualElement);
    }
    
    @Test
    void TestThatWhenIEnterAnArrayThatHasOnlyOneElementItReturnsThatElement(){
        //Given 
        int [] arrayOfNumbers = {1};
        
        //When
        String actualElement = QuestionTwo.singleDigitIn(arrayOfNumbers);
        
        String expectedElement = "1";
        
        //Check
        assertEquals(expectedElement, actualElement);
    }
    
    @Test
    void TestThatWhenIEnterAnArrayOfNumbersThatHaveMultipleSingleElementIGetTheSingleElements(){
        //Given 
        int [] arrayOfNumbers = {1,1,2,3,4,4,5,5,6};
        
        //When
        String actualElement = QuestionTwo.singleDigitIn(arrayOfNumbers);
        
        String expectedElement = "236";
        
        //Check
        assertEquals(expectedElement, actualElement);
    }
}

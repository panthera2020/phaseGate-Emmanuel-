import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionOne {
    
    @Test
    void TestThatWhenIGetANumberItAddsTheDigitsAndReturnTheSumOfTheDigitAsOneDigit(){
        //Given
        int number = 38;
        
        //When
        int actualAnswer = QuestionOne.addDigits(number);
        
        int expectedAnswer = 2;
        
        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
    
    @Test
    void TestThatWhenIEnterANumberThatIsZeroIGetZero(){
        //Given
        int number = 0;
        
        //When
        int actualAnswer = QuestionOne.addDigits(number);
        
        int expectedAnswer = 0;
        
        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
    
    @Test
    void TestThatWhenIEnterANumberHigherThanTwoDigitsItAddsTheDigitsAndReturnTheSumOfTheDigitAsOneDigit(){
        //Given
        int number = 289;
        
        //When
        int actualAnswer = QuestionOne.addDigits(number);
        
        int expectedAnswer = 1;
        
        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
}

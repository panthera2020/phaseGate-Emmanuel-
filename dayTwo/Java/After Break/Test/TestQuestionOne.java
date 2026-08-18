import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQuestionOne{

    @Test
    void testThatWhenIEnterFatherAgeAndSonAgeIGetTheYearsWhenFatherWillBeTwiceAsOld(){
        int fatherAge = 3;
        int sonAge = 15;
        
        int expectedAnswer = QuestionOne.fatherAgeDifference(fatherAge,sonAge);
        int actualAnswer = 0;
        
        assertEquals(expectedAnswer, actualAnswer);    
    }
}

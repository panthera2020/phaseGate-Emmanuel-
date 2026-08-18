import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQuestionTwo{

    @Test
    void testThatWhenIEnterThreeValuesIGetAGradeThatIsTheAverage(){
        int firstScore = 90;
        int secondScore = 90;
        int thirdScore = 90;
        
        char expectedAnswer = QuestionTwo.grade(firstScore,secondScore,thirdScore);
        char actualAnswer = 'A';
        
        assertEquals(expectedAnswer, actualAnswer);    
    }
}

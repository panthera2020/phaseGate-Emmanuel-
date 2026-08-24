import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionTwo {

    @Test
    void TestThatWhenIGetAStringInputItReturnsFalseIfTheBracketsAreNotCompleteBothOpenAndClosingBrackets(){
        //Given
        String firstInput = "[<{}(<]>>";
        String secondInput = "(((())))[";
        
        //When
        boolean firstActualAnswer = QuestionTwo.isBracketComplete(firstInput);
        boolean secondActualAnswer = QuestionTwo.isBracketComplete(secondInput);
        
        boolean expectedFirstAnswer = false;
        boolean expectedSecondAnswer = false;
        
        //Check
        assertEquals(expectedFirstAnswer,firstActualAnswer);
        assertEquals(expectedSecondAnswer, secondActualAnswer);
    }
    
    @Test
    void TestThatWhenIGetAStringInputItReturnsTrueIfTheBracketsAreCompleteBothOpenAndClosingBrackets(){
        //Given
        String firstInput = "]()[";
        String secondInput = "{()}[]";
        
        //When
        boolean firstActualAnswer = QuestionTwo.isBracketComplete(firstInput);
        boolean secondActualAnswer = QuestionTwo.isBracketComplete(secondInput);
        
        boolean expectedFirstAnswer = true;
        boolean expectedSecondAnswer = true;
        
        //Check
        assertEquals(expectedFirstAnswer,firstActualAnswer);
        assertEquals(expectedSecondAnswer, secondActualAnswer);
    }
}

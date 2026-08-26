import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionThree {

    @Test
    void TestThatWhenIGetAnArrayOfnumbersItReturnsTrueIfThereAreDuplicateNumbers(){
        //Given
        int [] arrayOfNumbers = {1,2,3,1};
        
        //When
        boolean actualAnswer = QuestionThree.isElementDuplicatedIn(arrayOfNumbers);
        
        boolean expectedAnswer = true;
        
        //Check
        assertEquals(expectedAnswer,actualAnswer);
    }
}

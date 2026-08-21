import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQuestionThree {

    @Test
    void TestThatWhenIGetAnArrayOfStringIGetAStringThatContainsTheLeadingCharactersThatAreSimiliarInEachElement(){
        //Given
        String [] arrayOfStrings = {"flower", "flow", "flight"};
        
        //When
        String actualStringResult = QuestionThree.similarLeadingPrefixIn(arrayOfStrings);
        
        String expectedStringResult = "fl";
        
        //Check
        assertEquals(expectedStringResult, actualStringResult);
    }
}

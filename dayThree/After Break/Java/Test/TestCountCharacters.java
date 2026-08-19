import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCountCharacters {

    @Test
    void testThatWhenIEnterAStringWithRepeatedCharactersIGetATheAmountOfDistinctCaseInsensitiveCharactersRepeated(){
        //Given
        String word = "a111BAcd";
        
        //When
        int actual_answer = CountCharacters.countDistinctCharactersIn(word);
        
        int expected_answer = 3;
        
        //Check
        assertEquals(expected_answer, actual_answer);
        
    }
    
    
    @Test
    void testThatWhenIEnterAStringWithWithoutRepeatedCharactersIGetZero(){
        //Given
        String word = "abcdef";
        
        //When
        int actual_answer = CountCharacters.countDistinctCharactersIn(word);
        
        int expected_answer = 0;
        
        //Check
        assertEquals(expected_answer, actual_answer);
        
    }
}

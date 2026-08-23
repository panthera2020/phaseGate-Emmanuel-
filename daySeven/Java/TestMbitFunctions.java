import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMbitFunctions {

    @Test
    void TestThatWhenIEnterAnArrayOfStringsIGetTheFirstStringElementInTheArray(){
        //Given
        String [] optionsArray = {"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"};
        
        //When
        String actualFirstElement = MbitFunctions.getFirstElementIn(optionsArray);
        
        String expectedFirstElement = "A. expend energy, enjoy groups";
        
        //Check
        assertEquals(expectedFirstElement, actualFirstElement);
    }
    
    @Test
    void TestThatWhenIEnterAnArrayOfStringsIGetTheSecondStringElementInTheArray(){
        //Given
        String [] optionsArray = {"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"};
        
        //When
        String actualSecondElement = MbitFunctions.getSecondElementIn(optionsArray);
        
        String expectedSecondElement = "B. conserve energy, enjoy one-on-one";
        
        //Check
        assertEquals(expectedSecondElement, actualSecondElement);
    }
    
    @Test
    void TestThatWhenIEnterAnMultidimensionalArrayOfStringsIGetTheFirstStringElementOfTheIndexInputedInTheArray(){
        //Given
        String [] firstOptionsArray = {"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"};
        String [] secondOptionsArray = {"A. Interpret literally", "B. look for meaning and possibilities"};
        
        String [][] options = {firstOptionsArray,secondOptionsArray};
        
        //When
        String actualFirstElement = MbitFunctions.getFirstElementIn(options, 0);
        
        String expectedFirstElement = "A. expend energy, enjoy groups";
        
        //Check
        assertEquals(expectedFirstElement, actualFirstElement);
    } 
    
    @Test
    void TestThatWhenIEnterAnArrayOfStringsIGetTheSecondStringElementOfTheIndexInputedInTheArray(){
        //Given
        String [] firstOptionsArray = {"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"};
        String [] secondOptionsArray = {"A. Interpret literally", "B. look for meaning and possibilities"};
        
        String [][] options = {firstOptionsArray,secondOptionsArray};
        
        //When
        String actualSecondElement = MbitFunctions.getSecondElementIn(options, 0);
        
        String expectedSecondElement = "B. conserve energy, enjoy one-on-one";
        
        //Check
        assertEquals(expectedSecondElement, actualSecondElement);
    }
}

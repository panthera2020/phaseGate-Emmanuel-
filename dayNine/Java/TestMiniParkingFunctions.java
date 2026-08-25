import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMiniParkingFunctions {

    @Test
    void TestThatWhenICheckTheParkingSpaceIGetAllTheParkingSpaceEmpty(){
        MiniParkingFunctions park = new MiniParkingFunctions();
        
        //When
        String [] actualSlotAvailable = park.checkParkingSpace();
        String [] expectedSlotAvailable = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
        
        //Check
        assertArrayEquals(expectedSlotAvailable,actualSlotAvailable);
    }
    
    @Test
    void TestThatWhenISelectedSlotSlotGetFilledAndThatPlaceAndShowsParked(){
        MiniParkingFunctions park = new MiniParkingFunctions();
        //Given
        int slot = 1;
        park.chooseSlot(slot);
        
        //When
        String [] actualSlotAvailable = park.checkParkingSpace();
        String [] expectedSlotAvailable = {"Parked","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
        
        //Check
        assertArrayEquals(expectedSlotAvailable,actualSlotAvailable);
    }
    
    @Test
    void TestThatWhenICheckoutParkingSlotBecomesEmpty(){
        MiniParkingFunctions park = new MiniParkingFunctions();
        //Given
        int slot = 1;
        park.chooseSlot(slot);
        
        String [] actualSlotAvailable = park.checkParkingSpace();
        String [] expectedSlotAvailable = {"Parked","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
        
        assertArrayEquals(expectedSlotAvailable,actualSlotAvailable);
        
        //Given
        int slotTwo = 1;
        park.checkOut(slot);
        
        //When
        String [] actualSlotNowAvailable = park.checkParkingSpace();
        String [] expectedSlotNowAvailable = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
        
        //Check
        assertArrayEquals(expectedSlotNowAvailable,actualSlotNowAvailable);
    }
    
    @Test
    void TestThatWhenICheckASlotItReturnsFalseIfFilled(){
        MiniParkingFunctions park = new MiniParkingFunctions();
        //Given
        int slot = 1;
        park.chooseSlot(slot);
        
        //When
        boolean actualAnswer = park.isSlotEmpty(slot);
        boolean expectedAnswer = false;
        
        //Check
        assertEquals(expectedAnswer,actualAnswer);
    }
}









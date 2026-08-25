from unittest import TestCase

from mini_parking_functions import *

class TestMiniParkingFunctions(TestCase):

    def test_ThatWhen_iCheckTheParkingSpace_iGetAllThe_parkingSpaceEmpty(self):
        actualSlotAvailable = check_parking_space()
        expectedSlotAvailable = ["Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"]
        
        self.assertEqual(expectedSlotAvailable,actualSlotAvailable)
        
    def test_thatWhen_iSelectedSlot_theSlotGetFilled_andThatPlace_andShowsParked(self):
        slot = 1;
        choose_slot(slot);
        
        actualSlotAvailable = check_parking_space()
        expectedSlotAvailable = ["Parked","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"]
        
        self.assertEqual(expectedSlotAvailable,actualSlotAvailable)
        
    def test_thatWhen_iCheckoutParkingSlot_becomesEmpty(self):
        slot = 1
        choose_slot(slot)
        
        actualSlotAvailable = check_parking_space()
        expectedSlotAvailable = ["Parked","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"]
        
        self.assertEqual(expectedSlotAvailable,actualSlotAvailable)
        
        slotTwo = 1
        check_out(slot)
        
        actualSlotNowAvailable = check_parking_space()
        expectedSlotNowAvailable = ["Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"]
        
        self.assertEqual(expectedSlotNowAvailable,actualSlotNowAvailable)
        
    def test_thatWhen_iCheckASlot_itReturnsFalse_ifFilled(self):
        slot = 1
        choose_slot(slot)
        
        actualAnswer = is_slot_empty(slot)
        expectedAnswer = False
        
        self.assertEqual(expectedAnswer,actualAnswer)

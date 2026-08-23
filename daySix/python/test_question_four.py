from unittest import TestCase

from question_four import *

class TestQuesionFour (TestCase):

    def test_thatWhenIGet_anArrayOfIntegers_iGetAnArray_ofTheElements_thatAreDuplicated(self):
    
        array_of_numbers = [45,60,3,0,67,2,45,3,22,0]
        
        actualArrayOfDuplicatedElements = get_array_of_duplicate_element(array_of_numbers)
        
        expectedArrayOfDuplicatedElements = [45,3,0]
        
        self.assertEqual(expectedArrayOfDuplicatedElements, actualArrayOfDuplicatedElements)

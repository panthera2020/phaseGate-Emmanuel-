from unittest import TestCase

from question_four import *

class TestQuesionFour (TestCase):

    def test_thatWhenIGet_anArrayOfIntegers_iGetAnArray_ofTheElements_thatAreDuplicated(self):
    
        arrayOfNumbers = [45,60,3,0,67,2,45,3,22,0]
        
        actualArrayOfDuplicatedElements = getArrayOfDuplicateElement(arrayOfNumbers)
        
        expectedArrayOfDuplicatedElements = [45,3,0]
        
        self.assertEqual(expectedArrayOfDuplicatedElements, actualArrayOfDuplicatedElements)

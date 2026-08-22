from unittest import TestCase

from question_three import *

class TestQuesionThree(TestCase):

    def test_thatWhen_iEnterAnArray_ofIntegers_allTheZeroElement_areAtTheEndOf_theArray(self):
        arrayOfNumbers = [5,0,3,0,2,0]
        
        actualArrayOfPrimes = moveZeroElementToEndOfArrayIn(arrayOfNumbers)
        
        expectedArrayOfPrimes = [5,3,2,0,0,0]
        
        self.assertEqual(expectedArrayOfPrimes, actualArrayOfPrimes) 

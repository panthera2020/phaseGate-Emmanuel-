from unittest import TestCase

from question_two import *

class TestQuesionTwo(TestCase):

    def test_thatWhenIEnter_anArrayOfIntegers_itReturnsTheArray_withAllThe_negativeElementsReplaced_withZero(self):
        arrayOfNumbers = [5,-6,3,-9,2,-1]
        
        actualReplacedArray = replaceNegativeElementIn(arrayOfNumbers)
        
        expectedReplacedArray =  [5, 0, 3, 0, 2, 0 ]
        
        self.assertEqual(expectedReplacedArray, actualReplacedArray)


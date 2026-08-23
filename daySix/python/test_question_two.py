from unittest import TestCase

from question_two import *

class TestQuesionTwo(TestCase):

    def test_thatWhenIEnter_anArrayOfIntegers_itReturnsTheArray_withAllThe_negativeElementsReplaced_withZero(self):
        array_of_numbers = [5,-6,3,-9,2,-1]
        
        actualReplacedArray = replace_negative_element_in(array_of_numbers)
        
        expectedReplacedArray =  [5, 0, 3, 0, 2, 0 ]
        
        self.assertEqual(expectedReplacedArray, actualReplacedArray)



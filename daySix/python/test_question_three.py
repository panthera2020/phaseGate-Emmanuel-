from unittest import TestCase

from question_three import *

class TestQuesionThree(TestCase):

    def test_thatWhen_iEnterAnArray_ofIntegers_allTheZeroElement_areAtTheEndOf_theArray(self):
        array_of_numbers = [5,0,3,0,2,0]
        
        actual_array_of_primes = move_zero_element_to_end_of_array_in(array_of_numbers)
        
        expected_array_of_primes = [5,3,2,0,0,0]
        
        self.assertEqual(expected_array_of_primes, actual_array_of_primes) 

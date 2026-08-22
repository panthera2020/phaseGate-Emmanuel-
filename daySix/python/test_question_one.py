from unittest import TestCase

from question_one import *

class TestQuesionOne(TestCase):

    def test_thatWhen_iEnterAnArray_ofIntegers_iGetAnArrayOf_primeNumbers(self):
        arrayOfNumbers = [5,9,3,6,2]
        
        actualArrayOfPrimes = get_primes_in(arrayOfNumbers)
        
        expectedArrayOfPrimes = [5,3,2]
        
        self.assertEqual(expectedArrayOfPrimes, actualArrayOfPrimes) 
        

    def test_thatWhen_iEnterAnArray_ofIntegers_iGetAnArray_ofSortedElements(self):
        arrayOfNumbers = [5,3,2]
        
        actualSortedArray = sort_elements_in(arrayOfNumbers)
        
        expectedSortedArray = [2,3,5]
        
        self.assertEqual(expectedSortedArray, actualSortedArray)

import unittest

from question_one import father_age_difference

class TestFatherAgeDifference(unittest.TestCase):
    
    def test_thatWhen_iEnterFatherAge_andSonAge_IgetTheYear_theFatherWill_beTwiceTheSonsAGe(self):
        expectedAnswer = father_age_difference(30,15)
        
        actualAnswer = 0
        
        self.assertEqual(expectedAnswer,actualAnswer)
        

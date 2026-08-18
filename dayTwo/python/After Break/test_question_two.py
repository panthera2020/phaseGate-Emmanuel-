import unittest

from question_two import grade

class TestGrade(unittest.TestCase):
    
    def test_thatWhen_iEnterThreeScores_IGetTheGrade_OfTheAverage_ofTheScores(self):
        expectedAnswer = grade(90,90,90)
        
        actualAnswer = 'A'
        
        self.assertEqual(expectedAnswer,actualAnswer)
        

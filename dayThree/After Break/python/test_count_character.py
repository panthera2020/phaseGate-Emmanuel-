from unittest import TestCase

from count_character import countDistinctCharactersIn

class TestCountCharacter(TestCase):
    
    def test_thatWhenI_enterAString_ofVariousCharacterRepeated_iGetThe_amountOfCase_insensitiveCharcters_thatOccurMore_thanOnce(self):
        word = "a111BAcd"
        
        actual_answer = countDistinctCharactersIn(word)
        
        expected_answer = 3
        
        self.assertEqual(expected_answer, actual_answer)
        

    def test_thatWhenI_enterAString_ofNonRepeated_charctersIGet_Zero(self):
        word = "abcdef"
        
        actual_answer = countDistinctCharactersIn(word)
        
        expected_answer = 0
        
        self.assertEqual(expected_answer, actual_answer)

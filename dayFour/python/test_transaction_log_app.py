from unittest import TestCase

from transcation_log_app import *

class TestTransaction(TestCase):

    def test_thatWhen_iCheckAcountBalance_igetTheAccountBalance(self):
    
        actualBalance = getBalance()
        
        expectedBalance = 0
        
        self.assertEqual(actualBalance,expectedBalance)
        
    def test_thatWhenI_depositItAddsToBalance(self):
        
        amount = 1000
        
        deposit(amount)
        
        actualBalance = getBalance()
        
        expectedBalance = 1000
        
        self.assertEqual(actualBalance,expectedBalance)
        
        

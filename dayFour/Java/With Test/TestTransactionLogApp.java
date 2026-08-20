import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTransactionLogApp {

    @Test
    public void TestThatWhenICheckAcountBalanceIgetTheAccountBalance(){
        double actualBalance = TransactionLogApp.getAccountBalance();
        
        double expectedBalance = 0;
        
        assertEquals(expectedBalance, actualBalance); 
    }
    
    @Test
    public void TestThatWhenIDepositItAddsToBalance(){
        //Given
        double amount = 1000;
        
        double balance = TransactionLogApp.getAccountBalance();
        
        //When 
        double actualBalance = TransactionLogApp.deposit(amount,balance);
        
        double expectedBalance = 1000;
        
        //Check
        assertEquals(expectedBalance,actualBalance);
    }
}

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
        
        //When 
        double actualBalance = TransactionLogApp.
    }
}

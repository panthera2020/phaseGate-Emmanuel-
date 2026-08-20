import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTransactionLogApp {

    @Test
    public void TestThatWhenICheckAcountBalanceIgetTheAccountBalance(){
        TransactionLogApp account = new TransactionLogApp();
        
        double actualBalance = account.getBalance();
        
        double expectedBalance = 0.0;
        
        assertEquals(expectedBalance, actualBalance); 
    }
    
    @Test
    public void TestThatWhenIDepositItAddsToBalance(){
        //Given
        double amount = 1000;
        
        //When 
        TransactionLogApp account = new TransactionLogApp();
        
        account.deposit(amount);
        
        double actualBalance = account.getBalance();
        
        double expectedBalance = 1000;
        
        //Check
        assertEquals(expectedBalance,actualBalance);
    }
    
    @Test
    public void TestThatWhenICheckTransactionHistroyIGetDepositedAmountAndBalance(){
        TransactionLogApp account = new TransactionLogApp();
        
        //When
        String actualHistory = account.getDepositTransactionHistory();
        
        String expectedHistory = "Deposited: #0.0 | New Balance: #0.0";
        
        //Check
        assertEquals(expectedHistory, actualHistory);
    }
    
    @Test
    public void TestThatWhenIDepositItAddsToNewBalance(){
        //Given
        double amount = 1000;
        double newAmount = 5000;
        
        //When 
        TransactionLogApp account = new TransactionLogApp();
        
        account.deposit(amount);
        account.deposit(newAmount);
        
        double actualUpdatedBalance = account.getBalance();
        
        double expectedUpdatedBalance = 6000;
        
        //Check
        assertEquals(actualUpdatedBalance, expectedUpdatedBalance);
    }
    
    @Test
    public void TestThatWhenIWithdrawFromBalanceAfterIDepositBalanceReduces(){
        //Given
        double depositAmount = 5000;
        double withdrawalAmount = 2000;
        
        //When
        TransactionLogApp account = new TransactionLogApp();
        
        account.deposit(depositAmount);
        account.withdraw(withdrawalAmount);
        
        double actualUpdatedBalance = account.getBalance();
        
        double expectedUpdatedBalance = 3000;
        
        //Check
        assertEquals(actualUpdatedBalance, expectedUpdatedBalance);
    }
}












import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//import TransactionLogApp.*;

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
    
//    @Test
//    public void TestThatWhenIDepositItReturnsTransactionHistory(){
//        //Given
//        double amount = 1000;
//        
//        double balance = TransactionLogApp.getAccountBalance();
//        
//        //When
//        String actualHistory = TransactionLogApp.getTransactionHistory(amount, balance);
//        
//        String expectedHistory = "Deposited: #1000.0 | New Balance: #1000.0";
//        
//        //Check
//        assertEquals(expectedHistory, actualHistory);
//    }
//    
//    @Test
//    public void TestThatWhenIDepositItAddsToNewBalance(){
//        //Given
//        double amount = 5000;
//        
//        //When
//        double actualUpdatedBalance = TransactionLogApp.newDeposit(amount);
//        
//        double expectedUpdatedBalance = 6000;
//        
//        //Check
//        assertEquals(actualUpdatedBalance, expectedUpdatedBalance);
//    }
}












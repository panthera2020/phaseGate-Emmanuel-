import java.util.ArrayList;

public class TransactionLogApp {
    private double balance;
    private double depositAmount;
    private double withdrawalAmount;
    
    public TransactionLogApp(){
        double balance = 0.0;
        double depositAmount = 0.0;
        double withdrawalAmount = 0.0;
        this.balance = balance;
        this.depositAmount = depositAmount;
        this.withdrawalAmount = withdrawalAmount;
    }
    
    public void setBalance(double amount){
        double balance = amount;
        this.balance = balance;
    }
    
    public void setDepositAmount(double amount){
        double depositAmount = amount;
        this.depositAmount = depositAmount;
    }
    
    public void setWithdrawalAmount(double amount){
        double withdrawalAmount = amount;
        this.withdrawalAmount = withdrawalAmount;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getDepositAmount(){
        return depositAmount;
    }
    
    public double getWithdrawalAmount(){
        return withdrawalAmount;
    }
    
    public void deposit(double amount){
        double newBalance = amount + balance;
        setDepositAmount(amount);
        setBalance(newBalance);
    }
    
    public String getDepositTransactionHistory(){
        String format = "Deposited: #" + depositAmount + " | New Balance: #" + balance;
        
        return format;
    }
    
    public void withdraw(double amount){
        double newBalance = balance - amount;
        setWithdrawalAmount(amount);
        setBalance(newBalance);
    }
    
    public String getWithdrawalTransactionHistory(){
        String format = "Withdrew: #" + withdrawalAmount + " | New Balance: #" + balance;
        
        return format;
    }
    
    public String [] getAllTransactionHistory(){
        ArrayList <String> transactionHistory = new ArrayList<String>();
        
        transactionHistory.add(getDepositTransactionHistory());
        transactionHistory.add(getWithdrawalTransactionHistory());
        
        String [] arrayOfTransactions = new String[transactionHistory.size()];
        
        for(int count = 0; count < arrayOfTransactions.length; count++){
            arrayOfTransactions[count] = transactionHistory.get(count);
        }
        
        return arrayOfTransactions;
    }

}







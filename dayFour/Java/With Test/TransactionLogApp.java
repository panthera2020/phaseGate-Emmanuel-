public class TransactionLogApp {
    private double balance;
    private double depositAmount;
    
    public TransactionLogApp(){
        double balance = 0.0;
        double depositAmount = 0.0;
        this.balance = balance;
        this.depositAmount = depositAmount;
    }
    
    public void setBalance(double amount){
        double balance = amount;
        this.balance = balance;
    }
    
    public void setDepositAmount(double amount){
        double depositAmount = amount;
        this.depositAmount = depositAmount;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getDepositAmount(){
        return depositAmount;
    }
    
    public void deposit(double amount){
        double newBalance = amount + balance;
        setDepositAmount(amount);
        setBalance(newBalance);
    }
    
    public String getTransactionHistory(){
        String format = "Deposited: #" + depositAmount + " | New Balance: #" + balance;
        
        return format;
    }
    

}

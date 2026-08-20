public class TransactionLogApp {
    public double balance;
    
    public TransactionLogApp(){
        double balance = 0.0;
        this.balance = balance;
    }
    
    public void setBalance(double amount){
        double balance = amount;
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        double newBalance = amount + balance;
        
        setBalance(newBalance);
    }
    
    public static String getTransactionHistory(double amount, double balance){
        String format = "Deposited: #" + amount + " | New Balance: #" + deposit(amount,balance);
        
        return format;
    }
    

}

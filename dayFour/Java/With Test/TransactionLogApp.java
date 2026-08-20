public class TransactionLogApp {

    public static double getAccountBalance(){
        double accountBalance = 0;
        
        return accountBalance;
    }
    
    public static double deposit(double amount, double balance){
        
        double newBalance = amount + balance;
        
        return newBalance;
    }
    
    public static String getTransactionHistory(double amount, double balance){
        String format = "Deposited: #" + amount + " | New Balance: #" + deposit(amount,balance);
        
        return format;
    }
}

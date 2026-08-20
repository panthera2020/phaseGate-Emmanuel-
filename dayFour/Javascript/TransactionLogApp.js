const scanner = require("prompt-sync")();

account_balance = 0
amount = 0
transaction = "no transaction yet"

account = [amount, account_balance, transaction];
updated = account;
transactionHistory = [];


let getBalance=()=>{
    return updated[1];
    }


let deposit=(newAmount)=>{
    if(newAmount > 0){
        updated[0] = newAmount;
        updated[1] = newAmount + updated[1];
        updated[2] = "Deposited: " + newAmount + " | New Balance " + updated[1];
        transactionHistory.push(updated[2]);
        }
    }

let getDepositReply=()=>{
    return updated[2];
    }



let withdraw=(newAmount)=>{
    if(updated[1] >= newAmount){
        updated[0] = newAmount;
        updated[1] = updated[1] - newAmount;
        updated[2] = "Withdrew: " + newAmount + " | New Balance " + updated[1];
        transactionHistory.push(updated[2]);
        }
    }

let getWithdrawalReply=()=>{
    return updated[2];
    }
    
userInput = 0;

console.log("Welcome to Transaction Log App");

while (userInput != 4){
    
    let welcome = `

1. Deposit
2. Withdraw
3. Show Transactions
4. Exit
    
    `
    console.log(welcome);
    
    let userInput = Number(scanner("Enter your choice: "));
    
    switch(userInput){
        case 1 :{ 
            let userDeposit = Number(scanner("Enter deposit amount: "));
            deposit(userDeposit);
            console.log(getDepositReply());
            console.log();
            }
        case 2: 
            let userWithdrawal = Number(scanner("Enter Withdrawal amount: "));
            withdraw(userWithdrawal);
            console.log(getWithdrawalReply());
            console.log();
        case 3:
            for(let index = 0; index < transactionHistory.length; index++){
                console.log(transactionHistory[index]);
                }
            console.log();
        case 4:
            console.log("Final Balance: " + getBalance());
            console.log("Thank you for using Transaction Log App!");
            break;
        default:
            console.log("Invalid Input");
        }
            
    }

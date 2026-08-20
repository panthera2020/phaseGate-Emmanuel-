const scanner = require("prompt-sync")();

let balance = 0;
let amount = 0;

let getBalance=()=>{
    return balance;
}

//console.log(getBalance());

let deposit=(newAmount)=>{
    amount = newAmount;
    newBalance = amount + balance;
    balance = newBalance;
}

let transactionHistory=()=>{
    let reply = "Deposited: #" + amount + " | New Balance: #" + balance;
    return reply;
}

//amount = 1000;
//
//deposit(amount);
//
//console.log();
//console.log(getBalance());
//console.log(transactionHistory());

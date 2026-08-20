
account_balance = 0
amount = 0
transaction = "no transaction yet"

account = [amount, account_balance, transaction]
updated = account
transactionHistory = []


def getBalance():
    return updated[1];


def deposit(newAmount):
    if(newAmount > 0):
        updated[0] = newAmount
        updated[1] = newAmount + updated[1]
        updated[2] = "Deposited: " + str(newAmount) + " | New Balance " + str(updated[1])
        transactionHistory.append(updated[2])

def getDepositReply():
    return updated[2]



def withdraw(newAmount):
    if(updated[1] >= newAmount):
        updated[0] = newAmount;
        updated[1] = updated[1] - newAmount
        updated[2] = "Withdrew: " + str(newAmount) + " | New Balance " + str(updated[1])
        transactionHistory.append(updated[2])

def getWithdrawalReply():
    return updated[2]
    
userInput = 0

print("Welcome to Transaction Log App")

while (userInput != 4):
    
    welcome = """

1. Deposit
2. Withdraw
3. Show Transactions
4. Exit
    
    """
    print(welcome)
    
    userInput = int(input("Enter your choice: "))
    
    match(userInput):
        case 1: 
            userDeposit = int(input("Enter deposit amount: "))
            deposit(userDeposit)
            print(getDepositReply())
            print()
        case 2: 
            userWithdrawal = int(input("Enter Withdrawal amount: "))
            withdraw(userWithdrawal)
            print(getWithdrawalReply())
            print()
        case 3:
            for index in range(len(transactionHistory)):
                print(transactionHistory[index])
            print()
        case 4:
            print("Final Balance: ", getBalance());
            print("Thank you for using Transaction Log App!")
            break
        case _:
            print("Invalid Input")
            

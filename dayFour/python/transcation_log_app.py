
account_balance = 0
amount = 0
transaction = "no transaction yet"

account = [amount, account_balance, transaction]
updated = account
transactionHistory = []


def getBalance():
    return updated[2];
    



def deposit(newAmount):
    updated[0] = newAmount
    updated[1] = newAmount + account_balance
    updated[2] = "Deposited: " + str(newAmount) + " | New Balance " + str(updated[1])
    transactionHistory.append(updated[2])
    
amount = 5000

deposit(amount);

print(updated)

def withdraw(newAmount):
    updated[0] = newAmount;
    updated[1] = updated[1] - newAmount
    updated[2] = "Withdrew: " + str(newAmount) + " | New Balance " + str(updated[1])
    transactionHistory.append(updated[2])
    
withdrawalAmount = 2000

withdraw(withdrawalAmount)
    
print(updated)
print(transactionHistory)

#def transactionHistory():
#    reply = "Deposited: #" + amount + " | New Balance: #" + balance
#    return reply
#

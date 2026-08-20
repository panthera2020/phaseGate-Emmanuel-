
account_balance = 0
amount = 0
transaction = "no transaction yet"

account = [amount, account_balance, transaction]
updated = account


def getBalance():
    return updated[1];
    



def deposit(newAmount):
    updated[0] = newAmount
    updated[1] = newAmount + account_balance
    updated[2] = "Deposited: " + str(newAmount) + " | New Balance " + str(updated[1])
    
amount = 1000

deposit(amount);

print(updated)


#def transactionHistory():
#    reply = "Deposited: #" + amount + " | New Balance: #" + balance
#    return reply
#

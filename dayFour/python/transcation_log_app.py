
balance = 0
amount = 0

def getBalance():
    return balance


def deposit(newAmount):
    amount = newAmount
    newBalance = newAmount + getBalance()
    balance = newBalance

#def transactionHistory():
#    reply = "Deposited: #" + amount + " | New Balance: #" + balance
#    return reply
#

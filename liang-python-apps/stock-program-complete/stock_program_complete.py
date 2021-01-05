#Declare constants for the program
COMMISSIONCHARGEBOUGHTSOLD = 0.03
AMOUNTJOEPAIDFORSTOCK = 40
AMOUNTJOESOLDSTOCKFOR = 42.75
AMOUNTOFSTOCKJOEBOUGHTSOLD = 2000
#Declare Strings 
joeMadeMoney = "Joe made money!"
joeLostMoney = "Joe lost money!"

totalAmountJoePaidForStockWithBrokerString = "Total amount Joe paid for stock including 3% broker commission: "

amountJoePaidBrokerForStockString = "3% Amount Joe paid his broker: "

amountOfMoneyJoeSpentOnStock = AMOUNTJOEPAIDFORSTOCK * AMOUNTOFSTOCKJOEBOUGHTSOLD

amountOfMoneyJoeSpentOnStockString = "Amount Joe paid for stock: "

print(amountOfMoneyJoeSpentOnStockString)
print(amountOfMoneyJoeSpentOnStock)

amountJoePaidBrokerForStock = amountOfMoneyJoeSpentOnStock * COMMISSIONCHARGEBOUGHTSOLD

print(amountJoePaidBrokerForStockString)

print(amountJoePaidBrokerForStock)

totalAmountJoePaidForStockWithBroker = amountOfMoneyJoeSpentOnStock + amountJoePaidBrokerForStock

print(totalAmountJoePaidForStockWithBrokerString)
print(totalAmountJoePaidForStockWithBroker)

totalAmountJoeSoldStockForString = "Amount Joe sold stock for: "
totalAmountJoeSoldStockFor = AMOUNTJOESOLDSTOCKFOR * AMOUNTOFSTOCKJOEBOUGHTSOLD

print(totalAmountJoeSoldStockForString)
print(totalAmountJoeSoldStockFor)

amountJoePaidBrokerWhenSoldStockString = "Amount of 3% commission Joe paid broker when stock sold: "
amountJoePaidBrokerWhenSoldStock = totalAmountJoeSoldStockFor * COMMISSIONCHARGEBOUGHTSOLD

print(amountJoePaidBrokerWhenSoldStockString)
print(amountJoePaidBrokerWhenSoldStock)

totalAmountJoeReceivedFromSellingString = "Total amount Joe received from transaction: "
totalAmountJoeReceivedFromSelling = totalAmountJoeSoldStockFor + COMMISSIONCHARGEBOUGHTSOLD

print(totalAmountJoeReceivedFromSellingString)
print(totalAmountJoeReceivedFromSelling)

totalActualProfitJoeReceivesFromTransactionString = "Total actual profit received from transaction: "
totalActualProfitJoeReceivesFromTransaction = totalAmountJoeReceivedFromSelling - amountJoePaidBrokerWhenSoldStock

print(totalActualProfitJoeReceivesFromTransactionString)
print(totalActualProfitJoeReceivesFromTransaction)

#Decision structure if-else condition
if totalActualProfitJoeReceivesFromTransaction > totalAmountJoePaidForStockWithBroker:
    print(joeMadeMoney)
else:
    print(joeLostMoney)

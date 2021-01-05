# Write a program that asks the user to enter the number of packages purchased. 
# The program should then display the amount of the discount (if any) 
# and the total amount of the purchase after the discount.
# Programming Exercise 12, chapter 3, p. 118

# Declare constants to represent static values
PACKAGE_PRICE = 99.0 # constants for package price
TEN_PERCENT = 0.10 # constants for 10% discount
TWENTY_PERCENT = 0.20 # constant for 20% discount
THIRTY_PERCENT = 0.30 # constant for 30% discount
FORTY_PERCENT = 0.40 # constant for 40% discount

# Declare Strings to output the discount applied

total_amount_after_discount = "Total amount of the purchase after the discount:" # total amount after discount
amount_purchased_packages = "Amount of purchased packages." # amount of purchased packages tring
less_than_or_equal_to_zero = "Invalid! Amount entered less than or equal to zero." #less than 0 string
less_than_ten = "Purchase amount less than 10. No discount." # no discount string
ten_percent = "10% discount applied." # 10 % discount string
twenty_percent = "20% discount applied." # 20% discount string
thirty_percent = "30% discount applied." # 30% discount string
forty_percent = "40% discount applied." # 40% discount string

# Declare user input String
you_entered_string = "You entered the following: "
input_string = "Enter the number of packages purchased: " # string for user to know what to enter
print(input_string) # print the string to inform user
user_input = int(input('Enter numerical amount only: ')) # obtain user input store as int in user_input variable
total_amount_price_string = "The total regular price is: "
total_amount_of_price = user_input * PACKAGE_PRICE
price_per_package = "The price per package is: "


# Use conditionals, control structures, and boolean logic to determine the correct discount to apply
if user_input >= 100: # if-condition for purchases over 100
  print(price_per_package)
  print(PACKAGE_PRICE)
  print(you_entered_string) # All print statements print data to the console
  print((amount_purchased_packages))
  print((user_input))
  print(total_amount_price_string)
  print(total_amount_of_price)
  print(forty_percent)
  print((total_amount_of_price * FORTY_PERCENT))
  print(total_amount_after_discount)
  print(total_amount_of_price - (total_amount_of_price * FORTY_PERCENT))
elif user_input >= 50:
  print(price_per_package)
  print(PACKAGE_PRICE)
  print(you_entered_string) # All print statements print data to the console
  print((amount_purchased_packages))
  print((user_input))
  print(total_amount_price_string)
  print(total_amount_of_price)
  print(thirty_percent)
  print((total_amount_of_price * THIRTY_PERCENT))
  print(total_amount_after_discount)
  print(total_amount_of_price - (total_amount_of_price * THIRTY_PERCENT))
elif user_input >= 20:
  print(price_per_package)
  print(PACKAGE_PRICE)
  print(you_entered_string) # All print statements print data to the console
  print((amount_purchased_packages))
  print((user_input))
  print(total_amount_price_string)
  print(total_amount_of_price)
  print(twenty_percent)
  print((total_amount_of_price * TWENTY_PERCENT))
  print(total_amount_after_discount)
  print(total_amount_of_price - (total_amount_of_price * TWENTY_PERCENT))
elif user_input >= 10:
  print(price_per_package)
  print(PACKAGE_PRICE)
  print(you_entered_string) # All print statements print data to the console
  print((amount_purchased_packages))
  print((user_input))
  print(total_amount_price_string)
  print(total_amount_of_price)
  print(ten_percent)
  print((total_amount_of_price * TEN_PERCENT))
  print(total_amount_after_discount)
  print(total_amount_of_price - (total_amount_of_price * TEN_PERCENT))
elif user_input >=1 :
  print(price_per_package)
  print(PACKAGE_PRICE)
  print(you_entered_string) # All print statements print data to the console
  print((amount_purchased_packages))
  print((user_input))
  print(total_amount_price_string)
  print(total_amount_of_price)
  print(less_than_ten)
else:
  print(less_than_or_equal_to_zero)
  
  

# SAMPLE OUTPUT BELOW #################
#######################################
#######################################
  
#Enter the number of packages purchased:
#Enter numerical amount only: 100
#The price per package is:
#99.0
#You entered the following:
#Amount of purchased packages.
#100
#The total regular price is:
#9900.0
#40% discount applied.
#Total amount of the purhcase after the discount:
#9860.4


#Enter the number of packages purchased:
#Enter numerical amount only: 50
#The price per package is:
#99.0
#You entered the following:
#Amount of purchased packages.
#50
#The total regular price is:
#4950.0
#30% discount applied.
#1485.0
#Total amount of the purhcase after the discount:
#3465.0


# Enter the number of packages purchased:
# Enter numerical amount only: 20
# The price per package is:
# 99.0
# You entered the following:
# Amount of purchased packages.
# 20
# The total regular price is:
# 1980.0
# 20% discount applied.
# 396.0
# Total amount of the purhcase after the discount:
# 1584.0


# Enter the number of packages purchased:
# Enter numerical amount only: 10
# The price per package is:
# 99.0
# You entered the following:
# Amount of purchased packages.
# 10
# The total regular price is:
# 990.0
# 10% discount applied.
# 99.0
# Total amount of the purhcase after the discount:
# 891.0

# Enter the number of packages purchased:
# Enter numerical amount only: 9
# The price per package is:
# 99.0
# You entered the following:
# Amount of purchased packages.
# 9
# The total regular price is:
# 891.0
# Purchase amount less than 10. No discount.

# Enter the number of packages purchased:
# Enter numerical amount only: 0
# Invalid! Amount entered less than zero.
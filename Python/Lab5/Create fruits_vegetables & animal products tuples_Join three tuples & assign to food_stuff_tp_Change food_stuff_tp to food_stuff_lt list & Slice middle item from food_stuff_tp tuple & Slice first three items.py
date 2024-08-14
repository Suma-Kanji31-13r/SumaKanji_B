# User input for tuples
fruits = tuple(input("Enter fruits separated by spaces: ").split())
vegetables = tuple(input("Enter vegetables separated by spaces: ").split())
animal_products = tuple(input("Enter animal products separated by spaces: ").split())

# Joining the tuples
food_stuff_tp = fruits + vegetables + animal_products
print("Food stuff (tuple):", food_stuff_tp)

# Converting tuple to list
food_stuff_lt = list(food_stuff_tp)
print("Food stuff (list):", food_stuff_lt)

# Slicing out the middle item(s)
n = len(food_stuff_lt)
middle_items = food_stuff_lt[n//2-1:n//2+1] if n % 2 == 0 else [food_stuff_lt[n//2]]
print("Middle item(s):", middle_items)

# Slicing out the first three and last three items
first_three = food_stuff_lt[:3]
last_three = food_stuff_lt[-3:]
print("First three items:", first_three)
print("Last three items:", last_three)

# Deleting the tuple
del food_stuff_tp

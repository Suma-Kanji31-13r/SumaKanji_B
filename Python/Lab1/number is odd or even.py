def is_even(number):
    return number % 2 == 0

# User input
number = int(input("Enter a number: "))
if is_even(number):
    print(f"{number} is even.")
else:
    print(f"{number} is odd.")

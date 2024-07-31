def swap_numbers(a, b):
    a, b = b, a
    return a, b

# User input
a = float(input("Enter the first number: "))
b = float(input("Enter the second number: "))
a, b = swap_numbers(a, b)
print(f"After swapping: a = {a}, b = {b}")

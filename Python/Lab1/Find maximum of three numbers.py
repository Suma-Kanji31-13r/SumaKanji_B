def find_maximum(a, b, c):
    return max(a, b, c)

# User input
a = float(input("Enter the first number: "))
b = float(input("Enter the second number: "))
c = float(input("Enter the third number: "))
maximum = find_maximum(a, b, c)
print(f"The maximum of {a}, {b}, and {c} is {maximum}.")

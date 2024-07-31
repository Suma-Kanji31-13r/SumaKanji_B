x = int(input("Enter first number: "))
y = int(input("Enter second number: "))

while y:
    x, y = y, x % y
print("GCD of the two numbers:", x)

x = int(input("Enter first number: "))
y = int(input("Enter second number: "))

while y:
    x, y = y, x % y
print("HCF of the two numbers:", x)

import math

# Prompt user for coefficients
a = float(input("Enter the coefficient a: "))
b = float(input("Enter the coefficient b: "))
c = float(input("Enter the coefficient c: "))

# Calculate the discriminant
discriminant = b**2 - 4*a*c

# Calculate and display the solutions
if discriminant > 0:
    root1 = (-b + math.sqrt(discriminant)) / (2*a)
    root2 = (-b - math.sqrt(discriminant)) / (2*a)
    print(f"The equation has two real roots: {root1} and {root2}")
elif discriminant == 0:
    root = -b / (2*a)
    print(f"The equation has one real root: {root}")
else:
    realPart = -b / (2*a)
    imaginaryPart = math.sqrt(-discriminant) / (2*a)
    print(f"The equation has two complex roots: {realPart} + {imaginaryPart}i and {realPart} - {imaginaryPart}i")

import math

a = float(input("Enter coefficient a: "))
b = float(input("Enter coefficient b: "))
c = float(input("Enter coefficient c: "))

discriminant = b**2 - 4*a*c
if discriminant < 0:
    print("No real roots")
elif discriminant == 0:
    root = -b / (2*a)
    print("Root of the quadratic equation:", root)
else:
    root1 = (-b + math.sqrt(discriminant)) / (2*a)
    root2 = (-b - math.sqrt(discriminant)) / (2*a)
    print("Roots of the quadratic equation:", root1, root2)

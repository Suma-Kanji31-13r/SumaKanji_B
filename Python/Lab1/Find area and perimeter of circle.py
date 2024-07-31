import math

def area_of_circle(radius):
    return math.pi * radius**2

def perimeter_of_circle(radius):
    return 2 * math.pi * radius

# User input
radius = float(input("Enter the radius of the circle: "))
area = area_of_circle(radius)
perimeter = perimeter_of_circle(radius)
print(f"Area of the circle is {area}.")
print(f"Perimeter (circumference) of the circle is {perimeter}.")

def area_of_rectangle(length, width):
    return length * width

def perimeter_of_rectangle(length, width):
    return 2 * (length + width)

# User input
length = float(input("Enter the length of the rectangle: "))
width = float(input("Enter the width of the rectangle: "))
area = area_of_rectangle(length, width)
perimeter = perimeter_of_rectangle(length, width)
print(f"Area of the rectangle is {area}.")
print(f"Perimeter of the rectangle is {perimeter}.")

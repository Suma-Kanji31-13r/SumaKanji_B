def calculate_slope():
    try:
        x1 = float(input("Enter x1: "))
        y1 = float(input("Enter y1: "))
        x2 = float(input("Enter x2: "))
        y2 = float(input("Enter y2: "))
        if x2 == x1:
            return 'Slope is undefined (vertical line)'
        else:
            slope = (y2 - y1) / (x2 - x1)
            return slope
    except ValueError:
        return 'Invalid input. Please enter numerical values.'

# Example usage:
print(calculate_slope())

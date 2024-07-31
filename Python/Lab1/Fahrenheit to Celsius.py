def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

# User input
fahrenheit = float(input("Enter temperature in Fahrenheit: "))
celsius = fahrenheit_to_celsius(fahrenheit)
print(f"{fahrenheit}°F is equal to {celsius}°C")

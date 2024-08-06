import math

x = float(input("Enter x: "))
n = int(input("Enter the number of terms: "))
sine_x = 0
for i in range(n):
    term = ((-1)**i) * (x**(2*i+1)) / math.factorial(2*i+1)
    sine_x += term
print("sin(", x, ") =", sine_x)

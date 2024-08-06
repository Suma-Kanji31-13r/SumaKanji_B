import math

x = float(input("Enter x: "))
n = int(input("Enter the number of terms: "))
cosine_x = 0
for i in range(n):
    term = ((-1)**i) * (x**(2*i)) / math.factorial(2*i)
    cosine_x += term
print("cos(", x, ") =", cosine_x)

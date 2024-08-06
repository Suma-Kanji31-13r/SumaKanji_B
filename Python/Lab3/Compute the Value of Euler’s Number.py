import math

n = int(input("Enter the number of terms: "))
euler_number = 1.0

for i in range(1, n + 1):
    euler_number += 1 / math.factorial(i)

print("Approximate value of Euler's number e:", euler_number)

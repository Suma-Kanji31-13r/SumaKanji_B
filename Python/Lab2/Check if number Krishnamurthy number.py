import math

n = int(input("Enter a number: "))

sum_of_factorials = sum(math.factorial(int(digit)) for digit in str(n))
if sum_of_factorials == n:
    print(f"{n} is a Krishnamurthy number")
else:
    print(f"{n} is not a Krishnamurthy number")

m = int(input("Enter the first number (m): "))
n = int(input("Enter the second number (n): "))

if m % n == 0:
    print(m, "is a multiple of", n)
else:
    print(m, "is not a multiple of", n)

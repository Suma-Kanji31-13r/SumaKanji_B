n = int(input("Enter a number: "))

total = sum(int(digit) for digit in str(n))
print("Sum of digits:", total)

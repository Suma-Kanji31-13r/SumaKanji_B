base = int(input("Enter base number: "))
exp = int(input("Enter exponent: "))

result = 1
for _ in range(exp):
    result *= base
print(f"{base} to the power of {exp} is:", result)

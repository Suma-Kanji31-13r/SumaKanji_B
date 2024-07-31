base = int(input("Enter base number: "))
exp = int(input("Enter exponent: "))

def power(base, exp):
    if exp == 0:
        return 1
    else:
        return base * power(base, exp - 1)

result = power(base, exp)
print(f"{base} to the power of {exp} is:", result)

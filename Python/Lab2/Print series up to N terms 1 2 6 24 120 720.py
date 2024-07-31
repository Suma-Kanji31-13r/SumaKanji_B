N = int(input("Enter the number of terms: "))

factorial = 1
print("Series up to", N, "terms:")
for i in range(1, N + 1):
    factorial *= i
    print(factorial)

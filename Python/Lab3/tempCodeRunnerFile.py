N = int(input("Enter N: "))

for i in range(1, N + 1):
    for j in range(1, N + 1):
        if j == 2:
            print(1, end=" ")
        else:
            print(i ** (j - 1), end=" ")
    print()

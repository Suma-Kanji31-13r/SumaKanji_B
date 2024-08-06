N = int(input("Enter the number of lines: "))
for i in range(1, N+1):
    print(" "*(N-i) + "/" + " "*(2*(i-1)) + "\\")
    if i == N:
        print("/" + "_"*(2*N-2) + "\\")

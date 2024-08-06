N = int(input("Enter N: "))

matrix = [[0] * N for _ in range(N)]
num = 1

# Fill the outermost layer
for layer in range((N + 1) // 2):
    # Top row
    for i in range(layer, N - layer):
        matrix[layer][i] = num
        num += 1
    # Right column
    for i in range(layer + 1, N - layer):
        matrix[i][N - layer - 1] = num
        num += 1
    # Bottom row
    for i in range(N - layer - 2, layer - 1, -1):
        matrix[N - layer - 1][i] = num
        num += 1
    # Left column
    for i in range(N - layer - 2, layer, -1):
        matrix[i][layer] = num
        num += 1

for row in matrix:
    print(" ".join(map(str, row)))

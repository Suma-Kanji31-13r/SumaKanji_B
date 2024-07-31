def generate_fibonacci_series(n):
    fibonacci_series = [0, 1]
    while len(fibonacci_series) < n:
        fibonacci_series.append(fibonacci_series[-1] + fibonacci_series[-2])
    return fibonacci_series[:n]

# User input
n = int(input("Enter the number of terms for Fibonacci series: "))
fibonacci_series = generate_fibonacci_series(n)
print(f"Fibonacci series up to {n} terms: {fibonacci_series}")

n = int(input("Enter the number of terms in the Fibonacci series: "))
fib_series = [0, 1]
while len(fib_series) < n:
    fib_series.append(fib_series[-1] + fib_series[-2])
print("Fibonacci series:", fib_series[:n])

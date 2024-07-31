def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def generate_prime_series(n):
    primes = []
    for i in range(2, n + 1):
        if is_prime(i):
            primes.append(i)
    return primes

# User input
n = int(input("Enter the value of n: "))
prime_series = generate_prime_series(n)
print(f"Prime numbers up to {n} are: {prime_series}")

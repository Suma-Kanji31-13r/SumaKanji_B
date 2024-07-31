number = int(input("Enter a number to check if it is a perfect number: "))
sum_of_divisors = sum(i for i in range(1, number) if number % i == 0)
if sum_of_divisors == number:
    print(f"{number} is a perfect number.")
else:
    print(f"{number} is not a perfect number.")

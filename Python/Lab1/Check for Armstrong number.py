def is_armstrong_number(number):
    num_str = str(number)
    num_len = len(num_str)
    sum_of_powers = sum(int(digit)**num_len for digit in num_str)
    return sum_of_powers == number

# User input
number = int(input("Enter a number to check if it is an Armstrong number: "))
if is_armstrong_number(number):
    print(f"{number} is an Armstrong number.")
else:
    print(f"{number} is not an Armstrong number.")

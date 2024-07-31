number = int(input("Enter a number to check if it is an Armstrong number: "))
num_str = str(number)
num_len = len(num_str)
sum_of_powers = sum(int(digit)**num_len for digit in num_str)
if sum_of_powers == number:
    print(f"{number} is an Armstrong number.")
else:
    print(f"{number} is not an Armstrong number.")

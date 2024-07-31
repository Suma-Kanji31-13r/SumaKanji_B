def reverse_number(number):
    return int(str(number)[::-1])

# User input
number = int(input("Enter a number: "))
reversed_number = reverse_number(number)
print(f"The reverse of {number} is {reversed_number}.")

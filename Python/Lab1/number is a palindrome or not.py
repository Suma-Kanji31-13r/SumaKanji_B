def is_palindrome(number):
    return str(number) == str(number)[::-1]

# User input
number = int(input("Enter a number: "))
if is_palindrome(number):
    print(f"{number} is a palindrome.")
else:
    print(f"{number} is not a palindrome.")

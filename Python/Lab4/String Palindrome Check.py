string = input("Enter a string to check if it's a palindrome: ")
reversed_string = string[::-1]
if string == reversed_string:
    print(f"'{string}' is a palindrome.")
else:
    print(f"'{string}' is not a palindrome.")

number = int(input("Enter a number: "))
if str(number) == str(number)[::-1]:
    print(f"{number} is a palindrome.")
else:
    print(f"{number} is not a palindrome.")

num = int(input("Enter a number: "))
original_num = num
reversed_num = 0

while num != 0:
    digit = num % 10
    reversed_num = reversed_num * 10 + digit
    num //= 10

if original_num == reversed_num:
    print(original_num, "is a palindrome")
else:
    print(original_num, "is not a palindrome")

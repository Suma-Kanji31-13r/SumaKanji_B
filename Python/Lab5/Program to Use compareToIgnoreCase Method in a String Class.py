str1 = input("Enter the first string: ")
str2 = input("Enter the second string: ")

if str1.lower() == str2.lower():
    print("The strings are equal ignoring case.")
elif str1.lower() > str2.lower():
    print(f'"{str1}" is greater than "{str2}" ignoring case.')
else:
    print(f'"{str1}" is less than "{str2}" ignoring case.')

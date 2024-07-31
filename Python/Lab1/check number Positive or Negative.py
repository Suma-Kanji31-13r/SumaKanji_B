def check_sign(number):
    if number > 0:
        return "Positive"
    elif number < 0:
        return "Negative"
    else:
        return "Zero"

# User input
number = float(input("Enter a number: "))
sign = check_sign(number)
print(f"{number} is {sign}.")

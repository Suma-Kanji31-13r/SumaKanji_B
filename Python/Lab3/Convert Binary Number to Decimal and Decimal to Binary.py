# Binary to Decimal
binary = input("Enter a binary number: ")
decimal = int(binary, 2)
print("Decimal representation:", decimal)

# Decimal to Binary
decimal = int(input("Enter a decimal number: "))
binary = bin(decimal).replace("0b", "")
print("Binary representation:", binary)

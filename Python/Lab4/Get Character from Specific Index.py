string = input("Enter a string: ")
index = int(input("Enter the index to get the character from: "))
if 0 <= index < len(string):
    print(f"Character at index {index}: {string[index]}")
else:
    print("Index out of range")

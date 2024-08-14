string = input("Enter a string: ")
char_counts = {}
for char in string:
    char_counts[char] = char_counts.get(char, 0) + 1

print("Character counts:")
for char, count in char_counts.items():
    print(f"{char}{count}")

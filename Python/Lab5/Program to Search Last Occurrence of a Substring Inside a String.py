original_string = input("Enter the original string: ")
substring = input("Enter the substring to find: ")

last_occurrence = original_string.rfind(substring)
print("Last occurrence of the substring is at index:", last_occurrence)

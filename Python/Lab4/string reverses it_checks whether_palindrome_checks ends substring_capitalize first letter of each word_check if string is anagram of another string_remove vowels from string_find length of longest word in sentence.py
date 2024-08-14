# Task 9: String Manipulations
string = input("Enter a string: ")

# 1. Reverse the string
reversed_string = string[::-1]
print(f"Reversed string: {reversed_string}")

# 2. Check whether it is a palindrome
is_palindrome = string == reversed_string
print(f"Is palindrome: {is_palindrome}")

# 3. Check whether it ends with a specific substring
substring = input("Enter the substring to check: ")
ends_with = string.endswith(substring)
print(f"Ends with '{substring}': {ends_with}")

# 4. Capitalize the first letter of each word
capitalized_string = string.title()
print(f"Capitalized string: {capitalized_string}")

# 5. Check if the string is an anagram of another string
another_string = input("Enter another string to check for anagram: ")
is_anagram = sorted(string) == sorted(another_string)
print(f"Is anagram of '{another_string}': {is_anagram}")

# 6. Remove vowels from the string
vowels = "aeiouAEIOU"
no_vowels = ''.join([c for c in string if c not in vowels])
print(f"String without vowels: {no_vowels}")

# 7. Find the length of the longest word in the sentence
words = string.split()
longest_word = max(words, key=len)
print(f"Length of the longest word: {len(longest_word)}")

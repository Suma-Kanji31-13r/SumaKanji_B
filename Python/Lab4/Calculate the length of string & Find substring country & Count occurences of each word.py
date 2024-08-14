# Task 1: String Analysis
string = input("Enter a string: ")

# Calculate the length of the string
length = len(string)
print(f"Length of the string: {length}")

# Find the substring 'country'
substring = "country"
occurrences = string.lower().count(substring)
print(f"Occurrences of the word '{substring}': {occurrences}")

# Count the occurrences of each word
word_counts = {}
words = string.split()
for word in words:
    word_counts[word] = word_counts.get(word, 0) + 1
print("Word counts:", word_counts)

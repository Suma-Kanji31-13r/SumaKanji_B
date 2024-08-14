sequence = input("Enter a sequence of whitespace-separated words: ")
words = sequence.split()
unique_words = sorted(set(words))
print("Sorted unique words:", " ".join(unique_words))

sequence = input("Enter a comma-separated sequence of words: ")
words = sequence.split(',')
words.sort()
print("Sorted words:", ",".join(words))

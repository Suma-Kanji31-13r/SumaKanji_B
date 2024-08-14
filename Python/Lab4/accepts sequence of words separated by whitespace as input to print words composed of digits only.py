sequence = input("Enter a sequence of words separated by whitespace: ")
digit_words = [word for word in sequence.split() if word.isdigit()]
print("Words composed of digits only:", digit_words)

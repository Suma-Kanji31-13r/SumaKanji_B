segments = {
    '0': [" _ ",
          "| |",
          "|_|"],
    '1': ["   ",
          "  |",
          "  |"],
    '2': [" _ ",
          " _|",
          "|_ "],
    '3': [" _ ",
          " _|",
          " _|"],
    '4': ["   ",
          "|_|",
          "  |"],
    '5': [" _ ",
          "|_ ",
          " _|"],
    '6': [" _ ",
          "|_ ",
          "|_|"],
    '7': [" _ ",
          "  |",
          "  |"],
    '8': [" _ ",
          "|_|",
          "|_|"],
    '9': [" _ ",
          "|_|",
          " _|"],
}

number = input("Enter a number: ")
n = int(input("Enter N (spacing between digits): "))

for line in range(3):
    for digit in number:
        print(segments[digit][line], end=" " * n)
    print()

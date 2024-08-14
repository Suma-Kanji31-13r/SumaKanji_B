lines = []
while True:
    line = input("Enter a line (or type 'STOP' to end): ")
    if line == "STOP":
        break
    lines.append(line.upper())

print("\nLines in uppercase:")
for line in lines:
    print(line)

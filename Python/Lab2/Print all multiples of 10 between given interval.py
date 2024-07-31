start = int(input("Enter the start of the interval: "))
end = int(input("Enter the end of the interval: "))

multiples = []
for i in range(start, end + 1):
    if i % 10 == 0:
        multiples.append(i)
print("Multiples of 10 between", start, "and", end, "are:", multiples)

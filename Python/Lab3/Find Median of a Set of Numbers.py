numbers = list(map(int, input("Enter a set of numbers separated by space: ").split()))
numbers.sort()
length = len(numbers)

if length % 2 == 0:
    median = (numbers[length // 2 - 1] + numbers[length // 2]) / 2
else:
    median = numbers[length // 2]

print("Median of the set is:", median)

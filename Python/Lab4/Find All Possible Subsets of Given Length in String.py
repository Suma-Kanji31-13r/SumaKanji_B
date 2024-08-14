from itertools import combinations

string = input("Enter a string: ")
subset_length = int(input("Enter the length of subsets: "))
subsets = [''.join(combo) for combo in combinations(string, subset_length)]
print(f"All possible subsets of length {subset_length}: {subsets}")

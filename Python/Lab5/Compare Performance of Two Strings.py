# Compare performance of two strings (length comparison in this context)
import time

string1 = input("Enter the first string: ")
string2 = input("Enter the second string: ")

start_time = time.time()
comparison = string1 == string2
end_time = time.time()

print(f"Comparison result: {comparison}")
print(f"Time taken for comparison: {end_time - start_time} seconds")

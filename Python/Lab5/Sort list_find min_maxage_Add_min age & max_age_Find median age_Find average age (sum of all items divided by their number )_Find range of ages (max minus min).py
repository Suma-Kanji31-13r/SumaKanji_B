# User input for list of ages
ages = list(map(int, input("Enter ages separated by spaces: ").split()))

# Sorting the list
ages.sort()
print("Sorted ages:", ages)

# Finding min and max age
min_age = min(ages)
max_age = max(ages)
print("Min age:", min_age)
print("Max age:", max_age)

# Adding min and max age again to the list
ages.append(min_age)
ages.append(max_age)
print("Ages after adding min and max again:", ages)

# Finding the median age
n = len(ages)
median_age = (ages[n//2] + ages[n//2 - 1])/2 if n % 2 == 0 else ages[n//2]
print("Median age:", median_age)

# Finding the average age
average_age = sum(ages) / n
print("Average age:", average_age)

# Finding the range of the ages
age_range = max_age - min_age
print("Age range:", age_range)

# Comparing min - average and max - average
min_average_diff = abs(min_age - average_age)
max_average_diff = abs(max_age - average_age)
print("Min - average:", min_average_diff)
print("Max - average:", max_average_diff)

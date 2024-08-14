# User input for sets
it_companies = set(input("Enter IT companies separated by spaces: ").split())
A = set(map(int, input("Enter set A numbers separated by spaces: ").split()))
B = set(map(int, input("Enter set B numbers separated by spaces: ").split()))

# Length of the set
print("Length of IT companies set:", len(it_companies))

# Adding 'Twitter' to the set
it_companies.add('Twitter')
print("IT companies after adding 'Twitter':", it_companies)

# Inserting multiple IT companies
it_companies.update(['TCS', 'Infosys', 'Wipro'])
print("IT companies after adding multiple companies:", it_companies)

# Removing one of the companies
it_companies.remove('TCS')
print("IT companies after removing 'TCS':", it_companies)

# Difference between remove and discard
# remove() throws an error if the item doesn't exist, discard() does not.

# Set operations on A and B
print("A union B:", A.union(B))
print("A intersection B:", A.intersection(B))
print("Is A subset of B:", A.issubset(B))
print("Are A and B disjoint sets:", A.isdisjoint(B))
print("Symmetric difference between A and B:", A.symmetric_difference(B))

# Deleting sets
del A, B

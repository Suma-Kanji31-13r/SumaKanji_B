# Creating a student dictionary
student = {
    'first_name': input("Enter first name: "),
    'last_name': input("Enter last name: "),
    'gender': input("Enter gender: "),
    'age': int(input("Enter age: ")),
    'marital_status': input("Enter marital status: "),
    'skills': input("Enter skills separated by spaces: ").split(),
    'country': input("Enter country: "),
    'city': input("Enter city: "),
    'address': input("Enter address: ")
}

# Getting length of the dictionary
print("Length of student dictionary:", len(student))

# Getting value of skills and checking the data type
skills = student['skills']
print("Skills:", skills)
print("Type of skills:", type(skills))

# Modifying the skills values
student['skills'].append(input("Add another skill: "))
print("Modified skills:", student['skills'])

# Getting dictionary keys and values as lists
print("Keys:", list(student.keys()))
print("Values:", list(student.values()))

# Changing dictionary to list of tuples
student_items = list(student.items())
print("List of tuples:", student_items)

# Deleting an item from the dictionary
del student['city']
print("Dictionary after deleting city:", student)

# Deleting the dictionary
del student

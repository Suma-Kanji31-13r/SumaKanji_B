# Creating a person dictionary
person = {
    'first_name': 'Asabeneh',
    'last_name': 'Yetayeh',
    'age': 250,
    'country': 'Finland',
    'is_married': True,
    'skills': ['JavaScript', 'React', 'Node', 'MongoDB', 'Python'],
    'address': {
        'street': 'Space street',
        'zipcode': '02210'
    }
}

# Check if 'skills' key exists and print the middle skill
if 'skills' in person:
    skills = person['skills']
    middle_skill = skills[len(skills)//2]
    print("Middle skill:", middle_skill)

# Check if 'Python' skill exists
if 'skills' in person and 'Python' in person['skills']:
    print("Python skill exists:", True)

# Determine developer type based on skills
skills = set(person['skills'])
if skills == {'JavaScript', 'React'}:
    print("He is a front end developer")
elif skills == {'Node', 'Python', 'MongoDB'}:
    print("He is a backend developer")
elif skills == {'React', 'Node', 'MongoDB'}:
    print("He is a fullstack developer")
else:
    print("Unknown title")

# Check if person is married and lives in Finland
if person['is_married'] and person['country'] == 'Finland':
    print(f"{person['first_name']} {person['last_name']} lives in {person['country']}. He is married.")

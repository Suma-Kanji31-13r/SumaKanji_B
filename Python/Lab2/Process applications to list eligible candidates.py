n = int(input("Enter number of students: "))
eligible_students = []
for i in range(n):
    print(f"Enter marks for student {i+1}:")
    maths = int(input("Mathematics: "))
    physics = int(input("Physics: "))
    chemistry = int(input("Chemistry: "))
    total_all = maths + physics + chemistry
    total_mp = maths + physics
    if (maths >= 60 and physics >= 50 and chemistry >= 40 and (total_all >= 200 or total_mp >= 150)):
        eligible_students.append(i + 1)
print("Eligible students:", eligible_students)

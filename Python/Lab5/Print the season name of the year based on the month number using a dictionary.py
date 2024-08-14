# Dictionary for month number to season
seasons = {
    1: 'Winter', 2: 'Winter', 3: 'Spring', 4: 'Spring', 5: 'Spring', 
    6: 'Summer', 7: 'Summer', 8: 'Summer', 9: 'Autumn', 10: 'Autumn', 
    11: 'Autumn', 12: 'Winter'
}

# User input for month number
month_number = int(input("Enter the month number (1-12): "))
season = seasons.get(month_number, "Invalid month number")
print("Season:", season)

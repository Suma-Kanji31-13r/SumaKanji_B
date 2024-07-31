def find_special_numbers():
    result = []
    for i in range(1000, 2001):
        if i % 7 == 0 and i % 5 != 0:
            result.append(i)
    return result

special_numbers = find_special_numbers()
print(f"Numbers divisible by 7 but not multiple of 5 between 1000 and 2000: {special_numbers}")

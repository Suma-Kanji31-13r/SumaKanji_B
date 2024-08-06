def print_list():
    try:
        user_input = input("Enter a list of elements separated by commas: ")
        elements = user_input.split(',')
        for element in elements:
            print(element.strip())
    except Exception as e:
        print(f"An error occurred: {e}")

# Example usage:
print_list()

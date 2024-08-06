def reverse_list():
    try:
        user_input = input("Enter a list of elements separated by commas: ")
        elements = user_input.split(',')
        reversed_elements = []
        for element in elements:
            reversed_elements.insert(0, element.strip())
        return reversed_elements
    except Exception as e:
        print(f"An error occurred: {e}")

# Example usage:
print(reverse_list())

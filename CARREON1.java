
import static java.io.IO.print;

def classify_number(num):

if num > 0:

return f"{num} is a positive number"

elif num < 0:

return f"{num} is a negative number"

else:

return "Inputted number Zero"

# Example usage

if _name_ == "_main_":

# Instance 1

number = 5

print(classify_number(number))

# Instance 2

number = -10

print(classify_number(number))

# Instance 3

number = 0

print(classify_number(number))
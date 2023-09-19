# Solo se realiza conversión de tipos de datos compatibles.

# Implícitas: Lo realiza directamente el interprete de python.

# Explícito:
str(3)              # Convierte datos a string.
int('75')           # Convierte a numeros enteros.
float(20)           # Convertir a numeros flotantes.
bool()              # Convertir a bool.
ord()               #
hex()               #
oct()               #
tuple()             #
set()               #
list()              #
dict()              #

# Modify the line below 
name = input('What is your name? ')
print(f"Type of name variable is: {type(name)}. It should be <class 'str'>")

# Modify the line below
age = int(input('What is your age? '))
print(f"Type of age variable is: {type(age)}. It should be <class 'int'>")

# Modify the line below
height = float(input('What is your height in meters? '))
print(f"Type of height variable is: {type(height)}. It should be <class 'float'>")

# Modify the line below
loyalty = bool(input('Are you part of our loyalty program? '))
print(f"Type of loyalty variable is: {type(loyalty)}. It should be <class 'bool'>")  
a = True
b = False

# Las 2 se cumplen.
if a and b:
    print('true')

# Una se cumple.
if a or b:
    print('true')

# Comprueba lo contrario.
if not(a) and not(b):
    print('true')

if a or not(b):
    print('true')
str = 'Looping'

# Recorrer el string.
for item in str:
    print(item)                             # L o o p i n g

# Recorrer añadiendo un elemento al final.
for item in range(10):
    print('Looping..', item)                # Looping.. 0 Looping.. 1 -> 10

favorite = ['music', 'movies', 'games']

# Recorrer el array.
for item in favorite:
    print('Looping..', item)                # music movies games

# Añadir acceso al indice mediante la función enumerada.
for indice, item in enumerate(favorite):
    print(indice, item)                     # 0 music 1 movies 2 games

# Ejemplo de while loop.
count = 0
while count < len(favorite):
    print('I like', favorite[count])
    count += 1
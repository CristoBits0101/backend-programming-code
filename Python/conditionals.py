# if
name = "John"

# La sangría del print es obligatoria o dará error.
if name == "John":
   print(name)
elif name == "Jane":
   print(name)
else:
   print("Unknown")

# match = switch
match name:
   case 'John': 
      print('Success')
   case 'Jane': 
      print('Success')
   case 'Unknown' | '0' : # | == or
      print('Failure')
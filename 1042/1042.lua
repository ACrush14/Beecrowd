local a, b, c = io.read("*n", "*n", "*n")

local numeros = {a, b, c}

local ordenados = {a, b, c}

table.sort(ordenados)

print(ordenados[1])
print(ordenados[2])
print(ordenados[3])
    
print()

print(numeros[1])
print(numeros[2])
print(numeros[3])

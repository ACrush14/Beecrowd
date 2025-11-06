a, b, c = map(int, input().split(' '))

numeros = [a, b, c]
ordenados = [a, b, c]

ordenados.sort()

print(ordenados[0])
print(ordenados[1])
print(ordenados[2])

print()

print(numeros[0])
print(numeros[1])
print(numeros[2])



# #Primeiro input, o menor
# if a<b and a<c:
#     print(a)
# if b<a and b<c:
#     print(b)
# if c<a and c<b:
#     print(c)
    
# #Segundo input, o do meio
# if a<b and a>c or a>b and a<c:
#     print(a)
# if b>a and b<c or b<a and b>c:
#     print(b)
# if c>a and c<b or c<a and c>b:
#     print(c)

# #Terceiro input, o maior
# if a>b and a>c:
#     print(a)
# if b>a and b>c:
#     print(b)
# if c>a and c>b:
#     print(c)

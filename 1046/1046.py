valores = input().split()
inicio = int(valores[0])
fim = int(valores[1])
total = 0

if inicio == fim:
    total = 24
elif inicio > fim:
    fim = fim + 24
    total = fim - inicio
else:
    total = fim - inicio

print(f"O JOGO DUROU {total} HORA(S)")
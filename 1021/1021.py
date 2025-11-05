num = float(input())

valor = int(round(num * 100))

notas = [10000, 5000, 2000, 1000, 500, 200]

moedas = [100, 50, 25, 10, 5, 1]

print("NOTAS:")
for i in notas:
    qtde, valor = divmod(valor, i)
    print(f"{qtde} nota(s) de R$ {i/100:.2f}")
    
print("MOEDAS:")
for i in moedas:
    qtde, valor = divmod(valor, i)
    print(f"{qtde} moeda(s) de R$ {i/100:.2f}")
linha1 = input().split()
linha2 = input().split()

cod1 = int(linha1[0])
num1 = int(linha1[1])
valor1 = float(linha1[2])
cod2 = int(linha2[0])
num2 = int(linha2[1])
valor2 = float(linha2[2])

total = ((valor1 * num1) + (valor2 * num2))

print(f"VALOR A PAGAR: R$ {total:.2f}")

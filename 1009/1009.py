nome = input()
sal = float(input())
vendas = float(input())

bonus = vendas * 0.15

total = sal + bonus

print(f"TOTAL = R$ {total:.2f}")
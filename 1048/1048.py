sal = float(input())

if sal <= 400:
    bonus = 0.15
elif sal <= 800:
    bonus = 0.12
elif sal <= 1200:
    bonus = 0.10
elif sal <= 2000:
    bonus = 0.07
else:
    bonus = 0.04

reajuste = sal * bonus
novo = sal + reajuste
percent = int(bonus * 100)

print(f"Novo salario: {novo:.2f}")
print(f"Reajuste ganho: {reajuste:.2f}")
print(f"Em percentual: {percent} %")


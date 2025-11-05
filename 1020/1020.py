num = int(input())

ano = 0
mes = 0
dia = 0

while (num >= 365):
    num -= 365
    ano += 1
    
while (num >= 30):
    num -= 30
    mes += 1
    
while (num >= 1):
    num -= 1
    dia += 1
    
print(f"{ano} ano(s)")
print(f"{mes} mes(es)")
print(f"{dia} dia(s)")
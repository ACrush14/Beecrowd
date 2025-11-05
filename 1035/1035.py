#se B > C OK
#se D > A OK
#se C + D > A e B OK
#se C for positivo
#se D for Positivo
#se A for par
#Valores aceitos

A, B, C, D = map(int, input().split())

if ( B > C and D > A and (C+D) > (A+B) and  C > 0 and D > 0 and (A % 2 == 0)):
    print("Valores aceitos")
else:
    print("Valores nao aceitos")
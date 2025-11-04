#Receber os inputs em cada numero
#Fazer o devido peso para cada nota
#Calcular a media
#Fazer um If e ElseIf para cada situação
#Receber outro input

n1, n2, n3, n4, = map(float, input().split())

n1 = n1 *2
n2 = n2 * 3
n3 = n3 * 4

media = (n1 + n2 + n3 + n4) / 10

print(f"Media: {media:.1f}")

if media < 5:
    print("Aluno reprovado.")
elif media >= 7:
    print("Aluno aprovado.")
else:
    print("Aluno em exame.")
    
    n5 = float(input())
    print(f"Nota do exame: {n5:.1f}")
    
    n_media = (media + n5) / 2
    
    if n_media < 5:
        print("Aluno reprovado.")
    else:
        print("Aluno aprovado.")
        
    print(f"Media final: {n_media:.1f}")
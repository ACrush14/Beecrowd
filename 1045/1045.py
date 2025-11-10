valores = list(map(float, input().split()))

valores.sort(reverse=True)

a, b, c = valores

if a >= b + c:
    print("NAO FORMA TRIANGULO")
else:
    if a*a == (b*b) + (c*c):
        print("TRIANGULO RETANGULO")
    elif a*a > (b*b) + (c*c):
        print("TRIANGULO OBTUSANGULO")
    elif a*a < (b*b) + (c*c):
        print("TRIANGULO ACUTANGULO")
    if a == b and a == c and b == c:
        print("TRIANGULO EQUILATERO")
    elif a == b or a == c or b == c:
        print("TRIANGULO ISOSCELES")

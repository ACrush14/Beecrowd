a, b, c = map(float, input().split())

valor = a + b + c
area = ((a+b) * c)/2

if a < b+c and b < a+c and c < a+b:
    print(f"Perimetro = {valor:.1f}")
else:
    print(f"Area = {area:.1f}")
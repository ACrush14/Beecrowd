A, B, C = map(float, input().split())

bas = (B * B) - ( 4 * A * C)

#se bas for negativo, impossivel calcular
#se A !== 0, impossivel calcular
#else, faz o calculo

if (bas < 0 or A == 0):
    print("Impossivel calcular")
else:
    bas = bas ** (0.5)
    R1 = (-B + bas)/(2*A)
    R2 = (-B - bas)/(2*A)
    print(f"R1 = {R1:.5f}")
    print(f"R2 = {R2:.5f}")
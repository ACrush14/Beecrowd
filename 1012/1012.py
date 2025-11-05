A, B, C = map(float, (input().split()))

tri = (A * C)/2
cir = 3.14159 * C * C
tra = ((A + B) / 2) * C
qua = B * B
ret = A * B

print(f'TRIANGULO: {tri:.3f}')
print(f'CIRCULO: {cir:.3f}')
print(f'TRAPEZIO: {tra:.3f}')
print(f'QUADRADO: {qua:.3f}')
print(f'RETANGULO: {ret:.3f}')
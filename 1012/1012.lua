local A, B, C = io.read("*number", "*number", "*number")

local tri = (A * C)/2
local cir = 3.14159 * C * C
local tra = ((A + B) / 2) * C
local qua = B * B
local ret = A * B

print("TRIANGULO: " .. string.format("%.3f", tri))
print("CIRCULO: " .. string.format("%.3f", cir))
print("TRAPEZIO: " .. string.format("%.3f", tra))
print("QUADRADO: " .. string.format("%.3f", qua))
print("RETANGULO: " .. string.format("%.3f", ret))
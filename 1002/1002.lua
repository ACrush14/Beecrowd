local PI = 3.14159

local raio = io.read("*n")

local area = PI * raio * raio

io.write(string.format("A=%.4f\n", area))
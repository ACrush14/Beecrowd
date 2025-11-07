local a, b, c = io.read("*n", "*n", "*n")

local valor = a + b + c
local area = ((a+b) *c)/2

if a < b+c and b < a+c and c < a+b then
    print(string.format("Perimetro = %.1f", valor))
else
    print(string.format("Area = %.1f", area))
end
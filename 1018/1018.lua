local valor = io.read("*number")

print(valor)

local cont100 = 0
local cont50 = 0
local cont20 = 0
local cont10 = 0
local cont5 = 0
local cont2 = 0
local cont1 = 0

while valor >= 100 do
    valor = valor - 100
    cont100 = cont100 + 1
end
    
while valor >= 50 do
    valor = valor - 50
    cont50 = cont50 + 1
end
    
while valor >= 20 do
    valor = valor - 20
    cont20 = cont20 + 1
end

while valor >= 10 do
    valor = valor - 10
    cont10 = cont10 + 1
end

while valor >= 5 do
    valor = valor - 5
    cont5 = cont5 + 1
end

while valor >= 2 do
    valor = valor - 2
    cont2 = cont2 +  1
end

while valor >= 1 do
    valor = valor - 1
    cont1 = cont1 + 1
end    

print(string.format("%d nota(s) de R$ 100,00", cont100))
print(string.format("%d nota(s) de R$ 50,00", cont50))
print(string.format("%d nota(s) de R$ 20,00", cont20))
print(string.format("%d nota(s) de R$ 10,00", cont10))
print(string.format("%d nota(s) de R$ 5,00", cont5))
print(string.format("%d nota(s) de R$ 2,00", cont2))
print(string.format("%d nota(s) de R$ 1,00", cont1))


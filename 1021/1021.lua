local num = io.read("*number")

local valor = math.floor((num * 100) + 0.5)

local notas = {10000, 5000, 2000, 1000, 500, 200}
local moedas = {100, 50, 25, 10, 5, 1}

print("NOTAS:")
for _, i in ipairs(notas) do
    local qtde = math.floor(valor / i)
    
    valor = valor % i
    
    print(string.format("%d nota(s) de R$ %.2f", qtde, i / 100))
end

print("MOEDAS:")
for _, i in ipairs(moedas) do
    local qtde = math.floor(valor / i)
    valor = valor % i
    
    print(string.format("%d moeda(s) de R$ %.2f", qtde, i / 100))
end
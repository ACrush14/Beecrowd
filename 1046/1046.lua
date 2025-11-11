local valores = {}

for numero in string.gmatch(io.read(), "[^%s]+") do
    table.insert(valores, tonumber(numero))
end

local inicio = valores [1]
local fim = valores [2]

local total = 0

if inicio == fim then
    total = 24
elseif inicio > fim then
    fim = fim + 24
    total = fim - inicio
else
    total = fim - inicio
end

print(string.format("O JOGO DUROU %d HORA(S)", total))
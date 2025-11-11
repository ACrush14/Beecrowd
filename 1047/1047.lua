local valores = {}

for numero in string.gmatch(io.read(), "[^%s]+") do
    table.insert(valores, tonumber(numero))
end

local horaInicial = valores[1]
local minInicial = valores[2]
local horaFinal = valores [3]
local minFinal = valores [4]

local totalInicial = horaInicial * 60 + minInicial
local totalFinal = horaFinal * 60 + minFinal

local totalMinutos = 0

if totalInicial == totalFinal then
    totalMinutos = 24*60
elseif totalInicial < totalFinal then
    totalMinutos = totalFinal - totalInicial
else 
    totalMinutos = (totalFinal + 24 * 60) - totalInicial
end

local hTotal = math.floor(totalMinutos / 60)
local mTotal = totalMinutos % 60

print(string.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", hTotal, mTotal))
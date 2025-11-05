local linha1 = io.read("*l")
local cod1_s, num1_s, valor1_s = string.match(linha1, "(%S+)%s+(%S+)%s+(%S+)")

local linha2 = io.read("l")
local cod2_s, num2_s, valor2_s = string.match(linha2, "(%S+)%s+(%S+)%s+(%S+)")

local num1 = tonumber(num1_s)
local valor1 = tonumber(valor1_s)

local num2 = tonumber(num2_s)
local valor2 = tonumber(valor2_s)

local total = (num1 * valor1) + (num2 * valor2)

print(string.format("VALOR A PAGAR: R$ %.2f", total))

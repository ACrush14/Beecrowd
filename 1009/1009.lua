local nome = io.read()
local sal = io.read("*number")
local vendas = io.read("*number")

local bonus = vendas * 0.15

local total = sal + bonus

print("TOTAL = R$ " .. string.format("%.2f", total))
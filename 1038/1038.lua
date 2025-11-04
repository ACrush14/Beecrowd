cardapio = {
    [1] =  4.00,
    [2] =  4.50,
    [3]=  5.00,
    [4]=  2.00,
    [5] = 1.50
}

local ent, qtde = io.read("*n", "*n")
 
local uni = cardapio[ent]

local total = uni * qtde

print(string.format("Total: R$ %.2f", total))
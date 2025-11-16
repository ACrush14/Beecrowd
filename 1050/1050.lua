local ddd_table = {
    [61] = "Brasilia",
    [71] = "Salvador",
    [11] = "Sao Paulo",
    [21] = "Rio de Janeiro",
    [32] = "Juiz de Fora",
    [19] = "Campinas",
    [27] = "Vitoria",
    [31] = "Belo Horizonte",
    
}


local a = io.read("*n")

if ddd_table[a] ~= nil then
    print(ddd_table[a])
else
    print("DDD nao cadastrado")
end
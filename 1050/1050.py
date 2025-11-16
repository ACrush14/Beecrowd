ddd_map = {
    61: "Brasilia",
    71: "Salvador",
    11: "Sao Paulo",
    21: "Rio de Janeiro", 
    32: "Juiz de Fora",
    19: "Campinas", 
    27: "Vitoria",
    31: "Belo Herizonte"
}

a = int(input())

if a in ddd_map:
    print(ddd_map[a])
else:
    print("DDD nao cadastrado")
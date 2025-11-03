cardapio = {
    1: 4.00,
    2: 4.50,
    3: 5.00,
    4: 2.00,
    5: 1.50,
}

ent, qtde = map(int, input().split(' '))

uni = cardapio[ent]

total = uni * qtde

print(f"Total: R$ {total:.2f}")

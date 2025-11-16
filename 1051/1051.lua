local salario = io.read("*n")
local imposto = 0

if salario <= 2000 then
    print("Isento")
elseif salario <= 3000 then
    imposto = (salario - 2000) *0.08
    print(string.format("R$ %.2f", imposto))
elseif salario <= 4500 then
    imposto = (1000 * 0.08) + (salario - 3000) * 0.18
    print(string.format("R$ %.2f", imposto))
else
    imposto = (1000 *0.08) + (1500 * 0.18) + (salario - 4500) *  0.28
    print(string.format("R$ %.2f", imposto))
end
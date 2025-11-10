local valores = {}

for numero in string.gmatch(io.read(), "[^%s]+") do
    table.insert(valores, tonumber(numero))
end

table.sort(valores, function(x, y) return x > y end)

local a, b, c = valores[1], valores[2], valores[3]



if a >= b + c then
    print("NAO FORMA TRIANGULO")
else
    if a*a == (b*b) + (c*c) then
        print("TRIANGULO RETANGULO")
    elseif a*a > (b*b) + (c*c) then
        print("TRIANGULO OBTUSANGULO")
    elseif a*a < (b*b) + (c*c) then
        print("TRIANGULO ACUTANGULO")
    end
    if a == b and a == c and b == c then
        print("TRIANGULO EQUILATERO")
    elseif a == b or a == c or b == c then
        print("TRIANGULO ISOSCELES")
    end
end
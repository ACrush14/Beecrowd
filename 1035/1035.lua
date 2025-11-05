local A = io.read("*n")
local B = io.read("*n")
local C = io.read("*n")
local D = io.read("*n")

if (B>C and D > A and (C+D) > (A+B) and  C > 0 and D > 0 and (A % 2 == 0)) then
    print("Valores aceitos")
else
    print("Valores nao aceitos")
end
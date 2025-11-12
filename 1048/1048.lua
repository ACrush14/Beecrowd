local sal = io.read("*n")
local bonus

if sal <= 400 then
    bonus = 0.15
elseif sal <= 800 then
    bonus = 0.12
elseif sal <= 1200 then
    bonus = 0.10
elseif sal <= 2000 then
    bonus = 0.07
else
    bonus = 0.04
end

local reajuste = sal * bonus
local novo = sal + reajuste
local percent = math.floor(bonus * 100)

print(string.format("Novo salario: %.2f", novo))
print(string.format("Reajuste ganho: %.2f", reajuste))
print(string.format("Em percentual: %d %%", percent))

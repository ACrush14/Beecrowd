local A = io.read("*n")
local B = io.read("*n")
local C = io.read("*n")

local bas = (B * B) - ( 4 * A * C)

if bas < 0 or A == 0 then
    print("Impossivel calcular")
else
    q_bas =  math.sqrt(bas)
    local R1 = (-B + q_bas)/(2*A)
    local R2 = (-B - q_bas)/(2*A)
    print(string.format("R1 = %.5f", R1))
    print(string.format("R2 = %.5f", R2))    
end
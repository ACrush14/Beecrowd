local a, b, c = io.read("*number", "*number", "*number")

local maiorAB = (a + b + math.abs(a-b)) / 2

local maiorABC = (maiorAB + c + math.abs(maiorAB - c)) / 2
    
print(math.tointeger(maiorABC) .. " eh o maior")
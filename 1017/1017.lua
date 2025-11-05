local tempo = io.read("*number")
local vel = io.read("*number")

local res = (tempo * vel) / 12

print(string.format("%.3f", res))
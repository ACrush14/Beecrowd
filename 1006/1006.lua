local a = io.read("*number")
local b = io.read("*number")
local c = io.read("*number")

local media = ((a * 2) + (b * 3) + (c * 5)) /10


print("MEDIA = " .. string.format("%.1f", media))
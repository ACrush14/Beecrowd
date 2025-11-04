local a = io.read("*number")
local b = io.read("*number")


local media = ((a * 3.5) + (b * 7.5)) / 11

print("MEDIA = " .. string.format("%.5f", media))
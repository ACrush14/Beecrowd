local linha1 = io.read()

local x1_str, y1_str = linha1:match("([^%s]+)%s+([^%s]+)")

local x1 = tonumber(x1_str)
local y1 = tonumber(y1_str)

local linha2 = io.read()

local x2_str, y2_str = linha2:match("([^%s]+)%s+([^%s]+)")

local x2 = tonumber(x2_str)
local y2 = tonumber(y2_str)


local dist = math.sqrt(((x2 - x1) ^ 2) + ((y2 - y1) ^ 2))

print(string.format("%.4f", dist))
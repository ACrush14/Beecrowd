local num = io.read("*number")

local ano = math.floor(num / 365)

num = num % 365

local mes = math.floor(num / 30)

local dia = num % 30


print(string.format("%d ano(s)", ano))
print(string.format("%d mes(es)", mes))
print(string.format("%d dia(s)", dia))
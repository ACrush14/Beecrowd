local a = io.read("*n")

if (a >= 0 and a <= 25) then
    print("Intervalo [0,25]")
elseif (a > 25 and a <= 50) then
    print("Intervalo (25,50]")
elseif (a > 50 and a <= 75) then
    print("Intervalo (50,75]")
elseif (a > 75 and a <= 100) then
    print("Intervalo (75,100]")
else
    print("Fora de intervalo")
end

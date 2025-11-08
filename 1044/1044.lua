local a, b = io.read("*n", "*n")

if a % b  == 0 or b % a == 0 then
    print("Sao Multiplos")
else
    print("Nao sao Multiplos")
end
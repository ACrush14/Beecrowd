local n1 = io.read("*n")
local n2 = io.read("*n")
local n3 = io.read("*n")
local n4 = io.read("*n")

n1 = n1 *2
n2 = n2 * 3
n3 = n3 * 4

local media = (n1 + n2 + n3 + n4) / 10

print(string.format("Media: %.1f", media))
    
if media < 5 then
    print("Aluno reprovado.")
elseif media >= 7 then
    print("Aluno aprovado.")
else
    print("Aluno em exame.") 
    
    local n5 = io.read("*n")
    print(string.format("Nota do exame: %.1f", n5))
    local n_media = (media + n5) / 2
    
    if n_media < 5 then
        print("Aluno reprovado.")
    else
        print("Aluno aprovado.")
        
    print(string.format("Media final: %.1f", n_media))
        
    end
end
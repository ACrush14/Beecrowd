local a = io.read()
local b = io.read()
local c = io.read()

if a == "vertebrado" then
    if b == "ave" then
        if c == "carnivoro" then
            print("aguia")
        elseif c == "onivoro" then
            print("pomba")
        end
    elseif b == "mamifero" then
        if c == "onivoro" then
            print("homem")
        elseif c == "herbivoro" then
            print("vaca")
        end
    end
elseif a == "invertebrado" then
    if b == "inseto" then
        if c == "hematofago" then
            print("pulga")
        elseif c == "herbivoro" then
            print("lagarta")
        end
    elseif b == "anelideo" then
        if c == "hematofago" then
            print("sanguessuga")
        elseif c == "onivoro" then
            print("minhoca")
        end
    end
end



    
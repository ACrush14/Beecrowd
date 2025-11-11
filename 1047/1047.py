valores = input().split()

hIni = int(valores[0])
mIni = int(valores[1])
hFin = int(valores[2])
mFin = int(valores[3])

iniTotal = hIni *60 + mIni
finTotal = hFin * 60 + mFin

durMin = 0

if iniTotal == finTotal:
    durMin = 24 * 60
elif iniTotal < finTotal:
    durMin = finTotal - iniTotal
else:
    durMin = (finTotal + 24 * 60) - iniTotal

hTotal = durMin // 60
mTotal = durMin % 60

#método de conversão de hora para minuto


    
print(f"O JOGO DUROU {hTotal} HORA(S) E {mTotal} MINUTO(S)")
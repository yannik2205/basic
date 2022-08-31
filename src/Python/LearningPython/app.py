Gew = input("Gewicht: ")
Gewicht = float(Gew)
K_L = input("(K)g or (L)bs: ")
if K_L == "K" or "k":
    print("Gewicht in Lbs: " + str(Gewicht*2))
else:
    print("Gewicht in Kgs: " + str(Gewicht/2))

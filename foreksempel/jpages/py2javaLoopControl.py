# for-løkke eksempel 1: intro til for-løkke
for i in range(10):
    print(i)


# for-løkke eksempel 2: øke telleren med mer enn 1
print("Alle tall i fem-gangen t.o.m. 30 er:")
for i in range(5, 30, 5):
    print(i)


# for-løkke eksempel 3: andre ting enn integers og telling
# python-versjonen blir enklest som en while-løkke
s = "X"
while s != "XXX":
    print("Alt er greit! Ordet er " + s)
    s += "X"


# for-løkke eksempel 4: for-each løkke
# skrive ut alle ord i en liste (Java: array)
prog_spraak = ["Python", "C++", "Java", "PHP"]
for spraak in prog_spraak:
    print(spraak)


# for-løkke eksempel 5: bruke liste-lengden
# gå gjennom liste, og ha en teller (i)
personer = ["Cecilie", "Vegard", "Vemund", "Nils", "Ragnar"]
for i in range( len(personer) ):
    print(personer[i] + " er på plass " + str(i+1))


# for-løkke eksempel 6: break
# brukes helt likt i while-løkker
# lete gjennom en liste helt til vi finner Gløshaugen
plasser = ["Dragvoll", "St. Olav", "Tunga", "Kalvskinnet", "Gløshaugen", "Gjøvik"]
print("Leter etter Gløshaugen")
for plass in plasser:
    if plass == "Gløshaugen":
        break
    print("Leter fremdeles... er på " + plass + " nå.")
print("Jeg fant!")


# for-løkke eksempel 7: nestede løkker
# bruker array, for intro se liste- TODO
letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H']
print('Her er alle rutene i et sjakkbrett:')
for i in range(8):
    for j in range(8):
        print(letters[i] + str(j+1))
        

# while-løkke eksempel 1: intro til while-løkke
timer = 5
while timer > 0:
    print("Tid igjen: " + str(timer))
    timer -= 1
print("Tiden er ute!")



# while-løkke eksempel 2: uendelig løkke, med break
# brukes stort sett bare med input e.l., men det dropper vi her
# så eksempelet er bare å skrive ut noe helt til vi har gjort det 3 ganger
# bare for å illustrere uendelige løkker
teller = 0
while (True):
    print("Java er best, ingen protest!")
    teller += 1
    if teller == 3: 
        break

#Lage ny liste med innhold
list = ["hei", "paa", "deg", "hva", "skjer"]
print(list)  # Printer listen


#Diverse listeoperasjoner
print(list[0])  # frste element
print(list[-1])  # siste element
print(list[3:])  # subliste med elementer fra indeks 3 og ut lista
print(list[0:2])  # subliste med element 0 og 1
print(list[-2:]) # subliste med 2 siste elementer

print(len(list))  # lengden til listen
print(list.pop(0))  # returnerer og fjerner frste element
print(list.remove("paa"))  # fjerner elemtet paa 
print(list.append("java"))  # Legger til 6 paa slutten av listen
print(list)

print(list.index("java"))   # Indeks til element
print(list)



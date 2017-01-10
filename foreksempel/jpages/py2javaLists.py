#Lage ny liste med innhold
list = ["hei", "paa", "deg", "hva", "skjer"]
print(list)  # Printer listen

#Diverse listeoperasjoner
print(len(list))  # lengde

print(list[0])  # forste element
print(list[-1])  # Eventuelt list[len(list)-1]   siste element
print(list[3:])  # subliste med elementer fra indeks 3 og ut lista
print(list[0:2])  # subliste med element 0 og 1
print(list[-2:]) # subliste med 2 siste elementer


list.pop(0)  # Fjerner og returnerer forste element
print(list)

list.remove("paa") # fjerner elemtet paa 
print(list)

list.append("java")  # Legger til 6 paa slutten av listen
print(list)

list[0]="meg"  # setter "meg" paa index 0
print(list)

print( "meg" in list)  # Sjekker om listen inneholder elementet "meg"

print(list.index("java"))   # Indeks til element




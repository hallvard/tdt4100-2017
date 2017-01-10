# string functions
s = "Hallvard"
if s.startswith("Hal") :
    print(s[0:6] + "9000")
else:
    print("zzz")


#Check if a string is a substring of another string
tekst = "Objektorientert programmering"
sub = "programmering"

if sub in tekst:
    print(sub + " er en substring av " + tekst)


#Split a string into two parts

email = "student@ntnu.no"
parts = email.split("@")
studentName = parts[0]
domain = parts[1]

print(studentName)
print(domain)


#Remove whitespace from a string
tekst = "Java blir goy"
print(tekst.replace(" ", ""))

#Find the first index of a given string
print("java".find("a"))


#Check if a string is palindrome
tekst = "agnes i senga"
isPalindrome = True

n = len(tekst)
for i in range(0, n//2):
    if tekst[i] != tekst[n-i-1]:
        isPalindrome = False
        
print("Er palindrom: " + str(isPalindrome))
        
        
        
#Check if a string is palindrome while ignoring case
tekst = "Agnes i senga"
isPalindrome = True

n = len(tekst)
for i in range(0, n//2):
    if tekst[i].lower() != tekst[n-i-1].lower():
        isPalindrome = False
        
print("Er palindrom: " + str(isPalindrome))


myDict = {"I": "Close, but not the strongest avenger", "B": "Try again",
          "H": "Access granted", "C": "Worthy,but no", "T": "No", "Ha": "He is retired"}

count = 1
print("Choose one of the following options: (I / B / H / C / T / Ha)")
print("I - Ironman \nB - Black Widow \nH - Hulk \nC - Captain America \nT - Thor \nHa - Hawkeye")
while count <= 3:
    name = input("Who is the strongest avenger from above? ")
    if name == "H":
        print(myDict[name])
        print()
        print("You won the guess game! Congrats!")
        break
    else:
        print(myDict[name])
        print()
        choice = input(
            f"Would you like to guess again (Y / N)? (attempt {count+1}) ")
        print()
        if choice == "N":
            break
    count += 1

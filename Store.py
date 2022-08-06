# from curses import start_color


# stockDict = {
#     "Whiteboard Maker": [85, 1.50],
#     "Whiteboard Eraser": [45, 5.00],
#     "Black Pen": [100, 1.50],
#     "Red Pen": [100, 1.50],
#     "Blue Pen": [100, 1.50]
# }

# def sellStock(stockDict):
#     name = input("Name: ")
#     if name.title() in stockDict:
#         print("Selling", name)
#         number = int(input("Number: "))
#         if stockDict[name][0] > number:
#             stockDict[name][0] -= number
#         else:
#             print("Out of stock")
#     else:
#         for ele in stockDict:
#             if name.title() in ele:
#                 print(
#                     f"{ele} - {stockDict[ele][0]} at ${stockDict[ele][1]}")
#         myFun(stockDict)

#     pass


# def viewStock(stockDict):
#     pass


# def restock(stockDict):
#     pass


# def prune(stockDict):
#     pass


# print('''
#     Choice (s/r/V/c/p/X): ?
#     Menu options
#     s = sell
#     r = restock
#     v = view stock
#     c = view cash
#     p = prune products
#     x = exit
#     ''')


# def myFun(stockDict):

#     while True:
#         user_choice = input("Choice (s/r/V/c/p/X): ")
#         if user_choice == 'v':
#             for ele in stockDict:
#                 print(f"{ele} - {stockDict[ele][0]} at ${stockDict[ele][1]}")
#         elif user_choice == 's':
#             sellStock(stockDict)


# temperature=float(input("Enter the temperature in degree C: "))
# user_choice=int(input("Convert to Kelvin (1) or Fahrenheit (2) ? "))
# if user_choice==1:
#     kelvin=temperature+273.15
#     print(round(kelvin,1))
# elif user_choice==2:
#     fahrenheit=(9/5)*temperature+32
#     print(round(fahrenheit,1))

# def calculateFactorial(n):
#     if n==0:
#         return 1
#     else:
#         return n*fact(n-1)
# def calculateCombination(n,k):
#     result=calculateFactorial(n)/(calculateFactorial(k)*calculateFactorial(n-k))
#     return result

# q=int(input())
# n_k=list(map(int,input().strip().split()))
# n=n_k[0]
# k=n_k[1]
# if calculateCombination(n)>k:
#     print("YES")
# else:
#     print("NO")
# Your code here
# def calculateFactorial(n):
#     if n==0:
#         return 1
#     else:
#         return n*calculateFactorial(n-1)
# def calculateCombination(n,k):
#     result=calculateFactorial(n)/(calculateFactorial(k)*calculateFactorial(n-k))
#     return result

# q=int(input())
# for i in range(q):
#     n_k=list(map(int,input().strip().split()))
#     n=n_k[0]
#     k=n_k[1]
#     if calculateCombination(n,k)>k:
#         print("YES")
#     else:
#         print("NO")

# arr=[[4,3],[2,5]]
# arr=sorted(arr)
# print(arr)
# print(max
# (arr))

# from numpy import mat
# from soupsieve import match


# from textwrap import indent
# from soupsieve import match


# # matches = [[1, 3], [2, 3], [3, 6], [5, 6], [5, 7],
# #            [4, 5], [4, 8], [4, 9], [10, 4], [10, 9]]
# # matches=[[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
# matches=[[1,3]]
# num=0
# for i in range(len(matches)):
#     ele=max(matches[i])
#     if ele>num:
#         num=ele
# result = [[], []]
# myArr = [[0, 0]]
# for i in range(num):
#     myArr.append([0, 0])
# # print(myArr)

# for i in range(len(matches)):
#     # print("Entering the loop.")
#     winner = matches[i][0]
#     # print("winner =", winner)
#     looser = matches[i][1]
#     # print("looser =", looser)
#     myArr[winner][0] += 1
#     myArr[looser][1] += 1
# for i in range(1, len(myArr)):
#     if myArr[i][1] == 0 and myArr[i][0]!=0:
#         result[0].append(i)
#     elif myArr[i][1] == 1:
#         result[1].append(i)
# print(myArr)
# print(result)


# data = {'A': 'aaaaa', 'B': 'aaaab', 'C': 'aaaba', 'D': 'aaabb', 'E': 'aabaa',
#         'F': 'aabab', 'G': 'aabba', 'H': 'aabbb', 'I': 'abaaa', 'J': 'abaab',
#         'K': 'ababa', 'L': 'ababb', 'M': 'abbaa', 'N': 'abbab', 'O': 'abbba',
#         'P': 'abbbb', 'Q': 'baaaa', 'R': 'baaab', 'S': 'baaba', 'T': 'baabb',
#         'U': 'babaa', 'V': 'babab', 'W': 'babba', 'X': 'babbb', 'Y': 'bbaaa', 'Z': 'bbaab'}

# # Function to encrypt the string according to the cipher provided
# def encrypt(message):
#     cipher = ''
#     for letter in message:
#         # checks for space
#         if(letter != ' '):
#             # adds the ciphertext corresponding to the
#             # plaintext from the dictionary
#             cipher += data[letter]
#         else:
#             # adds space
#             cipher += ' '
#     return cipher
# def main():
#     message = "Hello world"
#     result = encrypt(message.upper())
#     print(result)


# main()

# from typing_extensions import assert_type


# def isComoposite(x):
#     if (x<=1):
#         return False
#     if (x<=3):
#         return False
#     if (x%2==0 or x%3==0):
#         return True
#     i=5
#     while (i*i<=x):
#         if (x%i==0 or x%(i+2)==0):
#             return True
#         i=i+6
#     return False
# print(isComoposite(9))
# print(isComoposite(22))
# print(isComoposite(3))
# print(isComoposite(41))

# composite_numbers=[4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,26,27,28]
# for i in composite_numbers:
#     assert_true(isComoposite(i),str(i)+ "is composte")


# #Function
# def generateSquare(n): 
#     # 2-D array with all  
#     # slots set to 0 
#     magicSquare = [[0 for x in range(n)] 
#                       for y in range(n)] 
#     # initialize position of 1 
#     i = n / 2
#     j = n - 1
#     # Fill the square by placing values 
#     num = 1
#     while num <= (n * n): 
#         if i == -1 and j == n: # 3rd condition 
#             j = n - 2
#             i = 0
#         else:  
#             # next number goes out of 
#             # right side of square  
#             if j == n: 
#                 j = 0    
#             # next number goes  
#             # out of upper side 
#             if i < 0: 
#                 i = n - 1
#         if magicSquare[int(i)][int(j)]: # 2nd condition 
#             j = j - 2
#             i = i + 1
#             continue
#         else: 
#             magicSquare[int(i)][int(j)] = num 
#             num = num + 1
#         j = j + 1
#         i = i - 1 # 1st condition 
#     # Printing the square 
#     print ("Magic Square for n =", n) 
#     print ("Sum of each row or column",n * (n * n + 1) / 2, "\n") 
#     for i in range(0, n): 
#         for j in range(0, n): 
#             print('%2d ' % (magicSquare[i][j]),end = '') 
#             # To display output  
#             # in matrix form 
#             if j == n - 1:  
#                 print()
# # Driver Code 
# # Works only when n is odd 
# n=int(input("Number of rows of the Magic Square:"))
# generateSquare(n)


# Python3 program to fill blanks
# with numbers

# Function to print the original matrix
# def printFilledDiagonal(sq):

# 	# Calculate the sum of all the
# 	# elements of the matrix
# 	Sum = 0
# 	for i in range(0, 4):
# 		for j in range(0, 4):
# 			Sum += sq[i][j]

# 	# Required sum of each
# 	# row (from the approach)
# 	Sum = Sum//2

# 	for i in range(0, 4):

# 		# Row sum excluding the
# 		# diagonal element
# 		rowSum = 0
# 		for j in range(0, 4):
# 			rowSum += sq[i][j]

# 		# Element that must be inserted
# 		# at diagonal element of the
# 		# current row
# 		sq[i][i] = Sum - rowSum
	
# 	# Print the updated matrix
# 	for i in range(0, 4):
# 		for j in range(0, 4):
# 			print(sq[i][j], end = " ")
# 		print()

# # Driver Code
# sq = [[54, 12, 0,0],
# 	[0, 39, 0,30],
# 	[33, 27, 24,42],
#     [18,0,0,0]]

# printFilledDiagonal(sq)
	
# # This code is contributed
# # by Rituraj Jain


# # Built-in Scope 
# from math import pi 

# # pi = 'Not defined in global pi'
# def outer_function(): 

#     # pi = 'Not defined in outer pi' 
#     def inner_function(): 
#         # pi = 'not defined in inner pi' 
#         print(pi) 

#     inner_function() 

# outer_function()
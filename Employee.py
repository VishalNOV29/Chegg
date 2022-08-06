# class Person:
#     def __init__(self, FirstName, LastName, Age, Address, ContactNumber):
#         self.firstName = FirstName
#         self.lastName = LastName
#         self.age = Age
#         self.address = Address
#         self.contactNumber = ContactNumber


# class Employee(Person):
#     def __init__(self, FirstName, LastName, Age, Address, ContactNumber, EmployeeID, OrganizationName, Position):
#         super().__init__(FirstName, LastName, Age, Address, ContactNumber)
#         self.employeeID = EmployeeID
#         self.ogranizationName = OrganizationName
#         self.position = Position


# class CommissionEmployee(Employee):
#     def __init__(self, FirstName, LastName, Age, Address, ContactNumber, EmployeeID, OrganizationName, Position, CommissionRate):
#         super().__init__(FirstName, LastName, Age, Address,
#                          ContactNumber, EmployeeID, OrganizationName, Position)
#         self.commissionRate = CommissionRate

#     def calculateCommission(self):
#         self.gross_sale = float(input("Enter gross sale: "))
#         self.commission = (self.gross_sale/100)*self.commissionRate
#         return self.commission

#     def displayData(self):
#         print(f'''FirstName : {self.firstName}
# LastName : {self.lastName}
# Age : {self.age}
# Address : {self.address}
# ContactNumber : {self.contactNumber}
# EmployeeId : {self.employeeID}
# OrganizationName : {self.ogranizationName}
# Position : {self.position}
# CommissionRate : {self.commissionRate}
# TotalEarning : {self.calculateCommission()+self.gross_sale()} ''')


# class SalariedEmployee(Employee):
#     def __init__(self, FirstName, LastName, Age, Address, ContactNumber, EmployeeID, OrganizationName, Position, baseSalary):
#         super().__init__(FirstName, LastName, Age, Address,
#                          ContactNumber, EmployeeID, OrganizationName, Position)
#         self.baseSalary = baseSalary

#     def calculateNetSalary(self):
#         self.provisional_tax_percent = 13
#         self.insurance_percent = 1
#         self.fed_tax_percent = 3
#         self.netSalary = self.baseSalary-(self.baseSalary/100)*(
#             self.provisional_tax_percent+self.insurance_percent+self.fed_tax_percent)
#         return self.netSalary

#     def displayData(self):
#         print(f'''FirstName : {self.firstName}
# LastName : {self.lastName}
# Age : {self.age}
# Address : {self.address}
# ContactNumber : {self.contactNumber}
# EmployeeId : {self.employeeID}
# OrganizationName : {self.ogranizationName}
# Position : {self.position}
# BaseSalary : {self.baseSalary}
# NetSalary : {self.calculateNetSalary()}''')


# class BasePlusCommissionEmployee(CommissionEmployee):
#     def __init__(self, FirstName, LastName, Age, Address, ContactNumber, EmployeeID, OrganizationName, Position, CommissionRate, baseSalary):
#         super().__init__(FirstName, LastName, Age, Address, ContactNumber,
#                          EmployeeID, OrganizationName, Position, CommissionRate)
#         self.baseSalary = baseSalary

#     def calculateTotalEarning(self):
#         self.totalEarning = super().calculateCommission()+self.baseSalary
#         return self.totalEarning

#     def displayData(self):
#         print(f'''FirstName : {self.firstName}
# LastName : {self.lastName}
# Age : {self.age}
# Address : {self.address}
# ContactNumber : {self.contactNumber}
# EmployeeId : {self.employeeID}
# OrganizationName : {self.ogranizationName}
# Position : {self.position}
# TotalEarning : {self.calculateTotalEarning()}''')


# obj1 = SalariedEmployee("XYZ", "ABC", 22, "AAAAA",
#                         1234567, "0201CSE15FKJFEKL8", "BBBB", "Student", 12000)
# obj1.displayData()

# print("") # For generating new lines.

# obj2 = BasePlusCommissionEmployee(
#     "XYZ", "ABC", 22, "AAAAA",
#     1234567, "0201CSE15FKJFEKL8", "BBBB", "Student", 12,12000)
# obj2.displayData()

# a=(5+5)%11
# print(a)


# i=13
# while (i>7):
#     j=0;
#     while (j<4):
#         print(i,"+",j,"=",i+j)
#         j+=1
#     i-=2


# list1 = [1, 2, 3]
# # in list indexing starts from 0.
# list1[0] = 2
# list1[1] = 3
# list1[2] = 4
# list1.append(6)
# print(list1)
# #

# def zipper(s1,s2):
#     newStr=""
#     list1=list(s1)
#     list2=list(s2)
#     for i in range(len(list1)+len(list2)):
#         if i%2==0:
#             newStr+=list2.pop()
#         else:
#             newStr+=list1.pop()
#     newStr=newStr[::-1]
#     return newStr

# print(zipper("ABCDE","12345"))
# import numpy as nd
# class MyClass:
#     def __init__(self,array):
#         self.array=array
#     def calculateMean(self)

# arr=[1,2,3,4,5,6]
# # print(nd.mean(arr))

# def myFun():
#     print("Enter numbers: ")
#     arr=[]
#     while True:
#         num=int(input())
#         if num==0:
#             break
#         arr.append(num)
#     print("Highest:",max(arr))
#     print("Lowest:",min(arr))

# myFun()


# Python program to print a given number in
# words. The program handles numbers
# from 0 to 9999

# A function that prints
# given number in words


# def convert_to_words(num):
# 	l = len(num)
# 	if (l == 0):
# 		print("empty string")
# 		return

# 	if (l > 4):
# 		print("Length more than 4 is not supported")
# 		return
# 	single_digits = ["zero", "one", "two", "three",
# 					"four", "five", "six", "seven",
# 					"eight", "nine"]
# 	two_digits = ["", "ten", "eleven", "twelve",
# 				"thirteen", "fourteen", "fifteen",
# 				"sixteen", "seventeen", "eighteen",
# 				"nineteen"]
# 	tens_multiple = ["", "", "twenty", "thirty", "forty",
# 					"fifty", "sixty", "seventy", "eighty",
# 					"ninety"]

# 	tens_power = ["hundred", "thousand","lac","millions"]

# 	# Used for debugging purpose only
# 	print(num, ":", end=" ")

# 	# For single digit number
# 	if (l == 1):
# 		print(single_digits[ord(num[0]) - 48])
# 		return

# 	# Iterate while num is not '\0'
# 	x = 0
# 	while (x < len(num)):
# 		if (l >= 3):
# 			if (ord(num[x]) - 48 != 0):
# 				print(single_digits[ord(num[x]) - 48],
# 					end=" ")
# 				print(tens_power[l - 3], end=" ")
# 			l -= 1
# 		else:
# 			if (ord(num[x]) - 48 == 1):
# 				sum = (ord(num[x]) - 48 +
# 					ord(num[x+1]) - 48)
# 				print(two_digits[sum])
# 				return
# 			elif (ord(num[x]) - 48 == 2 and
# 				ord(num[x + 1]) - 48 == 0):
# 				print("twenty")
# 				return
# 			else:
# 				i = ord(num[x]) - 48
# 				if(i > 0):
# 					print(tens_multiple[i], end=" ")
# 				else:
# 					print("", end="")
# 				x += 1
# 				if(ord(num[x]) - 48 != 0):
# 					print(single_digits[ord(num[x]) - 48])
# 		x += 1


# # Driver Code
# convert_to_words("9929873") # Four Digits
# convert_to_words("523") # Three Digits
# convert_to_words("89") # Two Digits
# convert_to_words("8") # One Digits

# # This code is contributed
# # by Mithun Kumar


# Function to convert a single-digit or two-digit number into words
# def convertToDigit(n, suffix):
#     print(n)
#     X = ['', 'One ', 'Two ', 'Three ', 'Four ', 'Five ', 'Six ', 'Seven ',
#          'Eight ', 'Nine ', 'Ten ', 'Eleven ', 'Twelve ', 'Thirteen ', 'Fourteen ',
#          'Fifteen ', 'Sixteen ', 'Seventeen ', 'Eighteen ', 'Nineteen ']

#     Y = ['', '', 'Twenty ', 'Thirty ', 'Forty ', 'Fifty ',
#          'Sixty ', 'Seventy ', 'Eighty ', 'Ninety ']

#     if n == 0:
#         return ''

#     if n > 19:
#         return Y[n // 10] + X[n % 10] + suffix
#     else:
#         return X[n] + suffix


# # Function to convert a given number (max 9-digits) into words
# def convert(n):

#     result = convertToDigit((n // 1000000000) % 100, 'Billion, ')

#     result += convertToDigit((n // 10000000) % 100, 'Crore, ')

#     result += convertToDigit(((n // 100000) % 100), 'Lakh, ')

#     result += convertToDigit(((n // 1000) % 100), 'Thousand, ')

#     result += convertToDigit(((n // 100) % 10), 'Hundred ')

#     if n > 100 and n % 100:
#         result += 'and '

#     result += convertToDigit((n % 100), '')

#     return result.strip().rstrip(',').replace(', and', ' and')


# def spellout(n):
#     if n < 0:
#         n = n*-1
#         return "Minus "+convert(n)
#     return convert(n)


# print(spellout(-105769000))

# import num2word


# Number to Words

# Main Logic


# ones = ('zero', 'one', 'two', 'three', 'four',
#         'five', 'six', 'seven', 'eight', 'nine')

# twos = ('ten', 'eleven', 'twelve', 'thirteen', 'fourteen',
#         'fifteen', 'sixteen', 'seventeen', 'sighteen', 'nineteen')

# tens = ('twenty ', 'thirty ', 'forty', 'fifty', 'sixty',
#         'seventy', 'eighty', 'ninety', 'hundred')

# suffixes = ('', 'thousand', 'million', 'billion')


# def process(number, index):

#     if number == '0':
#         return 'Zero'
#     length = len(number)

#     if(length > 3):
#         return False

#     number = number.zfill(3)
#     words = ''

#     hdigit = int(number[0])
#     tdigit = int(number[1])
#     odigit = int(number[2])

#     words += '' if number[0] == '0' else ones[hdigit]
#     words += ' hundred and ' if not words == '' else ''

#     if(tdigit > 1):
#         words += tens[tdigit - 2]
#         words += ' '
#         words += ones[odigit]

#     elif(tdigit == 1):
#         words += twos[(int(tdigit + odigit) % 10) - 1]

#     elif(tdigit == 0):
#         words += ones[odigit]

#     if(words.endswith('Zero')):
#         words = words[:-len('Zero')]
#     else:
#         words += ' '

#     if(not len(words) == 0):
#         words += suffixes[index]

#     return words


# def spellout(number):
#     flag = 0
#     if number < 0:
#         number = number*(-1)
#         flag = 1
#     length = len(str(number))

#     if length > 12:
#         return 'This program supports upto 12 digit numbers.'

#     count = length // 3 if length % 3 == 0 else length // 3 + 1
#     copy = count
#     words = []

#     for i in range(length - 1, -1, -3):
#         words.append(
#             process(str(number)[0 if i - 2 < 0 else i - 2: i + 1], copy - count))
#         count -= 1

#     final_words = ''
#     for s in reversed(words):
#         temp = s + ' '
#         final_words += temp
#     if flag == 1:
#         return "minus "+final_words
#     return final_words

# print(spellout(123456))
# print(spellout(-78))
# print(spellout(0))


# def simplestDirection(directions):
#     if len(directions)==0:
#         return "No movement."
#     horizontal=""
#     vertical=""
#     directions=list(directions)
#     up=directions.count("U")
#     down=directions.count("D")
#     left=directions.count("<")
#     right=directions.count(">")
#     if up<down:
#         vertical="down"
#     else:
#         vertical="up"
#     if left<right:
#         horizontal="right"
#     else:
#         horizontal="left"
#     if up==down and left==right:
#         return "No movement."
#     simpleDirection=f"You have moved {abs(up-down)} blocks {vertical} and {abs(left-right)} blocks {horizontal}."
#     return simpleDirection

# print(simplestDirection(""))
# print(simplestDirection("<>UD"))
# print(simplestDirection(">U<U>>DU<>U"))
# print(simplestDirection("><>DUD"))


# from itertools import count
# from re import I

# from matplotlib.pyplot import get_figlabels


# def countingSort(arr,Max):
#     # creating a array of length max+1.
#     # Initially put 0 at all index.
#     countArr=[0 for i in range(Max+1)]

#     print("Initially: ",countArr)

#     # Check the occurance of each element in arr.
#     # Increase that index by 1 after each occurance.
#     for ele in arr:
#         countArr[ele]+=1
#     print("Occurance:",countArr)

#     result=[]
#     # Append all the elements whose occurance is not 0
#     i=0
#     while (i<len(countArr)):
#         if countArr[i]!=0:
#             for  j in range(countArr[i]):
#                 result.append(i)
#         i+=1
#     print("Sorted:",result)


# countingSort([1,1,2,2],2)
# countingSort([32,28,15,46,67,9],67)


# def calGrade(num):
#     grade=""
#     if num>=90:
#         grade="A"
#     elif 80<=num<90:
#         grade="B"
#     elif 70<=num<80:
#         grade="C"
#     elif 60<=num<70:
#         grade="D"
#     else:
#         grade="F"
#     return "Grade : "+grade

# print(calGrade(90))
# print(calGrade(85))
# print(calGrade(77))
# print(calGrade(100))
# print(calGrade(40))


# arr=[1,2,3,4,5,6]
# i=0
# while i<len(arr)-1:
#     arr[i],arr[i+1]=arr[i+1],arr[i]
#     i+=2
# print(arr)

# arr=[1,5]
# for i in range(0,len(arr)-1,2):
#     arr[i],arr[i+1]=arr[i+1],arr[i]
# print(arr)

# def myFun(num):
#     if num==0:
#         return
#     myFun(num-1)
#     print(num)
# myFun(5)


# arr = [[4, 5, 7, 10],
#        [8, 12, 15, 20],
#        [13, 18, 30, 40],
#        [14, 19, 33, 44]]


# def myFun(arr,target):
#     for i in range(len(arr)):
#         for j in range(len(arr[0])):
#             if (arr[i][j]==target):
#                 return i,j
#     return "Not found."
# print(myFun(arr,15))


# arr = [[4, 5, 7, 10],
#        [8, 12, 15, 20],
#        [13, 18, 30, 40],
#        [14, 19, 33, 44]]

# def myFun(arr,target):
#     i=0;
#     j=len(arr[0])-1
#     while (i<len(arr) and j>=0):
#         if (arr[i][j]==target):
#             return i,j
#         elif (arr[i][j]<target):
#             i+=1
#         elif (arr[i][j]>target):
#             j-=1
#     return "Not found"
# print(myFun(arr,15))

# s1=1
# s2=11
# while s1<=s2:
#     print("Common Letter")
#     s1+=1


# from xml.etree.ElementTree import PI

# from pygments import highlight


# from math import pi

# def circle():
#     try:
#         radius = int(input("Enter a radius: "))
#     except:
#         print("Invalid data. The program could not continue.")
#     if (radius > 25 or radius < 1):
#         print("Invalid data. The program could not continue.")
#         return
#     area = pi*radius**2
#     diameter = 2*radius
#     print(
#         f"The area and diameter of a circle having a radius of {radius} are {round(area,2)} and {diameter}.")


# def equilateralTriangle():
#     try:
#         side = int(input("Eneter the lenght of one side: "))
#     except:
#         print("Invalid data. The program could not continue.")
#         return
#     if (side > 25 or side < 1):
#         print("Invalid data. The program could not continue.")
#         return
#     height = (side**2-(side/2)**2)**(.5)
#     area = (1/2)*side*(height)
#     perimeter = 3*side
#     print(
#         f"The area and perimeter of an equilateral triangle having a base length of {round(side,2)} are {round(area,2)} and {perimeter}.")


# def square():
#     try:
#         side = int(input("Enter the length of the side: "))
#     except:
#         print("Invalid data. The program could not continue.")
#         return
#     if (side > 25 or side < 1):
#         print("Invalid data. The program could not continue.")
#         return
#     area = side**2
#     perimeter = side*4
#     print(
#         f"The area and perimeter of a square having a side length of {side} are {area} and {perimeter}.")


# def cone():
#     try:
#         radius = int(input("Enter the radius of cone: "))
#         height = int(input("Enter the height of cone: "))
#     except:
#         print("Invalid data. The program could not continue.")
#         return
#     if (radius > 25 or height > 25 or radius < 1 or height < 1):
#         print("Invalid data. The program could not continue.")
#         return
#     volume = (1/3)*pi*(radius**2)*height
#     surfaceArea = (pi*radius**2)+(pi*radius*(radius**2+height**2)**0.5)
#     print(
#         f"The volume and surface area of a cone have the radius {radius} and height{height} is {round(volume,2)} and {round(surfaceArea,2)}.")


# def main():
#     while True:
#         print('''
# Select a geometric object.
# 1  Circle
# 2  Equilateral Triangle
# 3  Square
# 4  Cone
# X  No Choice''')
#         user_choice = input()
#         if (user_choice == "1"):
#             circle()
#         elif user_choice == '2':
#             equilateralTriangle()
#         elif user_choice == '3':
#             square()
#         elif user_choice == '4':
#             cone()
#         elif (user_choice == "X" or user_choice == "x"):
#             break
#         else:
#             print("Invalid selection. The program could not continue.")
#             break


# main()

# def myFun():
#     baseSalary = 2450
#     myDict = {'Ellen Hank': [100.00, 85.00, 93.61],
#               'Markus Smith': [83, 95.12, 91.30],
#               'Joseph Depp': [83.45, 77.20, 79.88],
#               'Roger Leo': [96, 90.10, 92.80]
#               }
#     maxAverage = 0
#     name = ""
#     total=0
#     for ele in myDict:
#         averageCommission = round(sum(myDict[ele])/3,2)
#         total+=averageCommission
#         print("Name: ", ele)
#         print("Total commission: ", round(averageCommission*3,2))
#         print("Average commission: ", averageCommission,"\n")
#         if averageCommission > maxAverage:
#             name = ele
#             maxAverage = averageCommission
#     print("Whole group's average commission: ",round(total/len(myDict),2),"\n")
#     netSalary = baseSalary+sum(myDict[name])+(baseSalary/100)*12.50
#     print(name, "got the bonus.")
#     print(f"{name}'s net salary: ", netSalary)

# myFun()

# def myFun(string):
#     myDict = {"Red": 0, "Green": 0, "Blue": 0}
#     for ele in string:
#         if ele == "R":
#             myDict['Red'] += 1
#         elif ele == "G":
#             myDict['Green'] += 1
#         else:
#             myDict['Blue'] += 1
#     myTup=()
#     for ele in myDict:
#         if myDict[ele] != 0:
#             myTup += (ele, myDict[ele]),
#     return myTup


# print(myFun("RGBRRGBBR"))

# schools = {
#     "Alabama": {
#         "UNA": {
#             "name": "University of North Alabama",
#             "mascot": "Leo III"
#         },
#         "USA": {
#             "name": "University of South Alabama",
#             "mascot": "South Paw"
#         }
#     },
#     "Illinois": {
#         "UIUC": {
#             "name": "University of Illinois Urbana-Champaign",
#             "mascot": "Belted Kingfisher"
#         },
#         "UIC": {
#             "name": "University of Illinois Chicago",
#             "mascot": "Sparky"
#         }
#     }
# }
# count=0
# for ele in schools:
#     for item in schools[ele]:
#         count+=1
#         print(schools[ele][item]['mascot'])
# print(count)
# import numpy as np
# Target2=np.random.normal(1,2.5,np.quantile.shape)
# print(Target2)

# def removeDuplicates(list1)


# class LList:
#     def removeDuplicates(self,list1):
#         list1=list(set(list1))
#         return list1
# obj=LList()
# list1=obj.removeDuplicates([1,2,3,4,3,2,1])
# print(list1)

# def myFun(string):
#     if string[0] in "ABCDEFGHIJKLMN":
#         return "Committee 1"
#     else:
#         return "Committee 2"
# print(myFun("Hello"))
# print(myFun("Poll"))


# def fun(num):
#     for i in range(num):
#         expression=10**i
#         print(expression)
# fun(10)

# num1=int(input())
# num2=int(input())
# i=0
# while True:
#     if (i!=num1 and i!=num2):
#         print(i)
#         break
#     i+=1


# from collections import defaultdict
# class Graph:
#     def __init__(self, vertices):
#         self.V = vertices
#         self.graph = defaultdict(list)

#     def addNewEdge(self, u, v):
#         self.graph[u].append(v)

#     def isPathExist(self, s, d):
#         visited = [False]*(self.V)

#         queue = []
#         queue.append(s)
#         visited[s] = True

#         while queue:
#             n = queue.pop(0)
#             if n == d:
#                 return True
#             for i in self.graph[n]:
#                 if visited[i] == False:
#                     queue.append(i)
#                     visited[i] = True
#         return False


# # Create a graph given in the above diagram
# g = Graph(4)
# g.addNewEdge(0, 1)
# g.addNewEdge(0, 2)
# g.addNewEdge(1, 2)
# g.addNewEdge(2, 0)
# g.addNewEdge(2, 3)
# g.addNewEdge(3, 3)

# u = 1
# v = 3

# if g.isPathExist(u, v):
#     print("Path exist.")
# else:
#     print("Path doesn't exist.")
# from requests import head


# def insertMystery(self,data):
#     newNode=Node(data)
#     tempNode=head # head of linked list.

#     # loop to find the last node.
#     while (tempNode.next!=None):
#         tempNode=tempNode.next
#     tempNode.next=newNode

# import numpy as nd
# print("Hello world.")


# list1=[1,2,3]
# list2=[4,5,6,7,8]
# list3=[]
# while len(list1)!=0 and len(list2)!=0:
#     list3.append(list1.pop(0))
#     list3.append(list2.pop(0))
# while (len(list1)!=0):
#     list3.append(list1.pop(0))
# while len(list2)!=0:
#     list3.append(list2.pop())
# print(list3)


# from django.forms import MultiValueField


# def findFibo(n):
#     pass
# def myFun(m,n):
#     result=[]
#     a=0
#     b=1
#     while True:
#         next=a+b
#         print(next)
#         if next>m and next<n:
#             result.append(next)
#         elif next>n:
#             break
#         b=next
#         a=b
#     return result
# print(myFun(3,5))


# def recur_fibo(n):
#     if n <= 1:
#         return n
#     else:
#         return(recur_fibo(n-1) + recur_fibo(n-2))

# def myFun(m, n):
#     i = 0
#     result = []
#     while True:
#         data = recur_fibo(i)
#         if data <= n:
#             if data >= m:
#                 result.append(data)
#         elif data > n:
#             break
#         i += 1
#     return result

# print(myFun(2, 20))

# def myFun(m=None,n=None):
#     while True:
#         num=int(input("Enter a number: "))
#         if m==None or n==None:
#             m,n=0,m
#             if m<=num<=num:
#                 print("Valid number")
#         elif m==None and n==None:

# def myFun(m=None, n=None):
#     print("************************")
#     while True:
#         num = int(input("Enter a number: "))
#         if m != None and n != None:
#             if m < num < n:
#                 print("Valid input.")
#                 break
#             else:
#                 print("Invalid input.")
#         elif m == None and n == None:
#             m = 2**63-1
#             if num < m:
#                 print("Valid input")
#                 break
#             else:
#                 print("Invalid input")
#         elif m == None or n == None:
#             n = m
#             m = 0
#             if m <= num <= n:
#                 print("Valid number")
#                 break
#             else:
#                 print("Invalid input")


# myFun(5, 10)
# myFun(10)
# myFun()

# def putNext(age):
#     nextYear=age+1
#     print("Age : ",age)
#     print("Age next year: ",nextYear)
# def addTwo(one,two):
#     Sum=one+two
#     print(f"{one} + {two} = {Sum}")
# def main():
#     putNext(20)
#     putNext(100)
#     addTwo(20,5)
#     a=int(input("\nEnter a: "))
#     b=int(input("Enter b: "))
#     addTwo(a,b)
# main()

# import csv
# file = open('jack.csv', 'r')
# reader = csv.reader(file)
# items = []
# for row in reader:
#     items.append(row)
# myDict = {}
# for i in range(1, len(items)):
#     name = items[i][0]
#     if name in myDict:
#         if myDict[name] < int(items[i][1]):
#             myDict[name] = int(items[i][1])
#     else:
#         myDict[name] = int(items[i][1])


# for ele in myDict:
#     print(f"{ele} : {myDict[ele]}")


# n=int(input("Enter a number: "))
# count=0
# for i in range(n):
#     for j in range(4,2*n+1):
#         count+=1
#         # print(i,j)
# print(count,n*n)


# class NewInt():
#     def __init__(self,num=1):
#         self.num=num
#         print("NewInt value :",self.num)
#     def __str__(self) -> str:
#         return f"This is a NewInt object with the value : {self.num}"
#     def __add__(self,other):
#         result=self.num-other.num
#         print(result)
#     def __sub__(self,other):
#         result=self.num+other.num
#         print(result)
# a=NewInt()
# print(a)
# b=NewInt(5)
# b-a
# b+a


# from logging import exception


# class Car:
#     def __init__(self,gas,mpg):
#         self.gas=gas
#         self.mpg=mpg
#     def __str__(self):
#         return f"A car with {float(self.mpg)} mpg"
#     def travel(self,num):
#         fuel_require=num/self.mpg
#         if fuel_require<self.gas:
#             self.gas-=fuel_require
#             print(f"Gas remaining: {self.gas:.2f} gallons")
#         else:
#             raise Exception("No enough gas")

# car1=Car(15,17)
# print(car1)
# car1.travel(150)
# car1.travel(120)

# def decRadius(num):
#     return num**2*3.14159

# result=decRadius(7)
# print(result)

# def rightAngleTriangle(num1,num2,num3):
#     list1=[num1,num2,num3]
#     list1.sort()
#     side1=list1[0]
#     side2=list1[1]
#     side3=list1[2]
#     if (side3**2==(side1**2+side2**2)):
#         return True
#     else:
#         return False

# print(rightAngleTriangle(3,4,5))
# print(rightAngleTriangle(3,4,6))


# def makeCube(num):
#     result=num**(1/3)
#     return int(result)

# def myFun(side1,side2,side3):
#     cube_volume=[]
#     cubic_volume=side1*side2*side3
#     while cubic_volume!=0:
#         res=makeCube(cubic_volume)
#         volume=res**3
#         cubic_volume-=volume
#         cube_volume.append(volume)
#     return cube_volume

# result=myFun(12,24,30)
# print("Total cube formed :",result)

# set1=set(result)
# minimum_number=0
# for ele in set1:
#     if result.count(ele)>minimum_number:
#         minimum_number=result.count(ele)
# print("Minimum number of identical cube: ",minimum_number)


# num=int(input("Enter number: "))
# top=(num//2)
# print(top)
# print("* "*(top+1))
# for i in range(1,top):
#     print(f"{i*' '}*")
# print(f"{(top)*' '}*")
# for i in range(top-1,0,-1):
#     print(f"{i*' '}*")

# print("* "*(top+1))


# def add(c, k):
#     c. test = c. test + 1
#     k = k + 1
# class Plus:
#     def __init_(self):
#         self.test = 0

# def main():
#     p = Plus()
#     index = 0
#     for i in range(0, 25):
#         add(p, index)
#         print("p.test=", p.test)
#         print("index=", index)

# main()

# print('The {} side {1} {2}'.format('bright', 'of', 'life'))

# t = '%(a)s %(b)s %(c)s'
# print(t % dict(a='Welcome', b='to', c='Supercoder'))

# alphabets = 'abcd"

# for i in range (len(alphabets)):
#     alphabets[i].upper()
# print(alphabets)

# array1 = [1, 2, 3, 4, 5]
# array2 = array1
# array2[@] = 0
# print(array1)

# class Developer(object):
#     def _init__(self, skills):
#         self.skills = skills

# def add_(self, other):
#     skills = self.skills + other.skills
#     return Developer (skills)

# def str_(self):
#     return "Skills"

# A = Developer ('NodeJS')

# B = Developer('Python')
# print(A + B)

# 1=[1, 2, 3, 4, 5]
# m = map(lambda x: 2**x, 1)
# print(list(m))

# l1 = [1, 2, 3, 4]


# l2 = [5, 6, 7]
# result=l1+l2
# print(result)

# print("Welcome to Supercoder".capitalize())

# print(2**(3**2), (2**3)**2, (2**3)**3)

# print([i.lower() for i in "Supercoder"])


# def listSkills(val, list=[]):
#     list.append(val)
#     return list

# list1 = listSkills ('NodeJS')
# list2 = listSkills ('Java', [])
# list3 = listSkills ('ReactJS')
# print("%s" % list1)
# print("%s" % list2)
# print("%s" % list3)


# array = ['Welcome', 'To', 'Supercoder']
# print("-".join(array))

# x=['ab','cd']
# print(list(map(len,x)))


# a = [1, 2, 3, 4]
# b = [sum(a[0:x+1]) for x in range(0, len(a))]
# print(b)


# import re

# result = re.findall('Welcome to Supercoder', 'Welcome', 1)

# print (result)


# def f(x, l=[]):
#     for i in range(x):
#         l.append(i * i)
#     print(l)

# f(2)
# f(3, [3, 2, 1])
# f(3)


# x = "abcdef"
# i = "a"
# while i in x[:-1]:
#     print(i, end=" ")

# def myFun():
#     # This data is given in the question.
#     baseSalary = 2450
#     myDict = {'Ellen Hank': [100.00, 85.00, 93.61],
#               'Markus Smith': [83, 95.12, 91.30],
#               'Joseph Depp': [83.45, 77.20, 79.88],
#               'Roger Leo': [96, 90.10, 92.80]
#               }
#     # let maxAverage is 0.
#     maxAverage = 0

#     # Initially name is empty.
#     name = ""

#     # let total is 0.
#     total = 0 # Total commisionAverage

#     # Start iterating dictionary
#     for ele in myDict:

#         # Here ele(name) will be the key of dictionary.
#         # myDict[ele] this will return the list of marks of that name.
#         # myDict[ele]/3 . sum of all elements of list is divided by 3, because there are three elements in the list and we have to find the average.
#         averageCommission = round(sum(myDict[ele])/3, 2)

#         # add averageCommision to total
#         total += averageCommission

#         # printing the name.
#         print("Name: ", ele)

#         # printing the total commision. It is sum of all commission.
#         print("Total commission: ", round(averageCommission*3, 2))

#         # printing average commission. It is calculated above.
#         print("Average commission: ", averageCommission, "\n")

#         # check averageCommission is greater than the maxAverage or not.
#         if averageCommission > maxAverage:
#             name = ele # update the name having maximum averageCommission.
#             maxAverage = averageCommission # update the maxAverage with averageCommission.

#     # printing the whole group average commission.
#     print("Whole group's average commission: ",
#           round(total/len(myDict), 2), "\n")

#     # calculating net salary.
#     netSalary = baseSalary+sum(myDict[name])+(baseSalary/100)*12.50

#     # print the name.
#     print(name, "got the bonus.")

#     # print the net salary.
#     print(f"{name}'s net salary: ", netSalary)


# myFun()


# def myFun():
#     str1=input("Enter a first set of characters: ")
#     str2=input("Rearrange the string and add new character: ")
#     set1=set(str1)
#     set2=set(str2)
#     result=set2-set1
#     if len(result)==1:
#         print(list(result)[0])
#     else:
#         print("Invalid Strings")

# myFun();

# def map(array,method):
#     result=[]
#     for element in array:
#         value=method(element)
#         result.append(value)

# from os import remove


# def myFun(items):
#     i=0
#     while i<len(items):
#         if len(items[i])==0:
#             remove(items[i])
#             i+=1

# names=['Rachel'," ","Meghana","","","Tim"]
# myFun(names)


# class Person:
#     def __init__(self,name):
#         self.name=name

# class Account:
#     def __init__(self,pay):
#         self.pay=pay

# class Admin:
#     def __init__(self,code):
#         self.code=code

# class Master(Person,Account,Admin):
#     def __init__(self,name,pay,code,experience):
#         Person.__init__(self,name)
#         Account.__init__(self,pay)
#         Admin.__init__(self,code)
#         self.experience=experience

#     def __str__(self):
#         result=f"NAME : {self.name}\nCODE : {self.code}\nPAY : {self.pay}\nEXPERIENCE : {self.experience} YRS"
#         return result

# obj1=Master("John",101,25000,10)
# print(obj1,"\n")

# obj2=Master("NITIN",102,18500,6)
# print(obj2)


# class MyC:
#     def  fun1(a,b):
#         print(a," ",b)
#     def __fun2(a=0,b=0,c=0):
#         pass
#     def __fun3(**a):
#         print(a)
#     def __fun(*b):
#         print(b)

# obj=MyC()
# obj.fun1(3,4)
# obj.__fun2()
# obj._fun3()
# obj._fun4()


# Python program to
# demonstrate private methods

# Creating a Base class
# class Base:

# 	# Declaring public method
# 	def fun(self):
# 		print("Public method")

# 	# Declaring private method
# 	def __fun(self):
# 		print("Private method")


# # Driver code
# obj1 = Base()

# # Calling public method
# obj1.fun()


# def myFun(p_c,N):
#     print("myFun is called.")
#     if N>=20:
#         child_born=p_c[0]//5
#         p_c[0]+=p_c[1]
#         p_c[1]=child_born
#     return p_c
# initial_population=100
# initial_child=0
# def population(N):
#     # result=myFun([initial_population,initial_child],N)
#     result=[]
#     if N<20:
#         return result
#     else:
#         result=
#         return population(N-20)

# print(population(20))

# myNum=1
# def myFun(n):

#     if n>100:
#         print("Returning the value.")
#         return myNum
#     else:
#         print("Recursive part")
#         print(myNum)
#         myNum+=n
#         myFun(n*2)
# print(myFun(20))

# def recursiveFun(list1,N):
#     if N<20:
#         return (list1[0],list1[1])
#     else:
#         child=list1[0]//5
#         list1[0]+=list1[1]
#         list1[1]=child
#         return recursiveFun(list1,N-20)

# def population(N):
#     initial_population=100
#     initial_child=0
#     list1=[initial_population,initial_child]
#     return recursiveFun(list1,N)

# print(population(20))
# print(population(40))
# print(population(50))
# print(population(60))


# class bank:
#     accountDict = {}

#     @classmethod
#     def add(cls, name, id, balance):
#         if id in cls.accountDict:
#             print("Account found so increased the balance")
#             cls.accountDict[id][1] += balance
#         else:
#             print("Account created")
#             cls.accountDict[id] = [name, float(balance)]

#     @classmethod
#     def find(cls, name):
#         for ele in cls.accountDict:
#             if cls.accountDict[ele][0] == name:
#                 print(cls.accountDict[ele][0], ele, cls.accountDict[ele][1])

#     @classmethod
#     def deleteAcc(cls, id):
#         if id in cls.accountDict:
#             del(cls.accountDict[id])
#         else:
#             print("Account not found")

#     @classmethod
#     def withdraw(cls, id, amount):
#         for ele in cls.accountDict:
#             if ele == id:
#                 balance = cls.accountDict[ele][1]
#                 if balance < amount:
#                     print("No enough balance")
#                 else:
#                     print("Money withdrawn")
#                     cls.accountDict[ele][1] -= amount

#     @classmethod
#     def display(cls):
#         if len(cls.accountDict) == 0:
#             print("No account available")
#         else:
#             print("DISPLAY")
#             for ele in cls.accountDict:
#                 print(
#                     f"{cls.accountDict[ele][0]} {ele} {cls.accountDict[ele][1]}")


# bank.display()

# bank.add("James", 101, 5000)
# bank.add("James", 102, 8000)
# bank.add("Lily", 103, 9000)

# bank.display()

# bank.add("James", 101, 200)
# bank.find("James")
# bank.withdraw(101, 1200)
# bank.withdraw(101, 5000)
# bank.display()

# bank.deleteAcc(102)

# bank.deleteAcc(102)

# bank.display()



# class Invoice:
#     def __init__(self,date,amount,paid):
#         print("Object created.")
#         self.date=date
#         self.amount=amount
#         self.paid=paid
    
#     def __str__(self):
#         return f"{self.date}\n{self.amount}\n{self.paid}"

# def processTextFile():
#     file=open("invoice.txt",'r')
#     file=file.readlines()
#     totalInvoice=int(file.pop(0).strip())
#     i=1
#     while (i<3*totalInvoice):
#         date=file.pop(0).strip()
#         amount=file.pop(0).strip()
#         paid=file.pop(0).strip()
#         obj=Invoice(date,amount,paid)
#         print(obj)
#         i+=3
# processTextFile()


# def home(request):
#     if request.user.is_authenticated:
#         customer = request.user.customer
#         order, created = Order.objects.get_or_create(customer=customer, complete=False)
#         items = order.orderitem_set.all()

# cartItems = order.get_cart_items

# else:

# items = []

# order = {'get_cart_total':0, 'get_cart_items':0}

# cartItems = order['get_cart_items']

# products = Product.objects.all()

# context = {'products':products, 'cartItems':cartItems}

# return render(request, 'home/home.html', context)


# class Solution:
#     # @param A : integer
#     # @param B : integer
#      # @return an long
#     def solve(self, A, B):
#         i=2
#         while (i<=B):
#             if (A%2==0):
#                 A=A/2
#                 print(int(A))
#             else:
#                 A=(3*A+1)
#                 print(int(A))
#             i+=1
#         return int(A)
                
                
# obj=Solution()
# result=obj.solve(1,3)
# print(result)


# def pairup(a,b):
#     result=[None]*len(a)
#     for i in range(len(a)):
#         result[i]=(a[i],b[i])
#     return result


# # Elements of list is seperated by comma (not separated by semicolon).
# a=[1,2,3]  #list1
# b=["a","b","c"]   #list2
# print(pairup(a,b))

# def years_to_goal()

# num=int(input("Enter a number: "))
# if (num&1==0):
#     print("This is even number")
# elif (num&1==1):
#     print("THis is odd number.")


num1=int(input("ENter firts number: "))
num2=int(input("ENter second number: "))
print(num1,num2)
num1=num1^num2
num2=num2^num1
num1=num1^num2
print(num1,num2)
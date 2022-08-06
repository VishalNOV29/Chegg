# x=int(input("Enter a number:"))
# a=0
# b=1
# print(a)
# print(b)
# res=None
# S=0
# l=[0,1]
# while True:
#     res=a+b
#     a=b
#     b=res
#     if res>x:
#         break
#     else:
#         print(res)
#         l.append(res)
# print(l)

# name="visjhal"
# name.replace("","v")
# print(name)

# def muFun(arr1,arr2,m,n):
#     arr1=arr1[:m]
#     arr1+=arr2
#     arr1.sort()
#     return arr1
# arr1=[1,2,3,0,0,0]
# arr2=[4,5,6]
# print(muFun(arr1,arr2,3,3))

# import numpy as np
# list1=[[1,2],[3,4]]
# r=int(input("Enter the value of r: "))
# c=int(input("Enter the value of c: "))
# arr=np.array(list1)
# print(arr)
# print(len(arr))
# if r*c==len(arr)*len(arr[0]):
#     print("Condition satisfied.")
#     arr=arr.reshape(r,c)
#     print(arr)
# else:
#     print("Condition not satisifed.")
#     print(list1)
# from os import remove


# s=input("Enter S: ")
# p=input("Enter P: ")
# list1=[p]
# result=[]
# str_list=list(p)
# for i in range(len(p)-1):
#     str_list.append(str_list.pop(0))
#     new_str="".join(str_list)
#     list1.append(new_str)
# print(list1)
# for ele in list1:
#     print(ele)
#     if ele in s:
#         result.append(s.index(ele[0]))
# print(result)
# num=int(input("Enter the number: "))
# num_list=list(str(num))
# print(num_list)
# while len(num_list)!=1:
#     num_sum=0
#     for ele in num_list:
#         print(ele)
#         num_sum+=int(ele)
#     num_list=list(str(sum))
# print(num_list)
# def myFun(num):
#     if len(str(num))==1:
#         return num
#     else:
#         numSum=0
#         while num!=0:
#             numSum+=num%10
#             num=num//10
#         return myFun(numSum)
# print(myFun(38))
# print(3//10)
# print(ord('a')-96)
# print(type(ord('a')))
# from hashlib import new
# from itertools import count
# from re import I


# arr=[1,2,3,4,5,6,7]
# count=0
# k=5
# result=[]
# for i in range(len(arr)):
#     Sum=0
#     for j in range(i,len(arr)):
#         Sum+=arr[j]
#         if Sum==k:
#             result.append([i,j])
#             count+=1
#         if Sum>k:
#             Sum=0
#             break
# print(result)
# print(count)

# input two matrices of size n x m
# matrix1 = [[12,7,3],
# 		[4 ,5,6]]
# matrix2 = [[5,8,1],
# 		[6,7,3],
# 		[4,5,9]]

# res = [[0 for x in range(3)] for y in range(3)]

# # explicit for loops
# for i in range(len(matrix1)):
# 	for j in range(len(matrix2[0])):
# 		for k in range(len(matrix2)):

# 			# resulted matrix
# 			res[i][j] += matrix1[i][k] * matrix2[k][j]

# print (res)


# arr=[3,2,4,1]
# arr=[1,2,3,4]
# result=[[]]
# for i in range(len(arr)):
#     result.append([arr[i]])
#     for j in range(i+1,len(arr)):
#         # result.append([arr[i]])
#         result.append([arr[i],arr[j]])
#         result.append(arr[i:])
# # print(result)
# for i in range(len(arr)):
#     for j in range(i+1,len(arr)+1):
#         result.append(arr[i:j])
# new=[]
# for ele in result:
#     if ele not in new:
#         new.append(ele)
# print(result)
# print(new)
# result=set(result)

# print(list(set(result)))
# print(result)

# str1="cbaebabacd"
# str2='abc'
# result=[]
# for i in range(len(str1)):
#     if str1[i] in str2:
#         newList=list(str2)
#         for j in range(i,len(str1)):
#             if str1[j] in newList:
#                 newList.remove(str1[j])
#         if len(newList)==0:
#             result.append(i)
# print(result)


# class person:
#     country="India"
#     def takebreath(self):
#         print("I am breathig...")
# obj=person()
# obj.takebreath()
# class employee(person):
#     company = "Google"

#     def takebreath(self):
#         print("I am an employee so I am luckily breathing....!")

#     def getsalry(self):
#         print(f"The salry of the employee is {self.salary}")
# obj2=employee()
# obj2.takebreath()
# class programmer(employee):
#     company = "Google"

#     def getsalry(self):
#         print("no salary is given to programmer")

#     def takebreath(self):
#         print("I am a programmr so I am breathing.++...!")
# obj3=programmer()
# obj3.takebreath()

# p=person()
# p.takebreath()
# e=employee()
# e.takebreath()

# p=person
# p.takebreath()
# e=employee
# e.takebreath()
# pr=programmer
# pr.takebreath()


# num = "1432219", k = 3
# name="vishalsingh"
# name=name.replace("i","I")
# print(name)
# name="Vishalsingh"
# print(name)

# def find(n):
#     numStr=""
#     i=1
#     while True:
#         numStr+=str(i)
#         print("Entering in the  loop.")
#         i+=1
#         print(len(numStr))
#         if len(numStr)==n:
#             break
#     print(numStr)
#     return numStr[n-1]
# print(find(10))

# def check(n):
#     numStr=""
#     i=1
#     while True:
#         numStr+=str(i)
#         print(numStr)
#         if len(numStr)==n:
#             print("Condition satisfied.")
#             break
#         i+=1
#     return numStr
# print(check(10))

# class Solution:
#     def findNthDigit(self, n: int) -> int:
#         numStr=""
#         i=1
#         while len(numStr)!=n:
#             numStr+=str(i)
#             i+=1
#         print(numStr)
#         return numStr[n-1]
# obj=Solution()
# obj.findNthDigit(10)

# def check(n):
#     list1=[str(ele) for ele in range(1,n+1)]
#     list_str="".join(list1)
#     print(list_str)
#     return list_str[n-1]

# print(check(10))
# nums=[1,2,3,4]
# nums.reverse()
# print(nums)

# n=int(input("Enter the number: "))
# ans=[]
# for i in range(n+1):
#     binary=bin(i)
#     total=binary.count("1")
#     ans.append(total)
# print(ans)

# n=int(input("Enter the number: "))
# def myFun(n):
#     total=0
#     if n==1:
#         return 1
#     else:
#         while n!=0:
#             if n%10==1:
#                 total+=1
#             n=n//10
#         return myFun(n-1)
# print(myFun(10))

# name1=input("Enter first string: ")
# name2=input("Enter second string: ")
# list_s=list(name1)
# list_t=list(name2)
# while list_t and list_s:
#     if list_t[0]==list_s[0]:
#         list_t.pop(0)
#         list_s.pop(0)
#     else:
#         list_t.pop(0)
# if len(list_s)==0:
#     print("True")
# else:
#     print("False")

# arr=[23,29,15,19,31,7,9,5,2]
# gap=len(arr)//2
# def shell_sort(arr,gap):
#     if gap<1:
#         return arr
#     else:
#         j=gap
#         while i<=gap and j<len(arr):


# def generateNumbers(num):
#     if num == 1:
#         return -5
#     else:
#         return generateNumbers(num-1)+2*(num*num)


# num = int(input("Enter a number: "))
# for i in range(2, num+1):
#     print(generateNumbers(i), end=" ")


# A=list(map(int,input("Enter array separated by comma: ").strip().split(",")))
# k=int(input("Enter the value of K: "))
# arr=set(A)
# def myFun(arr,k):
#     new_arr=set(arr)
#     result=[]
#     for ele in new_arr:
#         if arr.count(ele)>=k:
#             result.append(ele)
#     if result:
#         return result
#     return "None"
# print(myFun(A,k))


# def isValid(s):
#     stack = []
#     for ele in s:
#         if ele == "(" or ele == "{" or ele == "[":
#             stack.append(ele)
#         else:
#             if len(stack) == 0:
#                 return False
#             elif ele == ")":
#                 if stack[len(stack)-1] == "(":
#                     stack.pop()
#                 else:
#                     return False
#             elif ele == "]":
#                 if stack[len(stack)-1] == "[":
#                     stack.pop()
#                 else:
#                     return False
#             elif ele == "}":
#                 if stack[len(stack)-1] == "{":
#                     stack.pop()
#                 else:
#                     return False
#     if len(stack) == 0:
#         return True
#     else:
#         return False
# paran = input("Enter the expression: ")
# if isValid(paran):
#     print("Your expression is correct and balanced.")
# else:
#     print("Your expression is not correct. Unbalanced parentheses")


# num=int(input("Enter the  numebr: "))
# binary=""
# while (num>0):
#     digit=num%2
#     binary+=str(digit)
#     num=num//2
# print(binary[::-1])


# n_m=list(map(int,input("Enter n and m separated by space:").strip().split()))
# n=n_m[0]
# queries=[]
# for  i in range(n_m[1]):
#     temp=list(map(int,input("Enter queries separated by space: ").strip().split()))
#     queries.append(temp)
# arr=[0 for i in range(n)]
# for i in range(len(queries)):
#     for j in range(queries[i][0]-1,queries[i][1]):
#         print(j)
#         arr[j]+=queries[i][2]
#     print(arr)
# print(arr)
# print(max(arr))

# class Solution:
#     def checkRecord(self, s: str) -> bool:
#         print("Method is called.")
#         cons_late=0
#         print("current_late =",cons_late)
#         total_absent=0
#         print("total_absent =",total_absent)
#         for i in range(len(s)):

#             if s[i]=="L":
#                 print("L is found")
#                 cons_late+=1
#                 print("cons_late is increased. ",cons_late)
#             elif s[i]=="A":
#                 print("A is found.")
#                 total_absent+=1
#                 print("total_absent is increased.",total_absent)
#                 cons_late=0
#                 print("cons_late is zero.")
#             elif s[i]=="P":
#                 print("P is found.")
#                 cons_late=0
#                 print("cons_late is zero.",cons_late)
#             if cons_late>2:
#                 print("Condition1")
#                 return False
#             if total_absent>1:
#                 print("condition2")
#                 return False
#             print("total_absent =",total_absent)
#         return True
# obj=Solution()
# print(obj.checkRecord("PPALLL"))
# Passenger Name	Survival Status	Sex	Age	Boat Class
# Allen, Miss. Elisabeth Walton	yes	female	29	1st
# Allison, Master. Hudson Trevor	yes	male	0.9167	1st
# Allison, Miss. Helen Loraine	no	female	2	1st
# Allison, Mr. Hudson Joshua Crei	no	male	30	1st
# Allison, Mrs. Hudson J C (Bessi	no	female	25	1st
# Anderson, Mr. Harry	yes	male	48	1st
# Andrews, Miss. Kornelia Theodos	yes	female	63	1st
# Andrews, Mr. Thomas Jr	no	male	39	1st
# Appleton, Mrs. Edward Dale (Cha	yes	female	53	1st
# Artagaveytia, Mr. Ramon	no	male	71	1st
# Astor, Col. John Jacob	no	male	47	1st
# Astor, Mrs. John Jacob (Madelei	yes	female	18	1st
# Aubart, Mme. Leontine Pauline	yes	female	24	1st
# Barber, Miss. Ellen Nellie	yes	female	26	1st
# Barkworth, Mr. Algernon Henry W	yes	male	80	1st
# Baumann, Mr. John D	no	male	NA	1st
# Baxter, Mr. Quigg Edmond	no	male	24	1st
# Baxter, Mrs. James (Helene DeLa	yes	female	50	1st
# Bazzani, Miss. Albina	yes	female	32	1st
# Beattie, Mr. Thomson	no	male	36	1st
# Beckwith, Mr. Richard Leonard	yes	male	37	1st
# Beckwith, Mrs. Richard Leonard	yes	female	47	1st
# Behr, Mr. Karl Howell	yes	male	26	1st
# Bidois, Miss. Rosalie	yes	female	42	1st

# Shell sort in python


# def shellSort(array, h_gap):
#     interval=h_gap
#     for i in range(interval, len(array)):
#         temp = array[i]
#         j = i
#         while j >= interval and array[j - interval] > temp:
#             array[j] = array[j - interval]
#             j -= interval

#         array[j] = temp

# array = [-27, 9, 0, -4, 12, 17, -100, -8, 42, 6404, 4]
# shellSort(array, 9)
# print("New array:")
# print(array)
#
# print(1253//20)
# print(1253%20)
# n=int(input("Enter the value of n: "))
# arr=[1,0,0]
# def myFun(arr,n):
#     if arr[0]==0 and len(arr)==1:
#         print("Condition 1")
#         n-=1
#         arr[0]=1
#         return n==0
#     for i in range(n):
#         print("Entering the loop.")
#         print("i =",i)
#         if i==0 and arr[i]==0 and arr[i+1]==0 and n>0:
#             print("Condition 2")
#             n-=1
#             arr[i]=1
#         elif i==len(arr)-1 and arr[i]==0 and arr[i-1]==0 and n>0:
#             print("Condition 3")
#             arr[i]=1
#             n-=1
#         else:
#             if arr[i]==0 and arr[i+1]==0 and arr[i-1]==0:
#                 print("Condition 4")
#                 arr[i]=1
#                 n-=1
#         if n==0:
#             print(arr)
#             print(n)
#             return True
#     print("Outside of the loop.")
#     print(arr)
#     print(n)
#     return n==0

# print(myFun(arr,1))


# n=1
# arr=[0,1,0]
# def check(arr,n):
#     if len(arr)==1 and arr[0]==0:
#         print("Base case")
#         n-=1
#         return n==0
#     if len(arr)==2:
#         if arr[0]==0 and arr[1]==0:
#             n-=1
#             return n==0
#         else:
#             return n==0

#     for i in range(len(arr)):
#         ele=arr[i]
#         print("ele =",ele)
#         if n==0:
#             print("Inner case")
#             print(arr)
#             return True
#         elif i==0 and arr[i]==0 and arr[i+1]==0 and n>0:
#             print("Condition1")
#             n-=1
#             arr[i]=1
#         elif i==len(arr)-1 and arr[i]==0 and arr[i-1]==0 and n>0:
#             print("Condition2")
#             arr[i]=1
#             n-=1
#         elif arr[i]==0 and arr[i+1]==0 and arr[i-1]==0 and i!=len(arr)-1:
#             print("Condition 3")
#             n-=1
#             arr[i]=1
#     print(arr)
#     print(n)
#     return n==0

# print(check(arr,n))

# arr=[1,8,6,2,9,4,8,3,7]
# from matplotlib.cbook import maxdict


# arr = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
# res=[]
# for i in range(len(arr)):
#     count=1
#     for j in range(i+1,len(arr)):
#         res.append(count*min(arr[i],arr[j]))
#         count+=1
# print(res)
# print(max(res))
# arrLeft=[]
# maxLeft=arr[0]
# for i in range(len(arr)):
#     if arr[i]>maxLeft:
#         maxLeft=arr[i]
#         arrLeft.append(maxLeft)

#     else:
#         arrLeft.append(maxLeft)
# print(arrLeft)

# # arr=[1,2,3,4,5,6]
# arrRight=[]
# maxRight=arr[-1]
# print(maxRight)
# for i in range(len(arr)-1,-1,-1):
#     print("i =",arr[i])
#     if arr[i]>maxRight:
#         print("Condition matched.")
#         maxRight=arr[i]
#         # arrRight.append(maxRight)
#         arrRight.insert(0,maxRight)
#     else:
#         print("Condition not matched.")

#         # arrRight.append(maxRight)
#         arrRight.insert(0,maxRight)
# maxWater=0
# for i in range(len(arr)):
#     maxWater+=min(arrLeft[i],arrRight[i])-arr[i]
# print(maxWater)

# print(arrRight)


# student_num=int(input("Enter the number of students: "))
# marks_dict={}
# for i in range(student_num):
#     name=input("Enter name of the student:")
#     marks=int(input("Enter score: "))
#     marks_dict[marks]=name
# max_marks=0
# name=None
# for ele in marks_dict:
#     if ele>=max_marks:
#         max_marks=ele
#         name=marks_dict[ele]
# print("Max score =",max_marks)
# print("Name =",name)

# temp=int(input("Enter the temperature: "))
# if temp>=150:
#     print("Compound x is boiling.")
# else:
#     print("Compound x is not boiling.")

# class Point:
#     def __init__(self, x=0, y=0):
#         self.x = x
#         self.y = y

#     def __str__(self):
#         return "({0},{1})".format(self.x, self.y)

#     def __add__(self, other):
#         x = self.x + other.x
#         y = self.y + other.y
#         return Point(x, y)


# p1 = Point(1, 2)
# p2 = Point(2, 3)

# print(p1+p2)

# arr = [3.5, 3.6, 2.9, 4.0, 3.2, 3.1]
# i = 0
# while (i < len(arr)):
#     j = i
#     while (j < len(arr)):
#         if arr[i] > arr[j]:
#             x = arr[i]
#             arr[i] = arr[j]
#             arr[j] = x
#         j += 1
#     i += 1

# print(" Sorted arr:\n",arr)


# Program to find the even numbers in from 1 to N.

# N=int(input("Enter number: ")) # Taking input of last number.

# #  for loop to get all the numbers from 1 to N.
# for i in range(1,N+1):

#     # if condition- If a number is divisible by 2, then it is a even number.
#     if i%2==0:
#         print(i) # Printing the number.


# n = int(input("Enter a numeber: "))
# arr = [n]
# while n != 1:
#     if n % 2 == 0:
#         n = n//2
#     else:
#         n = n*3+1
#     arr.append(n)

# for i in range(len(arr)):
#     print(arr[i], end="\t")

#     # Condition for new line
#     if (i+1) % 10 == 0:
#         print("\n") # \n is used for new line.

# arr=[1,2,3,4,2,3]
# pre_arr=[]
# maxe=arr[len(arr)-1]
# for i in range(len(arr)-1,-1,-1):
#     if arr[i]>=maxe:
#         maxe=arr[i]
#         pre_arr.insert(0,maxe)
#     else:
#         pre_arr.insert(0,maxe)
# print(pre_arr)
# for i in range(len(arr)):
#     ele=arr[i]
#     check=0
#     for j in range(i+1,len(arr)):
#         if arr[j]>arr[i]:
#             print(arr[j])
#             check=1
#             break
#     if check==0:
#         print(-1)

# freq = []
# freq1 = []
# while True:
#     sen = input("Line: ")
#     if sen == "":
#         break
#     else:
#         words = sen.split(" ")
#         for i in range(len(words)-1):
#             freq.append((words[i]+" "+words[i+1]).lower())
# for ele in freq:
#     if ele not in freq1:
#         freq1.append(ele)

# for ele in freq1:
#     if freq.count(ele) > 1:
#         print(f"{ele}: {freq.count(ele)}")

# content_volume=0
# def containerVolume(content_volume):
#     print(f"Container C has a capacity of 1000 and a content volume of {content_volume}")
#     operation=input("operator: ")
#     if "+=" in operation:
#         volume_to_add=int(operation[2:])
#         volume_remaining=1000-content_volume
#         if volume_to_add>volume_remaining:
#             content_volume+=volume_remaining
#             print(content_volume)
#             return volume_remaining
#         else:
#             content_volume+=volume_to_add
#             print(content_volume)
#             return volume_to_add
#     elif "-=" in operation:
#         volume_to_remove=int(operation[2:])
#         if volume_to_remove<content_volume:
#             content_volume-=volume_to_remove
#             return volume_to_remove
#         elif volume_to_remove>content_volume:
#             total=content_volume
#             content_volume-=total
#             return total
# # print(containerVolume(200))
# containerVolume(200)
# # print(content_volume)


# def myFun(x,y):
#     if x==0:
#         return 0
#     if x%2==0 and x>0:
#         return 2*myFun(x/2,y)
#     if x%2!=0 and x>0:
#         return y+myFun(x-1,y)
# print(myFun(1,1))
# print(myFun(3,7))
# print(myFun(6,4))


# a. Creating a tuple and set.
# mySet = {10, 20, 35, 65, 7, 85, 95, 99, 65, 40}
# myTuple = (10, 20, 35, 65, 7, 85, 95, 99, 65, 40)

# # Creating a dictionary D.
# myDict = {"a": 120, "b": 1200, "c": 180, "d": 70, "e": 50}

# # b. Elements having value 65 in tuple.
# countTuple = 0
# for ele in myTuple:
#     if ele == 65:
#         countTuple += 1
# print("Element having value 65 =", countTuple)
# print()

# # c. Delete an item 35 from set.
# mySet.remove(35)
# print("Set items: ")
# for ele in mySet:
#     print(ele, end=" ")
# print()

# # d. Display the position of item 99 in tuple.
# for i in range(len(myTuple)):
#     if myTuple[i] == 99:
#         print("\nPosition of 99 =", i+1)
# print()

# # e. Display in a tabular format all keys for the dictionary.

# print("TABULAR FORMAT:\nKeys        Values")
# for ele in myDict:
#     print(f"{ele}           {myDict[ele]}")
# print()

# # f.
# for ele in myTuple:
#     if 0 <= ele <= 20:
#         print("Procurement cost")
#     elif 21 <= ele <= 60:
#         print("Transportation")
#     elif 61 <= ele <= 100:
#         print("Utilities")


# def validate_sudolu_board(board) -> bool:
#     for i in range(9):
#         vertical = [0]*9
#         horizontal = [0]*9

#         for j in range(9):
#             ### logic for column ###
#             if(board[i][j] != "."):
#                 if(vertical[int(board[i][j])-1] == 0):
#                     vertical[int(board[i][j])-1] = 1
#                 else:
#                     print("vertical :", i, j, int(board[i][j])-1, vertical)
#                     return False

#                     ### logic for row ###
#             if(board[j][i] != "."):
#                 if(horizontal[int(board[j][i])-1] == 0):
#                     horizontal[int(board[j][i])-1] = 1
#                 else:
#                     print("horizontal :", i, j, int(board[j][i])-1, horizontal)
#                     return False

#                 ######Logic for 3*3 matrix######
#             if(i % 3 == 0):
#                 if(j % 3 == 0):
#                     box = {}
#                 for k in range(3):
#                     if(board[i+k][j] != "."):
#                         if(board[i+k][j] in box):
#                             print("Box :", i, j, board[i][j], box)
#                             return False
#                         else:
#                             box[board[i+k][j]] = 1

#     return True


# board = [["5", "3", ".", ".", "7", ".", ".", ".", "."], ["6", ".", ".", "1", "9", "5", ".", ".", "."],
# [".", "9", "8", ".", ".", ".", ".", "6", "."], ["8", ".", ".", ".", "6", ".", ".", ".", "3"], ["4", ".", ".", "8",
#                                                                                                                                                                                                       ".", "3", ".", ".", "1"], ["7", ".", ".", ".", "2", ".", ".", ".", "6"], [".", "6", ".", ".", ".", ".", "2", "8", "."], [".", ".", ".", "4", "1", "9", ".", ".", "5"], [".", ".", ".", ".", "8", ".", ".", "7", "9"]]
# print(isValidSudoku(board))

# from itertools import count


# def myFun(num):
#     counter=0
#     while num!=1:
#         if num%2==0:
#             num=num//2
#         else:
#             num=num*3+1
#         counter+=1
#     return counter
# print("Stopping time =",myFun(20))


# class Complex():

#     def _init_(self, i, r):
#         self.real = r
#         self.imaginary = i

#     def _add_(self, c):
#         return Complex(self.real + c.real, self.imaginary + c.imaginary)

#     def _mul_(self, c):
#         mulReal = self.real*c.real - self.imaginary*c.imaginary
#         mulImg = self.real*c.imaginary + self.imaginary*c.real
#         return Complex(mulReal, mulImg)

#     def _str_(self):
#         return f"{self.real} + {self.imaginary}i"


# c1 = Complex(3, 2)
# c2 = Complex(1, 7)
# sum = c1 + c2
# print(sum)
# mul = c1 * c2
# print(mul)

# import random
# random_number = random.randint(1, 1000)
# print(random_number)
# user_guess = None
# while (user_guess != random_number):
#     user_guess = int(input("Enter your guess: "))
#     if user_guess == random_number:
#         print("Your guess right")
#     else:
#         print("Your guess wrong")

# import random
# random_number=random.randint(1,1000)
# print(random_number)
# user_guess=None
# gusses = 0
# while (user_guess != random_number):
#     user_guess = int(input("Enter your guess:"))
#     if user_guess == random_number:
#         print("Your guessed right")
#     else:
#         print("you guessed wrong")

# from numpy import array_split


# arr=[-1,2,1,-4]
# arr=sorted(arr)
# print(arr)
# target=1
# result=[]
# sum_closest=arr[0]+arr[1]+arr[2]
# for i in range(len(arr)):
#     print("Entering outer loop.")
#     temp=arr[i]
#     j=i+1
#     k=len(arr)-1
#     check=0
#     while j<k:
#         print("Entering inner loop.")
#         all_sum=abs(temp+arr[j]+arr[k])
#         new_arr=[arr[i],arr[j],arr[k]]
#         if all_sum==target:
#             sum_closest=all_sum
#             check=1
#             result.append(new_arr)
#             break
#         if all_sum<sum_closest:
#             sum_closest=all_sum
#             result.append(new_arr)
#         j+=1
#     if check==1:
#         break
#     i+=1
# print(sum_closest)
# print(result)

# f=open("vishal.txt",'w')
# f.write("My name is vishal kumar singh.")
# f.close()
# string=open('vishal.txt','r')
# print(string.read())
# f=open('vishal.txt','a')
# f.write("aaaaaaaaaaa")
# f.close()
# string=open('vishal.txt','r')
# print(string.read().upper())
# print(string.read())

# import random
# file_len=int(input("How many number the file will hold:"))
# count=1
# while count<=file_len:
#     num=random.randint(1,500)
#     f=open('random.txt','a')
#     f.write(str(num)+" ")
#     f.close()
#     count+=1
# file=open('random.txt','r')
# print(file.read())


# import InputModifier
# print(InputModifier.inputString("Enter a string: "))
# print(InputModifier.inputInt("Enter a interger value: "))
# print(InputModifier.inputFloat("Enter a float value: "))

# import requests
# url = "https://ajayakv-rest-countries-v1.p.rapidapi.com/rest/v1/all"
# headers = {
#     'x-rapidapi-host': "ajayakv-rest-countries-v1.p.rapidapi.com",
#     'x-rapidapi-key': "cJvLRNK0GfdM9WSMbQe3inU7REn8JVy5"
#     }
# response = requests.request("GET", url, headers=headers)
# print(response.text)
# import requests

# url = "https://ajayakv-rest-countries-v1.p.rapidapi.com/rest/v1/all"

# headers = {
# 	"X-RapidAPI-Host": "ajayakv-rest-countries-v1.p.rapidapi.com",
# 	"X-RapidAPI-Key": "f04dda996dmsha1dafa6a047250dp18fb1ejsn5b6f08bedee1"
# }

# response = requests.request("GET", url, headers=headers)

# print(response.text)
# print(4%10)
# number=int(input("Enter number of line to write: "))
# f=open("newtext.txt",'a')
# f.write("Hello visahl kuamr singh.")
# f.close()

# from msvcrt import open_osfhandle


# num=int(input("Enter number of line: "))
# f=open("newtext.txt",'a')
# for i in range(num):
# 	content=input("Enter your content: ")
# 	f.write(content)
# f.close()
# f=open('newtext.txt','r')
# f.read()
# f=open('newtext.txt','a')
# f.write("\nHello world")


# def Fibonacci(n):
#     if n==1:
#         return 1
#     if n==0:
#         return 1
#     if n<0:
#         return 0
#     return Fibonacci(n-1)+Fibonacci(n-1)
# print(Fibonacci(2))
# for i in range(9):
#     print(Fibonacci(i))

# arr=[1,2]
# i=0
# j=1
# k=len(arr)-1
# while (while )

# matrix = [
#     [1, 1, 1, 1, 0, 0],
#     [1, 1, 0, 0, 0, 0],
#     [1, 1, 1, 1, 1, 0],
#     [1, 1, 1, 0, 0, 0],
#     [1, 0, 0, 0, 0, 0],
#     [1, 1, 1, 1, 0, 0]
# ]
# max_count = 0
# for i in range(len(matrix)):
#     temp_count = 0
#     for j in range(len(matrix)):
#         if matrix[i][j] == 0:
#             break
#         temp_count += 1
#     if max_count < temp_count:
#         max_count = temp_count
# print("Max number of 1 :", max_count)

# 5. Upgrading mobile phone
# def jobCalculator():
#     location=input("Enter location: ")
#     salary=float(input("Enter salary: "))
#     if location=="London" and salary>50000:
#         print("ACCEPTED")
#     elif(salary>30000 and location!="London"):
#         print("ACCEPTED")
#     else:
#         print("REJECTED")

# jobCalculator()

# # 6.Upgrading mobile phone
# def upgradeMobilePhone():
#     name=input("Enter your name: ")
#     monthly_contract_cost=int(input("Enter monthly contract cost: "))
#     initial_cost=int(input("Enter initial cost: "))
#     print(f"Hello {name},\nTotal annual cost of your current handset : {monthly_contract_cost*12}")
#     monthly_cost=int(input("Enter monthly cost for second phone: "))
#     handset_price=int(input("Enter price for your second phone: "))

# def gradeCalculator():
#     ae1=int(input("Enter your first grade: "))
#     ae2=int(input("Enter your second grade: "))
#     print("Average grade :",(ae1+ae2)/2)
#     if (ae1>ae2):
#         print(f"AE1 has highest score by : {ae1-ae2}")
#     else:
#         print(f"AE2 has highest score by : {ae2-ae1} ")


# from curses.ascii import EM
# from textwrap import indent


# class Employee:
#     idNb=1000
#     def __init__(self,name,salary,servieClass):
#         self.name=None
#         self.salary=None
#         Employee.idNb+=1
#     def setName(self,name):
#         self.name=name
#     def getName(self):
#         return self.name
#     def setSalary(self,salary):
#         self.salary=salary
#     def getSalary(self):
#         return self.salary
#     def getId(self):


# array=[1,2,3,4,5,6,7,8]
# r=0
# for i in range(len(array)):
#     if array[i]%2!=0:
#         r+=1
# print("OddCount =",r)

# import math
# from optparse import check_choice
# from sre_compile import MAXCODE
# # print(math.log(100,10))
# a = None
# b = None
# var1=(1030301-a-b)/3*a*b
# exp1=3*math.log(var1,101)
# exp2=3-2*math.log(a*b,101)
# for a in range(100):
#     for b in range(100):
#         var1=(1030301-a-b)/3*a*b
#         exp1=3*math.log(var1,101)
#         exp2=3-2*math.log(a*b,101)
#         if exp1==exp2:
#             print(f"a = {a}, b = {b}")
#             break
# num=25
# count=0
# def fact(n):
#     if n==0:
#         return 1
#     else:
#         return n*fact(n-1)

# for i in range(num+1):
#     print(fact(i))

# for i in range(1,num+1):
#     count+=i//5
# print(count)

# num


# class A:
#     temp = 4

#     def __init__(self):
#         self.y = self.temp-1
#         self.sum = self.temp+1
#         A.temp = 2
#         self.methodA(3, 4)

#     def methodA(self, m, n):
#         x = 0
#         self.y = self.y+m+(self.temp)
#         A.temp += 1
#         x = x+1+n
#         self.sum = self.sum+x+self.y
#         print(x, self.y, self.sum)


# class B:
#     x = 0

#     def __init__(self, b=None):
#         self.y, self.temp, self.sum = 5, -5, 2
#         if b == None:
#             self.y = self.temp+3
#             self.sum = 3+self.temp+2
#             self.temp -= 2
#         else:
#             self.sum = b.sum
#             B.x = b.x
#             b.methodB(2, 3)

#     def methodA(self, m, n):
#         x = 2
#         self.y = self.y+m+(self.temp)
#         self.temp+=1
#         x=x+5+n
#         self.sum=self.sum+x+self.y
#         print(x,self.y,self.sum)
#     def methodB(self,m,n):
#         y=0
#         y=y+self.y
#         B.x=self.y+2+self.temp
#         self.methodA(self.x,y)
#         self.sum=self.x+y+self.sum
#         print(self.x,y,self.sum)

# a1=A()
# b1=B()
# b2=B(b1)
# b1.methodA(1,2)
# b2.methodB(3,2)


# # Function to read data from user:
# def readData():
#     '''
#     map(fun,list): map function take two parameter - 1. a function (int) and 2. a list
#     strip(): this function is used to remove succeeding and trailing space.
#     split(): this function take one parameter (a regex) and split the input from the matching regex.
#     '''
#     data_list = list(map(int, input("Enter numbers separated by comma: ").strip().split(',')))

#     return data_list

# # Function to shift the elements of the list:

# def shiftList(list1, n):
#     for i in range(n):
#         # In each iteration of the loop we try to find the last element of the list and remove it.After that insert it at 0 index of the list.
#         # pop() method removes the last element of the list.
#         last_element = list1.pop()

#         # inserting the last element the index 0.
#         list1.insert(0, last_element)
#     # repeat this process k times.

#     return list1  # return the resultant list

# # Main function:
# def main():

#     list1 = readData()  # calling first function to read data from user.

#     # asking user to input the value of k.
#     num = int(input("Enter a number: "))

#     print("List before shifting: ")
#     print(list1)

#     # calling the shiftList function. It shift the elements of the list k times and return that list.
#     shiftList(list1, num)

#     print("List after shifting: ")
#     print(list1)


# main()  # calling main function

# num=10111000
# for i in range()
# def checkPower(num):
#     print(num)
#     if num == 1:
#         return True
#     if num % 2 != 0:
#         return False
#     else:
#         return checkPower(num >> 1)
# print(checkPower(34))


# Array preprocessing from left to right.
# arr=[5,6,3,2,1]
# new_arr=[]
# max_ele=arr[0]
# for i in range(len(arr)):
#     temp_ele=arr[i]
#     if temp_ele>max_ele:
#         max_ele=temp_ele
#     arr[i]=max_ele
#     new_arr.append(max_ele)
# print(arr)
# print(new_arr)

# Array preprocessing from right to left;
# arr=[1,2,3,4,5,6,5,4]
# max_ele=arr[len(arr)-1]
# for i in range(len(arr)-1,-1,-1):
#     temp_ele=arr[i]
#     if max_ele<temp_ele:
#         max_ele=temp_ele
#     arr[i]=max_ele
# print(arr)

# ar=[1,2,3,400,500]
# print((2*ar[0]+2*ar[1])-(ar[len(ar)-2]/2+ar[len(ar)]/2))

# arr=[2,2,2,3]
# num=0
# for i in range(len(arr)):
#     num=num^arr[i]
# print(3^2)
# print(num)
# for i in range(len(arr)):
#     num=num^arr[i]
# print(num)

# def program_3(n):
#     L=[]
#     i=0
#     while 2**i<=n:
#         print("i =",i)
#         if n%2**i==0:
#             L.append(2**i)

#         i+=1
#     for i in range(len(L)):
#         for j in range(n):
#             L[i]==j
#     return L

# program_3(5)


# set1={4,5,6,7,8,9,10}
# set2={1,2,3,4,5,6}
# print("Union : ",set1.union(set2))
# print("Intersection :",set1.intersection(set2))
# print("Difference :",set2.difference(set1))
# print("Symmetric Difference :",set1.symmetric_difference(set2))


# list_with_duplicates=["dogs","cats","dogs","fish","cats","reptiles"]
# list_with_duplicates=set(list_with_duplicates)
# print(list(list_with_duplicates))

# def dispnth(arr, n):

#     # finding the element with the help of it's index.Tanking index n-1 because it starts from 0
#     ele = arr[n-1]
#     print(arr[n-1]) # Printing the element


# def delnth(arr, n):
#     # pop() function receives one parameter (index of any element) and remove the element of that index.
#     arr.pop(n-1)
#     print(arr)


# def remv(ele, arr):
#     count = 0 # initializing count to 0

#     # For loop to count the number of times ele appears in list.
#     for i in range(len(arr)):
#         if arr[i] == ele:
#             count += 1

#     # removing all the occurance of ele from list.
#     for i in range(count):
#         arr.remove(ele)
#     print(arr)


# arr = [1, [2, 3], 4, 5]
# dispnth(arr, 2)

# arr = [1, 2, [3, 4], 5]
# delnth(arr, 3)

# arr = ['a', 'b', 'a', 'c']
# remv('a', arr)

# class ItemToPurchase:
#     def __init__(self, name='none', price=0, quantity=0, description='none'):
#         self.item_name = name
#         self.item_descritption = description
#         self.item_price = price
#         self.item_quantity = quantity

#     def print_item_cost(self):
#         total = self.item_price*self.item_quantity
#         print("%s %d @ $%d = $%d" %
#               (self.item_name, self.item_quantity, self.item_price, total))

#     def print_item_description(self):
#         print("%s: %s" % (self.item_name, self.item_descritption))


# class ShoppingCart:
#     def __init__(self, customer_name='none', current_date='January 1, 2016', cart_items=[]):
#         self.customer_name = customer_name
#         self.current_date = current_date
#         self.cart_items = cart_items

#     def add_item(self, itemToPurchase):
#         self.cart_items.append(itemToPurchase)

#     def remove_item(self, itemName):
#         tremove_item = False
#         for item in self.cart_items:
#             if item.item_name == itemName:
#                 self.cart_items.remove(itemName)
#                 tremove_item = True
#                 break
#         if not tremove_item:
#             print("Item not found in cart. Nothing removed.")

#     def modify_item(self, itemToPurchase):
#         tmodify_item = False
#         for i in range(len(self.cart_items)):
#             if self.cart_items[i].item_name == itemToPurchase.item_name:
#                 tmodify_item = True
#                 self.cart_items[i].item_quantity = itemToPurchase.item_qunatity
#                 break

#         if not tmodify_item:
#             print("Item not found in cart. Nothing modified.")

#     def get_num_items_in_cart(self):
#         num_items = 0
#         for item in self.cart_items:
#             num_items = num_items+item.item_quantity
#         return num_items

#     def get_cost_of_cart(self):
#         total_cost = 0
#         cost = 0
#         for item in self.cart_items:
#             cost = (item.item_quantity*item.item_price)
#             total_cost += cost
#         return total_cost

#     def print_total(self):
#         print("{}\'s ShoppingCart-{}".format(self.customer_name, self.current_date))
#         print("Number of items: %d\n" % self.get_num_items_in_cart())
#         total_cost = self.get_cost_of_cart()
#         if total_cost == 0:
#             print("SHOPPING CART IS EMPTY")
#         else:
#             for item in self.cart_items:
#                 item.print_item_cost()
#                 print("\nToatl:$%d" % (total_cost))

#     def print_description(self):
#         if len(self.cart_items) == 0:
#             print("SHOPPING CART IS EMPTY")
#         else:
#             print("{}\s Shopping Cart - {}".format(self.customer_name, self.current_date))
#             print("\nItem Descriptions")
#             for item in self.cart_items:
#                 item.print_item_description()


# def print_menu(newCart):
#     print("This function is called.")
#     customer_Cart = newCart
#     menu = ('\nMENU\n'
#             'a - Add item to cart\n'
#             'r - Remove item from cart\n'
#             'c - Change item quantity\n'
#             "i - Output items' descriptions\n"
#             'o - Output shopping cart\n'
#             'q - Quit\n')
#     command = ""
#     while (command != 'q'):
#         print(menu)
#         command = input("Choose an option:\n")
#         while (command == 'a' or command == 'o' or command == 'i' or command == 'q' or command == 'r' or command == 'c'):
#             command = input("Choose an option:\n")
#             if (command == 'a'):
#                 print("\nADD ITEM TO CART")
#                 item_name = input("Enter the item name:\n")
#                 item_description = input("Enter the item description:\n")
#                 item_price = int(input("Enter the item price:\n"))
#                 item_quantity = int(input("Enter the item quantity:\n"))
#                 itemToPurchase = ItemToPurchase(
#                     item_name, item_price, item_quantity, item_description)
#                 customer_Cart.add_item(itemToPurchase)
#             elif (command == 'o'):
#                 print("OUTPUT SHOPPING CART")
#                 customer_Cart.print_total()
#             elif (command == 'i'):
#                 print("\nOUTPUT ITEMS\'DESCRIPTIONS")
#                 customer_Cart.print_description()
#             elif (command == 'r'):
#                 print("REMOVE ITEM FROM CART")
#                 item_name = input("Enter name of item to remove:\n")
#                 customer_Cart.remove_item(item_name)
#             elif (command == 'c'):
#                 print('\nCHANGE ITEM QUANTITY')
#                 itemName = input('Enter the item name:\n')
#                 qty = int(input('Enter the new quantity:\n'))
#                 itemToPurchase = ItemToPurchase(itemName, 0, qty)
#                 customer_Cart.modify_item(itemToPurchase)
#             else:
#                 break


# if __name__ == "__main__":
#     customer_name = input("Enter customer's name:\n")
#     current_date = input("Enter today's date:\n")
#     print("\nCustomer name: %s" % customer_name)
#     print("Today's date: %s" % current_date)
#     newCart = ShoppingCart(customer_name, current_date)
#     print_menu(newCart)


# performance = {'Ventriloquism': '9:00am',
#                 'Snake Cahrmer':'12:00pm',
#                 'Amazing Acrobatics':'2:00pm',
#                 'Encahnted Elephants':'5:00pm',
#                 'Bearded Lady':'6:00pm'}
# showtime=performance.get('Bearded Lady')
# if performance is None:
#     print("Performance doesn't exist")
# else:
#     print("The time of the Bearded Lady show is",showtime)


# def readFile():
#     file1=open('AlicelnWonderLand.txt','r')
#     content=file1.read()
#     print(content+"\n\n")
#     content=content[::-1]
#     file2=open('AliceWonderLand_REV.txt','w')
#     file2.write(content)
#     file2=open('AliceWonderLand_REV.txt','r')
#     print(file2.read())
#     file1.close()
#     file2.close()
# readFile()

# from curses import keyname


# def findPhoneFaveName(myDict):
#     number=input('\nEnter number: ')
#     key_list=list(myDict.keys())
#     value_list=list(myDict.values())
#     for i in range(len(value_list)):
#         if value_list[i]==number:
#             return key_list[i]
#     return "Number was not found"

# def printPhoneFaves(myDict):
#     key_list=list(myDict.keys())
#     key_list.sort()
#     print("\nPrinting name in sorted order:")
#     for ele in key_list:
#         print(f"{ele} : {myDict[ele]}")

# def searchPhoneFaves(myDict):
#     name=input("\nEnter text: ")
#     key_list=list(myDict.keys())
#     found=0
#     for ele in key_list:
#         if name in ele or name in  myDict[ele] :
#             print(f"{ele} : {myDict[ele]}")
#             found=1
#     if found==0:
#         print("No match found")


# myDict={'Vishal':'1234','Abhi':'4321'}
# val=findPhoneFaveName(myDict)
# print(val)

# printPhoneFaves(myDict)
# searchPhoneFaves(myDict)

# string=input("\nEnter string: ")
# sub_string=input("Enter substring: ")
# if sub_string in string:
#     count=string.count(sub_string)
#     print(f"\nsubstring occurs {count} times in string")
#     if string.index(sub_string)==0:
#         print("string starts with sub_string")
#     elif string.index(sub_string)==len(string)-len(sub_string):
#         print("string ends with sub_string")
# else:
#     print("String doesn't contain the substring.")

# word=input("Enter a word: ")
# file=open("wordSummary.txt",'w')
# length=len(word)
# countVowel=0
# countConso=0
# for ele in word:
#     if ele in "aeiouAEIOU":
#         countVowel+=1
#     else:
#         countConso+=1
# file.write(f"{length}, {countVowel}, {countConso}")
# file.close()


# def list_sum(arr):
#     result=[]
#     for ele in arr:
#         ele_sum=sum(ele)
#         result.append(ele_sum)
#     return result

# arr=[[1,3],[],[4,2,5]]
# print(list_sum(arr))


# s="vishal,singh hello world"
# res = [c.strip() for c in s.split(',') if not c.isspace()]
# print(res)

# name="vishal,kumar singh "
# name=name.title()
# print(name)
# i=0
# while i<len(name)-1:
#     if name[i]

# import re
# sentence = "We eat, Granny"
# result=re.findall(r'\s|,|[^,\s]+', sentence)
# # print(re.finda(r'\s|,|[^,\s]+', sentence))
# print(result)


# import nltk
# # nltk.download('punkt')
# sentence = "help, me."
# result=nltk.word_tokenize(sentence)
# print(result)

# Python3 code to demonstrate
# to extract words from string
# using regex() + string.punctuation
# import re
# import string

# # initializing string
# test_string = "Geeksforgeeks, is best @# Computer Science Portal.!!!"

# # printing original string
# print ("The original string is : " + test_string)

# # using regex() + string.punctuation
# # to extract words from string
# res = re.sub('['+string.punctuation+']', '', test_string).split()

# # printing result
# print ("The list of words is : " + str(res))

# import re

# i = 'Sandra went to the hallway.!!'
# l = re.split('(\W+?)', i)
# print(l)
# print(''.join(l))
# This course serves as an introductory programming course or mathematics majors. Basics programming techniques for solving probles typically encountered by mathematics will be developed. The course basic procedural techniques such as algorithm, variables, input/output, data types, selection, iteration, functions, and graphing. Good programming and commenting practices will be emphasized.

# import re
# def upper_sentence(user_input):
#     sentence=user_input.title()
#     word_list=re.split('(\W+?)', sentence)
#     for i in range(len(word_list)):
#         if word_list[i].isalpha():
#             ele=word_list[i]
#             ele_list=list(ele)
#             ele_list[-1]=ele_list[-1].upper()
#             ele=''.join(ele_list)
#             word_list[i]=ele
#     return ''.join(word_list)

# user_input=input("Enter text: ")
# print("\n",upper_sentence(user_input))

# from email import contentmanager
# from operator import sub
# from numpy import product


# def multiply_list(list1,list2):
#     new_list=[]
#     for i in range(len(list1)):
#         for j in range(len(list2)):
#             new_list.append(list1[i]*list2[j])
#     return new_list

# list1=[4,2,7]
# list2=[3,1,9,2]
# prod_list=multiply_list(list1,list2)

# # D. sum of prod_list.
# sum_list=sum(prod_list)
# print("sum =",sum_list)

# # E. number of times 4 occurs in prod_list
# number_of_4=prod_list.count(4)
# print("Number of occurrences of 4 is: ",number_of_4)

# # F. check if 73 occurs in prod_list or not.
# if 72 in prod_list:
#     print("True")
# else:
#     print("False")

# arr=[[1,2],[3,4]]

# def sub_coures_position(path):
#     # it is assumed that downward direction is positive and upward direction is negative.

#     dict={"horizontal":0,"depth":0} # initialize the position to 0.
#     file=open(path,'r')
#     file_content=file.readlines()
#     i=1
#     for ele in file_content:
#         temp_list=list(ele.strip().split())
#         direction=temp_list[0]
#         data=int(temp_list[1])
#         if direction=="up":
#             dict['depth']-=data # depth will decrease
#         elif direction=="down":
#             dict['depth']+=data # depth will increase
#         elif direction=="forward":
#             dict['horizontal']+=data

#     return dict

# result=sub_coures_position('sub-path-full.txt')
# print(result)

# Python code to
# demonstrate readlines()

# L = ["Geeks\n", "for\n", "Geeks\n"]

# writing to file
# file1 = open('myfile.txt', 'w')
# file1.writelines(L)
# file1.close()

# # Using readlines()
# file1 = open('sub-path-full', 'r')
# Lines = file1.readlines()

# count = 0
# # Strips the newline character
# for line in Lines:
# 	count += 1
# 	print("Line{}: {}".format(count, line.strip()))


# def sub_coures_position(path):
#     # it is assumed that downward direction is positive and upward direction is negative.

#     dict={"horizontal":0,"depth":0} # initialize the position to 0.
#     file=open(path,'r')
#     file_content=file.readlines()
#     for ele in file_content:
#         temp_list=list(ele.strip().split())
#         direction=temp_list[0]
#         data=int(temp_list[1])
#         if direction=="up":
#             dict['depth']-=data # depth will decrease
#         elif direction=="down":
#             dict['depth']+=data # depth will increase
#         elif direction=="forward":
#             dict['horizontal']+=data

#     return dict

# result=sub_coures_position('sub-path-full.txt')
# print(result)

# areaCode

# def myFun():
#     arr=list(map(int,input("Enter integers separated by space: ").strip().split()))
#     minInt=arr[0]-arr[1]
#     res=None
#     i=0
#     while i<len(arr)-1:
#         j=len(arr)
#         while (i+1<j):
#             new_arr=arr[i:j]
#             temp=max(new_arr)-min(new_arr)
#             if temp<minInt:
#                 minInt=temp
#             j-=1
#         i+=1
#     return minInt
# print(myFun())

# password=input("Etner your password of 6 length: ")
# for i in range(100000,1000000):
#     print(i)
#     if str(i)==password:
#         print(f"Password matched {password}")
#         break

# def swap(ele1,ele2):
#     ele1,ele2=ele2,ele1
#     return ele1,ele2
# a=10
# b=20
# print(swap(a,b)[0])
# print(a,b)
# from numpy import right_shift


# from turtle import right


# num=int(input("Enter a numebr: "))
# num_list=[]
# while num!=0:
#     rem=num%10
#     num_list.append(rem)
#     num=num//10
# num_list.reverse()

# even_list=[]
# odd_list=[]
# maxEle=num_list[-1]
# for i in range(len(num_list)-1,-1,-1):
#     ele=num_list[i]
#     if ele<maxEle:
#         print("Condition1")
#         print("maxEle =",maxEle)
#         right_list.insert(0,maxEle)
#     else:
#         maxEle=ele
#         print("Condition2")
#         right_list.insert(0,ele)
# print(right_list)

# for i in range(len(num_list)):
#     if num_list[i]%2 == right_list[i]%2:
#         if num_list[i]<right_list[i]:
#             num_list[i]=right_list[i]
# print(num_list)


# num=int(input("Enter a number: "))
# def checkPalindrome(num):
#     tempNum=num
#     newNum=0
#     while num!=0:
#         remainder=num%10
#         # newNum*=remainder
#         newNum=newNum*10+remainder
#         num=num//10
#     return newNum==tempNum

# print(checkPalindrome(num))

# sop=["5","2","C","D","+"]
# arr=[]
# for i in range(len(sop)):
#     if sop[i]=="C":
#         print("Condition1")
#         arr.pop()
#         print(arr)
#     elif sop[i]=="D":
#         print("Condition2")
#         arr.append(arr[len(arr)-1]*2)
#         print(arr)
#     elif sop[i]=="+":
#         print("Condition3")
#         arr.append(int(arr[len(arr)-1])+int(arr[len(arr)-2]))
#         print(arr)
#     else:
#         print("Condition4")
#         arr.append(int(sop[i]))
#         print(arr)
# print(arr)
# print(sum(arr))
# import random
# from shutil import unregister_archive_format

# from openpyxl import load_workbook


# def promptUser():
#     choiceArr = ["r", 's', 'p']
#     computer_choice = random.choice(choiceArr)
#     user_choice = input(
#         "Please choose rock (r/R), paper (p/P), scissors (s/S) or quit (q/Q) :")
#     user_choice=user_choice.lower()
#     return user_choice,computer_choice


# def decideWinner(userChoice, computerChoice):
#     promptDict={"r":"rock","p":"paper","s":"scissors"}
#     userChoice=userChoice.lower()
#     computerChoice=computerChoice.lower()
#     winner=None
#     print(f"The computer chose {promptDict[computerChoice]}. You chose {promptDict[userChoice]}")
#     if (userChoice.u=="r" and computerChoice=="p") or (userChoice=="r" and computerChoice=="s"):
#         winner="user"
#         print("You won!")
#     elif userChoice==computerChoice:
#         print("You drew!")
#     else :
#         winner = "computer"
#         print("You lost!")
#     return winner


# def updateStats(winner,score_dict):
#     score_dict[winner]+=1
#     score_dict["total"]+=1
#     return score_dict


# def outputSummary(score_dict):
#     user_win=score_dict['user']
#     computer_win=score_dict['computer']
#     total=score_dict['total']
#     lost=total-drew-user_win
#     drew=total-(user_win+computer_win)
#     average_win=0
#     average_drew=0
#     average-lost=0

#     try:
#         average_win=(total/user_win)*100
#         average_drew=(total/drew)*100
#         average_lost=()
#     except:
#         print("No data is avialble.")
#     print(f"Number won = {user_win} or {round(average_win,1)} %")
#     print(f"Number drew = {drew} or {round(average_drew,1)} %")
#     print(f"Number lost = {lost} or {round()}")


# def main():
#     score_dict={"user":0,"computer":0,"total":0}
#     while True:
#         user_choice=promptUser()[0]
#         computer_choice=promptUser()[1]
#         if user_choice=="  q" or user_choice=="Q":
#             outputSummary(score_dict)
#             pass
#         winner=decideWinner(user_choice,computer_choice)
#         user_status=updateStats(winner,score_dict)


# def Alice(s,n):
#     print("Method called.")
#     if (n==1):
#         return 0
#     m=0
#     print(s)
#     for i in range(1,n):
#         print(s,s[i],s[m])
#         if s[i]>s[m]:
#             m=i
#     n-=1
#     print("m =",m,"n =",n)
#     s_=s[0:m]+s[m+1:n]
#     return (n-m)+Alice(s_,n)
# print(Alice([1,2,3,4,1,2,3,4],7))


# from nbformat import current_nbformat


# class Book:
#     def __init__(self,isbn):
#         self.ISBN=isbn
#         self.next=None

# class Stack_Library:

#     def __init__(self):
#         self.top=None
#         self.cost=0
#     def push(self,isbn):
#         newBook=Book(isbn)
#         if self.top==None:
#             self.top=newBook
#         else:
#             newBook.next=self.top
#             self.top=newBook
#         self.cost+=1
#     def pop(self):
#         self.cost+=1
#         if (self.top==None):
#             return None
#         else:
#             currentBook=self.top
#             self.top=currentBook.next
#             return currentBook.ISBN

#     def _push(self,b):
#         b.next=self.top
#         self.top=b
#         self.cost+=1

#     def remove(self,i):
#         currentBook=self.top
#         while (currentBook.next!=None):
#             if currentBook.next.ISBN==i:
#                 break
#             currentBook=currentBook.next
#         currentBook.next=currentBook.next.next

#     def print_all(self):
#         currentBook=self.top
#         while (currentBook!=None):
#             print(currentBook.ISBN)
#             currentBook=currentBook.next

#     def get_cost(self):
#         return self.cost

# class Queue_Library:
#     def __init__(self):
#         self.front=None
#         self.rear=None
#         self.cost=0

#     def enqueue(self,isbn):
#         newBook=Book(isbn)
#         if self.front==None:
#             self.front=newBook
#         else:
#             currentBook=self.front
#             while (currentBook.next!=None):
#                 currentBook=currentBook.next
#                 self.cost+=1
#             currentBook.next=newBook
#     def dequeue(self):
#         if self.front==None:
#             return None
#         else:
#             currentBook=self.front
#             self.front=currentBook.next
#             return currentBook.ISBN
#             self.cost+=1
#     def _enqueue(self,b):
#         if (self.front==None):
#             self.cost+=1
#             self.front=b
#         else:
#             currentBook=self.front
#             while (currentBook.next!=None):
#                 currentBook=currentBook.next
#                 self.cost+=1
#             currentBook.next=b
#     def remove(self,i):
#         if self.front==None:
#             self.cost+=1
#             return None
#         else:
#             currentBook=self.front
#             while (currentBook.next!=None):
#                 if currentBook.next.ISBN==i:
#                     break
#                 self.cost+=1
#             currentBook.next=currentBook.next.next;

#     def print_all(self):
#         currentBook=self.front
#         while (currentBook!=None):
#             print(currentBook.ISBN)
#             currentBook=currentBook.next

#     def get_cost(self):
#         return self.cost


# print("hello world")




# def create_baby_names_dictionary(baby_names_list):

#     dictionay = {}
#     for baby_name in baby_names_list:
#         initial = baby_name[0]
#         if initial not in dictionay:
#             dictionay[initial] = [baby_name]
#         else:
#             dictionay[initial].append(baby_name)

#     # sorting value for every keys
#     for ele in dictionay:
#         dictionay[ele].sort()

#     return dictionay

# names = {'Joshua', 'James', 'Jack', 'Thomas', "Daniel", 'Jacob', "Benjamin"}
# a_dict=create_baby_names_dictionary(names)

# for keys in sorted(a_dict):
#     print(keys,a_dict[keys])

# Python3 program to convert infix to prefix.

# Function to check if
# given character is
# an operator or not.



def checkOperator(c):
	return (not (c >= 'a' and c <= 'z') and not(c >= '0' and c <= '9') and not(c >= 'A' and c <= 'Z'))


def getPriority(C):
	if (C == '-' or C == '+'):
		return 1
	elif (C == '*' or C == '/'):
		return 2
	elif (C == '^'):
		return 3
	return 0


def infixToPrefixConversion(infixExpression):
	
	operators = []
	operands = []

	for i in range(len(infixExpression)):
		
		if (infixExpression[i] == '('):
			operators.append(infixExpression[i])

		
		elif (infixExpression[i] == ')'):
			while (len(operators)!=0 and operators[-1] != '('):
				# operand 1
				operand1 = operands[-1]
				operands.pop()

				# operand 2
				operand2 = operands[-1]
				operands.pop()

				# operator
				operator = operators[-1]
				operators.pop()

				tmp = operator + operand2 + operand1
				operands.append(tmp)

			
			operators.pop()

		
		elif (not checkOperator(infixExpression[i])):
			operands.append(infixExpression[i] + "")

		
		else:
			while (len(operators)!=0 and getPriority(infixExpression[i]) <= getPriority(operators[-1])):
				operand1 = operands[-1]
				operands.pop()

				operand2 = operands[-1]
				operands.pop()

				operator = operators[-1]
				operators.pop()

				tmp = operator + operand2 + operand1
				operands.append(tmp)
			operators.append(infixExpression[i])

	
	while (len(operators)!=0):
		operand1 = operands[-1]
		operands.pop()

		operand2 = operands[-1]
		operands.pop()

		operator = operators[-1]
		operators.pop()

		tmp = operator + operand2 + operand1
		operands.append(tmp)

	
	return operands[-1]

s = "a*b*(c-d)*e-d"
print( infixToPrefixConversion(s))



# class Book:
#     def __init__(self, isbn):
#         self.ISBN = isbn
#         self.next = None

# # Stack_Library class


# class Stack_Library:

#     # Constructor
#     def __init__(self):
#         self.top = None
#         self.cost = 0

#     # push method
#     def push(self, isbn):
#         newBook = Book(isbn)
#         if self.top == None:
#             self.top = newBook
#         else:
#             newBook.next = self.top
#             self.top = newBook
#         self.cost += 1

#     # pop method
#     def pop(self):
#         self.cost += 1
#         if (self.top == None):
#             return None
#         else:
#             currentBook = self.top
#             self.top = currentBook.next
#             return currentBook.ISBN

#     # push object method
#     def _push(self, b):
#         b.next = self.top
#         self.top = b
#         self.cost += 1

#     # remove a book
#     def remove(self, i):
#         if self.top == None:
#             self.cost += 1
#             return None
#         else:
#             if self.top.ISBN == i:
#                 self.top = self.top.next
#                 self.cost += 1
#             else:
#                 currentBook = self.top
#                 while (currentBook.next != None):
#                     self.cost += 1
#                     if currentBook.next.ISBN == i:
#                         break
#                     currentBook = currentBook.next
#                 self.cost += 1
#                 currentBook.next = currentBook.next.next

#     # print all book in library
#     def print_all(self):
#         currentBook = self.top
#         while (currentBook != None):
#             print("ISBN :", currentBook.ISBN)
#             currentBook = currentBook.next

#     # get all cost.
#     def get_cost(self):
#         return self.cost


# # Queue_Library
# class Queue_Library:

#     # constructor
#     def __init__(self):
#         self.front = None
#         self.rear = None
#         self.cost = 0

#     # add a book at the rear
#     def enqueue(self, isbn):
#         newBook = Book(isbn)
#         if self.front == None:
#             self.cost += 1
#             self.front = newBook
#             self.rear = newBook
#         else:
#             self.rear.next = newBook
#             self.rear = newBook
#             self.cost += 1

#     # remove book from the front
#     def dequeue(self):
#         if self.front == None:
#             self.cost += 1
#             return None
#         else:
#             currentBook = self.front
#             self.front = currentBook.next
#             self.cost += 1
#             return currentBook.ISBN

#     # add a book object
#     def _enqueue(self, b):
#         if (self.front == None):
#             self.cost += 1
#             self.front = b
#             self.rear = b
#         else:
#             self.rear.next = b
#             self.rear = b

#     # remove book having ISBN = i
#     def remove(self, i):
#         if self.front == None:
#             self.cost += 1
#             return None
#         else:
#             currentBook = self.front
#             if self.front.ISBN == i:
#                 self.front = self.front.next
#                 self.cost += 1
#             else:
#                 while (currentBook.next != None):
#                     self.cost += 1
#                     if currentBook.next.ISBN == i:
#                         break
#                     currentBook.next = currentBook
#                 self.cost += 1
#                 currentBook.next = currentBook.next.next

#     # print all book
#     def print_all(self):
#         currentBook = self.front
#         while (currentBook != None):
#             print("ISBN :", currentBook.ISBN)
#             currentBook = currentBook.next

#     # get cost
#     def get_cost(self):
#         return self.cost


# def main():
#     obj = Stack_Library()
#     obj.push(100)
#     obj.push(200)
#     obj.push(300)
#     obj.push(400)
#     obj.remove(100)
#     obj.push(500)
#     obj.remove(300)
#     obj.print_all()
#     print("STACK_LIBRARY COST :", obj.get_cost())

#     obj1 = Queue_Library()
#     obj1.enqueue(100)
#     obj1.enqueue(200)
#     obj1.enqueue(300)
#     obj1.enqueue(400)
#     obj1.remove(100)
#     obj1.enqueue(500)
#     obj1.remove(300)
#     obj1.print_all()
#     print("QUEUE_LIBRARY COST :", obj1.get_cost())

# main()


# import csv

# # Open file
# with open('samplecsv.csv') as file_obj:
# 	reader_obj = csv.reader(file_obj)

# 	for row in reader_obj:
# 		print(row)


# import csv
# def data_reader(file_name):
#     result=[]
#     with open(file_name) as file_obj:
#         reader_obj=csv.reader(file_obj)
#         for row in reader_obj:
#             result.append(row)
#     result.pop(0)
#     return result

# print(data_reader('fake_example.csv'))
# print(data_reader("imagine.csv"))

# import scipy.interpolate
# import numpy as np
# # x = [0, 1, 2, 3]
# x=np.array([0,1,2,3])
# # y = [0, 1, 4, 0]
# y=np.array([0,1,2,3])
# # tck = scipy.interpolate.splrep(x, y)
# # print(tck)
# result=np.linalg.solve([x,y])
# print(result)

# def linearSpline(arr1,arr2):
#     pass


# Element at grid[i][j] moves to grid[i][j + 1].
# Element at grid[i][n - 1] moves to grid[i + 1][0].
# Element at grid[m - 1][n - 1] moves to grid[0][0].

# grid = [[1, 2, 3],
#         [4, 5, 6],
#         [7, 8, 9]]

# k= 1
# temp= 0
# result= grid
# while (temp < k):
#     # step 1
#     i= len(result)
#     j= len(result[0])
#     for i in range(len(result)):
#         for j in range(len(result[0])-1, 0, -1):
#             result[i][j]= result[i][j-1]
#     temp += 1

#     new_arr= [[1, 1, 2],
#                [4, 4, 5],
#                [7, 7, 8]]

#     # Step 2.

# print(result)

# from decimal import MAX_EMAX
# from re import I


# num=int(input("Enter size: "))
# arr=list(map(int,input("Enter elements separated space: ").strip().split()))


# num=int(input("Enter length: "))
# arr=list(map(int,input("Enter elements separated by space: ").strip().split()))
# maxSum=0
# i=0
# while i<len(arr):
#     tempSum=0
#     j=i
#     maxEle=arr[i]
#     while (j<len(arr)):
#         if arr[j]>=maxEle:
#             tempSum+=arr[j]
#             maxEle=arr[j]
#         elif arr[j]>arr[i]:
#             if maxSum<tempSum:
#                 maxSum=tempSum
#             tempSum=arr[j]+arr[i]
#             maxEle=arr[i]
#         else:
#             if maxSum<tempSum:
#                 maxSum=tempSum
#             tempSum=0
#             maxEle=arr[i]
#         j+=1
#     if tempSum>maxSum:
#         maxSum=tempSum
#     i+=1
# print(maxSum)


# grid = [[1, 2, 3],
#         [4, 5, 6],
#         [7, 8, 9]]

# k = 1
# temp = 0
# result = [[None]*len(grid[0])]*len(grid)


# result=[]
# for i in range(len(grid)):
#     temp_arr=[]
#     for j in range(len(grid[0])):
#         temp_arr.append(0)
#     result.append(temp_arr)
# while (temp < k):
#     for i in range(len(result)):
#         print("Entering first loop.")
#         for j in range(len(result[0])-1, 0, -1):
#             result[i][j] = grid[i][j-1]
#     for i in range(len(grid)-1, 0, -1):
#         result[i][0] = grid[i-1][-1]
#     result[0][0] = grid[-1][-1]
#     print(result)
#     temp += 1


# print(result)

# new_arr = [[1, 1, 2],
#            [2, 4, 5],
#            [5, 7, 8]]
# new_arr = [[8, 1, 2],
#            [2, 4, 5],
#            [5, 7, 8]]
# new = [[1, 1, 2],
#        [4, 4, 5],
#        [7, 7, 8]]
# arr = [[None, 7, 8],
#        [None, 7, 8],
#        [None, 7, 8]]


# class Person:
#     def __init__(self, name=None):
#         self.name = name

#     def printinfo(self):
#         print(f"I am {self.name}")


# class Student(Person):
#     def __init__(self, name=None, university=None, program=None, creditpoints=None):
#         super().__init__(name)
#         self.university = university
#         self.program = program
#         self.creditpoints = creditpoints

#     def setCreditPoints(self, points):
#         self.creditpoints = points

#     def getCreditPoints(self):
#         return self.creditpoints

#     def printinfo(self):
#         super().printinfo()
#         print(
#             f'''
# I am a student at {self.university}. I study {self.program}
# {self.name} has {self.creditpoints} points.''')


# class Lecturer(Person):
#     def __init__(self, name=None, university=None, department=None):
#         super().__init__(name)
#         self.university = university
#         self.department = department

#     def printinfo(self):
#         print(f'''
# I am {self.name}.
# I am a lecturer at {self.university}, {self.department}.''')


# class BachelorStudent(Student):
#     def __init__(self, name, university, program, creditpoints, school=None):
#         super().__init__(name, university, program, creditpoints)
#         self.school = school

#     def printinfo(self):
#         print(f'''
# I am {self.name}.
# I am a student at {self.university}. I study {self.program}.
# I went to school in {self.school}.
# {self.name} has {self.creditpoints} points.
#             ''')


# class MasterStudent(Student):
#     def __init__(self, name, university, program, creditPoints, bdegree):
#         super().__init__(name, university, program, creditPoints)
#         self.bdegree = bdegree

#     def printinfo(self):
#         print(f'''
# I am {self.name}.
# I am a student at {self.university}. I study {self.program}.
# I have a Bachelor's degree in {self.bdegree}.
# {self.name} has {self.creditpoints} points.''')


# class TechingAssistant(Student, Lecturer):
#     def __init__(self, name, university, department, program, creditpoints):
#         self.name = name
#         self.university = university
#         self.program = program
#         self.department = department
#         self.creditpoints = creditpoints

#     def printinfo(self):
#         print(f'''
# I am {self.name}.
# I am lecturer at {self.university}, {self.department}.
# I am also a student of {self.program}.
# {self.name} has {self.creditpoints} points.    ''')

# bachelorstudent=BachelorStudent("Alice","UU","Biology",150,"Amsterdam")
# bachelorstudent.printinfo()

# masterstudent=MasterStudent("Bob","UU","Chemistry",45,"Biophysics")
# masterstudent.printinfo()

# lecturer=Lecturer("Cindy","UU","Information and Computing Sciences")
# lecturer.printinfo()


# assistant = TechingAssistant(
#     "Dennis", "UU", "Information and Computing Sciences", "Computer Science", None)
# assistant.printinfo()


# # 4.5
# gradebook = []
# new_student = {"name": "Samantha", "homework": 95, "test": 92, "exm": 100}
# gradebook.append(new_student)

# # 4.5.1
# print("\n4.5.1")
# print(gradebook[0],)

# # 4.5.2
# print("\n4.5.2")
# print(gradebook[0]['name'])

# # 4.5.3
# print("\n4.5.3")
# gradebook[0]['exm']=100
# print(gradebook[0])

# # 4.5.4
# print("\n4.5.4")
# new_gradebook={}
# new_gradebook[gradebook[0]['name']]=gradebook[0]
# print(new_gradebook)

# Define the dictionary
# dict = {}

# # Insert data into dictionary
# # dict1 = {1: ["Samuel", 21, 'Data Structures'],
# # 	2: ["Richie", 20, 'Machine Learning'],
# # 	3: ["Lauren", 21, 'OOPS with java'],
# # 	}

# dict1 = {

#     'Sam': {"Green": 2, "Black":3, "Red": 5},

#     'Charlie': {"Green": 23, "Black": 28, "Red": 32}

# }
# # Print the names of the columns.
# print("{:<10} {:<10} {:<10}".format('NAME', 'COLOR', 'NUMBER'))

# # print each data item.
# for key, value in dict1.items():
#     name, age, course = value
#     print("{:<10} {:<10} {:<10}".format(name, age, course))


# import random

# filename=input("Enter month.txt or day.txt: ")

# file=open(filename)
# word_list=file.readlines()
# random.seed(10)

# rand_number=random.randrange(0,len(word_list))
# random_word=word_list[rand_number].strip()
# print("Random word is:",random_word, 'with length', len(random_word))

# class Book:
#     def __init__(self):


# def addBook(file, bookName):
#     f = open(file, 'a')
#     f.write(bookName+"\n")


# def showBook(fileName):
#     file = open(fileName, 'r')
#     f = file.read()
#     print("\nBOOK NAME:")
#     print(f)


# def deleteBook(file, bookName):
#     f = open(file, 'r')
#     bookList = f.readlines()
#     check = 0
#     for i in range(len(bookList)):
#         bookname = bookList[i].strip()
#         if bookname == bookName:
#             bookList.remove(bookName+"\n")
#             check = 1
#             print("Book deleted successfully.")
#             break
#     f = open(file, 'w')
#     for ele in bookList:
#         f.write(ele)
#     if check == 0:
#         print("Book not found")


# def main():
#     file = input("Enter file name: ")
#     f = open(file, 'a')
#     while (True):
#         print('''\nMenu Options...
# 1.Add Book
# 2.Delete Book
# 3.Show Book''')
#         user_choice = input("\nYour Choice??: ")
#         if user_choice == '1':
#             bookName = input("Enter book name: ")
#             addBook(file, bookName)
#         elif user_choice == '2':
#             book_name = input("Enter book name to delete: ")
#             deleteBook(file, book_name)
#         elif user_choice == '3':
#             showBook(file)
#         else:
#             break

# main()
# import random
# class Dice:
#     def __init__(self):
#         self.score=[]
#         self.firstDie=random.randrange(1,6)
#         self.secondDie=random.randrange(1,6)
#         self.score.append(self.firstDie+self.secondDie)
#     def Dice():
#         pass
#     def tossDice(self):
#         self.firstDie=random.randrange(1,6)
#         self.secondDie=random.randrange(1,6)
#     def sum(self):
#         return self.firstDie+self.secondDie
#     def toString(self):
#         return self.firstDie,self.secondDie


# import random
# def myFunction():
#     myList=[]
#     n=int(input("Input the number of rows: "))
#     m=int(input("Enter the number of cols: "))
#     data_type=input("Input the type of the random numbers: ")
#     if data_type=="integer":
#         for i in range(n):
#             temp_list=[]
#             for j in range(m):
#                 ele=random.randrange(1,10)
#                 temp_list.append(ele)
#             myList.append(temp_list)
#     elif data_type=="float":
#         for i in range(n):
#             temp_list=[]
#             for j in range(m):
#                 ele=random.randrange(10,100)/10
#                 temp_list.append(ele)
#             myList.append(temp_list)
#     else:
#         return "Invalid data type."
#     print("Original 2D list:\n",myList)
#     newList=[]
#     for i in range(len(myList)):
#         temp_list=[]
#         for j in range(len(myList[0])):
#             temp_list.append(myList[j][i]+1)
#         newList.append(temp_list)
#     return newList
# ll=myFunction()
# print("New 2D list:\n",ll)

# def faster_list_subset(list1, list2):
#     set1 = set(list1)
#     set2 = set(list2)
#     set3 = set1.difference(set2)
#     if set3:
#         return False
#     else:
#         return True


# def longlist(n, firstitem, seconditem):
#     result = []
#     for i in range(n):
#         result += [firstitem]
#     result += [seconditem]
#     return result


# longlist1 = longlist(50000, 'a', 'b')
# longlist2 = longlist(50000, 'b', 'a')

# print(faster_list_subset(['b', 'o', 'o'], ['o', 'b', 'o', 'e']))
# print(faster_list_subset(['c', 'o', 'o'], ['c', 'o']))
# print(faster_list_subset(['s', 'l', 'o', 'w', 'e', 's', 't'], ['s', 'l', 'o', 'w']))
# print(faster_list_subset(longlist1, longlist2))


# from re import L


# class Student:
#     def __init__(self):
#         file = open("student.txt", 'a')


#     def addStudents(self, id, name, labTestGrade, midGrade, finalGrade):
#         self.id = id
#         self.name = name
#         self.labTestGrade = labTestGrade
#         self.midGrade = midGrade
#         self.finalGrade = finalGrade
#         self.totalGrade = self.labTestGrade+self.midGrade+self.finalGrade
#         file = open('student.txt', 'a')
#         file.write(
#             f"{self.id} {self.name} {self.labTestGrade} {self.midGrade} {self.finalGrade} {self.totalGrade}\n")

#     def removeStudents(self):
#         user_choice = input("a. By ID")
#         file = open('student.txt', 'r')
#         id = input("Enter ID: ")
#         arr = file.readlines()
#         flag = 0
#         if user_choice == 'a':
#             for i in range(len(arr)):
#                 ele = arr[i]
#                 data_list = list(ele.strip().split())
#                 if data_list[0] == id:
#                     arr.pop(i)
#                     flag = 1
#                     break
#         if flag == 0:
#             print("ID not found.")

#     def removeStudents(self):
#         user_choice = input("a. By ID")
#         file = open('student.txt', 'r')
#         id = input("Enter ID: ")
#         arr = file.readlines()
#         flag = 0
#         if user_choice == 'a':
#             for i in range(len(arr)):
#                 ele = arr[i]
#                 data_list = list(ele.strip().split())
#                 if data_list[0] == id:
#                     arr.pop(i)
#                     flag = 1
#                     break
#             f = open('student.txt', 'a')
#             for ele in arr:
#                 file.write(arr)
#         if flag == 0:
#             print("ID not found.")

#     def modifyData(self):
#         user_choice = input("Retrive information by ID: ")
#         file = open('student.txt', 'r')
#         id = input("Enter ID: ")
#         arr = file.readlines()

#         if user_choice == 'a':
#             flag = 0

#             for i in range(len(arr)):
#                 ele = arr[i]
#                 data_list = list(ele.strip().split())
#                 if data_list[0] == id:
#                     flag = 1
#                     print(ele.strip())
#                     print("a.ID \nb.Student Name \nc.Lab Test Grade \nd.Mid Grade \ne.Final Grade")
#                     ch1=input("Enter your choice: ")
#                     if ch1=='a':
#                         newId=input("Enter new ID: ")
#                         data_list[0]=newId
#                     elif ch1=='b':
#                         newName=input("Enter new name: ")
#                         data_list[1]=newName
#                     elif ch1=='c':
#                         newGrade=input("ENter new grade: ")
#                         data_list[2]=newGrade
#                         data_list[5]=str(int(data_list[2]+int(data_list[3])+int(data_list[4])))
#                     elif ch1=='d':
#                         midGrade=input("Enter new mid grade: ")
#                         data_list[3]=midGrade
#                         data_list[5]=str(int(data_list[2]+int(data_list[3])+int(data_list[4])))
#                     elif ch1=="e":
#                         finalGrade=input("Enter new final grade: ")
#                         data_list[4]=finalGrade
#                         data_list[5]=str(int(data_list[2]+int(data_list[3])+int(data_list[4])))
#                     else:
#                         print("Invalid option.")
#                     new_str=''.join(data_list)
#                     arr[i]=new_str+"\n"
#                     break
#             if flag==0:
#                 print("ID not found.")
#                 return


#     def showInformation(self):
#         user_choice=input("a. Sort by ID \nb. Sort by Total Marks\n")
#         file=open('student.txt','r')
#         data=file.readlines()
#         if user_choice=='a':
#             data.sort()
#             for ele in data:
#                 print(ele)
#         elif user_choice=='b':
#             temp_arr=[]
#             for i in range(len(data)):
#                 var=list(data[i].strip().split())
#                 var=var[::-1]
#                 temp_arr.append(' '.join(var))
#             print(temp_arr)
#             temp_arr.sort()
#             print(temp_arr)
#             # temp_arr=temp_arr[::-1]
#             for ele in temp_arr:
#                 ele_list=list(ele.split())
#                 ele_list=ele_list[::-1]
#                 print(' '.join(ele_list))
# def main():
#     obj=Student()
#     user_choice=input('''
# 1 - Adding student information to the class file
# 2 - Removing a student information from the class
# 3 - Modifying student information
# 4 - Show all information for all students
# 5 - Generate class report file
# 6 - Terminate a progam''')
#     if user_choice==1:
#         id=input("Enter student id: ")
#         name=input("Enter student name: ")
#         labtestgrade=input("Enter lab")

#         obj.addStudents()


# import fractions

# num1=input("Enter first numeber (in fraction): ")
# num1_list=list(num1.split('/'))

# num2=input("Enter second number (in fraction): ")
# num2_list=list(num2.split('/'))

# f1 = fractions.Fraction(int(num1_list[0]), int(num1_list[1]))
# f2 = fractions.Fraction(int(num2_list[0]), int(num2_list[1]))
# result=f1*f2
# print(result)


# import fractions
# class Fraction:
#     def findMultiply(self,num1,num2):
#         self.num1_list=list(num1.split('/'))
#         self.num2_list=list(num2.split('/'))
#         return f"{int(self.num1_list[0])*int(self.num2_list[0])}/{int(self.num1_list[1])*int(self.num2_list[1])}"
#     def findSimplest(self,num):
#         self.num_list=list(num.split("/"))
#         result=fractions.Fraction(int(self.num_list[0]),int(self.num_list[1]))
#         return result
# def main():
#     obj=Fraction()
#     num1=input("Enter first numeber (in fraction): ")
#     num2=input("Enter second number (in fraction): ")
#     result=obj.findMultiply(num1,num2)
#     print("Fractional multiplication: ",result)
#     result2=obj.findSimplest(result)
#     print("Simplest form: ",result2)

# main()


# from fileinput import filename


# def readCharacter(file_name):
#     file=open(file_name,"r")
#     data=file.read()
#     # print(file)
#     for ele in data:
#         print(ele)
#         if ele.isalpha():
#             prnt()

# readCharacter('myfile.txt')


# def myFun(string):
#     alpha = ""
#     num = ""
#     i = 0
#     while i < len(string):
#         j = i
#         while (j < len(string)):
#             if string[j].isalpha():
#                 if (len(num) != 0):
#                     print(num, "--number")
#                     num = ""
#                 alpha += string[j]

#             elif string[j].isdigit():
#                 if (len(alpha) != 0):
#                     print(alpha, "--word")
#                     alpha = ""
#                 num += string[j]

#             elif string[j] in "!@#~`$%^&*()_+=|\}]{[';/?.>,<":
#                 if (len(alpha)!=0):
#                     print(alpha,"--word")
#                     alpha=""
#                 if len(num)!=0:
#                     print(num,"--number")
#                     num=""
#                 print(string[j],"--ss")


#             j += 1

#         i = j
#         if (len(num)!=0):
#             print(num,"--number")
#         elif (len(alpha)!=0):
#             print(alpha,"--word")


# def main(file_name):
#     file=open(file_name,'r')
#     data=file.read()
#     myFun(data)

# main('myfile.txt')


# def myFun():

#     score = 0
#     grade = None

#     for i in range(1, 6):
#         temp_score = int(input(f"Enter project{i} score: "))
#         score += temp_score

#     if (90 <= score <= 100):
#         grade = "A"
#     elif (80 <= score <= 89):
#         grade = "B"
#     elif (70 <= score <= 79):
#         grade = "C"
#     elif (60 <= score <= 69):
#         grade = "D"

#     print("Score :",score)
#     print("Grade :", grade)


# myFun()


# def get_string(input_string):

#     output_string = ""

#     if (len(input_string) > 6):
#         output_string = input_string[1::]

#     elif (input_string.count("e")+input_string.count("E") > 2):
#         output_string = str(input_string.count("e")+input_string.count("E"))+"E"

#     elif (input_string.isdigit()):
#         output_string = str(int(input_string)//2)

#     elif (input_string.isalnum()):
#         output_string = input_string[::-1]

#     return output_string


# print(get_string("24"))
# print(get_string("EcEse"))
# print(get_string("Ec5sd"))


# def performOps(A):
#     m = len(A)
#     n = len(A[0])
#     B = []
#     for i in range(len(A)):
#         B.append([0] * n)
#         for j in range(len(A[i])):
#             B[i][n - 1 - j] = A[i][j]
#     return B


# A = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]


# B = performOps(A)
# for i in range(len(B)):
#     for j in range(len(B[i])):
#         print(B[i][j])


# def myFun(arr, n):
#     i = 0
#     j = len(arr)-1
#     count = 0
#     total = 0
#     tempArr=[]
#     while (count < n):
#         if (arr[i] > arr[j]):
#             total += arr[i]
#             data=arr[i]
#             tempArr.append(data)
#             i += 1
#         elif (arr[i] < arr[j]):
#             total += arr[j]
#             data=arr[j]
#             tempArr.append(data)
#             j -= 1
#         count += 1
#     print(tempArr)
#     return total


# # arr=[5,-2,3,1,2]
# arr = [-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447,
#        726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35]
# n = 48
# print(myFun(arr, n))


# def myFun(arr,n):
#     maxSum=0
#     for i in range(n):
#         print("left : ",arr[0:n-i])
#         print("right :",arr[-i:])
#         tempSum=sum(arr[0:n-i-1])+sum(arr[-i-1:])
#         if tempSum>maxSum:
#             maxSum=tempSum
#     return maxSum


# from turtle import right


# def myFun(arr,n):
#     i=n-1
#     j=len(arr)-1
#     maxSum=sum(arr[0:n])
#     tempSum=maxSum
#     for count in range(n):
#         print("i =",count)
#         tempSum=tempSum-arr[i-count]+arr[j-count]
#         print("tempSum : ",tempSum)
#         if tempSum>maxSum:
#             maxSum=tempSum
#     return maxSum
# # arr=[5,-2,3,1,2]
# arr = [-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447,
#        726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35]
# n = 48
# print(myFun(arr,n))


# def myFun(boxTypes,truckSize):
#     for i in range(len(boxTypes)):
#         ele=boxTypes[i]
#         temp=ele[0]
#         ele[0]=ele[1]
#         ele[1]=temp
#     boxTypes.sort()
#     print(boxTypes)
#     profit=0
#     i=len(boxTypes)-1
#     while truckSize!=0 and i>=0:
#         print("i :",i)
#         ele=boxTypes[i]
#         print("ele :",ele)
#         if ele[1]<truckSize:
#             profit+=ele[0]*ele[1]
#             truckSize-=ele[1]
#         else:
#             print("Condition2")
#             profit+=(truckSize*ele[0])
#             truckSize-=truckSize
#         i-=1
#     return profit


# boxTypes = [[5,10],[2,5],[4,7],[3,9]]
# arr=sorted(boxTypes)
# print(arr)
# print(myFun(boxTypes,100))


# from inspect import modulesbyfile


# arr = [3, 30, 34, 5, 9]
# def myFun(num,string):
#     num=str(num)
#     if len(string)==0:
#         string+=num
#     elif ()


# class Message:
#     def __init__(self,stime=None,):
#         self.__sendingTime=None
#         self.__sequenceNumber=None
    
#     def setSendingTime(self,stime):
#         self.__sendingTime=stime
    
#     def setSequenceNumber(self,seqNum):
#         self.__sequenceNumber=seqNum
    
#     def getSendingTime(self):
#         return self.__sendingTime
    
#     def getSequenceNumber(self):
#         return self.__sequenceNumber
    

# obj=Message()
# obj.__sendingTime=10
# print(obj.getSendingTime())
# # class AddModifyOrderMessage(Message):
# #     pass
# # class DeleteOrderMessage(Message):
# #     pass
# # class TradeMessage(Message):
# #     pass


# class Ab():
#     def __init__(self, year):
#         self.__year = year
#         self.year = year # <-- this needs to be here
#         print(self.__year)

#     @property
#     def year(self):
#         return self.__year

#     @year.setter
#     def year(self, y):
#         if y < 8:
#             self.__year = 0
#         else:
#             self.__year = y
# a = Ab(5)
# print(a.year)




def factorial(num):
    if num<=1:
        return 1
    else:
        return num*factorial(num-1)

print(factorial(0))
print(factorial(1))
print(factorial(2))
print(factorial(3))
# class Person:
#     def __init__(self, fname="None", lname="None", age=0, address="None",):
#         self.fname = fname
#         self.lname = lname
#         self.age = age
#         self.address = address

#     def set_age(self, newAge):
#         self.age = newAge

#     def set_firstname(self, firstName):
#         self.fname = firstName

#     def set_lastname(self, lastname):
#         self.lname = lastname
#     def __lt__(self,other):
#         return self.age<other.age
#     def __eq__(self,other):
#         return self.fname==other.fname and self.lname==other.lname


#     def __str__(self):
#         return f"{self.fname} {self.lname}"

# if __name__ == '__main__':
#     bond = Person('James', 'Bond', 37, '29 Wellington Square, London')
#     print(bond)
#     spy = Person()
#     spy.set_firstname('James')
#     spy.set_lastname('Bond')
#     spy.set_age(65)
#     print(spy)
#     if spy == bond:
#         print(f'The spy is {bond}.')

#     homes = Person('Sherlock', 'Holmes', 42, '221B Baker Street, London')
#     detective = Person()
#     detective.set_age(18)
#     if detective < homes:
#         print(f'Detective is younger than {homes}.')


# A = "My name is vishal kumar singh. Basically I am from chapra bihar and my father name is umesh singh and my mother name is kanit devi she lives in village."
# A=["hello","my","name","is","vishal","kumar","singh"]
# A=[ "The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" ]



# def myFun(A):
#     A="".join(A)
#     count = 0
#     # tempArr = [0]*26
#     # charArr=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
#     charDict = {'a': 0, 'b': 0, 'c': 0, 'd': 0, 'e': 0, 'f': 0, 'g': 0, 'h': 0, 'i': 0, 'j': 0, 'k': 0, 'l': 0,
#                 'm': 0, 'n': 0, 'o': 0, 'p': 0, 'q': 0, 'r': 0, 's': 0, 't': 0, 'u': 0, 'v': 0, 'w': 0, 'x': 0, 'y': 0, 'z': 0}
#     for ele in A:
#         ele=ele.lower()
#         if charDict[ele]==0:
#             count+=1
#             charDict[ele]+=1
#         if count==26:
#             return 1
#     return 0


# name="vishal kumar singh"
# name=name.split()
# print(name)

# num1=5
# num2=6
# print(5/6)
# print(5%6)
# t1=(1,2,3)
# t2=(4,5,6)
# t1[0]=100
# print(t1[0])

# message="welcome to Mysore"
# word=message[-7:]
# if(word=="mysore"):
#     print("got it")
# else:
#     message=message[3:14]
#     print(message)


# song="JINGLE Bells jingle Bells Jingle All The Way"
# song.upper()
# song_words=song.split()
# count=0
# for word in song_words:
#     if(word.startswith("jingle")):
#         count=count+1
# print(count)
 


# def count_names(name_list):
#     count1=0
#     count2=0
    
#     #start writing your code here
#     #Populate the variables: count1 and count2
#     for ele in name_list:
#         if ele[len(ele)-2:]=="at":
#             count1+=1
#             count2+=1
#         else:
#             if "at" in ele:
#                 count2+=1

#     # Use the below given print statements to display the output
#     # Also, do not modify them for verification to work
#     print("_at -> ",count1)
#     print("%at% -> ",count2)


# #Provide different names in the list and test your program
# # name_list=["Hat","Cat","rabbit","matter"]
# name_list=['at','dats']
# count_names(name_list)

# num1=10
# num2=5 
# num3=0 
# num4=2 
# num5=10 

# print((num1==num5) and ((num2-num4*num3) == (num2-num3)))
# print(not(num3>=num4) and (num5/num2 == num4))

# num1 = 50
# num2 = 2
# num3 = 3
# num4 = 8
# result = num1/num4-num3*num2+num4
# print(result)


#lex_auth_01269363490743091290

# def display(num):
#     message=""
#     if num%3==0:
#         message="Zip"
#     elif (num%5==0):
#         message="Zap"
#     elif (num%3==0 and num%5==0):
#         message="Zoom"
#     else:
#         message="Invalid"
#     #write your logic here
#     return message

# #Provide different values for num and test your program
# message=display(45)
# print(message)

# num_list = [100.5,30.465,-1.22,20.15]
# num_list.insert(1, -100.5)
# num_list.pop(0)
# num_list.sort()
# print(num_list[0])

# list1=[5,10,15,20,25]
# print(len(list1))
# print(list1[4])
# print(list1[5])
# print(list1[4:5])
# list1[2]=12
# print(list1)
# list1=list1+[8,9]


sample_dict = {'a':1,'b':2}
sample_dict.update({'b':5, 'c':10 })
print(sample_dict.get('b'), sample_dict.get('c'))
 
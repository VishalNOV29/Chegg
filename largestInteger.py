# def myFun1(result,num):
#     print("myFun1 is called")
#     if (len(result)==0):
#         result+=str(num)
#         print("Length of result is zero.")
#         print("result =",result)
#         return result
#     if (num==0):
#         print("digit is zero.")
#         result=result+str(num)
#         print("result =",result)
#         return result
#     i=0
#     while (i<len(result)):
#         if (int(result[i])<=num):
#             result=str(num)+result
#             print("Greater......")
#             print("result =",result)
#             return result
#         elif (int(result[i])>num):
#             print("Smaller......")
#             result=result+str(num)
#             print("result =",result)
#             return result
#         i+=1
        



# def main(arr):
#     result=""
#     for num in arr:
#         result=myFun1(result,num)
#     return result

# arr=[1,2,0,1,2]
# print(main(arr))


# def myFun(arr):
#     i=0
#     while (i<len(arr)-1):
#         j=i+1
#         while (j<len(arr)):    
#             ij=str(arr[i])+str(arr[j])
#             ji=str(arr[j])+str(arr[i])
#             if (int(ji)>int(ij)):
#                 temp=arr[i]
#                 arr[i]=arr[j]
#                 arr[j]=temp
#             j+=1
#         i+=1
#     return arr
# print(myFun([3,30,34,9]))
        

num1="123"
num2="34"
print(num1<num2)
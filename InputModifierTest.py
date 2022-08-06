process_name=input("Proces Name: ")
no_of_threads=int(input("Number of threads: "))
total=0
print("Amount of memory consumed by threads:")
for i in range(no_of_threads):
    amt=int(input(f"{i+1}: "))
    total+=amt
print("Sum of consumed memory by this process is",total)
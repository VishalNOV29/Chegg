def createRecords():
    f=open('records.txt','a')
    student_number=int(input('Enter the number of students: '))
    for i in range(student_number):
        student_name=input("Enter student name: ")
        f.write(student_name+"\n")
        course_number=int(input("How many course they have: "))
        f.write(course_number+"\n")
        for j in range(course_number):
            subject_name=input('Enter subject name: ')
            credit=int(input("Enter credit: "))
            f.write(credit+"\n")
            grade=float(input('Enter grade: '))
            f.write(grade+"\n")
            f.write('{}\n{}\n{}\n'.format(student_name,course_number,subject_name,credit))
createRecords()


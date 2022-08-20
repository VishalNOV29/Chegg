import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class StudentData {
    String name;
    String initials;
    String studentId;

    StudentData(String name, String initials, String studentId) {
        this.name = name;
        this.initials = initials;
        this.studentId = studentId;
    }
}

class Student {

    static ArrayList<StudentData> readStudentFile(String fileName) {
        ArrayList<StudentData> arr = new ArrayList<StudentData>();
        try {

            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                String[] dataArr = data.split(",");
                System.out.println(Arrays.toString(dataArr));

                String name = dataArr[0];
                String initials = dataArr[1];
                String studentId = dataArr[2];

                StudentData newEntry = new StudentData(name, initials, studentId);
                arr.add(newEntry);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return arr;
    }

    static String searchDetails(String in, ArrayList<StudentData> arr) {

        String result = "";

        for (int i = 0; i < arr.size(); i++) {
            StudentData student = arr.get(i);
            if (student.initials.contains(in)) {
                result = "Name : " + student.name + "\nStudent Id : " + student.studentId;
                break;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<StudentData> arr = readStudentFile("Student.txt");

        System.out.println("\n\n");

        System.out.print("Enter initials: ");
        String initials = sc.nextLine();

        String result = searchDetails(initials, arr);
        System.out.println(result);
    }
}
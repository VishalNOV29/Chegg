// import java.nio.file.FileStore;

// import java.util.Arrays;

// public class Student extends Person {
//     private int grade;
//     public void setGrade(int new_grade){
//         grade=new_grade;
//     }
//     public int getGrade(){
//         return grade;
//     }

// }

// public class Student{
//     public Student(){
//         System.out.println("This is student class constructor.");
//     }
//     void myMethod(){
//         System.out.println("This is student class method.");
//     }
// }
// class VCCSStudent extends Student{
//     private String name="XYZ";
//     // Overriding the Student class method.
//     void myMehtod(){
//         System.out.println("This is parent VCCSStudent class method");
//     }
//     void newMethod(){
//         System.out.println("This method is a new method of child class.");
//     }
//     public static void main(String args[]){
//         VCCSStudent obj = new VCCSStudent();
//         obj.myMehtod();
//         obj.newMethod();
//         System.out.println("name = "+obj.name);

//     }
// }

// class Student {
//     static int myFun(int num) {
//         int modulo = num % 10;
//         if (num == modulo) {
//             return num;
//         }
//         int new_num = 0;
//         while (num != 0) {
//             int mod = num % 10;
//             new_num += mod;
//             num = num / 10;
//         }
//         return myFun(new_num);
//     }

//     public static void main(String[] args) {
//         // System.out.println(4%.10);
//         int num = 444;
//         System.out.println(myFun(num));

//     }
// }

// abstract class GeometricObject implements Comparable{
//     String name;
//     public GeometricObject(String n){
//         name=n;
//     }
//     public abstract double area();
//     public int

// }
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number of test case: ");
//         // int num=sc.nextInt();
//         int num=sc.nextInt();
//         sc.nextLine();
//         for (int i=0;i<num;i++){
//             System.out.println("Enter numbers: ");
//             // String numbers=sc.nextLine();
//             String[] n_m=sc.nextLine().split(" ");
//             int n=Integer.parseInt(n_m[0]);
//             int m=Integer.parseInt(n_m[1]);
//             System.out.println(n);
//             System.out.println(m);
//         }
//     }
// }

// class Solution {
//     static boolean binarySerach(int[] arr, int low, int high, int target) {
//         System.out.println("Recursive method is called.");
//         Arrays.sort(arr);
//         if (low <= high) {
//             int mid = (low + high) / 2;
//             System.out.println(mid);
//             if (arr[mid] == target) {
//                 return true;
//             } else if (arr[mid] > target) {
//                 high = mid - 1;
//                 return binarySerach(arr, low, high, target);
//             } else {
//                 low = mid + 1;
//                 return binarySerach(arr, low, high, target);
//             }
//         } else {
//             return false;
//         }

//     }

//     public static boolean searchMatrix(int[][] matrix, int target) {
//         System.out.println("This method is called.");
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int i = 0;
//         while (i < n) {
//             System.out.println("Enting the while loop");
//             int first = matrix[i][0];
//             int last = matrix[i][m - 1];

//             if (first <= target && target <= last) {
//                 return binarySerach(matrix[i], 0, m-1, target);
//             }
//             i+=1;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         // int arr[] = { 5, 4, 3, 2, 1 };
//         int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//         // Solution obj = new Solution();
//         boolean res = searchMatrix(matrix, 60);
//         System.out.println(res);
//     }
// }

// import java.util.*;

// class LinkedList1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         LinkedList<Integer> l1 = new LinkedList<Integer>();

//         System.out.println("Enter 'STOP' for stop the input.");
//         while (true) {
//             System.out.print("Enter element: ");
//             String element = sc.nextLine();
//             if (element.equals("STOP")) {
//                 break;
//             }
//             l1.add(Integer.parseInt(element));
//         }

//         // Sorting the list.
//         Collections.sort(l1);
//         int sum = 0;
//         Iterator<Integer> itr1 = l1.iterator();
//         while (itr1.hasNext()) {
//             int ele = itr1.next();
//             sum += ele;
//             System.out.print(ele + " ");
//         }
//         System.out.println();
//         System.out.println("Sum is : " + sum);
//         float average = (float) sum / l1.size();
//         System.out.printf("Average : "+"%.2f",average);
//     }
// }

// class Employee {
//     String name;
//     double salary;
//     String serviceClass = "NONE";
//     static int idNb = 1000;

//     public Employee(String name, double salary, String serviceClass) {
//         Employee.idNb += 1;
//         this.name = name;
//         this.salary = salary;
//         this.serviceClass = serviceClass;
//     }

//     void setName(String name) {
//         this.name = name;
//     }

//     String getName() {
//         return name;
//     }

//     void setSalary(double salary) {
//         this.salary = salary;
//     }

//     double getSalary() {
//         return salary;
//     }

//     String getId() {
//         return serviceClass + "." + idNb;
//     }

//     double calculateIndemnity(int years) {
//         double idemnity = years * 12 * getSalary();
//         if (this.serviceClass.equals("First")) {
//             idemnity = idemnity + (idemnity / 100) * 15;
//         } else if (this.serviceClass.equals("Second")) {
//             idemnity = idemnity + (idemnity / 100) * 13;
//         } else if (this.serviceClass.equals("Third")) {
//             idemnity = idemnity + (idemnity / 100) * 10;
//         }
//         return idemnity;

//     }

//     public String toString() {
//         return name + ", ID:" + getId() + "\n" + "Salary:$" + getSalary();
//     }

//     public static void main(String args[]) {

//         Employee obj = new Employee("ABC", 120000, "First");
//         System.out.println(obj);
//         System.out.println(obj.getName());
//         System.out.println(obj.getSalary());
//         System.out.println(obj.getId());
//         System.out.println(obj.calculateIndemnity(12));
//         System.out.println("**********************************************************");

//         Employee obj2 = new Employee("XYZ", 120000, "Second");
//         System.out.println(obj2);
//         System.out.println(obj2.getName());
//         System.out.println(obj2.getSalary());
//         System.out.println(obj2.getId());
//         System.out.println(obj.calculateIndemnity(5));

//     }
// }

// public class Student{
//     public static void main(String[] args){
//         int a=7,b=8,k=9;
//         k=(int)Math.pow(b, 2);
//         double x=6;
//         System.out.print("B"+b);
//         System.out.print('A');

//     }

// }

// class Student{
//    String firstName;
//    String lastName;
//    int id;
//    int age;
//    double percentGrade;
//    boolean pass;
//    Student(String fname,String lname,int i,int a,double p){
//        firstName=fname;
//        lastName=lname;
//        id=i;
//        age=a;
//        percentGrade=p;
//    }
// }

// class Address {
//     String streetAddressLine;
//     String city;
//     String state;
//     int zipCode;

//     Address(String streetAddressLine, String city, String state, int zipCode) {
//         this.streetAddressLine = streetAddressLine;
//         this.city = city;
//         this.state = state;
//         this.zipCode = zipCode;
//     }

//     String getStreetAddressLine() {
//         return this.streetAddressLine;
//     }

//     String getCity() {
//         return this.city;

//     }

//     String getState() {
//         return this.state;
//     }

//     int getZipCode() {
//         return this.zipCode;
//     }
// }

// class UserInformation {
//     String firstName;
//     String lastName;
//     Address address;
//     boolean canContact;
//     long userId;

//     UserInformation(String firstName, String lastName, Address address, long userId) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.address = address;
//         this.userId = userId;
//     }

//     String getFirstName() {
//         return this.firstName;
//     }

//     String getLastName() {
//         return this.lastName;
//     }

//     Address getAddress() {
//         return this.address;
//     }

//     void setCanContact(boolean canContact) {
//         this.canContact = canContact;
//     }

//     boolean getCanContact() {
//         return this.canContact;
//     }

//     long getUserId() {
//         return this.userId;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Address address = new Address("xyz", "abc", "pqr", 00000000);
//         UserInformation user1 = new UserInformation("user", " abcd\n", address, 123456);
//         System.out.println("Name : " + user1.getFirstName() + " " + user1.getLastName() + "userId : " + user1.getUserId());

//     }
// }
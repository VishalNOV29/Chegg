// import java.util.*;

// class Postal {
//     String fname;
//     String lname;
//     int zip;

//     Postal(String firstName, String lastName, int zipCode) {
//         fname = firstName;
//         lname = lastName;
//         zip = zipCode;
//     }

//     void setFirstName(String firstName) {
//         fname = firstName;
//     }

//     void setLastName(String lastName) {
//         lname = lastName;
//     }

//     void setZip(int zipcode) {
//         zip = zipcode;
//     }

//     String getFirstName() {
//         return fname;
//     }

//     String getLastName() {
//         return lname;
//     }

//     int getZip() {
//         return zip;
//     }

//     public String toString() {
//         if (zip < 10) {
//             return fname + " " + lname + " 0000" + zip;
//         } else if (zip < 100) {
//             return fname + " " + lname + " 000" + zip;
//         } else if (zip < 1000) {
//             return fname + " " + lname + " 00" + zip;
//         } else if (zip < 10000) {
//             return fname + " " + lname + " 0" + zip;
//         } else {
//             return fname + " " + lname + " " + zip;
//         }
//     }

// }

// class PostalList {

//     public static void main(String[] args) {
//         Postal arr[] = new Postal[10];
//         Scanner sc = new Scanner(System.in);
//         int i = 0;
//         while (i < 10) {
//             System.out.print("Enter firstname lastname zip-code: ");
//             String data = sc.nextLine();
//             String[] dataArr = data.split(" ");
//             Postal obj = new Postal(dataArr[0], dataArr[1], Integer.parseInt(dataArr[2]));
//             arr[i] = obj;
//             System.out.print("Continue? (y/n): ");
//             String userCh = sc.nextLine();
//             if (userCh.equals("n")) {
//                 int total = 0;
//                 for (int j = 0; j < arr.length; j++) {
//                     total = i;
//                     if (arr[j] == null) {
//                         break;
//                     }
//                 }
//                 System.out.println("Total number of Postal objects: " + (total + 1));
//                 for (Postal ele : arr) {
//                     if (ele != null) {
//                         System.out.println(ele.toString());
//                     } else {
//                         break;
//                     }
//                 }
//                 break;
//             }
//             i++;
//         }
//     }
// }

// class Postal{
//     int []
//     public static void main(String[] args){
//         int arr[][]=new int[m][n];

//     }
// }

// import java.util.ArrayList;
// class Solution {
//     public List<List<Integer>> shiftGrid(int[][] grid, int k) {
//         ArrayList<

//     }
// }

// class Main{
//     private int num=20;
//     void myMethod(){
//         System.out.println("Method 1");
//     }

// }
// class Main2 extends Main{

//     void myMethod(){
//         System.out.println("Method 2");
//     }
// }
// class Temp{
//     public static void main(String[] args){
//         Main obj =new Main();
//         obj.myMethod();
//         Main2 obj1=new Main2();
//         obj1.myMethod();
//         int arr[]={1,2,3};
//         int a=0;
//         int b=1;
//         System.out.println(arr[a+b]);
//     }
// }

// class First {
//     // Declaring instance varibale.
//     String name = "First";

// }

// class Second {
//     public static void main(String args[]) {
//         // Object from First class
//         First obj = new First();

//         // Pinting the value of instance varibale 'name' using object.
//         System.out.println(obj.name);
//     }
// }

// import java.util.*;
// interface Register{
//     // String firstName=null;
//     // String lastName=null;
//     // int age=0;
//     public void setFirstName(String fnaem);
//     public void setLastName(String lname);
//     public void setAge(int age);
//     public String getFirstName();
//     public String getLastName();
//     public int getAge();
// }
// class Person implements Register{
//     String firstName;
//     String lastName;
//     int age;
//     public void setFirstName(String fname){
//         firstName=fname;
//     }
//     public void  setLastName(String lname){
//         lastName=lname;

//     };
//     public void setAge(int ag){
//         age=ag;
//     };
//     public String getFirstName(){
//         return firstName;
//     };
//     public String getLastName(){
//         return lastName;
//     };
//     public int getAge(){
//         return age;
//     };
// }

// class Server extends Person{
//     Scanner sc=new Scanner(System.in);
//     public void setData(){
//         System.out.println("Enter first name: ");
//         String fname=sc.nextLine();
//         System.out.println("Enter last name: ");
//         String lname=sc.nextLine();
//         System.out.println("Enter age: ");
//         int age=sc.nextInt();
//         Person p1=new Person();
//         p1.setFirstName(fname);
//         p1.setAge(age);
//         p1.setLastName(lname);

//     }

// }
// class Client extends Server{
//     Person obj=new Server();
//     public String accessInformation(){
//         return obj.getFirstName()+" "+obj.getLastName()+" "+obj.getAge(); 
//     }
// }


// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         // int number=sc.nextInt();
//         int sum=0;
//         for (int i=1;i<number;i++){
//             if (number%i==0){
//                 sum+=i;
//             }
//         }
//         if (sum==number){
//             System.out.println("Perfect");
//         }
//         else{
//             System.out.println("Not perfect.");
//         }
//     }
// }
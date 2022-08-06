// import java.util.ArrayList;
// import java.util.Arrays;

// import javax.sql.rowset.serial.SerialArray;
// import javax.swing.text.html.InlineView;

// import java.util.Scanner;
// import java.lang.Math;
// public class MathFunctions {
//     public static void main(String[] args){
//         Scanner scnr=new Scanner(System.in);
//         double x;
//         double y;
//         double z;
//         System.out.print("Value of x: ");
//         x=scnr.nextDouble();
//         System.out.print("Value of y: ");
//         y=scnr.nextDouble();
//         // z=Math.abs(x+Math.pow(y, 3));
//         z=Math.abs(Math.pow(x+y, 3));
//         System.out.printf("%.1f\n",z);
//     }
// }
// class px {
//     public static void main(String[] args) {
//         int A = 7;
//         int B = 7;
//         int C=6;
//         int sum[][] = new int[A][B];
//         int X=7;
//         for (int k = 0; k < X; k++) {
//             sum[k][0] = 1;
//         }
//         int Y=6;
//         for (int k = 0; k < Y; k++) {
//             sum[0][k] = 1;
//         }

//         int Z=6;
//         int W=6;
//         for (int m = 1; m < Z; m++) {
//             for (int n = 1; n < W; n++) {
//                 sum[m][n] = sum[m - 1][n - 1] + sum[m][n - 1];
//             }
//         }
//         for (int n = 1; n < X; n++) {
//             System.out.print(sum[C][n] + " ");
//         }
//     }
// }

// import java.io.*;
// import java.util.*;

// class Invoice {
//     String date, amount, paid;
//     Invoice(String date, String amount, String paid) {
//         System.out.println("Object Created");
//         this.date = date;
//         this.amount = amount;
//         this.paid = paid;

//     }
//     public String toString(){
//         return date+"\n"+amount+"\n"+paid;
//     }

//     public static ArrayList processTestFile() {
//         ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
//         try {
//             FileInputStream fis = new FileInputStream("Invoice.txt");
//             Scanner sc = new Scanner(fis);
//             String number = sc.nextLine();
//             System.out.println("Total Invoice : " + number);
//             while (sc.hasNextLine()) {
//                 String date = sc.nextLine();
//                 String amount = sc.nextLine();
//                 String paid = sc.nextLine();
//                 Invoice obj = new Invoice(date, amount, paid);
//                 System.out.println(obj);
//                 invoiceList.add(obj);
//             }
//             sc.close(); // closes the scanner
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//         return invoiceList;
//     }

//     public static void main(String[] args) {
//         processTestFile();

//     }
// }

// class Solution {
//     public int[] runningSum(int[] nums) {
//         int[] result=new 

//     }

// }

// class Solution{
//     public static int[] runningSum(int[] nums){
//         for (int i=1;i<nums.length;i++){
//             nums[i]=nums[i]+nums[i-1];
//         }
//         return nums;
//     }
//     public static void main(String[] args){
//         int arr[]={1,2,3,4,5};
//         int result[]=runningSum(arr);
//         System.out.println(Arrays.toString(result));
//     }
// }

// import java.util.*;
// import java.text.*;

// class Employee {

//     static void showDetails() {
//         DecimalFormat df = new DecimalFormat("#.00");
//         while (true) {
//             Scanner sc = new Scanner(System.in);

//             System.out.print("\nEnter a salary: ");
//             double salary = sc.nextDouble();
//             if (salary == 0) {
//                 System.out.println("Good bye!");
//                 break;
//             }

//             System.out.println("Raise rate : 3%");
//             double salary_3 = salary;
//             for (int i = 1; i < 5; i++) {
//                 double raise = (salary_3 / 100) * 3;
//                 salary_3 += raise;
//                 System.out.println(
//                         "        Year: " + i + ", Raise: $" + df.format(raise) + ", Salary: $" + df.format(salary_3));

//             }

//             System.out.println("Raise rate : 4%");
//             double salary_4 = salary;
//             for (int i = 1; i < 5; i++) {
//                 double raise = (salary_4 / 100) * 4;
//                 salary_4 += raise;
//                 System.out.println(
//                         "        Year: " + i + ", Raise: $" + df.format(raise) + ", Salary: $" + df.format(salary_4));

//             }

//             System.out.println("Raise rate : 5%");
//             double salary_5 = salary;
//             for (int i = 1; i < 5; i++) {
//                 double raise = (salary_5 / 100) * 5;
//                 salary_5 += raise;
//                 System.out.println(
//                         "        Year: " + i + ", Raise: $" + df.format(raise) + ", Salary: $" + df.format(salary_5));

//             }
//         }
//     }

//     public static void main(String[] args) {
//         showDetails();
//     }
// }

// class Main {

//     // Reversing string...
//     static String reverseString(String str) {
//         if (str.isEmpty()) {
//             return str;
//         } else if (str.charAt(0) != 'a' && str.charAt(0) != 'e'
//                 && str.charAt(0) != 'i' && str.charAt(0) != 'o'
//                 && str.charAt(0) != 'u' && str.charAt(0) != 'A'
//                 && str.charAt(0) != 'E' && str.charAt(0) != 'I'
//                 && str.charAt(0) != 'O'
//                 && str.charAt(0) != 'U') {
//             return reverseString(str.substring(1)) +str.charAt(0);
//         } else {
//             return reverseString(str.substring(1)) + "";
//         }

//     }

//     // Finding minimum of an array...
//     public static int findMinimum(int A[], int n) {
//         if (n == 1)
//             return A[0];

//         return Math.min(A[n - 1], findMinimum(A, n - 1));
//     }

//     // Integer to string...
//     static String strToInt(int num) {
//         if (num == 0) {
//             return "";
//         } else {
//             int lastChar = num % 10;
//             String ele = Integer.toString(lastChar);
//             return strToInt(num / 10) + ele;
//         }
//     }

//     public static void main(String[] args) {

//         String result = reverseString("abkdoiswekjdies");
//         System.out.println("Reversed : " + result);
//         System.out.println("Reversed : "+reverseString("aeiou")); // all vowels
//         System.out.println("Reversed : "+reverseString("pqrst")); // no any vowel

//         int arr[] = { 2, 3, 1, 4, 5, 8, 20, 55, 78, 90, 13, 54, 48, 15, 90, 34, 78, 65, 44, 20 };
//         int min = findMinimum(arr, 20);
//         System.out.println("Minimum : " + min);

//         int num = 12439;
//         String str = strToInt(num);
//         System.out.println("String : " + str);

//     }
// }

// class Main{
//     public static void main(String[] arg){
//         int arr[]={9,8,7,6,5,4,3,2,1};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// class Solution {
//     public static int solve(int[] A) {
//         int i = 1;
//         int count = 1;
//         while (i < A.length) {
//             System.out.println("Entering inner loop.");
//             int j = i - 1;
//             while (j >= 0) {
//                 System.out.println("Entering outer loop.");
//                 if (A[j] >= A[i]) {
//                     System.out.println("Conditon satisfied.");
//                     // j -= 1;
//                     break;

//                 }
//                 j -= 1;
//             }
//             if (j == -1) {
//                 System.out.println("INcrement count. "+i+" "+j+" "+A[i]);
//                 count++;
//             }
//             i += 1;
//         }
//         return count;

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2,3,4 };
//         int result = solve(arr);
//         System.out.println(result);

//     }
// }

// import java.util.*;

// class UnitConversion {

//     // Method for conversion of length.
//     double convertLenght(String fromUnit, int num, String toUnit) {

//         double result = 0;

//         if (fromUnit.contains("inches")) {
//             if (toUnit.contains("meters")) {
//                 result = num * 0.0254;
//             } else if (toUnit.contains("feet")) {
//                 result = num * 0.0833;

//             } else if (toUnit.contains("yards")) {
//                 result = num * 0.0277;
//             }
//         }

//         else if (fromUnit.contains("meters")) {
//             if (toUnit.contains("inches")) {
//                 result = num * 39.3701;
//             } else if (toUnit.contains("feet")) {
//                 result = num * 3.2808;
//             } else if (toUnit.contains("yards")) {
//                 result = num * 1.0936;
//             }
//         }

//         else if (fromUnit.contains("feet")) {
//             if (toUnit.contains("meters")) {
//                 result = num * 0.3048;
//             } else if (toUnit.contains("inches")) {
//                 result = num * 12;
//             } else if (toUnit.contains("yerds")) {
//                 result = num * 0.3333;
//             }
//         }

//         else if (fromUnit.contains("yards")) {
//             if (toUnit.contains("meters")) {
//                 result = num * 0.9144;

//             } else if (toUnit.contains("inches")) {
//                 result = num * 36;
//             } else if (toUnit.contains("feet")) {
//                 result = num * 3;
//             }
//         }
//         return result;

//     }

//     // Method for conversion of mass.
//     double convertMass(String fromUnit, int num, String toUnit) {

//         double result = 0;

//         if (fromUnit.contains("grams")) {
//             result = num * 0.0352;
//         }

//         else if (fromUnit.contains("ounces")) {
//             result = num * 28.3495;
//         }

//         return result;

//     }

//     // Method for conversion of volume
//     double convertVolume(String fromUnit, int num, String toUnit) {

//         double result = 0;

//         // pints and gallons are taken as US liquid
//         if (fromUnit.contains("liters")) {
//             if (toUnit.contains("gallons")) {
//                 result = num * 0.2641;
//             } else if (toUnit.contains("pints")) {
//                 result = num * 2.1133;
//             }
//         } else if (fromUnit.contains("gallons")) {
//             if (toUnit.contains("liters")) {
//                 result = num * 3.78541;
//             } else if (toUnit.contains("pints")) {
//                 result = num * 8;

//             }

//         } else if (fromUnit.contains("pints")) {
//             if (toUnit.contains("liters")) {
//                 result = num * 0.4731;

//             } else if (toUnit.contains("gallons")) {
//                 result = num * 0.125;
//             }
//         }
//         return result;

//     }

//     double convertUnit(String fromUnit, int num, String toUnit) {

//         double result = 0;
        

//         // HashSet to store all lenght units.
//         HashSet<String> lenghtSet = new HashSet<>();
//         lenghtSet.add("inches");
//         lenghtSet.add("meters");
//         lenghtSet.add("feet");
//         lenghtSet.add("yards");

//         // HashSet to store all mass units.
//         HashSet<String> massSet = new HashSet<>();
//         massSet.add("grams");
//         massSet.add("ounces");

//         // HashSet to store all volume units.
//         HashSet<String> volSet = new HashSet<>();
//         volSet.add("liters");
//         volSet.add("gallons");
//         volSet.add("pints");

//         if (lenghtSet.contains(fromUnit) && lenghtSet.contains(toUnit)) {
//             // both units are from length.
//             result = convertLenght(fromUnit, num, toUnit);

//         } else if (massSet.contains(fromUnit) && massSet.contains(toUnit)) {
//             // both units are from mass
//             result = convertMass(fromUnit, num, toUnit);

//         } else if (volSet.contains(fromUnit) && volSet.contains(toUnit)) {
//             // both units are form volume.
//             result = convertVolume(fromUnit, num, toUnit);
//         } else {
//             // both units are different;
//             return -1;
//         }

//         return result;
//     }

//     // driver code.
//     public static void main(String[] ars) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Your question: ");
//         String que = sc.nextLine();
//         sc.close();

//         String strArr[] = que.split(" ");

//         String fromUnit = strArr[6];
//         int num = Integer.parseInt(strArr[5]);
//         String toUnit = strArr[2];

//         StringBuilder sb = new StringBuilder(fromUnit);

//         sb.deleteCharAt(fromUnit.length() - 1); // removing question mark from the last unit.

//         UnitConversion obj = new UnitConversion();
//         double result = obj.convertUnit(sb.toString(), num, toUnit);
//         if (result==-1){
//             System.out.println("Invalid conversion!");
//         }else{
//         System.out.println(num+" "+sb.toString()+" = "+result+" "+toUnit);
//         }

//     }
// }

// class Main{
//     public static void main(String[] args){
//         System.out.println("Code is working fine.");
//     }
// }

// class Vehicle{
//     String name;
//     String color;
//     String power;
//     int year;

//     // Default constructor...
//     Vehicle(){}

//     // Parameterized constructor
//     Vehicle(String name,String color,String power,int year){
//         this.name=name;
//         this.color=color;
//         this.power=power;
//         this.year=year;
//     }

//     void setName(String n){
//         name=n;
//     }
//     void setColor(String c){
//         color=c;
//     }
//     void setPower(String p){
//         power=p;
//     }
//     void setYear(int y){
//         year=y;
//     }
//     String getName(){
//         return name;
//     }
//     String getColor(){
//         return color;
//     }
//     String getPower(){
//         return power;
//     }
//     int getYear(){
//         return year;
//     }
//     public String toString(){

//     }
// }
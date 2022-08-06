// import java.nio.FloatBuffer;
// import java.util.ArrayList;

// import java.util.ArrayList;

// // public class Person {
// //     private String name;
// //     private String email;
// //     public String greet(){
// //         return "sendto: "+email+" Hi "+name+",\n";
// //     }
// //     public void setName(String new_name){
// //         name=new_name;
// //     }
// //     public String getName(){
// //         return name;
// //     }
// //     public void setEmail(String new_email){
// //         email=new_email;
// //     }
// //     public String getEmail(){
// //         return email;
// //     }
// // }

// // class Main{
// //     public static void main(String[] args){
// //         System.out.println(5&2);
// //     }
// // }
// // class Solution {
// //     public int maxArea(int[] height) {
// //         System.out.println("Method is called.");
// //         int i=0;
// //         int j=height.length-1;
// //         int max=0;
// //         while (i<j){
// //             System.out.println("Entering the loop.");
// //             System.out.println("i = "+i+", j = "+j);
// //             int temp;
// //             if (height[i]>height[j]){
// //                 System.out.println("Condition1");
// //                 temp=height[j]*(j-i);
// //                 j--;
// //             }else{
// //                 System.out.println("Condition2");
// //                 System.out.println("height[i] = "+height[i]);
// //                 System.out.println(j-i);
// //                 temp=height[i]*(j-i);
// //                 i++;
// //             }
// //             if (temp>max){
// //                 max=temp;
// //             }

// //         }
// //         return max;

// //     }
// //     public static void main(String[] args){
// //         Solution obj=new Solution();
// //         int height[]={1,8};
// //         int res=obj.maxArea(height);
// //         System.out.println(res);
// //     }
// // }

// public class {
//     protected static String customerName;
//     protected static double totalCustomerBalance=0;
//     protected static double totalPayments=0;
//     CustomerMaster(String customerName){
//         this.customerName=customerName;
//     }
// }
// class CustomerSales extends CustomerMaster{
//     public CustomerSales(String customerName,String salesDescription,double salesAmount){

//     }

// }CustomerMaster

// class Passenger{
//     String firstName;
//     String lastName;
//     long phoneNumber;
//     void setName(String firstName,String lastName){
//         this.firstName=firstName;
//         this.lastName=lastName;
//     }
// }
// class RoadTrip{
//     Passenger pass;
// }
// import java.io.FileWriter;
// import java.util.*;
// import java.io.*;

// class FileWriterExample {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter data separeated by space:");
//         try {
//             FileWriter fw = new FileWriter("testout.txt");
//             for (int i = 1; i < 10; i++) {

//                 String data = sc.nextLine();
//                 fw.write(data + "\n");
//             }
//             fw.close();
//             File file = new File("testout.txt"); 
//             FileReader fr = new FileReader(file); 
//             BufferedReader br = new BufferedReader(fr);
//             String arr[][]=new String[9][3];
//             String line;
//             int i=0;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//                 String line_arr[]=line.split(" ");
//                 arr[i][0]=line_arr[0];
//                 arr[i][1]=line_arr[1];
//                 arr[i][2]=line_arr[2];
//                 i++;
//             }
//             fr.close(); 
//             System.out.println(Arrays.deepToString(arr));
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         System.out.println("Success...");
//     }
// }

// class Shape{
//     String name;
//     Shape(String data){
//         name=data;
//     }

// }

//     public static void main(String[] args) {
//         int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 4 };
//         int k = 8;
//         System.out.println(threeSumMulti(arr, k));

//     }
// }
// import java.util.*;
// class University{
//     ArrayList<String> studentList;
//     ArrayList<String> faculty;
//     int nextStudentId;
//     University(){
//         studentList=new ArrayList<String>();
//         faculty= new ArrayList<String>();
//         nextStudentId=2000;
//     }
//     void hireProfessor(String name){
//         faculty.add(name);
//     }
// }

// import java.util.*;
// class Main{
//     public static double[] linearEquation(double[][]a,double[]b){
//         double a00=a[0][0],a01=a[0][1],a10=a[1][0],a11=a[1][1];
//         double b0=b[0],b1=b[1];
//         if (a00*a11-a01*a10==0){
//             return null;
//         }
//         double x=(b0*a11-b1*a01)/(a00*a11-a01*a10);
//         double y=(b1*a00-b0*a10)/(a00*a11-a01*a10);
//         double[] result={x,y};
//         return result;
//     }
//     public static void main(String[] args){
//         double a[][]=new double[2][2];
//         double b[]=new double[2];
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter (a00,a01,a10,a11,b0,b1) Separated by comma.");
//         String input=sc.nextLine();
//         String[] input_arr=input.split(",");
//         a[0][0]=Double.parseDouble(input_arr[0]);
//         a[0][1]=Double.parseDouble(input_arr[1]);
//         a[1][0]=Double.parseDouble(input_arr[2]);
//         a[1][1]=Double.parseDouble(input_arr[3]);
//         b[0]=Double.parseDouble(input_arr[4]);
//         b[1]=Double.parseDouble(input_arr[5]);
//         double[] result=linearEquation(a, b);
//         if (result==null){
//             System.out.println("The equation has no solution.");
//         }else{
//             System.out.println("x = "+result[0]);
//             System.out.println("y = "+result[1]);
//         }

//     }
// }

// import java.util.*;

// class Solution {
//     public static int threeSumMulti(int[] arr, int target) {
//         System.out.println("This method is called.");
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//         int i = 0;

//         int count = 0;
//         while (i < arr.length - 2) {
//             // System.out.println("Entering first loop.");
//             int j = i + 1;
//             int k = arr.length - 1;

//             while (j < k) {
//                 // System.out.println("Entering second loop.");
//                 System.out.println("i = " + i + " j = " + j + " k =" + k);
//                 int sum = arr[i] + arr[j] + arr[k];
//                 System.out.println("sum = " + sum);
//                 if (sum == target) {
//                     // System.out.println("Condition1(Satisfied), Increasing j");
//                     System.out.println("["+arr[i]+" "+arr[j]+" "+arr[k]+"]");
//                     count++;
//                     System.out.println("count = "+count);
//                     j += 1;
//                 } else if (sum < target) {
//                     // System.out.println("Condition2, Increasing j");
//                     j += 1;
//                 } else if (sum > target) {
//                     // System.out.println("Condition3, Decreasing k");
//                     k -= 1;
//                 }
//             }
//             // System.out.println("Increasing i");
//             i += 1;
//         }
//         return count;

//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 4 };
//         int k = 8;
//         System.out.println(threeSumMulti(arr, k));
//     }
// }
// // [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]

// class Main{
//     public static void swap(int a,int b){
//         int temp=a;
//         a=b;
//         b=temp;
//     }
//     public static void main(String[] args){
//         int a=10;
//         int b=20;
//         swap(a, b);
//         System.out.println(a+" "+b);

//     }
// }
// A Java program to demonstrate random number generation
// using java.util.Random;
// import java.util.Random;
// import java.util.*;

// class generateRandom {

//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         // // create instance of Random class
//         // Random rand = new Random();

//         // // Generate random integers in range 0 to 999
//         // int rand_int1 = rand.nextInt(1000);

//         // System.out.println("Random Integers: " + rand_int1);
//         // double a=1.333333;
//         // double roundOff = Math.round(a * 100.0) / 100.0;
//         // System.out.println(roundOff);
//         int n=0;
//         n=sc.nextInt();
//         System.out.println(n);

//     }
// }

// class Stack{
//     String stack[];
//     int capacity;
//     int top=-1;
//     Stack(int capacity){
//         this.capacity=capacity;
//         stack=new String[this.capacity];
//     }
//     void insert(String key){
//         top+=1;
//         stack[top]=key;
//     }
//     String pop(){
//         String res=stack[top];
//         stack[top]=null;
//         top-=1;
//         return res;
//     }
//     String top(){
//         if (top==-1){
//             return null;
//         }
//         return stack[top];
//     }
//     public static void main(String[] args){
//         Stack obj=new Stack(10);
//         obj.insert("G");
//         obj.insert("R");
//         obj.insert("T");
//         obj.insert("S");
//         obj.insert("V");
//         System.out.println(obj.pop());
//     }
// }

// class Dice{
//     int firstDie;
//     int secondDie;
//     Dice(){
//         this.firstDie = (int)(Math.random()*6+1);
//         this.secondDie = (int)(Math.random()*6+1);
//     }
//     void tossDie(){
//         this.firstDie = (int)(Math.random()*6+1);  
//         this.secondDie = (int)(Math.random()*6+1);  
//     }
//     int sum(){
//         return this.firstDie+this.secondDie;
//     }
//     public String toString(){
//         return this.firstDie+","+this.secondDie;
//     }
// }
// class Main{
//     public static void main(String[] args){
//         boolean arr[]=new boolean[12];
//         Dice obj=new Dice();
//         int a=obj.sum();
//         int sumArr[]=new int[11];
//         sumArr[0]=a;
//         System.out.println("******************************************");
//         System.out.println(obj.toString()+"("+a+")");
//         int count=1;
//         while (count<11){
//             obj.tossDie();
//             a=obj.sum();
//             System.out.println(obj.toString()+"("+a+")");
//             sumArr[count]=a;
//             count+=1;
//         }
//         System.out.println("******************************************");
//         int total=0;
//         for (int i=0;i<sumArr.length;i++){
//             if (arr[sumArr[i]]==false){
//                 total+=sumArr[i];
//                 arr[sumArr[i]]=true;
//                 System.out.println(i+1+": yes");
//             }else{
//                 System.out.println(i+1+": no");
//             }

//         }
//         System.out.println("Your total score: "+total);
//     }
// }

// import java.util.*;

// // Cylinder class
// class Cylinder {
//     String type;
//     int radius, height, volume; // one extra variable declared 'volume'

//     Cylinder(String ty, int rd, int hg) {
//         this.type = ty;
//         this.radius = rd;
//         this.height = hg;
//         // The value of pi is converted to integer because by default it's value is double.
//         // If you want you can set all the values to double. Here all values are taken as integer.
//         // Don't enter any double or float value ortherwise it will raise a typeError.
//         // If you want to proceed with double value then first change all the types to double.

//         this.volume = (int) Math.PI * this.radius * this.radius * this.height; // calculating volume of cylinder.

//     }

//     int getRadius() {
//         return this.radius;
//     }

//     int getHeight() {
//         return this.height;
//     }

//     int getVolume() {
//         return this.volume;
//     }

//     // This method will return string representaiton with type and volume.
//     public String toString() {
//         return this.type + " container with volume " + this.volume;
//     }
// }

// // You can set here your name.
// class XX_YourName_Lab07 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Creating an arraylist of type cylinder. It will store objects of Cylinder class.
//         ArrayList<Cylinder> arr = new ArrayList<Cylinder>();

//         // By default the loop will run five times only if you want you can change the length of loop.
//         for (int i = 0; i < 5; i++) {
//             System.out.print("Container type: ");
//             String type = sc.nextLine();
//             System.out.print("Radius: ");
//             int radius = sc.nextInt();
//             System.out.print("Height: ");
//             int height = sc.nextInt();
//             Cylinder object = new Cylinder(type, radius, height);
//             arr.add(object);
//             sc.nextLine();
//         }
//         System.out.println("\n****************************************************");

//         // Container search will continue untill the user won't press 3. 
//         while (true) {
//             System.out.println("\nContainer Search:\n1 By type \n2 by volume \n3 Quit \nYour selection?");
//             int user_choice = sc.nextInt();
//             sc.nextLine();
//             if (user_choice == 1) {
//                 System.out.print("Enter type: ");
//                 String type1 = sc.nextLine();
//                 for (Cylinder ele : arr) {
//                     if (ele.type.equals(type1)) {
//                         System.out.println(ele.toString());
//                     }
//                 }
//             } else if (user_choice == 2) {
//                 System.out.print("Enter volume: ");
//                 int vol = sc.nextInt();
//                 for (Cylinder ele : arr) {
//                     if (ele.volume == vol || ele.volume > vol) {
//                         System.out.println(ele.toString());
//                     }
//                 }
//             } else if (user_choice == 3) {
//                 break;

//             } else {
//                 // If the user press anything other than the choice then this block will be exeucted.
//                 System.out.println("Invalid choice.");
//             }

//         }

//     }

// }

// class Tree {

//     class Node {
//         int key;
//         Node left, right;

//         public Node(int item) {
//             key = item;
//             left = right = null;
//         }
//     }

//     Node root;

//     Tree() {
//         root = null;
//     }

//     void add(int key) {
//         root = insertKey(root, key);
//     }

//     // Insert key in the tree
//     Node insertKey(Node root, int key) {
//         // Return a new node if the tree is empty
//         if (root == null) {
//             root = new Node(key);
//             return root;
//         }

//         // Traverse to the right place and insert the node
//         if (key < root.key)
//             root.left = insertKey(root.left, key);
//         else if (key > root.key)
//             root.right = insertKey(root.right, key);

//         return root;
//     }

//     void inorder() {
//         inorderRec(root);
//     }

//     // Inorder Traversal
//     // Inorder Traversal prints the data in increasing order.
//     void inorderRec(Node root) {
//         if (root != null) {
//             inorderRec(root.left);
//             System.out.print(root.key + " -> ");
//             inorderRec(root.right);
//         }
//     }

//     // Driver Program to test above functions
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,12,13,5,6};
//         Tree tree = new Tree();
//         for (int ele:arr){
//             tree.add(ele);
//         }
//         System.out.print("Inorder traversal: ");
//         tree.inorder();
//     }
// }

// import java.awt.*;
// class Main{
//     public static void main(String[] args){
//         JTextField myOutput = new JTextField(16);
//         myOutput.setText("some text");
//     }
// }

// Java Program to create a
// blank label and add text to it.
// import java.awt.event.*;
// import java.awt.*;
// import javax.swing.*;
// import java.util.*;

// class text extends JFrame {

//     // frame
//     static JFrame f;
//     static JLabel l;

//     text() {
//     }

//     public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter name: ");
// String name = sc.nextLine();
// System.out.println("Enter salary: ");
// double salary = sc.nextDouble();
// double yearlyIncome = salary * 12;
// double tax = 0.05 * yearlyIncome;
// double netSalary = yearlyIncome - tax;
// f = new JFrame("Message");
// l = new JLabel();

// // add text to label
// String data = "Employee name: " + name + "\nhis salary : " + salary + "\nYearly income: " + yearlyIncome
//         + "\ntax is -" + tax + "net salary = " + netSalary;
// l.setText(data + "\n Vishal Singh");
// JPanel p = new JPanel();
// p.add(l);
// f.add(p);
// f.setSize(500, 400);

//         JPanel pMeasure = new JPanel();

//         JLabel economy = new JLabel("Economy");
//         JLabel regularity = new JLabel("Regularity");
//         pMeasure.setLayout(new BoxLayout(pMeasure, BoxLayout.Y_AXIS));
//         pMeasure.add(economy);
//         pMeasure.add(regularity);
//         f.show();
//     }
// }

// class 

// import java.util.*;

// // Cylinder class
// class Cylinder {
//     String type;
//     double radius, height, volume; // one extra variable declared 'volume'

//     Cylinder(String ty, double rd, double hg) {
//         this.type = ty;
//         this.radius = rd;
//         this.height = hg;

//         this.volume =Math.PI * this.radius * this.radius * this.height; // calculating volume of cylinder.

//     }

//     double getRadius() {
//         return this.radius;
//     }

//     double getHeight() {
//         return this.height;
//     }

//     double getVolume() {
//         return this.volume;
//     }

//     // This method will return string representaiton with type and volume.
//     public String toString() {
//         return this.type + " container with volume " + String.format("%.2f", this.volume);
//     }
// }

// // You can set here your name.
// class XX_YourName_Lab07 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Creating an arraylist of type cylinder. It will store objects of Cylinder class.
//         ArrayList<Cylinder> arr = new ArrayList<Cylinder>();

//         // By default the loop will run five times only if you want you can change the length of loop.
//         for (int i = 0; i < 5; i++) {
//             System.out.print("Container type: ");
//             String type = sc.nextLine();
//             System.out.print("Radius: ");
//             int radius = sc.nextInt();
//             System.out.print("Height: ");
//             int height = sc.nextInt();
//             Cylinder object = new Cylinder(type, radius, height);
//             arr.add(object);
//             sc.nextLine();
//         }
//         System.out.println("\n****************************************************");

//         // Container search will continue untill the user won't press 3. 
//         while (true) {
//             System.out.println("\nContainer Search:\n1 By type \n2 by volume \n3 Quit \nYour selection?");
//             int user_choice = sc.nextInt();
//             sc.nextLine();
//             if (user_choice == 1) {
//                 System.out.print("Enter type: ");
//                 String type1 = sc.nextLine();
//                 for (Cylinder ele : arr) {
//                     if (ele.type.equals(type1)) {
//                         System.out.println(ele.toString());
//                     }
//                 }
//             } else if (user_choice == 2) {
//                 System.out.print("Enter volume: ");
//                 int vol = sc.nextInt();
//                 for (Cylinder ele : arr) {
//                     if (ele.volume == vol || ele.volume > vol) {
//                         System.out.println(ele.toString());
//                     }
//                 }
//             } else if (user_choice == 3) {
//                 break;

//             } else {
//                 // If the user press anything other than the choice then this block will be exeucted.
//                 System.out.println("Invalid choice.");
//             }

//         }

//     }

// }

// import java.util.Stack; 
// import java.util.Scanner;
// class EvaluateString{

//     public static int evaluate(String expression){

//         char[] tokens = expression.toCharArray(); 

//         Stack<Integer> values = new Stack<Integer>(); 

//         Stack<Character> ops = new Stack<Character>(); 

//         for (int i = 0; i < tokens.length; i++){ 

//             if(tokens[i] == ' ') 
//                 continue; 

//             if(tokens[i] >= '0' && tokens[i] <= '9'){ 
//                 StringBuffer sbuf = new StringBuffer(); 

//                 while(i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9'){
//                     sbuf.append(tokens[i++]); 
//                 }

//                 values.push(Integer.parseInt(sbuf.toString())); 
//             } 

//             else if(tokens[i] == '(') 
//                 ops.push(tokens[i]); 

//             else if(tokens[i] == ')'){ 
//                 while (ops.peek() != '('){ 
//                   values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
//                 }  
//                 ops.pop(); 
//             } 

//             else if(tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/'){ 

//                 while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())){ 
//                   values.push(applyOp(ops.pop(), values.pop(), values.pop()));
//                 }  

//                 ops.push(tokens[i]); 
//             } 
//         } 

//         while(!ops.empty()){ 
//             values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
//         }    

//         return values.pop(); 
//     } 

//     public static boolean hasPrecedence(char op1, char op2){ 
//         if (op2 == '(' || op2 == ')') 
//             return false; 
//         if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
//             return false; 
//         else
//             return true; 
//     } 

//     public static int applyOp(char op, int b, int a){ 
//         switch (op){ 
//             case '+': 
//                 return a + b; 
//             case '-': 
//                 return a - b; 
//             case '*': 
//                 return a * b; 
//             case '/': 
//                 if (b == 0) 
//                     throw new
//                     UnsupportedOperationException("Cannot divide by zero"); 
//                 return a / b; 
//         } 
//         return 0; 
//     } 

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter infix expression.");
//         String expression=sc.nextLine();

//         System.out.println(evaluate(expression)); 

//     } 
// }

// import java.util.*;
// import java.util.Stack; 
// class EvaluateString{

//     public static int evaluate(String expression){
//         char[] tokens = expression.toCharArray(); 
//         Stack<Integer> values = new Stack<Integer>(); 
//         Stack<Character> ops = new Stack<Character>(); 
//         for (int i = 0; i < tokens.length; i++){ 
//             if(tokens[i] == ' ') 
//                 continue; 
//             if(tokens[i] >= '0' && tokens[i] <= '9'){ 
//                 StringBuffer sbuf = new StringBuffer(); 
//                 while(i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9'){
//                     sbuf.append(tokens[i++]); 
//                 }
//                 values.push(Integer.parseInt(sbuf.toString())); 
//             } 
//             else if(tokens[i] == '(') 
//                 ops.push(tokens[i]); 

//             else if(tokens[i] == ')'){ 
//                 while (ops.peek() != '('){ 
//                   values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
//                 }  
//                 ops.pop(); 
//             } 
//             else if(tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/'){ 

//                 while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())){ 
//                   values.push(applyOp(ops.pop(), values.pop(), values.pop()));
//                 }  
//                 ops.push(tokens[i]); 
//             } 
//         } 
//         while(!ops.empty()){ 
//             values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
//         }    
//         return values.pop(); 
//     } 
//     public static boolean hasPrecedence(char op1, char op2){ 
//         if (op2 == '(' || op2 == ')') 
//             return false; 
//         if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
//             return false; 
//         else
//             return true; 
//     } 

//     public static int applyOp(char op, int b, int a){ 
//         switch (op){ 
//             case '+': 
//                 return a + b; 
//             case '-': 
//                 return a - b; 
//             case '*': 
//                 return a * b; 
//             case '/': 
//                 if (b == 0) 
//                     throw new
//                     UnsupportedOperationException("Cannot divide by zero"); 
//                 return a / b; 
//         } 
//         return 0; 
//     } 
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("****Welcome to infix evalutor****");
//         System.out.print("Type an infix expression: ");
//         String expression=sc.nextLine();
//         String[] expressionArr=expression.split("");
//         String newExp="";
//         for (String ele:expressionArr){
//             newExp+=ele+" ";
//         }
//         int result=evaluate(newExp);
//         System.out.println("The result of the expression is: "+result); 
//         System.out.println("****Program ends****");
//     } 
// }

// class Person{
//         String name;
//         String address;
//         long phoneNumber;
//         String email;
//         Person(String name,String address,long phoneNumber,String email){
//                 this.name=name;
//                 this.address=address;
//                 this.phoneNumber=phoneNumber;
//                 this.email=email;
//         }
//         public String toString(){
//                 return "\nNAME: "+this.name+"\nADDRESS: "+this.address+"\nPHONE: "+this.phoneNumber+"\nEMAIL: "+this.email;
//         }
// }
// class Student extends Person{
//         String status;
//         Student(String name,String address,long phoneNumber,String email,String status){
//                 super(name, address, phoneNumber, email);
//                 this.status=status;

//         }
//         public String toString(){
//                 String res=super.toString()+"\nSTATUS: "+this.status;
//                 return res;
//         }
// }
// class Employee extends Person{
//         double salary;
//         String officeLocation;
//         Employee(String name,String address,long phoneNumber,String email,double salary,String officeLocation){
//                 super(name, address, phoneNumber, email);
//                 this.salary=salary;
//                 this.officeLocation=officeLocation;
//         }
//         public String toString(){
//                 String res=super.toString()+"\nSALARY: "+this.salary+"\nOFFICE_LOCATION: "+this.officeLocation;
//                 return res;
//         }
// }
// class Faculty extends Employee{
//         int officeHours;
//         int rank;
//         Faculty(String name,String address,long phoneNumber,String email,double salary,String officeLocation,int officeHours,int rank){
//                 super(name, address, phoneNumber, email, salary, officeLocation);
//                 this.officeHours=officeHours;
//                 this.rank=rank;
//         }

//         public String toString(){
//                 String res=super.toString()+"\nOFFICE_HOURS: "+this.officeHours+"\nRANK: "+this.rank;
//                 return res;
//         }
// }
// class Staff extends Employee{
//         String title;
//         Staff(String name,String address,long phoneNumber,String email,double salary,String officeLocation,String title){
//                 super(name, address, phoneNumber, email, salary, officeLocation);
//                 this.title=title;
//         }
//         public String toString(){
//                 String res=super.toString()+"\nTITLE: "+this.title;
//                 return res;
//         }
// }
// class Main{
//         public static void main(String[] args){
//                 Employee obj1=new Employee("XYZ", "ABCD", 1234576890, "abc@123gmail.con", 12000.00, "Near xyz");
//                 System.out.println(obj1);

//                 Student obj2=new Student("ABCD", "pars", 1234567090, "psra123@gamil.com", "Senior");
//                 System.out.println(obj2);
//         }
// }

// import java.util.*;

// class Main {
//         public static void main(String[] args){
//                 int arr[]={1,2,3,4,5};
//                 int firstNumber=arr[0];
//                 System.out.println("First number: "+firstNumber);
//                 int lastNumber=arr[arr.length-1];
//                 System.out.println("Last number: "+lastNumber);
//                 Scanner sc=new Scanner(System.in);

//                 int arr1[][]={{1,2,3,4,5},{2,3,4,5,6},{1,0,9,0,2},{2,0,2,3,4},};
//                 int sum=0;
//                 for (int i=0;i<5;i++){
//                         for (int j=0;j<10;j++){
//                                 sum+=arr1[i][j];
//                         }
//                 }

//         }
// }

// import java.util.*;
// class Main{
//         public static void main(String[] args){
//                 Scanner sc=new Scanner(System.in);
//                 System.out.print("For how many students do you have scores? ");
//                 int num1=sc.nextInt();
//                 System.out.print("How many test scores does each student have? ");
//                 int num2=sc.nextInt();
//                 for (int i=0;i<num1;i++){
//                         double score=0;
//                         for (int j=0;j<num2;j++){
//                                 System.out.print("Enter score "+(j+1)+" for student "+(i+1)+": ");
//                                 double tempScore=sc.nextInt();
//                                 score+=tempScore;
//                         }
//                         double avg=score/num2;
//                         System.out.println("The average score for student "+(i+1)+" is "+String.format("%.1f", avg));

//                 }
//         }
// }

// class Main{
//     public static void main(String[] args){
//         System.out.println("I am working well.");
//     }
// }

// class DoubleLikedList {
//     Node head,tail;

//     class Node {
//         int data;
//         Node next;
//         Node prev;

//         public Node(int key) {
//             data = key;
//             this.next = null;
//             this.prev = null;

//         }
//     }

//     public DoubleLikedList() {
//         head = null;
//         tail=null;
//     }

//     public void insert(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             tail=newNode;
//         } else {
//             tail.next=newNode;
//             newNode.prev=tail;
//             tail=newNode;
//         }
//     }

//     public boolean isEmpty(Node head) {
//         if (head == null) {
//             return true;
//         }
//         return false;
//     }
//     public void display(Node head){
//         Node temp=head;
//         while (temp!=null){
//             System.out.print(temp.data+"<->");
//             temp=temp.next;

//         }
//         System.out.println("null");
//     }
//     public Node findMax(Node head){
//         Node temp=head;
//         Node maxNode=temp;
//         while (temp!=null){
//             if (temp.data>=maxNode.data){
//                 maxNode=temp;
//             }
//             temp=temp.next;
//         }
//         // System.out.println("findMax method is called."+maxNode.data);
//         return maxNode;
//     }
//     public int maxSum(Node head){
//         int max=0;
//         while (head!=null && tail!=null){
//             display(head);
//             max+=findMax(head).data;
//             Node maxNode=findMax(head);
//             System.out.println("max ="+maxNode.data);
//             deleteNode(maxNode);
//             deleteNode(maxNode.next);
//             deleteNode(maxNode.prev);
//             System.out.println("ONCE");
//         }
//         display(head);
//         System.out.println("maxSum method  is called."+max);
//         return max;

//     }
//     public void deleteNode(Node toDelete){
//         if (toDelete==null){
//             return;
//         }
//         else if (toDelete.next!=null && toDelete.prev!=null){
//             toDelete.prev.next=toDelete.next;
//         }
//         else if (toDelete.next==null && toDelete.prev==null){
//             head=null;
//         } else if (toDelete.next==null && toDelete.prev!=null){
//             toDelete.prev.next=null;
//         }else if (toDelete.prev==null && toDelete.next!=null){
//             head=toDelete.next;
//             head.prev=null;

//         }
//         // if (toDelete.next)
//     }
//     public static void main(String[] args) {
//         DoubleLikedList obj = new DoubleLikedList();

//         obj.insert(100);
//         obj.insert(20); // Inserting a node.
//         obj.insert(30);
//         obj.insert(300);
//         obj.display(obj.head);

//         obj.maxSum(obj.head);
//         obj.deleteNode(obj.head.prev);
//         obj.display(obj.head);

//     }
// }
// class Main{
//     public ArrayList<Integer>removeInts(ArrayList<Integer>arrList){
//         ArrayList<Integer> arr=new ArrayList<>();
//         for (int ele:arrList){
//             if (ele%2!=0){
//                 arr.add(ele);
//             }
//         }
//         System.out.println(arr);
//         arrList=arr;
//         return arrList;
//     }
//     public static void main(String[] args){
//         ArrayList<Integer> arr=new ArrayList<Integer>();
//         arr.add(1);
//         arr.add(2);
//         arr.add(3);
//         arr.add(4);
//         arr.add(5);
//         arr.add(6);
//         arr.add(7);
//         arr.add(8);
//         arr.add(9);
//         arr.add(10);
//         System.out.println(arr);
//         Main obj=new Main();
//         obj.removeInts(arr);
//     }
// }

// import java.util.*;
// class Main {
//     public ArrayList<Integer> findTheString(ArrayList<String> arrList, ArrayList<String> stringsToFind) {
//         ArrayList<Integer> arrlist=new ArrayList<>();
//         for (int i=0;i<stringsToFind.size();i++){
//             String ele=stringsToFind.get(i);
//             if (arrList.contains(ele)){
//                 arrlist.add(arrList.indexOf(ele));
//             }else{
//                 arrlist.add(-1);
//             }
//         }
//         System.out.println(arrlist);
//         return arrlist;
//     }
//     public static void main(String[] args){
//         ArrayList<String> arrList=new ArrayList<>();
//         arrList.add("hello");
//         arrList.add("world");
//         arrList.add("my");
//         arrList.add("name");
//         ArrayList<String> stringsToFind=new ArrayList<>();
//         stringsToFind.add("hello");
//         stringsToFind.add("my");
//         stringsToFind.add("abcd");
//         stringsToFind.add("name");
//         Main obj=new Main();
//         obj.findTheString(arrList, stringsToFind);
//     }
// }

// class Main {
//     static NOINLINE int function3(int x)
// {
//    int y;
//    y = x / 10;

//    return (y);

// }
// }

// import java.util.*;
// class Vehicle {
//     private String manufacturer;
//     private Owner owner;

//     public Vehicle(String manufacturer,Owner owner){
//     this.manufacturer =manufacturer;
//     this.owner=owner;
//     }

//     public String getManufacturer() {
//     return manufacturer;
//     }

//     public Owner getOwner() {
//     return owner;
//     }

//     public void display(){
//     System.out.println("Manufacturer: "+this.manufacturer);
//     this.owner.display();
//     }
//     }

// class Car extends Vehicle {
//     private String model;
//     public String RegNumber;
//     private String carNoP;
//     private boolean registered = false;
//     private double price;
//     private ArrayList cars;
//     private int quantity;

//     public Car(String RegNumber, String manufacturer, Owner owner) {
//         super(manufacturer, owner);
//         this.RegNumber = RegNumber;
//     }

//     public Car(String manufacturer, Owner owner, String model, String RegNumber, String carNoP, double price) {
//         super(manufacturer, owner);

//         this.model = model;
//         this.RegNumber = RegNumber;
//         this.carNoP = carNoP;
//         this.price = price;
//     }

//     public Car(double price, String manufacturer, Owner owner) {
//         super(manufacturer, owner);
//         this.price = price;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     public String getModel() {
//         return model;
//     }

//     public void setModel(String model) {
//         this.model = model;
//     }

//     public String getRegNumber() {
//         return RegNumber;
//     }

//     public void setRegNumber(String RegNumber) {
//         this.RegNumber = RegNumber;
//     }

//     public boolean isRegistered() {
//         return registered;
//     }

//     public void setRegistered(boolean registered) {
//         this.registered = registered;
//     }

//     public int getQuantity() {
//         return quantity;
//     }

//     public void setQuantity(int quantity) {
//         this.quantity = quantity;
//     }

//     public void registerCar(String regNo) {
//         if (registered = false) {

//             RegNumber = regNo;
//             registered = true;
//         } else {
//             System.out.println("Registered");
//         }
//     }

//     public void display() {
//         super.display();
//         System.out.println("Model : " + model);
//         System.out.println("Car Plate Number: " + carNoP);
//         System.out.println("Registration Number: " + RegNumber);

//     }
// }

// class Owner {
//     private String name;
//     private String id;
//     private String phone;
//     private ArrayList<Car> cars;

//     public Owner(String name, String id, String phone) {
//         this.name = name;
//         this.id = id;
//         this.phone = phone;
//         cars = new ArrayList<>();
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public ArrayList getCarList() {
//         return cars;
//     }

//     public void setCarList(ArrayList<Car> c) {
//         this.cars = c;
//     }

//     public void buyCar(ArrayList<Car> carList) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Buying a Car: ");
//         System.out.println("Model:");
//         String model = in.nextLine();
//         System.out.println("Quantity:");
//         int quantity = Integer.parseInt(in.nextLine());
//         double total = 0;
//         int c = 0;
//         for (Car car : carList) {
//             if (car.getModel().equals(model)) {
//                 System.out.println("Bill:");
//                 System.out.println("Price: " + car.getPrice());
//                 System.out.println("Quantity: " + quantity);
//                 double p = car.getPrice() * quantity;
//                 total += p;
//                 System.out.println("Total: " + p);
//                 break;
//             }
//         }
//     }

//     public void makeRegistration(Car c) {
//         String RegNO = c.getRegNumber();
//         if (c.isRegistered() == false) {

//             c.RegNumber = RegNO;
//             c.setRegistered(true);
//         } else {
//             System.out.println(" Already Registered");
//         }

//     }

//     public void display() {
//         System.out.println("Owner Name: " + this.name);
//         System.out.println("Owner ID: " + this.id);
//         System.out.println("Owner phone: " + this.phone);
//     }

// }

// class Regestration

// import java.util.Scanner;
// import java.util.Collections;
// class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         ArrayList<Integer> arr=new ArrayList<Integer>();
//         System.out.println("Enter number: ");
//         while (true){
//             int num=sc.nextInt();
//             if (num==0){
//                 break;
//             }
//             arr.add(num);
//         }
//         System.out.println("Highest: "+Collections.max(arr));
//         System.out.println("Lowest: "+Collections.min(arr));

//     }
// }

// class Main{
//     static int p=rec(2);
//     public static int rec(int n){
//         int var=rec(n-1);
//         if (n==0){
//             return 1;
//         }else{
//             return (n*p);
//         }
//     }
//     public static void main(String[] args){

//     }
// }

// class Main{
//     int[] swap(int a,int b){
//         int temp=a;
//         int arr[]={a,b};
//         a=b;
//         b=temp;
//         return arr;
//     }
//     public static void main(String[] args){
//         int arrr[]={1,2,3,4,5};
//         for (int i=0;i<arrr)
//     }
// }

/*
* @author James Spoto
* @since 11/11/2019
* Eclipse was fusy
// */
// import java.util.Iterator;

// // import TreePackage.*;
// import Tree.BinaryTreeInterface;

// public class Labq9 {

//    public static void main(String[] args) {

//        BinaryTreeInterface<String> dTree = new BinaryTree<>();
//        dTree.setTree("D", null, null);

//        BinaryTreeInterface<String> fTree = new BinaryTree<>();
//        fTree.setTree("F", null, null);

//        BinaryTreeInterface<String> gTree = new BinaryTree<>();
//        gTree.setTree("G", null, null);

//        BinaryTreeInterface<String> hTree = new BinaryTree<>();
//        hTree.setTree("H", null, null);

//        BinaryTreeInterface<String> emptyTree = new BinaryTree<>();

//        // Form larger subtrees
//        BinaryTreeInterface<String> eTree = new BinaryTree<>();
//        eTree.setTree("E", fTree, gTree); // Subtree rooted at E

//        BinaryTreeInterface<String> bTree = new BinaryTree<>();
//        bTree.setTree("B", dTree, eTree); // Subtree rooted at B

//        BinaryTreeInterface<String> cTree = new BinaryTree<>();
//        cTree.setTree("C", emptyTree, hTree); // Subtree rooted at C

//        BinaryTreeInterface<String> aTree = new BinaryTree<>();
//        aTree.setTree("A", bTree, cTree); // Desired tree rooted at A

//        // Display root, height, number of nodes
//        System.out.println("Root of tree contains " + aTree.getRootData());
//        System.out.println("Height of tree is " + aTree.getHeight());
//        System.out.println("Tree has " + aTree.getNumberOfNodes() + " nodes");

//        // Display nodes in preorder
//        System.out.println("A preorder traversal visits nodes in this order:");
//        Iterator<String> preorder = aTree.getPreorderIterator();
//        while (preorder.hasNext())
//            System.out.print(preorder.next() + " ");
//        System.out.println();

//    }

// }
// import java.util.ArrayList;
// class Student {
//     String firstName, lastName;
//     double gpa;

//     Student(String fname, String lname, double g) {
//         firstName = fname;
//         lastName = lname;
//         gpa = g;
//     }

//     double getGpa() {
//         return gpa;
//     }
// }
// class Course {

//     private ArrayList<Student> roster;

//     public Course() {
//         roster = new ArrayList<Student>();
//     }

//     // Return an ArrayList of all Students with a GPA of at least 3.5
//     public ArrayList<Student> getDeansList() {
//         ArrayList<Student>deanList=new ArrayList<Student>();
//         for (Student ele:roster){
//             if (ele.gpa>3.5 || ele.gpa==3.5){
//                 deanList.add(ele);
//             }
//         }
//         return deanList;
//     }

//     public void addStudent(Student s) {
//         roster.add(s);
//     }

//     // main
//     public static void main(String args[]) {
//         Course course = new Course();
//         ArrayList<Student> deanList = new ArrayList<Student>();
//         String first; // first name
//         String last; // last name
//         double gpa; // grade point average

//         first = "Henry";
//         last = "Nguyen";
//         gpa = 3.5;
//         course.addStudent(new Student(first, last, gpa)); // Add 1st student

//         first = "Brenda";
//         last = "Stern";
//         gpa = 2.0;
//         course.addStudent(new Student(first, last, gpa)); // Add 2nd student

//         first = "Lynda";
//         last = "Robison";
//         gpa = 3.2;
//         course.addStudent(new Student(first, last, gpa)); // Add 3rd student

//         first = "Sonya";
//         last = "King";
//         gpa = 3.9;
//         course.addStudent(new Student(first, last, gpa)); // Add 4th student

//         deanList = course.getDeansList();
//         System.out.println("Dean's list:");
//         for (Student student : deanList) {
//             System.out.println(student); // Expect: ArrayList with Henry and Sonya
//         }
//     }
// }

// class Main{
//     public static int int_recursive(int n){
//         int result=0;
//         for (int i=n;i>=0;i++){
//             result+=i*i;
//         }

//         return result;
//     }
//     public static void main(String[] args){
//         // int_recursive(10)
//         System.out.println(10);
//     }
// }

// class MyCalendar {
//     class Event {
//         int start;
//         int end;
//         Event next;

//         Event(int s, int e) {
//             start = s;
//             end = e;
//         }
//     }

//     Event head;

//     public MyCalendar() {
//         head = null;

//     }

//     public boolean book(int start, int end) {
//         Event newEvent = new Event(start, end);
//         if (head == null) {

//             head = newEvent;
//             return true;
//         }
//         Event temp = head;

//         while (temp.next != null) {

           
//             if (newEvent.end <= temp.start || temp.end <= newEvent.start) {
//                 temp = temp.next;
//             } else {

//                 return false;
//             }
//         }
//         if (newEvent.end <= temp.start || temp.end <= newEvent.start) {
//             temp.next = newEvent;
//             temp = temp.next;
//             return true;
//         }
//         return false;

        

//     }

//     public static void main(String[] args) {

//         MyCalendar obj = new MyCalendar();
//         System.out.println(obj.book(47, 50));
//         System.out.println(obj.book(33, 41));
//         System.out.println(obj.book(39, 45));
//     }
// }
// // ["MyCalendar","book","book","book","book","book","book","book","book","book","book"]
// // [[],[47,50],[33,41],[39,45],[33,42],[25,32],[26,35],[19,25],[3,8],[8,13],[18,27]]


// import java.io.FileWriter;  
// import java.io.IOException;

// class Main{
//     public static void main(String[] args){
//         // System.out.println("Code is working fine.");
//         File file=new File("MyFile.txt");

//     }
// }


// Java Program to illustrate
// reading from Text File
// using Scanner Class




import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class ReadFromFileUsingScanner
{
public static void main(String[] args) throws Exception
{
	
	File file = new File("MyFile.txt");
	Scanner inputFile = null;
    try{
        inputFile=new Scanner(file);
        while (inputFile.hasNext()){
            System.out.println(inputFile.nextLine());
        }
    }
    catch(IOException e){
       
        System.out.println(e.toString());
    }
    finally{
        inputFile.close();
    }
}
}

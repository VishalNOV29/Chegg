// import java.lang.reflect.Array;
// import java.util.Arrays;

// // import java.util.Scanner;
// // class BinaryTree{
// //     public static void main(String[] args){
// //         System.out.println("HEllo vishal kumar singh.");
// //         BinaryTree obj=new BinaryTree();
// //         Node res=obj.createTree();
// //         System.out.println("Root is "+res.data);
// //     }
// //     class Node{
// //         int data;
// //         Node left,right;
// //         public Node(int key){
// //             data=key;
// //             left=right=null;
// //         }
// //     }
// //     public Node createTree(){
// //         Node root;
// //         Scanner sc=new Scanner(System.in);
// //         System.out.print("Enter data: ");
// //         int key=sc.nextInt();
// //         if (key==-1){
// //             return null;
// //         }
// //         root =new Node(key);
// //         System.out.println("Enter data for left of "+root.data);
// //         root.left=createTree();

// //         System.out.println("Enter data for right of "+root.data);
// //         root.right=createTree();
// //         // sc.close();
// //         return root;

// //     }
// // }

// import java.util.Scanner;
// import java.util.Arrays;

// class Vishal {
//     public void addName() {
//         Scanner sc = new Scanner(System.in);

//         while (true) {
//             System.out.print("How many name(s) you have:");
//             int num = sc.nextInt();
//             sc.nextLine();
//             if (num == -1) {
//                 System.out.println("Bye!");
//                 break;
//             }
//             if (num > 5) {
//                 System.out.println("Sorry You can't have more than " + num
//                         + " names stored in our system! Enter -1 to exit this program.");
//             } else {
//                 String nameArr[] = new String[num];
//                 System.out.println("Enter your " + num + " names separated by + then hit the Enter Key:");
//                 String name = sc.nextLine();
//                 String nameList[] = name.split("\\+");
//                 for (int i = 0; i < nameList.length; i++) {
//                     nameArr[i] = nameList[i].toUpperCase();
//                 }
//                 Arrays.sort(nameArr);
//                 System.out.println("Thank you!");
//                 System.out.println("You entered:");
//                 System.out.println(Arrays.toString(nameArr));
//                 while (true) {
//                     System.out.print(
//                             "Do you want to make a change to any of the entered names (enter y/Y for yes or e/E to exit program):");
//                     String user_choice = sc.nextLine();
//                     if (user_choice.equals("y") || user_choice.equals("Y")) {
//                         System.out.print("Enter the name you would like to change:");
//                         String nameToChange = sc.nextLine();
//                         if (Arrays.asList(nameArr).contains(nameToChange.toUpperCase())) {
//                             System.out.print("Enter the new name: ");
//                             String newName = sc.nextLine();
//                             for (int i = 0; i < nameArr.length; i++) {
//                                 if (nameArr[i].equals(nameToChange.toUpperCase())) {
//                                     nameArr[i] = newName.toUpperCase();
//                                     break;
//                                 }
//                             }
//                             System.out.println("Go it! Here is the new list.");
//                             System.out.println(Arrays.toString(nameArr));

//                         } else {
//                             System.out.print("Sorry no such name in your list. Would you like to add " + nameToChange
//                                     + " to the list? enter y/Y for yes or n/N for no.");
//                             String user_choice1 = sc.nextLine();
//                             System.out.println(nameArr.length);
//                             if (user_choice1.equals("Y") || user_choice1.equals("y")) {
//                                 if (nameArr.length < 5) {
//                                     for (int i = 0; i < nameArr.length; i++) {
//                                         if (nameArr[i].equals(null)) {
//                                             nameArr[i] = nameToChange.toUpperCase();
//                                             break;
//                                         }

//                                     }
//                                     System.out.println(nameToChange + " added to the list. Here is your new list. ");
//                                     System.out.println(Arrays.toString(nameArr));

//                                 } else {
//                                     System.out.println("Sorry you can't add a new name as you already have 5 names!");
//                                 }

//                             }

//                         }

//                     } else {
//                         break;
//                     }
//                 }

//             }
//             System.out.println("Goodbye!");
//             break;

//         }

//     }

//     public static void main(String[] args) {
//         Vishal obj = new Vishal();
//         obj.addName();

//     }
// }

// // import java.util.*;

// // class Hello {
// //     public static void main(String[] args) {
// //        String name[]={"Vishla","kuarm"};
// //        String new_name="vishu";
// //        for (int i=0;i<name.length;i++){
// //            if (name[i].equals("Vishla")){
// //                name[i]=new_name;
// //                break;
// //            }
// //        }
// //        System.out.println(Arrays.toString(name));
// //     }
// // }

// switch (main) {
//     case value:

//         break;

//     default:
//         break;
// }

// switch(menu){

//     case 1:
//     y=m*x+c;
//     break;

//     case 2:
//     y=a*x*x+b*x+c;
//     break;

//     case 3:
//     y=a*Math.pow(x,3)+c*x+d;
//     break;

//     case 4:
//     y=a*log(x);
//     break;

//     case 5:
//     y=a*log(x);
//     break;

//     default:
//     y=a;
// }

// import java.util.Scanner;
// class StudyTonight 
// { 
// 	public static void main(String[] args)   
// 	{ 
// 		Scanner sc = new Scanner(System.in);   
//         System.out.print("Enter: ");
// 		if(sc.hasNextInt()) {
// 		   System.out.println(sc.nextFloat()+" is valid Integer");
// 		}
// 		else
// 		{
// 			 System.out.println(sc.nextInt()+" is valid Integer");
// 		}
// 		sc.close();
// 	} 
// }

// class Hello{
// 	static int myFun(int num){
// 		if (num==1){
// 			return -5;
// 		}
// 		System.out.println(myFun(num-1)+(2*num*num));
// 		return myFun(num-1)+(2*num*num);
// 	}
// 	public static void main(String[] args){
// 		System.out.println("I am working fine.");
// 		// Hello obj=new Hello();
// 		myFun(10);
// 	}
// }
//Fibonacci Series using Recursion
// class fibonacci
// {
// 	static int fib(int n)
// 	{
// 	if (n <= 1)
// 	return n;
// 	return fib(n-1) + fib(n-2);
// 	}

// 	public static void main (String args[])
// 	{
// 	int n = 9;
// 	System.out.println(fib(n));
// 	}
// }
// /* This code is contributed by Rajat Mishra */
// class Node{
// 	int data;
// 	Node next;
// 	public Node(int val){
// 		data=val;
// 	}
// }
// class ThinkLinkedBag{
// 	Node head;
// 	public ThinkLinkedBag(){
// 		head=null;
// 	}
// 	public void addElement(int val){
// 		Node newNode=new Node(val);
// 		if (head==null){
// 			head=newNode;
// 		}else{
// 			Node temp=head;
// 			while (temp.next!=null){
// 				temp=temp.next;
// 			}
// 			temp.next=newNode;
// 		}

// 	}
// 	public void display(){
// 		Node temp=head;
// 		while (temp!=null){
// 			System.out.print(temp.data);
// 		}
// 		System.out.println("->");

// 	}
// 	public static void main(String[] args){
// 		ThinkLinkedBag obj=new ThinkLinkedBag();
// 		obj.addElement(3);
// 		obj.addElement(5);
// 		obj.addElement(8);
// 		obj.addElement(9);
// 		obj.display();
// 	}

// }

// interface Edible {
//     void myStatus(); // Abstract method.
// }

// class Animal {
//     // Parent class method.
//     void myMethod() {
//         System.out.println("This is Animal class.");
//     }
// }

// class Fruits implements Edible {
//     // Defining body of abstract method.
//     public void myStatus() {
//         System.out.println("This is a abstract method.");
//         System.out.println("This is Fruit class.");
//     }

// }

// class Apple extends Fruits {
//     void myMethod() {
//         super.myStatus(); // Calling parent class method.
//         System.out.println("This is apple class.");
//     }

// }

// class Orange extends Fruits {
//     void myMehtod() {
//         super.myStatus(); // Calling parent class method.
//         System.out.println("This is Orange class.");
//     }

// }

// class Goat extends Animal {
//     void myMehtod() {
//         super.myMethod(); // Calling parent class method.
//         System.out.println("This is Goat class");
//     }

// }

// class Lion extends Animal {

//     void myMehtod() {
//         super.myMethod(); // Calling parent class method.
//         System.out.println("This is Lion class");
//     }

// }

// class Final {
//     public static void main(String[] args) {

//         Orange orange = new Orange();
//         orange.myStatus();

//         Apple apple = new Apple();
//         apple.myStatus();

//         Lion lion = new Lion();
//         lion.myMehtod();

//         Goat goat = new Goat();
//         goat.myMehtod();

//     }

// }

// class KWArrayList{

//     public void Quiz(){
//         // int arr=[1,2,3,4,5,6]
//         int theData[]={1,2,3,4,5,6,7};
//         int size=theData.length;
//         if (size==1){
//             return;
//         }
//         int  v;
//         for (int i=0;i<size/2;i++){
//             v=theData[i];
//             theData[i]=theData[i+size-1];
//             theData[i+size-1]=v;
//         }
//         System.out.println(Arrays.toString(theData));
//     }
//     public static void main(String[] args){
//         KWArrayList obj=new KWArrayList();
//         obj.Quiz();
//     }
// }

// import java.util.*;

// public class Main {
//     public int searchForFirstOccurance() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the length of the array: ");
//         int len = sc.nextInt();
//         int arr[] = new int[len];
//         System.out.println("Enter elements: ");
//         for (int i = 0; i < len; i++) {
//             int ele = sc.nextInt();
//             arr[i] = ele;
//         }
//         System.out.println("Enter the key: ");
//         int key = sc.nextInt();
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 return i + 1; // Return the position of the element (not index)
//                 // If you want the index of element then replace i+1 by i
//             }
//         }
//         return -1;

//     }

//     public static void main(String[] args) {
//         Main obj = new Main();
//         int result = obj.searchForFirstOccurance();
//         System.out.println("Output = "+result);

//     }
// }

// class Node {
//     int data;
//     Node next;

//     public Node(int val) {
//         data = val;
//         next = null;
//     }
// }

// class LinkedList {
//     Node head;

//     public LinkedList() {
//         head = null;
//     }
//     void insertNode(int val){
//         Node newNode=new Node(val);
//         if (head==null){
//             head=newNode;
//         }else{
//             Node current=head;
//             while (current.next!=null){
//                 current=current.next;
//             }
//             current.next=newNode;
//         }
//     }
//     void displayNode(){
//         Node current=head;
//         while (current!=null){
//             System.out.print(current.data+"->");

//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args){
//         LinkedList obj=new LinkedList();
//         System.out.println(obj.head);
//     }
// }

// class Main{
//     public static void main(String[] args){
//         System.out.println("Hello world.");
//     }
// }

// class Main{
//     static int areaCode;
//     static int exchange;
//     static int lastFour;
//     static String result;
//     public static String myMethod(int x,int y,int z){
//         areaCode=x;
//         exchange=y;
//         lastFour=z;
//         result=String.valueOf(areaCode)+"-"+String.valueOf(exchange)+"-"+String.valueOf(lastFour);
//         return result;
//     }
//     public static void main(String[] args){
//        String res=myMethod(800,555, 1212);
//        String res1=myMethod(212,867,5309);

//        System.out.println(res);
//        System.out.println(res1);
//     }
// }

// def myFun()

// class Main{
//     static double  convert2euro(Double bd){
//         return bd;
//     }
//     static void convert(){
//         double res = convert2euro(10.55);
//         System.out.println(res);

//     }
//     public static void main(String[] args){
//         // double res=convert();
//         convert();
//     }
// }

// import java.util.*;
// import java.util.ArrayList;

// class Solution {
//     public static int calPoints(String[] ops) {
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         for (int i = 0; i < ops.length; i++) {
//             if (ops[i] == "C") {
//                 System.out.println("Condition1");
//                 arr.remove(arr.size() - 1);
//             } else if (ops[i] == "D") {
//                 System.out.println("Condition2");
//                 int ele = arr.get(arr.size() - 1) * 2;
//                 arr.add(ele);
//             } else if (ops[i] == "+") {
//                 System.out.println("Conditio4");
//                 int ele = arr.get(arr.size() - 1) + arr.get(arr.size() - 2);
//                 arr.add(ele);
//             } else {
//                 System.out.println("Condition5");
//                 int ele = Integer.parseInt(ops[i]);
//                 arr.add(ele);
//             }
//         }
//         int sum = 0;
//         for (int ele : arr) {
//             System.out.print("ele = " + ele + " \n");
//             sum += ele;
//         }
//         return sum;
//     }
// }
// import java.io.*;
// import java.io.FileWriter;

// class Main {
//     static void writeFile2() throws IOException {
//         FileWriter fw = new FileWriter("out.txt");
//         for (int i = 0; i < 10; i++) {
//             fw.write("something");
//         }
//         fw.close();
//     }

//     public static void main(String[] args) {
//         System.out.println("Code is running");
//         writeFile2();

//     }
// }

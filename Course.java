// import java.util.Arrays;

// import javax.naming.spi.DirStateFactory.Result;

// import java.lang.reflect.InvocationTargetException;
// import java.util.ArrayList;
// import java.util.Scanner;

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
// public class Course {
//     private ArrayList<Student> roster;
//     public Course() {
//         roster = new ArrayList<Student>();
//     }
//     // Return an ArrayList of all Students with a GPA of at least 3.5
//     public ArrayList<Student> getDeansList() {
//         ArrayList<Student> deanList = new ArrayList<Student>();
//         for (Student ele : roster) {
//             if (ele.gpa > 3.5 || ele.gpa == 3.5) {
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
//             // System.out.println(student);// It will only print the memory locaton of both objects.
//             System.out.println(student.firstName+" "+student.lastName+" "+student.gpa); 
//         }
//     }
// }
// class Main{
//     public static void main(String[] args){
//         System.out.println("Code is running correctly.");
//     }
// }

// import java.util.*;
// class Stats {
//     private int[] numA;
//     private int maxSize = 20;

//     Stats() {
//         numA = new int[maxSize];
//     }

//     Stats(int arr[]) {
//         numA = arr;
//     }

//     int[] getA() {
//         return numA;
//     }

//     void setA(int arr[]) {
//         numA = arr;
//     }

//     int getMaxSize() {
//         return maxSize;
//     }

//     void setMaxSize(int a) {
//         maxSize = a;
//     }

//     double average() {
//         double total = 0;
//         for (int i = 0; i < numA.length; i++) {
//             total += numA[i];

//         }
//         return total / numA.length;
//     }

//     int mode() {
//         int maxValue = 0, maxCount = 0, i, j;

//         for (i = 0; i < numA.length; ++i) {
//             int count = 0;
//             for (j = 0; j < numA.length; ++j) {
//                 if (numA[j] == numA[i])
//                     ++count;
//             }

//             if (count > maxCount) {
//                 maxCount = count;
//                 maxValue = numA[i];
//             }
//         }
//         return maxValue;
//     }

// }

// class FirstnameLastnameLab11 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Number of elements in arr?:");
//         int len = sc.nextInt();
//         int arr[] = new int[len];
//         System.out.println("Enter elements: ");
//         for (int i = 0; i < len; i++) {
//             int num = sc.nextInt();
//             arr[i] = num;
//         }
//         Stats obj = new Stats(arr);
//         double avg = obj.average();
//         int mod = obj.mode();
//         System.out.println("Average : " + avg);
//         System.out.println("Mode : " + mod);

//     }
// }

// class Main{
//     // public static void insert_before_after(int val,int insertVal,int c){

//     // }
//     public static void main(String[] args){
//         ArrayList<Integer>arr=new ArrayList<Integer>();
//         arr.add(2, 20);
//         System.out.println(arr);
//     }
// }

// class List {
//     Node head;

//     List() {
//         head = null;
//     }

//     class Node {
//         String data;
//         Node next;

//         Node(String val) {
//             data = val;
//         }
//     }

//     void addNode(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;

//         } else {
//             Node tempNode = head;
//             while (head.next != null) {
//                 tempNode = tempNode.next;
//             }
//             tempNode.next = newNode;

//         }

//     }

//     void display(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         List obj = new List();
//         obj.addNode("Vishal");
//         obj.addNode("Kumar");
//         obj.addNode("Singh");
//         System.out.println(obj.head.data);
//         obj.display(obj.head);
//         // System.out.println("code is running.");
//     }
// }

// import java.util.*;

// class LinkedList {
//     Node head;

//     static class Node {
//         String data;
//         Node next;

//         Node(String d) {
//             data = d;
//             next = null;
//         }
//     }

//     public static LinkedList findDifference(LinkedList list1, LinkedList list2) {
//         Set<String> data1 = new HashSet<String>();
//         Set<String> data2 = new HashSet<String>();
//         Node temp1 = list1.head;
//         while (temp1 != null) {
//             data1.add(temp1.data);
//             temp1 = temp1.next;
//         }
//         Node temp2 = list2.head;
//         while (temp2 != null) {
//             data2.add(temp2.data);
//             temp2 = temp2.next;
//         }
//         data1.removeAll(data2);

//         LinkedList newList = new LinkedList();
//         String[] newData = data1.toArray(new String[data1.size()]);
//         for (int i = 0; i < newData.length; i++) {
//             newList = insert(newList, newData[i]);
//         }
//         return newList;
//     }

//     public static LinkedList insert(LinkedList list, String data) {

//         Node new_node = new Node(data);
//         new_node.next = null;
//         if (list.head == null) {
//             list.head = new_node;
//         } else {
//             Node last = list.head;
//             while (last.next != null) {
//                 last = last.next;
//             }
//             last.next = new_node;
//         }
//         return list;
//     }

//     public static void printList(LinkedList list) {
//         Node currNode = list.head;
//         if (currNode==null){
//             System.out.println("Empty.");
//         }
//         while (currNode != null) {
//             System.out.print(currNode.data + " ");
//             currNode = currNode.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         LinkedList list1 = new LinkedList();
//         list1 = insert(list1, "A");
//         list1 = insert(list1, "D");
//         list1 = insert(list1, "B");
//         System.out.print("list1: ");
//         printList(list1);

//         LinkedList list2 = new LinkedList();
//         list2 = insert(list2, "C");
//         list2 = insert(list2, "A");
//         list2 = insert(list2, "D");
//         list2 = insert(list2, "F");
//         System.out.print("list2: ");
//         printList(list2);
//         LinkedList temp = findDifference(list1, list2);
//         System.out.print("final list: ");

//         printList(temp);

//     }
// }

// class Main {
//     static boolean isSubset(int arr1[],
//             int arr2[], int m,
//             int n) {
//         int i = 0;

//         sort(arr1, 0, m - 1);
//         for (i = 0; i < n; i++) {
//             if (binarySearch(arr1,
//                     0, m - 1,
//                     arr2[i]) == -1)
//                 return false;
//         }

//         return true;
//     }

//     static int binarySearch(int arr[],
//             int low, int high,
//             int x) {
//         if (high >= low) {

//             int mid = (low + high)
//                     / 2;

//             if ((mid == 0 || x > arr[mid - 1])
//                     && (arr[mid] == x))
//                 return mid;
//             else if (x > arr[mid])
//                 return binarySearch(arr,
//                         (mid + 1), high,
//                         x);
//             else
//                 return binarySearch(arr, low,
//                         (mid - 1), x);
//         }
//         return -1;
//     }

//     static int partition(int arr[], int low, int high) {
//         int pivot = arr[high];
//         int i = (low - 1);

//         for (int j = low; j < high; j++) {

//             if (arr[j] <= pivot) {
//                 i++;

//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }

//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;

//         return i + 1;
//     }

//     static void sort(int arr[], int low, int high) {
//         if (low < high) {
//             int pi = partition(arr, low, high);
//             sort(arr, low, pi - 1);
//             sort(arr, pi + 1, high);
//         }
//     }
//     public static void main(String args[]) {
//         int arr1[] = { 1,2,3,4,5,6,7,8,9,10 };
//         int arr2[] = { 1,2,3,4,5 };

//         int m = arr1.length;
//         int n = arr2.length;

//         if (isSubset(arr1, arr2, m, n))
//             System.out.print("arr2[] is subset of arr1[] ");
//         else
//             System.out.print(
//                     "arr2[] is not a subset of arr1[]");
//     }
// }

// Java program for implementation of Insertion Sort
// class InsertionSort {
//     // Function to sort array (Insertion Sort).
//     void insertionSort(int arr[]) {
//         int n = arr.length;
//         for (int i = 1; i < n; ++i) {
//             int key = arr[i];
//             int j = i - 1;

//             // Finding the right place for the key in left part of the array (left part is sorted).
//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j = j - 1;
//             }
//             arr[j + 1] = key;
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = { 12, 11, 13, 5, 6 };
//         System.out.println("Unsorted Array : " + Arrays.toString(arr));
//         InsertionSort obj = new InsertionSort();
//         obj.insertionSort(arr);

//         System.out.println("Sorted Array : " + Arrays.toString(arr));
//     }
// }

// class BinarySearch {
//     // Returns index of x if it is present in arr[l..r], else return -1
//     int binarySearch(int arr[], int l, int r, int x) {
//         if (r >= l) {
//             int mid = l + (r - l) / 2;
//             // If the element is present at the middle itself
//             if (arr[mid] == x)
//                 return mid;
//             // If element is smaller than mid, then it can only be present in left subarray
//             if (arr[mid] > x)
//                 return binarySearch(arr, l, mid - 1, x);

//             // Else the element can only be present in right subarray
//             return binarySearch(arr, mid + 1, r, x);
//         }
//         // We reach here when element is not present in array
//         return -1;
//     }

//     // Function to call binarySearch() function.
//     public static void binSearch(int arr[],int key) {
//         BinarySearch ob = new BinarySearch();

//         int n = arr.length;
//         int result = ob.binarySearch(arr, 0, n - 1, key);
//         if (result == -1)
//             System.out.println("Element not present");
//         else
//             System.out.println("Element found at index "
//                     + result);
//     }

//     public static void main(String args[]) {
//         int arr1[]={1,2,3,4,5,6,7,8};
//         binSearch(arr1,5);
//         binSearch(arr1, 10);

//     }
// }

// class Rectangle {
//     double TOLERANCE = 0.001;
//     double x;
//     double y;
//     double width;
//     double height;

//     Rectangle(double x, double y, double width, double height) {
//         this.x = x;
//         this.y = y;
//         this.width = width;
//         this.height = height;
//     }

//     double getX() {
//         return x;
//     }

//     double getY() {
//         return y;
//     }

//     double getWidth() {
//         return width;
//     }

//     double getHeight() {
//         return height;
//     }
//     // boolean aeq(double a,double b){

//     // }
//     double [][] subdivide(int across,int down){
//         int m=(int)width/across;
//         int n=(int)height/down;
//         double res[][]=new double[m][n];
//         res[0][0]=x;
//         res[]
//         for (int i=0;i<m;i++){
//             for (int j=0;j<n;j++){
//                 res[i][j]=y
//                 y=y*(j+1);
//             }
//             x=x*(i+1);
//         }
//         return res;
//     }

// }

// class Person{
//     String name;
//     int yearOfBirth;
//     Person(String n,int y){
//         name = n;
//         yearOfBirth=y;
//     }
//     public  String toString(){
//         return name+" "+yearOfBirth;
//     }
// }
// class Student extends Person{
//     String major;
//     Student(String n,int y,String m){
//         super(n, y);
//         major=m;
//     }
//     public String toString(){
//         return name+" "+yearOfBirth+" "+major;
//     }
// }
// class Instructor extends Person{
//     double salary;
//     Instructor(String n,int y,double s){
//         super(n, y);
//         salary=s;
//     }
//     public String toString(){
//         return name+" "+yearOfBirth+" "+salary;
//     }
// }
// class PersonDemo{
//     public static void main(String[] args){
//         Person p1=new Person("Larry", 1950);
//         Person p2=new Student("Joe", 1985, "Computer Science");
//         Person p3=new Instructor("Sally", 1970, 40000);

//         System.out.println(p1);
//         System.out.println(p2);
//         System.out.println(p3);
//     }
// }

// class Business{
//     String name;
//     int numberOfEmployee;
//     Business(String n,int num){
//         name=n;
//         numberOfEmployee=num;
//     }
//     public static void main(String[] args){
//         Theater the=new Theater("Numare", 23, 50);
//         the.printInfo();
//     }
// }
// class Theater extends Business{
//     int numSeats;
//     Theater(String n,int num,int n2){
//         super(n, num);
//         numSeats=n2;

//     }
//     void printInfo(){
//         System.out.println("Name : "+name);
//         System.out.println("Number of Employee : "+numberOfEmployee);
//         System.out.println("Number of seats : "+numSeats);
//     }
// }

// import java.util.Scanner;
// class Hangman {
//     private static String[] words = { "mango", "banana", "computer", "cow", "rain", "water","apple","egg","coconut","youcandoanything" };
//     private static String word = words[(int) (Math.random() * words.length)];
//     private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
//     private static int count = 0;

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         while (count < 7 && asterisk.contains("*")) {
//             System.out.println("Guess any letter in the word");
//             System.out.println(asterisk);
//             String guess = sc.next();
//             hang(guess);
//         }
//         sc.close();
//     }

//     public static void hang(String guess) {
//         String newasterisk = "";
//         for (int i = 0; i < word.length(); i++) {
//             if (word.charAt(i) == guess.charAt(0)) {
//                 newasterisk += guess.charAt(0);
//             } else if (asterisk.charAt(i) != '*') {
//                 newasterisk += word.charAt(i);
//             } else {
//                 newasterisk += "*";
//             }
//         }

//         if (asterisk.equals(newasterisk)) {
//             count++;
//             hangmanImage();
//         } else {
//             asterisk = newasterisk;
//         }
//         if (asterisk.equals(word)) {
//             System.out.println("Correct! You win! The word was " + word);
//         }
//     }

//     public static void hangmanImage() {
//         if (count == 1) {
//             System.out.println("Wrong guess, try again");
//         }
//         if (count == 2) {
//             System.out.println("Wrong guess, try again");
//         }
//         if (count == 3) {
//             System.out.println("Wrong guess, try again");
//         }
//         if (count == 4) {
//             System.out.println("Wrong guess, try again");
//         }
//         if (count == 5) {
//             System.out.println("Wrong guess, try again");
//         }
//         if (count == 6) {
//             System.out.println("Wrong guess, try again");
//         }
//         if (count == 7) {
//             System.out.println("GAME OVER!");
//             System.out.println("GAME OVER! The word was " + word);
//         }
//     }
// }

// class Main{
//     public static int int_recursive(int n){
//         int result=0;
//         for (int i=n;i>=0;i--){
//             result+=i*i;
//         }

//         return result;
//     }
//     public static void main(String args[]){
//         System.out.println(int_recursive(10));
//     }
// }

/*package whatever //do not write package name here */

// import java.io.*;
// import java.util.*;

// class Node {
// 	int data;
// 	Node next;

// 	Node(int key)
// 	{
// 		data = key;
// 		next = null;
// 	}
// }
// // Class implements Comparator to compare Node data
// class NodeComparator implements Comparator<Node> {

// 	public int compare(Node k1, Node k2)
// 	{
// 		if (k1.data > k2.data)
// 			return 1;
// 		else if (k1.data < k2.data)
// 			return -1;
// 		return 0;
// 	}
// }
// class GFG {
// 	// Function to merge k sorted linked lists
// 	static Node mergeKList(Node[] arr, int K)
// 	{
// 		// Priority_queue 'queue' implemented
// 		// as min heap with the help of
// 		// 'compare' function
// 		PriorityQueue<Node> queue
// 			= new PriorityQueue<>(new NodeComparator());
// 		Node at[] = new Node[K];
// 		Node head = new Node(0);
// 		Node last = head;
// 		// Push the head nodes of all
// 		// the k lists in 'queue'
// 		for (int i = 0; i < K; i++) {
// 			if (arr[i] != null) {
// 				queue.add(arr[i]);
// 			}
// 		}
// 		// Handles the case when k = 0
// 		// or lists have no elements in them
// 		if (queue.isEmpty())
// 			return null;
// 		// Loop till 'queue' is not empty
// 		while (!queue.isEmpty()) {
// 			// Get the top element of 'queue'
// 			Node curr = queue.poll();

// 			// Add the top element of 'queue'
// 			// to the resultant merged list
// 			last.next = curr;
// 			last = last.next;
// 			// Check if there is a node
// 			// next to the 'top' node
// 			// in the list of which 'top'
// 			// node is a member
// 			if (curr.next != null) {
// 				// Push the next node of top node
// 				// in 'queue'
// 				queue.add(curr.next);
// 			}
// 		}
// 		// Address of head node of the required
// 		// merged list
// 		return head.next;
// 	}
// 	// Print linked list
// 	public static void printList(Node node)
// 	{
// 		while (node != null) {
// 			System.out.print(node.data + " ");
// 			node = node.next;
// 		}
// 	}

// 	public static void main(String[] args)
// 	{
// 		int N = 4;
// 		// array to store head of linkedlist
// 		Node[] a = new Node[N];
// 		// Linkedlist1
// 		Node head1 = new Node(1);
// 		a[0] = head1;
// 		head1.next = new Node(2);
// 		head1.next.next = new Node(3);
// 		// Limkedlist2
// 		Node head2 = new Node(4);
// 		a[1] = head2;
// 		head2.next = new Node(5);
// 		// Linkedlist3
// 		Node head3 = new Node(5);
// 		a[2] = head3;
// 		head3.next = new Node(6);
// 		// Linkedlist4
// 		Node head4 = new Node(7);
// 		a[3] = head4;
// 		head4.next = new Node(8);

// 		Node res = mergeKList(a, N);

// 		if (res != null)
// 			printList(res);
// 		System.out.println();
// 	}
// }

// class Main {
// 	public static void main(String[] args) {
// 		String str = "sphinx of black quartz judge my vow";
// 		for (int i = str.length() - 1; i >= 0; i--) {
// 			boolean check = checkLetter(str.charAt(i));
// 			if (check) {
// 				System.out.println(str.charAt(i));
// 			}
// 		}
// 	}

// 	private static boolean checkLetter(char inLetter) {
// 		switch (inLetter) {
// 			case 'a':
// 			case 'e':
// 			case 'i':
// 			case 'o':
// 			case 'u':
// 				return true;
// 			default:
// 				return false;

// 		}
// 	}
// }

// import java.util.*;
// class ArrayList{
// 	public static void main(String[] args){
// 		ArrayList obj=new ArrayList();
// 		obj.add("A");
// 		obj.add("B");
// 		obj.add("C");
// 		obj.add(2,"D");
// 		System.out.println(obj);
// 	}
// }

// class array_outpyt {
// 	public static void main(String args[]) {
// 		int array_variable[] = new int[10];
// 		for (int i = 0; i < 10; ++i) {
// 			array_variable[i] = i;
// 			System.out.println(array_variable[i] + " ");
// 			i++;
// 		}

// 	}
// }

// class A{
// 	public int i;
// 	public int j;
// 	A(){
// 		i=1;
// 		j=2;
// 	}
// }
// class B extends A{
// 	int a;
// 	B(){
// 		super();
// 	}
// }
// class super_use{
// 	public static void main(String args[]){
// 		B obj=new B();
// 		System.out.println(obj.i+" "+obj.j);
// 	}
// }

// class A {
// 	public int i;
// 	public int j;
// }

// class B extends A {
// 	void display() {
// 		super.j = super.i + 1;
// 		System.out.println(super.i + " " + super.j);

// 	}
// }

// class inheritance {
// 	public static void main(String[] args) {
// 		B obj = new B();
// 		obj.i = 1;
// 		obj.j = 2;
// 		obj.display();
// 	}

// }

// class Main

// import java.util.Queue;
// import java.util.Scanner;
// import java.util.LinkedList;

// class PalindromeTest {

// 	public static void main(String[] args) {

// 		System.out.print("Enter any string:");
// 		Scanner in = new Scanner(System.in);
// 		String inputString = in.nextLine();
// 		Queue queue = new LinkedList();

// 		for (int i = inputString.length() - 1; i >= 0; i--) {
// 			queue.add(inputString.charAt(i));
// 		}

// 		String reverseString = "";

// 		while (!queue.isEmpty()) {
// 			reverseString = reverseString + queue.remove();
// 		}
// 		if (inputString.equals(reverseString))
// 			System.out.println("The input String is a palindrome.");
// 		else
// 			System.out.println("The input String is not a palindrome.");

// 	}
// }
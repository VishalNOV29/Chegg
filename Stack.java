//Stack using array....
// import java.util.Scanner;
// class Stack{
//     public Scanner sc=new Scanner(System.in);
//     int stack[];
//     int top;
//     public Stack(){
//         top=-1;
//         System.out.println("Enter the length of stack.");
//         int leng=sc.nextInt();
//         stack=new int[leng];

//     }
//     public void push(int data){
//         if (top==stack.length){
//             System.out.println("Stakc is overflow");
//         }
//         else{
//             top+=1;
//             stack[top]=data;
//         }
//     }
//     public int pop(){
//         if (top==-1){
//             // System.out.println("Stack is underflow.");
//             return -1;
//         }
//         else{
//             int ele=stack[top];
//             stack[top]=0;
//             top-=1;
//             return ele;
//         }
//     }
//     public void display(){
//         while (top!=-1){
//             System.out.println(stack[top]);
//             top-=1;
//         }
//     }
//     public static void main(String args[]){
//         Stack obj = new Stack();
//         obj.push(10);
//         obj.push(20);
//         obj.push(30);
//         obj.push(40);
//         obj.push(50);
//         obj.push(60);
//         obj.display();
//         System.out.println("Poping element from the stack.");
//         obj.pop();
//         obj.display();
//     }
// }

// import java.util.*;
// class Main{

//     public static void reoccur(int count){
//         System.out.println(count);
//         reoccur(count+1);
//     }
//     public static void main(String[] args){
//         // reoccur(1);
//         Scanner sc=new Scanner(System.in);
//         String choice=sc.nextLine();
//         if (choice=="Apple"){
//             System.out.println("Gravity");
//         }else{
//             System.out.println("Space");
//         }

//     }
// }

// class Main{
//     public static void main(String[] args){
//         float num=1.22323f;
//         System.out.println("%.2f",num);
//     }
// }

// import java.util.*;

// class VendingMachine {
//     static Scanner sc = new Scanner(System.in);
//     static float currentBalance = 0;

//     public static void printBanner(int n) {
//         for (int i = 0; i < n * n + 1; i++) {
//             if (i == n) {
//                 System.out.println("**************** CMSC 102 --Vending Machine ********************");

//             } else {
//                 System.out.println("****************************************************************");
//             }
//         }

//     }

//     public static void printBalance() {
//         System.out.println(currentBalance);

//     }

//     public static void deposit(float amount) {
//         currentBalance += amount;

//     }

//     public static void purchase() {
//         String product[] = { "P1", "P2", "P3", "p4", "P5" };
//         float prices[] = { 100, 200, 3000, 400, 500 };
//         System.out.println("Which item want to purchase (P1,P2,P3,P4,P5) ? ");
//         String user_choice = sc.nextLine();
//         float price = 0;

//         for (int i = 0; i < product.length; i++) {
//             if (product[i].equals(user_choice)) {
//                 price = prices[i];
//                 break;
//             }
//         }

//         System.out.println("Product price : " + price);
//         System.out.println("Current Balance : " + currentBalance);
//         if (price > currentBalance) {
//             System.out.println("Insufficient Balance : " + (price - currentBalance));
//         } else {
//             System.out.println("Product purchased sucessfully.");
//         }

//     }

//     public static void main(String[] args) {
//         printBanner(2);
//         printBalance();
//         deposit(500);
//         printBalance();
//         purchase();-
//     }
// }

// class Main{
//     public static void main(St)
// }
// class Solution {
//     public void reverseString(char[] s) {
//         int i=0;
//         int j=s.length-1;
//         while (i<=j){
//             char temp=s[i];
//             s[i]=s[j];
//             s[j]=temp;
            
//         }
//         return s;
        
//     }
// }

class Animal{
    String name;

    public Animal(String name){
        this.name=name;
        
    }
    String getName(){
        return this.name;
    }
    int getLegs(){
        return 4;
    }
    boolean canFly(){
        return false;
    }
    void testAnimal(){
        System.out.println(this.name);
        System.out.println(this.getLegs());
        System.out.println(this.canFly());
    };
    
}

class Dog{
    String name;
    public Dog(String name){
        this.name=name;
    }
}
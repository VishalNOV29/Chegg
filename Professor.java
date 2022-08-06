// public class Professor extends Lecturer {
//     private int budget;
//     public void setBudget(int new_budget){
//         budget=new_budget;
//     }
//     public int getBudget(){
//         return budget;
//     }

// }

// import java.util.Random;
// import java.util.*;

// class Main {
//     public static Scanner sc = new Scanner(System.in);

//     public static void myFun1() {
//         System.out.println("Print numbers in ascending order.\n");
//         System.out.println("Enter first number: ");
//         int firstNum = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int secondNum = sc.nextInt();
//         System.out.println("Enter third number: ");
//         int thirdNum = sc.nextInt();
//         int arr[] = { firstNum, secondNum, thirdNum };
//         Arrays.sort(arr);
//         for (int ele : arr) {
//             System.out.print(ele + " ");
//         }
//         System.out.println();
//     }

//     public static void myFun2() {
//         System.out.println("Check number is divisible by 5 and 11.\n");
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         if (num % 5 == 0 && num % 11 == 0) {
//             System.out.println("Divisible");
//         } else {
//             System.out.println("Not divisible");
//         }
//     }

//     public static void myFun3() {
//         System.out.println("Calculate profit and loss percentage.\n");
//         System.out.println("Enter purchase price: ");
//         double purchasePrice = sc.nextDouble();
//         System.out.println("Enter sale price: ");
//         double sellPrice = sc.nextDouble();
//         if (purchasePrice < sellPrice) {
//             double profitPercent = ((sellPrice - purchasePrice) / purchasePrice) * 100;
//             System.out.println("Profit percent : " + profitPercent);
//         } else {
//             double lossPercent = ((purchasePrice - sellPrice) / purchasePrice) * 100;
//             System.out.println("Loss percent : " + lossPercent);

//         }

//     }

//     public static void myFun4() {
//         System.out.println("Display salary information.\n");
//         double income[] = new double[6];
//         System.out.println("Enter your income of six month: ");
//         double total = 0;
//         for (int i = 0; i < 6; i++) {
//             double inc = sc.nextDouble();
//             total += inc;
//             income[i] = inc;
//         }
//         Arrays.sort(income);
//         System.out.println("Total : " + total + ", Average :" +Math.round(total/income.length * 100.0) / 100.0 + ", Maximum : "
//                 + income[income.length - 1] + ", Minimum : " + income[0]);
//     }

//     public static void myFun5() {
//         System.out.println("Count total number of odd numbers.\n");
//         System.out.println("Enter odd numbers: ");
//         int count = 0;
//         while (true) {
//             int num = sc.nextInt();
//             if (num % 2 == 0) {
//                 break;
//             }
//             count += 1;
//         }
//         System.out.println("Total odd numbers : " + count);
//     }

//     public static void myFun6() {
//         System.out.println("First 10 prime numbers.\n");
//         int ct = 0, n = 0, i = 1, j = 1;
//         while (n < 10) {
//             j = 1;
//             ct = 0;
//             while (j <= i) {
//                 if (i % j == 0)
//                     ct++;
//                 j++;
//             }
//             if (ct == 2) {
//                 System.out.printf("%d ", i);
//                 n++;
//             }
//             i++;
//         }
//     }

//     public static void myFun7() {
//         System.out.println("Grade calculator.\n");
//         System.out.println("Enter your score: ");
//         int score = sc.nextInt();
//         String grade;
//         if (score > 90 && score < 100) {
//             grade = "A";
//         } else if (score > 80 && score < 89) {
//             grade = "B";
//         } else if (score > 70 && score < 79) {
//             grade = "C";
//         } else if (score > 60 && score < 69) {
//             grade = "D";
//         } else {
//             grade = "E";
//         }
//         System.out.println("Grade : " + grade);
//     }

//     public static void myFun8() {
//         sc.nextLine();
//         System.out.println("Car net price after discount.\n");
//         System.out.println("Enter the brand of the car: ");
//         String brand = sc.nextLine();
//         System.out.println("Enter the price of the car: ");
//         double price = sc.nextDouble();
//         double netPrice=0;
//         if (brand.equals("Toyota")) {
//             if (price <= 50000) {
//                 netPrice = price - (price / 100) * 5;
//             } else if (price > 50001 && price <= 100000) {
//                 netPrice = price - (price / 100) * 7.5;
//             } else if (price >= 100001) {
//                 netPrice = price - (price / 100) * 10;
//             }
//         } else if (brand.equals("Honda")) {
//             if (price <= 50000) {
//                 netPrice = price - (price / 100) * 7;
//             } else if (price > 50001 && price <= 100000) {
//                 netPrice = price - (price / 100) * 10;
//             } else if (price >= 100001) {
//                 netPrice = price - (price / 100) * 12;
//             }
//         }
//         System.out.println("Brand : "+brand+"\nNet Price : "+netPrice);
//     }
//     public static void myFun9(){
//         System.out.println("Finding value of y.\n");
//         for (int x=1;x<=19;x+=2){
//             int y=3+x*x+5*x+7;
//             System.out.println("x = "+x+", y = "+y);

//         }

//     }
//     public static void myFun10(){
//         System.out.println("Generate 1000 random numbers.\n");
//         int arr[]=new int[1000];
//         Random rand = new Random();
//         for(int i=0;i<1000;i++){
//             int rand_int = rand.nextInt(100)+1;
//             arr[i]=rand_int;
//         }
//         int count=0;
//         for (int ele:arr){
//             if (ele>=30 && ele<=40){
//                 count+=1;
//             }
//         }
//         System.out.println("Total numbers = "+count);
//     }
//     public static void main(String[] args){
//         System.out.println("Question 1:-");
//         myFun1();
//         System.out.println("\nQuestion 2:-");
//         myFun2();
//         System.out.println("\nnQuestion 3:-");
//         myFun3();
//         System.out.println("\nQuestion 4:-");
//         myFun4();
//         System.out.println("\nQuestion 5:-");
//         myFun5();
//         System.out.println("\nQuestion 6:-");
//         myFun6();
//         System.out.println("\nQuestion 7:-");
//         myFun7();
//         System.out.println("\nQuestion 8:-");
//         myFun8();
//         System.out.println("\nQuestion 9:-");
//         myFun9();
//         System.out.println("\nQuestion 10:-");
//         myFun10();
//     }
// }
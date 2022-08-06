// import java.util.ArrayList;
// import java.util.Arrays;

// // In the code I'm going to explain the code of liear search in a array.
// // import java.util.Scanner;
// // class Searching{
// //     public static void main(String[] args){
// //         Scanner sc=new Scanner(System.in);
// //         System.out.printf("Enter elements separated by space. ");
// //         String numbers=sc.nextLine();
// //         String numbers_arr[]=numbers.split(" ");
// //         int arr[]=new int[numbers_arr.length];
// //         for (int i=0;i<arr.length;i++){
// //             arr[i]=Integer.parseInt(numbers_arr[i]);
// //         }
// //         System.out.printf("Enter the number to search: ");
// //         int number=sc.nextInt();
// //         boolean check=false;
// //         int index=-1;
// //         for (int i=0;i<arr.length;i++){
// //             if (arr[i]==number){
// //                 check=true;
// //                 index=i;   
// //             }
// //         }
// //         if (check==true){
// //             System.out.println("Element found at index "+index);
// //         }else{
// //             System.out.println("Element doesn't found in the array.");
// //         }

// //     }

// // }

// // Binary Search.......
// // class BinarySearch {
// //     public int check(int[] arr, int ele, int low, int high) {
// //         int nu = 0;
// //         while (low <= high) {
// //             int mid = (low + high) / 2;
// //             if (arr[mid] == ele) {
// //                 return mid;
// //             } else {
// //                 if (ele < arr[mid]) {
// //                     return check(arr, ele, low, mid - 1);
// //                 } else if (ele > arr[mid]) {
// //                     return check(arr, ele, mid + 1, high);
// //                 }
// //             }

// //         }
// //         return nu;
// //     }
// //     public static void main(String[] args){
// //         BinarySearch obj=new BinarySearch();
// //         int arr[]={1,2,3,4,5,6};
// //         int ele=5;
// //         int low=0;
// //         int high=arr.length;
// //         int res=obj.check(arr, ele, low, high);
// //         System.out.println(res);
// //     }
// // }

// // class Main{

// //     public static void main(String[] args){
// //         int[][] myArr=new int[10][2];
// //         System.out.println(Arrays.toString(myArr[1]));
// //         myArr[1][1]+=20;
// //         System.out.println(Arrays.toString(myArr[1]));
// //         System.out.println(Arrays.toString(myArr[0]));
// //     }
// // }
// class Solution {
//     public List<List<Integer>> findWinners(int[][] matches) {

//     }

//     public static void main(String[] args) {
//         // ArrayList<ArrayList<Integer>> matches=new ArrayList<ArrayList<>>();
//         ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
//         Solution obj = new Solution();
//         obj.findWinners(matches);
//     }
// }

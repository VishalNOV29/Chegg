// public class CoffeeMaker {
//     private int cupsWater;
//     private int scoopsCoffee;
//     private int cupsCoffee;
//     private boolean isOn;

//     public CoffeeMaker() {
//     };

//     public void addCoffee(int amount) {
//         this.scoopsCoffee += amount;
//         System.out.println("Coffee is added.");
//     }

//     public void addaWater(int amount) {
//         this.cupsWater += amount;
//         System.out.println("Water is added to the coffee.");
//     }

//     public void turnOn() {
//         this.isOn = true;
//         System.out.println("Stove is turned ON.");
//     }

//     public void brewCoffee() {
//         this.cupsCoffee = this.cupsWater;
//         this.cupsWater = 0;
//         this.isOn = false;
//         System.out.println("Coffee is ready.");
//     }

//     public void pour(int numCups) {
//         if (this.cupsCoffee > 0) {
//             if (numCups < this.cupsCoffee) {
//                 throw new IllegalStateException("not enouth coffee");
//             }
//             this.cupsCoffee -= numCups;
//         }
//     }

//     public int getCupsCoffee() {
//         return this.cupsCoffee;
//     }

//     public int getCupsWater() {
//         return this.cupsWater;
//     }

//     public static void main(String[] args) {
//         CoffeeMaker obj = new CoffeeMaker();
//         obj.addCoffee(20);
//         obj.addaWater(10);
//         obj.turnOn();
//         obj.brewCoffee();

//         System.out.println(obj.getCupsCoffee());
//         obj.getCupsCoffee();
//     }

// }
// class Solution {
//     public static int lengthOfLIS(int[] nums) {

//         int length = 1;
//         if (nums.length == 1) {
//             return length;
//         } else {
//             int i = 0, j = 0;
//             while (j < nums.length - 1) {
//                 int nextEle = nums[j + 1];
//                 int currentEle = nums[j];
//                 if (nextEle > currentEle) {
//                     j++;
//                 } else {
//                     int temp_length = (j - i) + 1;
//                     if (temp_length > length) {
//                         System.out.println("Comparing lenght inside the loop.");
//                         System.out.println("length = "+temp_length);
//                         length = temp_length;
//                     }
//                     j++;
//                     i = j;
//                 }
//             }
//             int out_length = (j - i) + 1;
//             if (out_length > length) {
//                 System.out.println("Comparing length outside the loop.");
//                 length = out_length;
//             }

//         }
//         return length;

//     }

//     public static void main(String[] args) {
//         int arr[] = {4,5,1,2,3 };
//         System.out.println(lengthOfLIS(arr));
//     }
// }

// temperature=float(input("Enter the temperature in degree C"))
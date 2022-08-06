// import java.util.Arrays;
// import java.util.*;

// class Item {
//     private String sProductName;
//     private String sProductDescription;
//     private double dUnitPrice;
//     int nUnit;

//     Item() {
//         sProductName = "";
//         sProductDescription = "";
//         dUnitPrice = 0.0;
//         nUnit = 0;
//     }

//     Item(String name, String desc, double price, int count) {
//         sProductName = name;
//         sProductDescription = desc;
//         dUnitPrice = price;
//         nUnit = count;
//     }

//     public void setName(String name) {
//         sProductName = name;

//     }

//     public void setDesc(String desc) {
//         sProductDescription = desc;

//     }

//     public void setPirce(double price) {
//         dUnitPrice = price;
//     }

//     public void setUnit(int num) {
//         nUnit = num;
//     }

//     public String getName() {
//         return sProductName;
//     }

//     public String getDescription() {
//         return sProductDescription;
//     }

//     public double getPrice() {
//         return dUnitPrice;
//     }

//     public int getUnit() {
//         return nUnit;
//     }

//     public double calculateUnitTotal() {
//         double totalPrice = dUnitPrice * nUnit;
//         return totalPrice;
//     }

//     public String toString() {
//         return "\nNAME: " + sProductName + "\nDESC: " + sProductDescription + "\nPRICE: " + dUnitPrice + "\nUNITS: "
//                 + nUnit;
//     }
// }

// public class ShoppingCart {
//     private Item rgItems[];
//     int iNumOfItems = 0;

//     ShoppingCart() {
//         rgItems = new Item[20];
//     }

//     public int getiNumOfItems() {
//         return iNumOfItems;
//     }

//     public void addItem(Item item) {
//         if (iNumOfItems == 20) {
//             System.out.println("Maximum limit reached.");
//         } else {
//             rgItems[iNumOfItems] = item;
//             iNumOfItems++;
//         }
//     }

//     public double getTotal() {
//         double total = 0;
//         for (Item ele : rgItems) {
//             total += ele.calculateUnitTotal();
//         }
//         return total;
//     }

//     public String toString() {
//         String sOut = "";
//         for (int i = 0; i < rgItems.length; i++) {
//             if (rgItems[i] == null) {
//                 break;
//             }
//             sOut += rgItems[i].toString() + "\n";
//         }
//         return sOut;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ShoppingCart obj = new ShoppingCart();
//         System.out.println("<<<<<WELCOME>>>>>");
//         while (true) {
//             System.out.println("\n1.Add item\n2.Display Cart Items\n3.Quit");
//             String user_choice = sc.nextLine();

//             if (user_choice.equals("1")) {

//                 System.out.print("Enter product name: ");
//                 String name = sc.nextLine();

//                 System.out.print("Enter product description: ");
//                 String desc = sc.nextLine();

//                 System.out.print("Enter unit price: ");
//                 double price = sc.nextDouble();

//                 System.out.print("Enter number of units: ");
//                 int unit = sc.nextInt();

//                 Item item = new Item(name, desc, price, unit);
//                 obj.addItem(item);
//                 sc.nextLine();

//             } else if (user_choice.equals("2")) {

//                 if (obj.rgItems[0] == null) {
//                     System.out.println("Empty Cart.");
//                 } else {

//                     System.out.println("Item list.....");
//                     System.out.println("**************************************");
//                     System.out.println(obj.toString());
//                     System.out.println("**************************************");
//                 }
//             } else if (user_choice.equals("3")) {

//                 System.out.println("THANKS FOR VISITING CART...!");
//                 break;
//             } else {

//                 System.out.println("Invalid option");
//             }

//         }
//     }
// }



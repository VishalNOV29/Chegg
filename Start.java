
// class Animal{
//     String name;

//     public Animal(String name){
//         this.name=name;

//     }
//     String getName(){
//         return this.name;
//     }
//     int getLegs(){
//         return 4;
//     }
//     boolean canFly(){
//         return false;
//     }
//     void testAnimal(){
//         System.out.println(this.name);
//         System.out.println(this.getLegs());
//         System.out.println(this.canFly());
//     };

// }

// class Dog extends Animal{
//     String name;
//     // public Dog(String name){
//         // this.name=name;
//     }
// }
// public class Start {
//     public static void main(String[] args){

//     }

// }

// class Whatsit{
//     private int myM;
//     private char myZ;
//     public Whatsit(){
//         myM=0;myZ='a';
//     }
//     public char getZ(){
//         return myZ;
//     }
//     public void setM(int R){
//         myM=R;
//     }
//     public String  toString(){
//         return "M = "+myM+", Z = "+myZ;
//     } 
//     public static void main(String[] args){
//         Whatsit Gamma= new Whatsit();
//         System.out.println(Gamma);
//     }
// }
// public class Car {
//     public static boolean hasDigit(String car) {
//         for (int i = 0; i < car.length(); i++)
//             if (Character.isDigit(car.charAt(i)))
//                 return true;
//         return false;
//     }

//     public static void main(String[] args) {
//         // defining a scanner to read user input
//         Scanner scanner = new Scanner(System.in);
//         String carMake = null;
//         // create an array of 8 Strings
//         String[][] carMakes = new String[8][2];
//         // looping for 8 times
//         for (int i = 0; i < carMakes.length; i++) {

//             // asks the user what make car they want to buy
//             System.out.print("What car do you want to buy?: ");
//             // reads the user input
//             carMake = scanner.nextLine();
//             // looping as long as input is either blank or has a digit or longer than 6
//             while (carMake.isEmpty() || hasDigit(carMake) || carMake.length() > 6) {
//                 if (carMake.isEmpty())
//                     // asks the user again
//                     System.out.print("Input should not be empty, try again: ");
//                 if (hasDigit(carMake))
//                     // asks the user again
//                     System.out.print("Input should not contain digits, try again: ");
//                 if (carMake.length() > 6)
//                     // asks the user again
//                     System.out.print("Input should have a maximum of six characters, try again: ");
//                 // reads the user input
//                 carMake = scanner.nextLine();
//             }
//             // prints the user input once validation is complete
//             System.out.println("You have chosen " + carMake + ".\n");
//             carMakes[i][0] = carMake;
//             carMakes[i][1] = " ";
//         }

//         // print the cars in inventory
//         for (int i = 0; i < carMakes.length; i++) {
//             System.out.println(carMakes[i][0]);
//         }

//         // ask to enter a car name
//         System.out.print("Enter car name to search: ");
//         // read car name
//         String car = scanner.nextLine();
//         // initialize index to -1
//         int index = -1;
//         // iterate through each car in array
//         for (int i = 0; i < carMakes.length; i++) {
//             // set index to i if found at index i
//             if (carMakes[i][0].equals(car))
//                 index = i;
//         }
//         // if index is -1
//         if (index == -1) {
//             // then car is not found
//             System.out.println(car + " is not found!");
//         }
//         // if index is not -1
//         else {
//             // print the index where car is found
//             System.out.println(car + " is found at index " + index);
//             System.out.println();
//             // print other cars in array
//             System.out.println("Other cars are");
//             for (int i = 0; i < carMakes.length; i++) {
//                 if (index != i)
//                     System.out.println(carMakes[i][0]);
//             }
//         }
//     }// end main
// }// end class

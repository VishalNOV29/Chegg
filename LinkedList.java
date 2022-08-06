// // Implementation of linkedlist in java...

// import java.util.*;

// class LinkedList {
//     class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//         }
//     }

//     static Node head;

//     public void insertLast(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node temp = head;
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//         }
//     }

//     public void display() {
//         if (head == null) {
//             System.out.println("Linked list is empty.");
//         } else {
//             Node temp = head;
//             System.out.println("List elements are:");
//             while (temp != null) {
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     }

//     public void insertAtPosition(int position, int data) {
//         Node temp = head;
//         Node newNode = new Node(data);

//         int i = 1;
//         if (position == 1) {
//             newNode.next = head;
//             head = newNode;
//         } else {
//             while (i != position - 1) {
//                 i++;
//                 temp = temp.next;
//             }
//             Node nextNode = temp.next;
//             temp.next = newNode;
//             newNode.next = nextNode;
//         }

//     }

//     public void deletePosition(int position) {
//         Node temp = head;
//         int i = 1;
//         if (position == 1) {
//             head = head.next;
//         } else {
//             while (i != position - 1) {
//                 i++;
//                 temp = temp.next;

//             }
//             temp.next = temp.next.next;
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList obj = new LinkedList();
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of nodes: ");
//         int num = sc.nextInt();
//         for (int i = 0; i < num; i++) {
//             System.out.print("Enter the element: ");
//             int ele = sc.nextInt();
//             obj.insertLast(ele);
//         }
//         System.out.println("1.Insert 2.Delete 3.Display 4.Exit ");
//         while (true) {
//             System.out.print("Enter your option:");
//             int user_choice = sc.nextInt();
//             if (user_choice == 1) {
//                 System.out.print("Enter the element to be inserted: ");
//                 int ele = sc.nextInt();

//                 System.out.print("Enter the position to insert: ");
//                 int position = sc.nextInt();

//                 obj.insertAtPosition(position, ele);
//             } else if (user_choice == 2) {
//                 System.out.print("Enter the position to delete: ");
//                 int position = sc.nextInt();
//                 obj.deletePosition(position);
//             } else if (user_choice == 3) {
//                 obj.display();
//             } else {
//                 break;
//             }
//         }

//     }
// }
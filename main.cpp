// #include <iostream>
// using namespace std;

// int main()
// {
//     // string s1, s2, result;

//     cout << "Enter string s1: ";
//     // getline (cin, s1);

//     // cout << "Enter string s2: ";
//     // getline (cin, s2);

//     // result = s1 + s2;

//     // cout << "Resultant String = "<< result;

//     return 0;
// }

// // C++ implementation to read
// // file word by word
// // #include <bits/stdc++.h>
// // using namespace std;

// // // driver code
// // int main()
// // {
// // 	// filestream variable file
// // 	fstream file;
// // 	string word, t, q, filename;

// // 	// filename of the file
// // 	filename = "prices.txt";

// // 	// opening file
// // 	file.open(filename.c_str());

// // 	// extracting words from the file
// // 	while (file >> word)
// // 	{
// // 		// displaying content
// // 		cout << word << endl;
// // 	}

// // 	return 0;
// // }

// Linked list operations in C++

// Create a node
// struct Node {
//   int data;
//   struct Node* next;
// };

// // Insert a node after a node
// void insertAfter(struct Node* prev_node, int new_data) {
//   if (prev_node == NULL) {
//   cout << "the given previous node cannot be NULL";
//   return;
//   }

//   struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
//   new_node->data = new_data;
//   new_node->next = prev_node->next;
//   prev_node->next = new_node;
// }

// // Insert at the end
// void insertAtEnd(struct Node** head_ref, int new_data) {
//   struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
//   struct Node* last = *head_ref; /* used in step 5*/

//   new_node->data = new_data;
//   new_node->next = NULL;

//   if (*head_ref == NULL) {
//   *head_ref = new_node;
//   return;
//   }

//   while (last->next != NULL) last = last->next;

//   last->next = new_node;
//   return;
// }

// // Print the linked list
// void printList(struct Node* node) {
//   while (node != NULL) {
//   cout << node->data << " ";
//   node = node->next;
//   }
// }

// // Driver program
// int main() {
//   struct Node* head = NULL;

//   insertAtEnd(&head, 1);
//   insertAtEnd(&head, 4);
//   insertAfter(head->next, 5);

//   cout << "Linked list: ";
//   printList(head);

// }

// #include <stdlib.h>
// #include <iostream>
// using namespace std;

// int main()
// {

//   int result = -1;
//   int valueIn; // Initially result is -1.
//   while (true)
//   {
//     cout << "Enter a number: ";
//     cin >> valueIn;
//     if (valueIn < 0)
//     {
//       break;
//     }
//     if (valueIn % 4 == 0)
//     {
//       result -= (valueIn / 4);
//     }
//     if (valueIn % 4 != 0)
//     {
//       result += valueIn * 4;
//     }
//     cout << "Result is " << result << endl;
//   }
//   return 0;
// }


// #include <stdlib.h>
// #include <iostream>
// using namespace std;
// int main(){
//   int fatherHeight;
//   int motherHeight;
//   while (fatherHeight>=0 && motherHeight>=0)
//   cout<<"Enter father's height : ";
//   cin>>fatherHeight;
//   cout<<"Enter mother's height : ";
//   cin>>motherHeight;
  
  // return 0;
}
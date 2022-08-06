// C++ program to display "Hello World"

// Header file for input output functions
// #include <iostream>
// using namespace std;

// // Main() function: where the execution of program begins
// int main()
// {
// 	// prints hello world
// 	cout << "Hello World\n";
//     cout<<"what are you doing vishal kumar singh.";

// 	return 0;
// }

// Linked list implementation in C++

// #include <bits/stdc++.h>
#include <iostream>
using namespace std;

// Creating a node
class Node
{
public:
	Node(int val)
	{
		int value = val;
		Node *next;
	}
};
void insertNode(int data){
	Node obj(data);
	if (head==null){
		head=Node obj(data);
	}
}

int main()
{
	// print the linked list value
	
	while (head != NULL)
	{
		cout << head->value;
		head = head->next;
	}
}
class Linw=

// #include <iostream>
// using namespace std;

// class MyClass
// {		// The class
// public: // Access specifier
// 	MyClass(string name)
// 	{
// 		cout << "Hello World! "<<name;
// 	}
// };

// int main()
// {
// 	MyClass myObj("Vishal"); // Create an object of MyClass (this will call the constructor)
// 	return 0;
// }
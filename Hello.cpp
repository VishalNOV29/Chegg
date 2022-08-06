// #include<bits/stdc++.h>
// using namespace std;
// #define MAX 100
// void printList(char arr[][]){

// }

// void sortStrings(char arr[][MAX], int n)
// {
// 	char temp[MAX];

// 	// Sorting strings using bubble sort
// 	for (int i=0; i<n-1; i++)
// 	{
// 		for (int j=0; j<n-1-i; j++)
// 		{
// 			if (strcmp(arr[j], arr[j+1]) > 0)
// 			{
// 				strcpy(temp, arr[j]);
// 				strcpy(arr[j], arr[j+1]);
// 				strcpy(arr[j+1], temp);
// 			}
// 		}
// 	}
// }

// int main()
// {
// 	char arr[][MAX] = {"GeeksforGeeks","Quiz","Practice","Gblogs","Coding"};
// 	int n = sizeof(arr)/sizeof(arr[0]);

// 	sortStrings(arr, n);

// 	printf("Strings in sorted order are : ");
// 	for (int i=0; i<n; i++)
// 		printf("\n String %d is %s", i+1, arr[i]);
// 	return 0;
// }

// #include <bits/stdc++.h>
// using namespace std;

// class Node {
// public:
// 	int data;
// 	Node* left;
// 	Node* right;

// 	// Val is the key or the value that
// 	// has to be added to the data part
// 	Node(int val)
// 	{
// 		data = val;

// 		// Left and right child for node
// 		// will be initialized to null
// 		left = NULL;
// 		right = NULL;
// 	}
// };

// int main()
// {

// 	/*create root*/
// 	Node* root = new Node(1);
// 	/* following is the tree after above statement

// 			1
// 			/ \
// 		NULL NULL
// 	*/

// 	root->left = new Node(2);
// 	root->right = new Node(3);
// 	/* 2 and 3 become left and right children of 1
// 				1
// 				/ \
// 				2	 3
// 			/ \	 / \
// 			NULL NULL NULL NULL
// 	*/

// 	root->left->left = new Node(4);
// 	/* 4 becomes left child of 2
// 			1
// 			/ \
// 		2	 3
// 		/ \	 / \
// 		4 NULL NULL NULL
// 		/ \
// 	NULL NULL
// 	*/

// 	return 0;
// }

// Binary Tree in C++

// #include <stdlib.h>

// #include <iostream>

// using namespace std;

// struct node
// {
// 	int data;
// 	struct node *left;
// 	struct node *right;
// };

// // New node creation
// struct node *newNode(int data)
// {
// 	struct node *node = (struct node *)malloc(sizeof(struct node));

// 	node->data = data;

// 	node->left = NULL;
// 	node->right = NULL;
// 	return (node);
// }

// // Traverse Inorder
// void traverseInOrder(struct node *temp)
// {
// 	if (temp != NULL)
// 	{
// 		traverseInOrder(temp->left);
// 		cout << " " << temp->data;
// 		traverseInOrder(temp->right);
// 	}
// }
// bool ifNodeExists(struct node *node, int key)
// {
// 	if (node == NULL)
// 		return false;

// 	if (node->data == key)
// 		return true;

// 	bool res1 = ifNodeExists(node->left, key);

// 	if (res1)
// 		return true;

// 	bool res2 = ifNodeExists(node->right, key);

// 	return res2;
// }
// int maxDepth(node *node)
// {
// 	if (node == NULL)
// 		return -1;
// 	else
// 	{
// 		/* compute the depth of each subtree */
// 		int lDepth = maxDepth(node->left);
// 		int rDepth = maxDepth(node->right);

// 		/* use the larger one */
// 		if (lDepth > rDepth)
// 			return (lDepth + 1);
// 		else
// 			return (rDepth + 1);
// 	}
// }

// // Function to get height of left binary tree.
// int left_height(node *node)
// {
// 	int ht = 0;
// 	while (node)
// 	{
// 		ht++;
// 		node = node->left;
// 	}
// 	// Return the left height obtained
// 	return ht;
// }

// // Function to get the right height of the binary tree
// int right_height(node *node)
// {
// 	int ht = 0;
// 	while (node)
// 	{
// 		ht++;
// 		node = node->right;
// 	}
// 	// Return the right height obtained
// 	return ht;
// }
// int TotalNodes(node *root)
// {
// 	// Base Case
// 	if (root == NULL)
// 		return 0;

// 	int lh = left_height(root);
// 	int rh = right_height(root);

// 	if (lh == rh)
// 		return (1 << lh) - 1;
// 	// Otherwise, recursive call
// 	return 1 + TotalNodes(root->left) + TotalNodes(root->right);
// }

// int main()
// {
// 	struct node *root = newNode(1);
// 	root->left = newNode(2);
// 	root->right = newNode(3);
// 	root->left->left = newNode(4);

// 	cout << "\nInorder traversal: ";
// 	traverseInOrder(root);

// 	cout << endl;
// 	int key = 4;
// 	if (ifNodeExists(root, key))
// 		cout << "True" << endl;
// 	else
// 		cout << "False" << endl;

// 	cout << "Height of tree : " << maxDepth(root) << endl;

// 	cout << "Total number of nodes : " << TotalNodes(root);
// 	return 0;
// }

#include <iostream>
using namespace std;

// Funtion 1: Function to sort array.
//  void insertionSort(int arr[], int n)
//  {
//      int i, key, j;
//      for (i = 1; i < n; i++)
//      {
//          key = arr[i];
//          j = i - 1;
//          while (j >= 0 && arr[j] > key)
//          {
//              arr[j + 1] = arr[j];
//              j = j - 1;
//          }
//          arr[j + 1] = key;
//      }
//  }

// // Function 2: Function to find maximum element.
// void findMax(int arr[],int n)
// {
//    int max=arr[0];
//     for (int i = 0; i < n; i++)
//     {
//         if (arr[i] > max)
//         {
//             max = arr[i];
//         }
//     }
//     cout << "Maximum element is :" << max<<endl;
// }

// // Function 3: Function to find minimum element.
// void findMin(int arr[],int n){
//     int min=arr[0];
//     for (int i=0;i<n;i++){
//         if (arr[i]<min){
//             min=arr[i];
//         }
//     }
//     cout<<"Minimum Element : "<<min<<endl;
// }

// // Function 4: Function to find average.
// void findAvg(int arr[],int n){
//     int sum=0;
//     for (int i=0;i<n;i++){
//         sum+=arr[i];
//     }
//     double avg=(double)sum/n;
//     cout<<"Average : "<<avg<<endl;
// }

// // Main function.
// int main()
// {
//     int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

//     int n = sizeof(arr) / sizeof(arr[0]);

//     cout<<"Array before sorting : "<<endl;
//     for (int i = 0; i < 10; i++)
//     {
//         cout << arr[i] << " ";
//     }
//     cout << endl;

//     insertionSort(arr, n);
//     cout << "Array after sorting : " << endl;
//     for (int i = 0; i < 10; i++)
//     {
//         cout << arr[i] << " ";
//     }
//     cout<<endl;
//     findMax(arr,n);

//     findMin(arr,n);

//     findAvg(arr,n);
//     return 0;
// }

// int main(){
//     int product=3;
//     while (product<=70){
//         product=product*3;
//     }
//     cout<<product;
// }

// #include <bits/stdc++.h>
// using namespace std;

// // First element is considered as a pivot element.
// void printArray(int arr[], int n)
// {
//     for (int i = 0; i < n; i++)
//         printf("%d ", arr[i]);
//     printf("\n");
// }

// int partition(int arr[], int low, int high)
// {
//     int pivot = arr[low];
//     int i = low - 1, j = high + 1;

//     while (true)
//     {
//         // Find leftmost element greater than
//         // or equal to pivot
//         do
//         {
//             i++;
//         } while (arr[i] < pivot);

//         // Find rightmost element smaller than
//         // or equal to pivot
//         do
//         {
//             j--;
//         } while (arr[j] > pivot);

//         // If two pointers met.
//         if (i >= j)
//         {
//             cout << "j = " << j << endl;
//             return j;
//         }

//         swap(arr[i], arr[j]);
//         cout << "arr = " ;
//         printArray(arr, sizeof(arr) / sizeof(int));
//         cout << endl;
//     }
// }
// void quickSort(int arr[], int low, int high)
// {
//     if (low < high)
//     {
//         /* pi is partitioning index, arr[p] is now
//            at right place */
//         int pi = partition(arr, low, high);

//         // Separately sort elements before
//         // partition and after partition
//         quickSort(arr, low, pi);
//         quickSort(arr, pi + 1, high);
//     }
// }

// /* Function to print an array */
// // void printArray(int arr[], int n)
// // {
// //     for (int i = 0; i < n; i++)
// //         printf("%d ", arr[i]);
// //     printf("\n");
// // }

// // Driver Code
// int main()
// {
//     int arr[] = {10, 7, 8, 9, 1, 5};
//     int n = sizeof(arr) / sizeof(arr[0]);
//     quickSort(arr, 0, n - 1);
//     return 0;
// }

// #include <bits/stdc++.h>
// using namespace std;

// void printArray(int arr[], int n)
// {
//     for (int i = 0; i < n; i++)
//         printf("%d ", arr[i]);
//     printf("\n");
// }

// int partition(int arr[], int low, int high)
// {
//     int length=sizeof(arr)/sizeof(int);
//     int pivot = arr[low];
//     int i = low - 1, j = high + 1;

//     while (true)
//     {

//         do
//         {
//             i++;
//         } while (arr[i] < pivot);

//         do
//         {
//             j--;
//         } while (arr[j] > pivot);

//         // If two pointers met.
//         if (i >= j)
//         {
//             cout << "i = " << i << " j = " << j << endl;
//             return j;
//         }

//         swap(arr[i], arr[j]);
//     }
// }

// void quickSort(int arr[], int low, int high)
// {
//     if (low < high)
//     {

//         int pi = partition(arr, low, high);
//         printArray(arr,)
//         quickSort(arr, low, pi);
//         quickSort(arr, pi + 1, high);
//     }
// }

// /* Function to print an array */


// // Driver Code
// int main()
// {
//     int arr[] = {10, 7, 8, 9, 1, 5};
//     int n = sizeof(arr) / sizeof(arr[0]);
//     quickSort(arr, 0, n - 1);
//     printf("Sorted array: \n");
//     printArray(arr, n);
//     return 0;
// }


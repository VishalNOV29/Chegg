// // C++ program to demonstrate insertion
// // in a BST recursively.
// #include <iostream>
// using namespace std;

// class BST
// {
//     int data;
//     BST *left, *right;

// public:
//     // Default constructor.
//     BST();

//     // Parameterized constructor.
//     BST(int);

//     // Insert function.
//     BST *Insert(BST *, int);

//     // Inorder traversal.
//     void Inorder(BST *);
// };

// // Default Constructor definition.
// BST ::BST()
//     : data(0), left(NULL), right(NULL)
// {
// }

// // Parameterized Constructor definition.
// BST ::BST(int value)
// {
//     data = value;
//     left = right = NULL;
// }

// // Insert function definition.
// BST *BST ::Insert(BST *root, int value)
// {
//     if (!root)
//     {
//         return new BST(value);
//     }

//     // Insert data.
//     if (value > root->data)
//     {
//         // Insert right node data, if the 'value'
//         // to be inserted is greater than 'root' node data.

//         // Process right nodes.
//         root->right = Insert(root->right, value);
//     }
//     else
//     {
//         // Insert left node data, if the 'value'
//         // to be inserted is greater than 'root' node data.

//         // Process left nodes.
//         root->left = Insert(root->left, value);
//     }

//     // Return 'root' node, after insertion.
//     return root;
// }

// // Inorder traversal function.
// // This gives data in sorted order.
// void BST ::Inorder(BST *root)
// {
//     if (!root)
//     {
//         return;
//     }
//     Inorder(root->left);
//     cout << root->data << endl;

//     Inorder(root->right);
// }
// void BST::Preorder(BST *root){

// }
// // void BST ::Preorder(BST *root)
// // {
// //     if (!root)
// //     {
// //         return;
// //     }
// //     cout << root->data << "->";
// //     Preorder(root->left);
// //     Inorder(root->right);
// // }
// // void BST ::Postorder(BST *root)
// // {
// //     if (!root)
// //     {
// //         return;
// //     }
// //     Postorder(root->left);
// //     Postorder(root->right);
// //     cout << root->data << endl;
// // }

// // Driver code
// int main()
// {
//     BST b, *root = NULL;
//     root = b.Insert(root, 50);
//     b.Insert(root, 15);
//     b.Insert(root, 20);
//     b.Insert(root, 30);
//     b.Insert(root, 27);
//     b.Insert(root, 20);
//     b.Insert(root, 10);
//     b.Insert(root, 12);
//     b.Insert(root, 5);
//     b.Insert(root, 3);
//     b.Insert(root, 29);

//     b.Inorder(root);
//     return 0;
// }

// // This code is contributed by pkthapa

// Binary Search Tree operations in C++





// #include <iostream>
// using namespace std;

// struct node
// {
//     int key;
//     struct node *left, *right;
// };

// // Create a node
// struct node *newNode(int item)
// {
//     struct node *temp = (struct node *)malloc(sizeof(struct node));
//     temp->key = item;
//     temp->left = temp->right = NULL;
//     return temp;
// }

// // Inorder Traversal
// void inorder(struct node *root)
// {
//     if (root != NULL)
//     {
//         inorder(root->left);
//         cout << root->key << " -> ";
//         inorder(root->right);
//     }
// }
// // Preorder Traversal
// void preorder(struct node *root)
// {
//     if (root != NULL)
//     {
//         cout << root->key << " -> ";
//         preorder(root->left);
//         preorder(root->right);
//     }
// }

// // Insert a node
// struct node *insert(struct node *node, int key)
// {
//     if (node == NULL)
//         return newNode(key);
//     if (key < node->key)
//         node->left = insert(node->left, key);
//     else
//         node->right = insert(node->right, key);

//     return node;
// }

// // Height of a tree.
// int height(node *node)
// {
//     if (node == NULL)
//         return -1;
//     else
//     {
//         int lDepth = height(node->left);
//         int rDepth = height(node->right);

//         if (lDepth > rDepth)
//             return (lDepth + 1);
//         else
//             return (rDepth + 1);
//     }
// }

// // Driver code
// int main()
// {
//     struct node *root = NULL;
//     root = insert(root, 15);
//     root = insert(root, 25);
//     root = insert(root, 30);
//     root = insert(root, 27);
//     root = insert(root, 20);
//     root = insert(root, 10);
//     root = insert(root, 12);
//     root = insert(root, 5);
//     root = insert(root, 3);
//     root = insert(root, 29);

//     cout << "Inorder traversal: ";
//     inorder(root);
//     cout << endl;
//     cout << "Preorder traversal: ";
//     preorder(root);

//     cout << endl;
//     cout << "Height of Tree : " << height(root);
// }
// #include <cstdlib>
// #include <ctime>
// #include <iostream>
// using namespace std;

// int fib(int n){
//     if (n==0){
//         return 0;
//     }else{
//         return n*n+fib(n-1);
//     }
// }

// int main()
// {

//    double total_time =0.0;
//    clock_t time1 = clock();
//    int f = fib(1500);
//    clock_t time2 = clock();

//    total_time = difftime ( time2, time1 );
//    cout<<total_time<<endl;
//    cout<<f<<endl;
//    cout<<"hello world"<<endl;
// }

// class Color{
//     public:
//     int red,green,blue;
// };
// bool operator<=(Color lhs,Color rhs);
// int main(){
//     Color col1,col2;
//     if (col1<=col2){
//         cout<<"First color is less than or equal to second color!";
//         cout<<endl;
//     }
// }

// #include <cstdlib>
// #include <iostream>
// using namespace std;

// int find(int arr[], int num)
// {
//     for (int i = 0; i < 10; i++)
//     {
//         if (arr[i] == num)
//         {
//             return i;
//         }
//     }
//     return -1;
// }
// class Main {
//     static NOINLINE int function3(int x)
// {
//    int y;
//    y = x / 10;

//    return (y);

// }
// }
// int main()
// {
//     int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//     cout << "Enter a number to search: ";
//     int x;
//     cin >> x;
//     int res = find(arr, x);
//     if (res == -1)
//     {
//         cout << "Element not found";
//     }
//     else
//     {
//         cout << "Number found\n";
//         cout << "position = " << res + 1<<"\n";
//         cout << "index = " << res;
//     }
//     return 0;
// }

// CPP program to implement traveling salesman
// problem using naive approach.
// #include <bits/stdc++.h>
// using namespace std;
// #define V 4

// implementation of traveling Salesman Problem
// int travllingSalesmanProblem(int graph[][V], int s)
// {
//     // store all vertex apart from source vertex
//     vector<int> vertex;
//     for (int i = 0; i < V; i++)
//         if (i != s)
//             vertex.push_back(i);

//     // store minimum weight Hamiltonian Cycle.
//     int min_path = INT_MAX;
//     do
//     {

//         // store current Path weight(cost)
//         int current_pathweight = 0;

//         // compute current path weight
//         int k = s;
//         for (int i = 0; i < vertex.size(); i++)
//         {
//             current_pathweight += graph[k][vertex[i]];
//             k = vertex[i];
//         }
//         current_pathweight += graph[k][s];

//         // update minimum
//         min_path = min(min_path, current_pathweight);

//     } while (
//         next_permutation(vertex.begin(), vertex.end()));

//     return min_path;
// }

// // Driver Code
// int main()
// {
//     // matrix representation of graph
//     int graph[][V] = {{0, 10, 15, 20},
//                       {10, 0, 35, 25},
//                       {15, 35, 0, 30},
//                       {20, 25, 30, 0}};
//     int s = 0;
//     cout << travllingSalesmanProblem(graph, s) << endl;
//     return 0;
// }

#include <cstdlib>
#include <ctime>
#include <iostream>
using namespace std;

// Function to find absolute.
int absolute(int n)
{
    // If the number is negative then multiply it by -1, so that it will be positive.
    if (n < 0)
    {
        return -1 * n; // return the number.
    }
    return n;
}

void check_char(char ch)
{
    // Checking for alphabets. If alphabet is found then check for lower or upper.
    if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
    {
        // Checking for upper
        if (isupper(ch))
        {
            cout << "Upper";
        }
        // Checking for lower
        else if (islower(ch))
        {
            cout << "Lower";
        }
    }
    // If not a alphabet
    else
        cout << "Special Character ";
}

// function to calculate the value of series...
void calculate()
{
    int result = 0;
    for (int i = 2; i < 23; i++)
    {
        result += (3 * i * i) - 2;
    }
    cout << result;
}

// main function
int main()
{
    int result = absolute(-10);
    cout << result << endl;
    check_char('@');
    cout << endl;
    calculate();
    return 0;
}
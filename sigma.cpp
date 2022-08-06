#include <iostream>
using namespace std;
int main(){
    int h;
    cout << "h? ";
    cin >> h;
    int temp = h / 2;

    // Printing horizontal line of top
    for (int i = 0; i <= temp; i++){
        if (i == temp){
            cout << "*";
            break;
        }
        cout << "* ";
    }
    cout << endl;

    // printing increasing line .
    for (int i = 0; i < temp - 1; i++){
        for (int j = 0; j <= i; j++){
            cout << " ";
        }
        cout << "*" << endl;
    }

    //printing the middle line.
    for (int i = 0; i < temp; i++){
        cout << " ";
    }
    cout << "*" << endl;

    // printing decreasing line.
    for (int i = temp - 2; i >= 0; i--){
        for (int j = 0; j <= i; j++){
            cout << " ";
        }
        cout << "*" << endl;
    }

    // printing the hroizontal line of bottom.
    for (int i = 0; i <= temp; i++){
        if (i == temp){
            cout << "*";
            break;
        }
        cout << "* ";
    }
}
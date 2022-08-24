#include <stdio.h>

int linearSearch(int arr[], int size, int target)
{
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == target)
        {
            return i; // index of the target element.
        }
    }
    return -1; // Element not found in the array.
}
int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    int size = sizeof arr / sizeof arr[0];
    int target = 5;
    int result = linearSearch(arr, size, target);

    if (result == -1)
    {
        printf("Element not found in the array.");
    }
    else
    {
        printf("Element found at index %d.", result);
    }
    return 0;
}
#include <stdio.h>

int binarySearch(int array[], int target, int low, int high)
{
    while (low <= high)
    {
        int mid = low + (high - low) / 2;

        if (array[mid] == target)
        {
            return mid;
        }

        if (array[mid] < target)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }

    return -1;
}

int main()
{
    int array[] = {3, 4, 5, 6, 7, 8, 9};
    int size = sizeof(array) / sizeof(array[0]);
    int target = 4;
    int result = binarySearch(array, target, 0, size - 1);
    if (result == -1)
    {
        printf("Element not found");
    }
    else
    {
        printf("Element is found at index %d", result);
    }
    return 0;
}
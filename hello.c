// #include <stdio.h>
// int main()
// {
//     int num;
//     printf("Enter array size: ");
//     scanf("%d", &num);
//     int arr[num];
//     for (int i = 0; i < num; i++)
//     {
//         printf("Element: ");
//         scanf("%d", &arr[i]);
//     }
//     int find;
//     printf("Enter element to search: ");
//     scanf("%d", &find);
//     int flag=0;
//     for (int i = 0; i < num; i++){
//        if (arr[i]==find){
//            printf("Element found at index %d",i);
//            flag=1;
//            break;
//        }
//     }
//     if (flag==0){
//         printf("Element not found.");
//     }
//     return 0;
// }
// #include<stdio.h>
// #include<unistd.h>
// int main(){
//     int fork();
//     printf("Hello vishal I am working fine.");
//     return 0;
// }

// #include <stdio.h>
// #include <conio.h>
// void sa(int a[], int n)
// {
//     for (int i = 0; i < n - 1; i++)
//     {
//         int mi = i;
//         for (int j = i + 1; j < n; j++)
//         {
//             if (a[j] < a[mi])
//             {
//                 mi = j;
//             }
//         }
//         int temp = a[mi];
//         a[mi] = a[i];
//         a[i] = temp;
//     }
// }
// void pa(int a[], int n)
// {
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d\t", a[i]);
//     }
// }
// int main()
// {
//     int n;
//     printf("Enter size of the array : ");
//     scanf("%d", &n);
//     int a[n];
//     printf("Enter the elements :");
//     for (int i = 0; i < n; i++)
//     {
//         scanf("%d", &a[i]);
//     }
//     sa(a, n);
//     printf("The sorted elements are : ");
//     pa(a, n);
//     return 0;
// }

// #include <stdio.h>
// #include <conio.h>
// void countingsort(int arr[], int n, int max, int out[])
// {
//     int c[max + 1];
//     for (int i = 0; i <= max; i++)
//     {
//         c[i] = 0;
//     }
//     for (int j = 0; j < n; j++)
//     {
//         c[arr[j]] = c[arr[j]] + 1;
//     }
//     for (int i = 1; i <= max; i++)
//     {
//         c[i] = c[i] + c[i - 1];
//     }
//     for (int j = n - 1; j >= 0; j--)
//     {
//         out[c[arr[j]]] = arr[j];
//         c[arr[j]] = c[arr[j]] - 1;
//     }
// }
// void printArr(int out[], int k)
// {
//     for (int i = 1; i < k; i++)
//     {
//         printf("%d ", out[i]);
//     }
// }
// int main()
// {
//     int n;
//     printf("enter the no. of arry element: ");
//     scanf("%d", &n);
//     int arr[n];
//     int out[n + 1];
//     printf("enter the element: ");
//     int max = arr[0];
//     for (int i = 0; i < n; i++)
//     {
//         scanf("%d", &arr[i]);
//     }
//     for (int i = 1; i < n; i++)
//     {
//         if (arr[i] > max)
//         {
//             max = arr[i];
//         }
//     }
//     countingsort(arr, n, max, out);
//     printArr(out, n + 1);
// }

// #include <stdio.h>
// #include <math.h>
// float f(float x, float y);
// int main()
// {
//     float x0, y0, m1, m2, m3, m4, m, y, x, h, xn;
//     printf("Enter x0,y0,xn,h:");
//     scanf("%f %f %f %f", &x0, &y0, &xn, &h);
//     x = x0;
//     y = y0;
//     printf("\n\nX\t\tY\n");
//     while (x < xn)
//     {
//         m1 = f(x0, y0);
//         m2 = f((x0 + h / 2.0), (y0 + m1 * h / 2.0));
//         m3 = f((x0 + h / 2.0), (y0 + m2 * h / 2.0));
//         m4 = f((x0 + h), (y0 + m3 * h));
//         m = ((m1 + 2 * m2 + 2 * m3 + m4) / 6);
//         y = y + m * h;
//         x = x + h;
//         printf("%f\t%f\n", x, y);
//     }
// }
// float f(float x, float y)
// {
//     float m;
//     m = (x - y) / (x + y);
//     return m;
// }

// #include <stdio.h>
// void mergesort(int a[], int i, int j);
// void merge(int a[], int i1, int j1, int i2, int j2);
// int main()
// {
//     int a[30], n, i;
//     printf(" Enter How many Numbers : ");
//     scanf("%d", &n);
//     printf(" Enter %d Numbers :", n);
//     for (i = 0; i < n; i++)
//         scanf("%d", &a[i]);
//     mergesort(a, 0, n - 1);
//     printf(" Sorted Numbers are : ");
//     for (i = 0; i < n; i++)
//         printf("%d\t", a[i]);
//     return 0;
// }
// void mergesort(int a[], int i, int j)
// {
//     int mid;
//     if (i < j)
//     {
//         mid = (i + j) / 2;
//         mergesort(a, i, mid);
//         mergesort(a, mid + 1, j);
//         merge(a, i, mid, mid + 1, j);
//     }
// }
// void merge(int a[], int i1, int j1, int i2, int j2)
// {
//     int temp[50];
//     int i, j, k;
//     i = i1;
//     j = i2;
//     k = 0;
//     while (i <= j1 && j <= j2)
//     {
//         if (a[i] < a[j])
//             temp[k++] = a[i++];
//         else
//             temp[k++] = a[j++];
//     }
//     while (i <= j1)
//         temp[k++] = a[i++];
//     while (j <= j2)
//         temp[k++] = a[j++];
//     for (i = i1, j = 0; i <= j2; i++, j++)
//         a[i] = temp[j];
// }

// #include <stdio.h>
// void quicksort(int[], int, int);
// int main()
// {
//     int list[50];
//     int size, i;
//     printf("Enter Number of elements : ");
//     scanf("%d", &size);
//     printf("Enter %d Elements : ", size);
//     for (i = 0; i < size; i++)
//     {
//         scanf("%d", &list[i]);
//     }
//     quicksort(list, 0, size - 1);
//     printf("Sorted Numbers are : ");
//     for (i = 0; i < size; i++)
//     {
//         printf("%d ", list[i]);
//     }
//     printf("\n");
//     return 0;
// }
// void quicksort(int list[], int low, int high)
// {
//     int pivot, i, j, temp;
//     if (low < high)
//     {
//         pivot = low;
//         i = low;
//         j = high;
//         while (i < j)
//         {
//             while (list[i] <= list[pivot] && i <= high)
//             {
//                 i++;
//             }
//             while (list[j] > list[pivot] && j >= low)
//             {
//                 j--;
//             }
//             if (i < j)
//             {
//                 temp = list[i];
//                 list[i] = list[j];
//                 list[j] = temp;
//             }
//         }

//         temp = list[j];
//         list[j] = list[pivot];
//         list[pivot] = temp;
//         quicksort(list, low, j - 1);
//         quicksort(list, j + 1, high);
//     }
// }

// #include <stdio.h>
// void main()
// {
//     int heap[10], no, i, j, c, root, temp;
//     printf("enter the no. of element: ");
//     scanf("%d", &no);
//     printf("Enter elements: ");
//     for (i = 0; i < no; i++)
//         scanf("%d", &heap[i]);
//     for (i = 1; i < no; i++)
//     {
//         c = i;
//         do
//         {
//             root = (c - 1) / 2;
//             if (heap[root] < heap[c])
//             {
//                 temp = heap[root];
//                 heap[root] = heap[c];
//                 heap[c] = temp;
//             }
//             c = root;
//         } while (c != 0);
//     }
//     for (j = no - 1; j >= 0; j--)
//     {
//         temp = heap[0];
//         heap[0] = heap[j];
//         heap[j] = temp;
//         root = 0;
//         do
//         {
//             c = 2 * root + 1;
//             if ((heap[c] < heap[c + 1]) && c < j - 1)
//                 c++;
//             if (heap[root] < heap[c] && c < j)
//             {
//                 temp = heap[root];
//                 heap[root] = heap[c];
//                 heap[c] = temp;
//             }
//             root = c;
//         } while (c < j);
//     }
//     for (i = 0; i < no; i++)
//         printf("%d\t", heap[i]);
// }

#include <stdio.h>
#include <conio.h>
int main()
{
    int n, r, i, j, k, p, u = 0, s = 0, m;
    int block[10], run[10], active[10], newreq[10];
    int max[10][10], resalloc[10][10], resreq[10][10];
    int totalloc[10], totext[10], simalloc[10];
    printf("Enter the no of processes: ");
    scanf("%d", &n);
    printf("Enter the no of resource classes: ");
    scanf("%d", &r);
    printf("Enter the total existed resource in each class: ");
    for (k = 1; k <= r; k++)
        scanf("%d", &totext[k]);
    printf("Enter the allocated resources: ");
    for (i = 1; i <= n; i++)
        for (k = 1; k <= r; k++)
            scanf("%d", &resalloc[i][k]);
    printf("Enter the process making the new request: ");
    scanf("%d", &p);
    printf("Enter the requested resource: ");
    for (k = 1; k <= r; k++)
        scanf("%d", &newreq[k]);
    printf("Enter the process which are n blocked or running\n");
    for (i = 1; i <= n; i++)
    {
        if (i != p)
        {
            printf("process %d: \n", i + 1);
            scanf("%d%d", &block[i], &run[i]);
        }
    }
    block[p] = 0;
    run[p] = 0;
    for (k = 1; k <= r; k++)
    {
        j = 0;
        for (i = 1; i <= n; i++)
        {
            totalloc[k] = j + resalloc[i][k];
            j = totalloc[k];
        }
    }
    for (i = 1; i <= n; i++)
    {
        if (block[i] == 1 || run[i] == 1)
            active[i] = 1;
        else
            active[1] = 0;
    }
    for (k = 1; k <= r; k++)
    {
        resalloc[p][k] += newreq[k];
        totalloc[k] += newreq[k];
    }
    for (k = 1; k <= r; k++)
    {
        if (totext[k] - totalloc[k] < 0)
        {
            u = 1;
            break;
        }
    }
    if (u == 0)
    {
        for (k = 1; k <= r; k++)
            simalloc[k] = totalloc[k];
        for (s = 1; s <= n; s++)
            for (i = 1; i <= n; i++)
            {
                if (active[i] == 1)
                {
                    j = 0;
                    for (k = 1; k <= r; k++)
                    {
                        if ((totext[k] - simalloc[k]) < (max[i][k] - resalloc[i][k]))
                        {
                            j = 1;
                            break;
                        }
                    }
                }
                if (j == 0)
                {
                    active[i];
                    for (k = 1; k <= r; k++)
                        simalloc[k] = resalloc[i][k];
                }
            }
        m = 0;
        for (k = 1; k <= r; k++)
            resreq[p][k] = newreq[k];
        printf("Deadlock willn't occur\n");
        
    }
    else
    {
        for (k = 1; k <= r; k++)
        {
            resalloc[p][k] = newreq[k];
            totalloc[k] = newreq[k];
        }
        printf("Deadlock will occur\n");
    }
    return 0;
}

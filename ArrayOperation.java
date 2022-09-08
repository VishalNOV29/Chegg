
class MyArray {

    // This method will insert element at a specific position and return the new array.
    int[] insertElementAtPosition(int position, int element, int[] arr) {
        int newArr[] = new int[arr.length + 1];
        int i = 0;
        while (i < position - 1) {
            newArr[i] = arr[i];
            i++;
        }
        newArr[i] = element;
        i++;
        while (i < newArr.length) {
            newArr[i] = arr[i - 1];
            i++;
        }
        return newArr;
    }

    // method for searching an element in the array.
    int searchElement(int arr[], int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;

            }
        }
        return index;
    }

    // method for removing duplicates from the array.
    int[] removeDuplicate(int arr[]) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (newArr.contains(arr[i])) {
                continue;
            } else {
                newArr.add(arr[i]);
            }
        }
        int[] result = new int[newArr.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = newArr.get(i);
        }
        return result;
    }

    // method for copying the array
    int[] copyArray(int arr[]) {
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // method for displaying menu
    static void displayMenu() {
        System.out.println("\n\n1. Insert an element at specific position");
        System.out.println("2. Search for an element and return its index");
        System.out.println("3. Remove duplicate elements from the array");
        System.out.println("4. Copy the array in another array");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {

        // TAKING INPUT OF ARRAY DETAILS FROM THE USER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements separated by space: ");
        int arr[] = new int[size];
        sc.nextLine();
        String arrElements = sc.nextLine();
        String[] arrEle = arrElements.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrEle[i]);
        }

        MyArray obj = new MyArray();

        while (true) {
            displayMenu();
            System.out.println("Enter your choice: ");
            char input = sc.nextLine().charAt(0);

            if (input == '1') {

                System.out.println("Enter position: ");
                int position = sc.nextInt();
                System.out.println("Enter element");
                int element = sc.nextInt();
                sc.nextLine();
                int newArr[] = obj.insertElementAtPosition(position, element, arr);
                arr=newArr;
                System.out.println("After adding element: " + Arrays.toString(arr));

            } else if (input == '2') {
                System.out.println("Enter element to search: ");
                int element = sc.nextInt();
                int index = obj.searchElement(arr, element);
                sc.nextLine();
                System.out.println("Index of " + element + ": " + index); // If the index is -1, it means that the element is
                                                                     // not presnet in the array.
            } else if (input == '3') {

                int newArr2[] = obj.removeDuplicate(arr);
                System.out.println("Afrer removing duplicate: " + Arrays.toString(newArr2));

            } else if (input == '4') {

                int newArray[] = obj.copyArray(arr);
                arr=newArray;
                System.out.println("Copied array: " + arr);

            } else if (input == '5') {
                break;
            } else {
                System.out.println("Choose correct option.");
            }
        }

    }
}
import java.util.Scanner;

public class heapSort {
    public static void main(String[] args) {
        //user input
        System.out.println("Enter array size < 10");
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] userArray = new int[10];
        System.out.println("Enter "+ arraySize + " elements to be sorted");
        for(int i = 0; i < arraySize; i++) {
            userArray[i] = input.nextInt();
        }

        for(int i = arraySize/2 - 1; i >= 0 ; i--) {
            heapify(userArray, arraySize, i);
        }

        printSorted(userArray, arraySize);

        //Logic for heapSort(in place, nlogn, unstable)
        //Heapify(O(n)) followed by removal of root element and heapify

        heapSortFunc(userArray, arraySize);

        //Result printing
        printSorted(userArray, arraySize);
        input.close();
    }

    public static void heapSortFunc(int[] array, int size) {
       for(int i = size - 1; i >= 0; i--) {
           swap(array, 0, i);
           //System.out.print("before heapify ->");
           //printSorted(array, size);
           heapify(array, i, 0);
           //printSorted(array, size);
       }
    }

    public static void heapify(int[] array, int size, int index) {
        int largest = index;
        int left = index*2 + 1;
        int right = index*2 + 2;

        if(left < size && array[largest] < array[left]) {
            largest = left;
        }

        if(right < size && array[largest] < array[right]) {
            largest = right;
        }

        if(index != largest) {
            swap(array, index, largest);
            heapify(array, size, largest);
        }    
    }

    public static void swap(int[] array, int i, int j) {
            if(i != j) {
                int temp;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
    }

    public static void printSorted(int[] array, int size) {
        System.out.print("Heap Sorted -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("is the Result\n");
    }
}
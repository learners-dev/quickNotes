import java.util.Scanner;

public class quickSort {
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

        //Logic for quick Sort(in place, nlogn usually n^2 worst case(already sorted arrays), unstable)
        //Consider array as where one side elements are greater than pivot element and smaller in other side
        //keep swapping smaller numbers with number larger than pivot and finally swap pivot 
        //with the number larger than it. Split the array into subarrays left and right of pivot and repeat

        quickSortFunc(userArray, 0, arraySize - 1);

        //Result printing
        printSorted(userArray, arraySize);
        input.close();
    }

    public static void quickSortFunc(int[] array, int start, int end) {
        if(start < end) {
            int pivot;
            pivot = pivotIndex(array, start, end);
            
            quickSortFunc(array, start, pivot - 1);
            quickSortFunc(array, pivot + 1, end);
        }
    }

    public static int pivotIndex(int[] array, int start, int end) {
        int index = start;
        int pivot = array[end];
        int i;
        for(i = start; i < end; i++) {
            if(array[i] <= pivot) {
                swap(array, index, i);
                index++;
            }
        }
        swap(array, index, end);
        return index;
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
        System.out.print("Quick Sorted -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("is the Result");
    }
}

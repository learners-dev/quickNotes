import java.util.Scanner;

public class selectionSort {
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

        //Logic for Selection Sort(in place, n^2, unstable)
        //Consider array as sorted and unsorted
        //Swap the smallest number with current index
        int smallest;
        for(int i = 0; i < arraySize; i++) {
            smallest = i;
            for(int j = i + 1; j < arraySize; j++) {
                if(userArray[smallest] > userArray[j]) {
                    smallest = j;
                }
            }
            swap(userArray, smallest, i);
        }

        //Result printing
        printSorted(userArray, arraySize);
        input.close();
    }

    public static void swap(int[] array, int i, int j) {
        int temp;

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printSorted(int[] array, int size) {
        System.out.print("Selection Sorted -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("is the Result");
    }
}

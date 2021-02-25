import java.util.Scanner;

public class insertionSort {
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

        //Logic for Insertion Sort(in place, n^2, stable)
        //Consider array as sorted and unsorted
        //Place the new element of unsorted part at correct position in sorted part

        int newElement, j;
        for(int i = 1; i < arraySize; i++) {
            newElement = userArray[i];
            j = i - 1;
            while(j >= 0 && (userArray[j] > userArray[i])) {
                j--;
            }
            if(j != i-1) {
                for(int k = i; k > j+1; k--) {
                    userArray[k] = userArray[k-1];
                }
            }
            userArray[j + 1] = newElement;
        }

        //Result printing
        printSorted(userArray, arraySize);
        input.close();
    }

    public static void printSorted(int[] array, int size) {
        System.out.print("Insertion Sorted -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("is the Result");
    }
}

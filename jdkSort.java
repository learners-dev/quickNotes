import java.util.Scanner;
import java.util.Arrays;

public class jdkSort {
    public static void main(String[] args) {
        //user input
        System.out.println("Enter array size < 5");
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] userArray = new int[5];
        System.out.println("Enter "+ arraySize + " elements to be sorted");
        for(int i = 0; i < arraySize; i++) {
            userArray[i] = input.nextInt();
        }

        //Logic for inbuilt Arrays.sort(double pivot quick sort)
        //The idea of dual pivot quick sort is to take two pivots, one in left end of the array and the second in right end
        //The left pivot must be less than or equal to the right pivot, so we swap them if necessary.
        //Dual pivot quick sort is a little bit faster than the original single pivot quicksort
        //the worst case will remain O(n^2) when the array is already sorted in an increasing or decreasing order.

        Arrays.sort(userArray);

        //Result printing
        printSorted(userArray, arraySize);
        input.close();
    }

    public static void printSorted(int[] array, int size) {
        System.out.print("jdk Sorted -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("is the Result");
    }
}

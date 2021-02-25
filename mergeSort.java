import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
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

        //Logic for Merge Sort(not in place, nlogn, stable requires extra space of O(n))
        //Uses devide and conquer algorithm 
        //Splits array into single elements than merge sorted arrays together
        //The collections.sort used merge sort algorithm instead of quick sort. But Arrays.sort uses quick sort.

        int start, end;
        start = 0;
        end = arraySize-1;
        mergeSortFunc(userArray, start, end);
        //Result printing
        printSorted(userArray, arraySize);
        input.close();
    }

    public static void mergeSortFunc(int[] array, int start, int end) {
       //exit condition
        if(end > start) {

            //finding mid point
                int mid = ((end + start) / 2); 

            //sorting arrays by merge sort 
                mergeSortFunc(array, start, mid);
                mergeSortFunc(array, mid+1, end);
                
            //merging sorted arays
                merge(array, start, end, mid);
        }
    }

    public static void merge(int[] array, int start, int end, int mid) {
        int mainIndex = start;
        int i, j;
        i = 0;
        j = 0;
        int[] left = new int[(mid - start) + 1];
        int[] right = new int[end - mid];
        left = Arrays.copyOfRange(array, start, mid + 1); //excludes item at last index so +1 is given
        right = Arrays.copyOfRange(array, mid + 1, end + 1);
        // System.out.println("\nThe left array is ");
        // printSorted(left, left.length);
        // System.out.println("\nThe right array is ");
        // printSorted(right, right.length);
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]){
                array[mainIndex++] = left[i++];
            } else {
                array[mainIndex++] = right[j++];
            }
        }
        while(i < left.length) {
            array[mainIndex++] = left[i++];
        }
        while(j < right.length) {
            array[mainIndex++] = right[j++];
        }
    }

    public static void printSorted(int[] array, int size) {
        System.out.print("Merge Sorted -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("is the Result");
    }
}

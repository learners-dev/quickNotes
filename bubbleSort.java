import java.util.Scanner;

public class bubbleSort {

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

        //Logic for Bubble Sort (inplace, n^2)

        for(int i = arraySize - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(userArray[j] > userArray[j+1]) {
                    swap(userArray, j);
                }
            }
        }

        //Result printing
        printSorted(userArray, arraySize);
        input.close();

    }

    public static void swap(int[] array, int i) {
        int temp;

        temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
    }

    public static void printSorted(int[] array, int size) {
        System.out.print("Bubble Sorted -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("is the Result");
    }
}
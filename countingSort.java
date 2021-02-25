import java.util.Scanner;

public class countingSort {
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

        //Logic for Counting Sort(not in place, n, unstable)
        //Assumes that array has non negative integers within a specified range
        //create an array to count occurances of each element according to index of counting array
        //add all the count values before each count with its count to get index of that element in array

        countingSortFunc(userArray, arraySize);

        //Result printing
        printSorted(userArray, arraySize);
        input.close();
    }

    public static void countingSortFunc(int[] array, int size) {
        int i, j;
        int[] countArray = new int[10];
        for(i = 0; i < size; i++) {
            countArray[array[i]]++;
        }
        System.out.println(" ");
        printSorted(countArray, 10);
        j = 0;
        i = 0;
        while(i < 10) {
            if(countArray[i] != 0) {
                array[j++] = i;
                countArray[i]--;
            } else {
                i++;
            }
        }
    }

    public static void printSorted(int[] array, int size) {
        System.out.print("Counting Sorted -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("is the Result");
    }
}

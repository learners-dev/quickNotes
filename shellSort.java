import java.util.Scanner;

public class shellSort {
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

        //Logic for Shell Sort(in place, n^2, unstable)
        //Considers gap of length/2 (Assumed) instead of 1 like in insertion sort 
        //Consider array as sorted and unsorted
        //Place the new element of unsorted part at correct position in sorted part

        int newElement, j, gap;
        for(gap = arraySize/2; gap > 0; gap/=2) {
            for(int i = gap; i < arraySize; i+=gap) {
                newElement = userArray[i];
                j = i - gap;
                while(j >= 0 && (userArray[j] > userArray[i])) {
                    j-=gap;
                }
                if(j != i - gap) {
                    for(int k = i; k > j+gap; k-=gap) {
                        userArray[k] = userArray[k-gap];
                    }
                }
                userArray[j + gap] = newElement;
            }
        }

        //Result printing
        printSorted(userArray, arraySize);
        input.close();
    }

    public static void printSorted(int[] array, int size) {
        System.out.print("Shell Sorted -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("is the Result");
    }
}

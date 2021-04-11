import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        countDown(10);
        int[] test ={6,5,2,6,0,2,6};
        displayArray(mergeSort(test));
    }

    private static void countDown(int x) {
        if (x == 0) {
            System.out.println("YAY!!!");
            return;
        }
        System.out.println(x + "!");
        countDown(x - 1);
    }

    // Given a list of random numbers, sort them in increasing order:
    private static int[] mergeSort(int[] input) {
        if (input.length <= 1) {
            return input;
        } else if (input.length == 2) {
            if (input[0] > input[1]) {
                int[] output = {input[1], input[0]};
                return output;
            } else {
                return input;
            }
        }
        // First, slice the input array into two separate parts:
        int midpoint = input.length / 2;
        int[] leftSubTree = Arrays.copyOfRange(input, 0, midpoint);
        int[] rightSubTree = Arrays.copyOfRange(input, midpoint, input.length);

        // Then, sort the parts:
        leftSubTree = mergeSort(leftSubTree);
        rightSubTree = mergeSort(rightSubTree);

        // Then, put the parts together:
        int[] output = new int[input.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftSubTree.length && j < rightSubTree.length) {
            if (leftSubTree[i] < rightSubTree[j]) {
                output[k] = leftSubTree[i];
                i++;
            } else {
                output[k] = rightSubTree[j];
                j++;
            }
            k++;
        }
        while (i < leftSubTree.length){
            output[k] = leftSubTree[i];
            i++;
            k++;
        }
        while (j < rightSubTree.length){
            output[k] = rightSubTree[j];
            j++;
            k++;
        }
        return output;
    }


    private static void displayArray(int[] array) {
        for (int i : array) {
            System.out.print(i+", ");
        }
        System.out.println();
    }
}

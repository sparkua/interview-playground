package search;

import java.util.Arrays;

public class BinarySearch {

    private static int binarySearch(int[] input, int key) {
        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = input[mid];
            if (midVal > key) {
                high = mid - 1;
            } else if (midVal < key){
                low = mid + 1;
            } else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArr = {8, 12, 12, 15, 30, 55, 60};
        Arrays.sort(intArr);
        System.out.println("Result for" + Arrays.toString(intArr) + ":" + binarySearch(intArr, 12));
    }
}

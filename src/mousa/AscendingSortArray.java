package mousa;

import java.util.Arrays;

public class AscendingSortArray {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 5};
        System.out.println(Arrays.toString(sort(arr)));
    }
    //mousa sort
    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;

        }
        return arr;

    }
}

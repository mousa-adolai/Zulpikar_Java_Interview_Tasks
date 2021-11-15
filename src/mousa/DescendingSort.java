package mousa;

import java.util.Arrays;

public class DescendingSort {

    public static void main(String[] args) {
        int[] a = {6, 3, 7, 1, 0, 3, 6};
        descendingSort(a);
        System.out.println(Arrays.toString(a));
    }

    //insertion sort
    public static void descendingSort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            int selected = a[i];

            for (int j = 0; j < i; j++) {

                if (a[i] > a[j]) {

                    for (int r = i; r > j; r--) {

                        a[r] = a[r - 1];

                    }


                    a[j] = selected;
                }


            }

        }
    }
}


package Praktikum;

import java.util.Arrays;

public class Pertemuan6 {

    static int[] sort(int[] data) {

        int[] arr = new int[data.length];
        System.arraycopy(data, 0, arr, 0, data.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] array = { 3, 1, 2, 3 };
        int[] array1 = new int[3];

        int[] array2 = sort(array);
        System.arraycopy(array2, 0, array1, 0, 3);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}


/*
 * Buat program dengan menginput bilangan 1-100 sebanyak 10 ke dalam array.
 * Lalu hitung banyaknya tiap elemen yang sama 
 */

import java.util.Scanner;

public class Nomor1 {
    public static void inputUser(int[] array) {
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan 10 angka : ");
        for (int i = 0; i < 10; i++) {
            array[i] = data.nextInt();
            if (array[i] < 1 || array[i] > 100) {
                System.out.println("Angka yang diberi harus diantara 1-100");
                inputUser(array);
                break;
            }
        }
        data.close();
    }

    public static boolean checkField(int[] array, int find) {
        boolean checked = false;
        for (int i = 0; i < array.length; i++)
            if (array[i] == find)
                checked = true;
        return checked;
    }

    public static int countField(int[] array, int find) {
        int count = 0;
        for (int x : array) {
            if (x == find)
                count++;
        }
        return count;
    }

    public static int[] filter(int[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] != 0)
                length++;
        int[] filter = new int[length];
        for (int i = 0; i < array.length; i++)
            if (array[i] != 0)
                filter[i] = array[i];
        return filter;
    }

    public static void sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] input = new int[10];
        int countCollect = 0;
        int[] collect = new int[10];
        do {
            inputUser(input);
        } while (input[0] == 0);
        for (int i = 0; i < input.length; i++) {
            if (checkField(collect, input[i])) {
                continue;
            } else {
                collect[countCollect] = input[i];
                countCollect++;
            }
        }
        collect = filter(collect);
        sort(collect);
        for (int x : collect) {
            System.out.println("Elemen " + x + " sebanyak " +
                    countField(input, x));
        }
    }
}

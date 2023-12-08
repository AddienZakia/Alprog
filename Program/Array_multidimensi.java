import java.util.Arrays;
import java.util.Scanner;

public class Array_multidimensi {
    public static void main(String_praktek[] args) {
        Scanner data = new Scanner(System.in);

        int row, column;
        System.out.print("Masukkan jumlah baris : ");
        row = data.nextInt();

        System.out.print("Masukkan jumlah kolom : ");
        column = data.nextInt();

        int[][] matrix = new int[row][column];

        data.close();

        // input matrix, print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + " : ");
                matrix[i][j] = data.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        // print matrix berdasarkan nomor urut
        // int current = 1;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // matrix[i][j] = current;
        // current++;
        // }
        // }

        // for (int[] x : matrix) {
        // System.out.println(Arrays.toString(x));
        // }

        // print matrix biasa
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println(" ");
        // }

    }
}

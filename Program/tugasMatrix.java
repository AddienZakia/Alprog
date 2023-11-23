
/**
 *  Addien Zakia Hidayat
 *  5002231063
 *  Matematika
 */

import java.util.Scanner;

public class tugasMatrix {
    public static void pertambahanMatrix(int[][] matrix_a, int[][] matrix_b) {
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;

        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;

        if (baris_a != baris_b || kolom_a != kolom_b) {
            System.out.println("Tidak bisa melakukan penjumlahan matrix karna ukuran matrix beda");
            return;
        }

        int[][] matrix_baru = new int[baris_a][kolom_a];

        for (int i = 0; i < matrix_baru.length; i++) {
            for (int j = 0; j < matrix_baru[i].length; j++) {
                matrix_baru[i][j] = matrix_a[i][j] + matrix_b[i][j];

                System.out.printf("%5d", matrix_baru[i][j]);
            }

            System.out.println(" ");
        }
    }

    public static void perkalianMatrix(int[][] matrix_a, int[][] matrix_b) {
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;

        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;

        if (kolom_a != baris_b) {
            System.out.println("Perkalian matrix tidak bisa karna kolom matrix A beda dengan baris matrix B");
            return;
        }

        int[][] matrix_baru = new int[baris_a][kolom_b];

        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_b; j++) {
                for (int x = 0; x < kolom_a; x++) {
                    matrix_baru[i][j] += matrix_a[i][x] * matrix_b[x][j];
                }
            }
        }

        printMatrix(matrix_baru);
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        // Matrix A
        int baris_a, kolom_a;
        System.out.print("Masukkan ukuran baris matrix a : ");
        baris_a = data.nextInt();

        System.out.print("Masukkan ukuran kolom matrix a : ");
        kolom_a = data.nextInt();

        int[][] matrix_a = new int[baris_a][kolom_a];

        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_a; j++) {
                System.out.print("Baris " + i + " kolom " + j + " : ");
                matrix_a[i][j] = data.nextInt();
            }
        }

        System.out.println("\nMatrix A");
        printMatrix(matrix_a);

        // Matrix B
        int baris_b, kolom_b;
        System.out.print("\nMasukkan ukuran baris matrix b : ");
        baris_b = data.nextInt();

        System.out.print("Masukkan ukuran kolom matrix b : ");
        kolom_b = data.nextInt();

        int[][] matrix_b = new int[baris_b][kolom_b];

        for (int i = 0; i < baris_b; i++) {
            for (int j = 0; j < kolom_b; j++) {
                System.out.print("Baris " + i + " kolom " + j + " : ");
                matrix_b[i][j] = data.nextInt();
            }
        }

        System.out.println("\nMatrix B");
        printMatrix(matrix_b);

        data.close();

        System.out.println("\nPertambahan Matrix");
        pertambahanMatrix(matrix_a, matrix_b);

        System.out.println("\nPerkalian Matrix");
        perkalianMatrix(matrix_a, matrix_b);
    }
}
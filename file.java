import java.util.Scanner;

/**
 * file testing
 */
public class file {

    public static void main(String_praktek[] args) {
        // int sum = 0, i = 1;

        // while (i < 10) {
        // sum += i;
        // i++;
        // }

        // System.out.println("Sum is " + sum);

        // int sum = 0, i = 1;
        // do {
        // sum += i;
        // i++;
        // } while (i < 10);
        // System.out.println(sum);

        // int i = 0, sum = 0;
        // while (i < 5) {
        // for (int j = 0; j < 6; j++) {
        // System.out.print("Nilai i : " + i + ", Nilai j : " + j + ", Nilai sum : " +
        // sum);
        // sum += i+j;
        // System.out.println(", Hasil : " + sum);
        // }
        // i++;
        // }

        // System.out.println("Total : " + sum);

        // int m, n;
        // Scanner data = new Scanner(System.in);

        // System.out.print("Masukkan ukuran baris Matriks : ");
        // m = data.nextInt();

        // System.out.print("Masukkan ukuran kolom Matriks : ");
        // n = data.nextInt();

        // data.close();

        // for (int i = 0; i <= m; i++) {
        // for (int j = 0; j <= n; j++) {
        // System.out.printf("%4d", i*j);
        // }
        // System.out.println();
        // }

        int kolomA = 0, barisA = 0, kolomB = 0, barisB = 0;
        Scanner data = new Scanner(System.in);

        do {
            System.out.print("Masukkan jumlah kolom matriks A : ");
            kolomA = data.nextInt();

            System.out.print("Masukkan jumlah baris matriks A : ");
            barisA = data.nextInt();

            System.out.print("Masukkan jumlah kolom matriks B : ");
            kolomB = data.nextInt();

            System.out.print("Masukkan jumlah baris matriks B : ");
            barisB = data.nextInt();
        } while (kolomA != kolomB || barisA != barisB);

        data.close();

        int[][] matrixA = new int[kolomA][barisA];
        int[][] matrixB = new int[kolomB][barisB];

        int sum = 0;
        for (int i = 0; i < kolomA; i++) {
            for (int j = 0; j < barisA; j++) {
                matrixA[i][j] = sum;
                System.out.printf("%4d", sum);
                sum++;
            }
            System.out.println();
        }

        System.out.println();

        int sumB = 0;
        for (int i = 0; i < kolomB; i++) {
            for (int j = 0; j < barisB; j++) {
                matrixB[i][j] = sumB;
                System.out.printf("%4d", sumB);
                sumB++;
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < kolomB; i++) {
            for (int j = 0; j < barisB; j++) {
                System.out.printf("%4d", matrixA[i][j] + matrixB[i][j]);
            }
            System.out.println();
        }
    }
}
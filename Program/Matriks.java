import java.util.Scanner;

public class Matriks {
    public static void main(String_praktek[] args) {

        int m, n;
        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan ukuran baris Matriks : ");
        m = data.nextInt();

        System.out.print("Masukkan ukuran kolom Matriks : ");
        n = data.nextInt();

        data.close();

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

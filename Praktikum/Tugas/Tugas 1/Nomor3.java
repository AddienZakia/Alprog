import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        // Program operasi kombinasi minimal 2 macam kombinasi (no 3)
        // Rumus Kombinasi dan Permutasi
        int n, r, kombinasi, permutasi;
        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan nilai n atau nilai seluruh : ");
        n = data.nextInt();

        System.out.print("Masukkan nilai r atau nilai yang dipilih : ");
        r = data.nextInt();

        data.close();

        int atas = 1;
        for (int i = 1; i <= n; i++)
            atas *= i;

        int bawah = 1;
        for (int i = 1; i <= (n - r); i++)
            bawah *= i;

        int bawah_r = 1;
        for (int i = 1; i <= r; i++)
            bawah_r *= i;

        kombinasi = atas / (bawah * bawah_r);
        permutasi = atas / bawah;

        String tulisan = "\nNilai n : " + n +
                "\nNilai r : " + r +
                "\nNilai kombinasi : " + kombinasi +
                "\nNilai permutasi : " + permutasi;

        System.out.println(tulisan);
    }
}

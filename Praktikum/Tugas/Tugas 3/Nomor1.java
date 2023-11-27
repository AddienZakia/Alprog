package Praktikum.Tugas.Tugas3;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {

        /*
         *
         * Buatlah program yang meminta inputan berupa karakter. Kemudian seolah
         * olah system akan mencoba untuk menebak nama yang akan disampaikan,
         * semisal untuk char ‘a’, system akan menyebut ‘Nama anda pasti Andrian’, dst.
         * Buat minimal 2 else if. (minimal menebak 3 karakter) dan gunakan else (misal
         * mengatakan nama anda tidak bisa ditebak)
         * 
         */

        String[] nama = {
                "Abdul",
                "Budi",
                "Citra",
                "Dewi",
                "Eka",
                "Fahmi",
                "Gita",
                "Hadi",
                "Indra",
                "Joko",
                "Kartika",
                "Lia",
                "Mega",
                "Nina",
                "Oscar",
                "Putri",
                "Qori",
                "Rudi",
                "Siti",
                "Toni",
                "Umar",
                "Vina",
                "Wahyu",
                "Xena",
                "Yanti",
                "Zain"
        };

        String huruf;

        Scanner data = new Scanner(System.in);
        System.out.print("\nBerikan minimal 3 character untuk menebak nama (contoh: AWS) : ");

        huruf = data.nextLine();

        data.close();
        if (huruf.length() < 3) {
            System.out.println("Input harus ada minimal 3 karakter");
            return;
        } else {
            String karakter = "Karakter yang kamu pilih yaitu : " +
                    huruf.charAt(0) + ", " + huruf.charAt(1) + ", "
                    + huruf.charAt(2);

            System.out.println(karakter);

            String[] deret_nama = new String[huruf.toCharArray().length];
            for (int i = 0; i < huruf.toCharArray().length; i++) {
                for (String string : nama) {
                    Boolean cek = string.toLowerCase().charAt(0) == huruf.toCharArray()[i];
                    if (cek)
                        deret_nama[i] = string;
                }
            }

            System.out.println("Nama anda pasti diantara " +
                    String.join(", ", deret_nama) + "\n");
        }
    }
}

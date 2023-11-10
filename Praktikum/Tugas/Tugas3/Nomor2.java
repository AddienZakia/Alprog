package Praktikum.Tugas.Tugas3;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {

        /*
         *
         * Buatlah program yang menawarkan perubahan suhu, pertama program akan
         * memberikan skala apa yang dipakai (C/R/F/K) kemudian meminta inputan
         * suhu(int) kemudian menawarkan perubahan ke skala apa, setelah memilih,
         * system akan mengeluarkan hasil perubahan.
         * 
         * 
         */

        double celcius = 0,
                fahrenheit = 0,
                reamur = 0,
                kelvin = 0;

        Scanner data = new Scanner(System.in);

        String kata = "\nPilih skala suhu yang ingin dipakai : ";
        String konversi = "\nPilih skala yang mau diubah : ";
        String pilihan = "1. Celcius" +
                "\n2. Reamur" +
                "\n3. Fahrenheit" +
                "\n4. Kelvin";

        int pil1, pil2;
        do {
            System.out.print(pilihan + kata);
            pil1 = data.nextInt();

            System.out.print(pilihan + konversi);
            pil2 = data.nextInt();

            if (pil1 == pil2) {
                System.out.println("\nSkala yang mau dipakai dan diubah tidak boleh sama\n");
            } else if (pil1 <= 0 || pil2 <= 0 || pil1 > 4 || pil2 > 4) {
                System.out.println("\nPilihan nomor skala tidak tersedia\n");
            }
        } while (pil1 == pil2 || pil1 <= 0 || pil2 <= 0 || pil1 > 4 ||
                pil2 > 4);

        System.out.print("Masukkan suhu yang mau diubah : ");
        double suhu = data.nextInt();

        data.close();

        if (pil1 == 1) {
            if (pil2 == 2)
                reamur = (4.0 / 5) * suhu;
            else if (pil2 == 3)
                fahrenheit = (9.0 / 5) * suhu + 32;
            else if (pil2 == 4)
                kelvin = suhu + 273.15;
        } else if (pil1 == 2) {
            if (pil2 == 1)
                celcius = suhu / 0.8;
            else if (pil2 == 3)
                fahrenheit = (suhu * 2.25) + 32;
            else if (pil2 == 4)
                kelvin = (suhu / 0.8) + 273.15;
        } else if (pil1 == 3) {
            if (pil2 == 1)
                celcius = (suhu - 32) * (5.0 / 9);
            else if (pil2 == 2)
                reamur = (4.0 / 9) * (suhu - 32);
            else if (pil2 == 4)
                kelvin = (suhu + 459.67) * (5.0 / 9);
        } else if (pil1 == 4) {
            if (pil2 == 1)
                celcius = suhu - 273.15;
            else if (pil2 == 2)
                reamur = (4.0 / 5) * (suhu - 273.15);
            else if (pil2 == 3)
                fahrenheit = (suhu * (9.0 / 5)) - 459.67;
        }

        String jenis[] = { "Celcius", "Reamur", "Fahrenheit", "Kelvin" };
        String hasil = "\nProgram Hasil konversi" +
                "\nSuhu " + jenis[pil1 - 1] + " : " + suhu +
                "\nSuhu " + jenis[pil2 - 1] + " : ";

        System.out.print(hasil);

        if (celcius != 0)
            System.out.printf("%.2f", celcius);
        else if (reamur != 0)
            System.out.printf("%.2f", reamur);
        else if (fahrenheit != 0)
            System.out.printf("%.2f", fahrenheit);
        else if (kelvin != 0)
            System.out.printf("%.2f", kelvin);
        System.out.println("\n");
    }
}
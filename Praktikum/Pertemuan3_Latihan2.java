package Praktikum;

import java.util.Scanner;

public class Pertemuan3_Latihan2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        String kata = "1. Kubus" +
                "\n2. Prisma Segiempat" +
                "\n3. Prisma Segitiga" +
                "\n4. Tabung" +
                "\nMasukkan volume bangun yang dimau : ";

        System.out.println(kata);
        int pilihan = data.nextInt();

        data.close();

        if (pilihan == 1) {
            System.out.print("Masukkan rusuk : ");
            int rusuk = data.nextInt();

            System.out.println("Volume kubus : " + Math.pow(rusuk, 3));
        } else if (pilihan == 2) {
            System.out.print("Masukkan sisi alas : ");
            int sisi_alas = data.nextInt();

            System.out.print("Masukkan tinggi : ");
            int tinggi = data.nextInt();

            System.out.println("Volume Prisma Segiempat : " + sisi_alas * sisi_alas * tinggi);
        } else if (pilihan == 3) {
            System.out.print("Masukkan sisi alas : ");
            int sisi_alas = data.nextInt();

            System.out.print("Masukkan tinggi alas : ");
            int tinggi_alas = data.nextInt();

            System.out.print("Masukkan tinggi : ");
            int tinggi = data.nextInt();

            System.out.println("Volume Prisma Segitiga : " + 0.5 * tinggi_alas * sisi_alas * tinggi);
        } else if (pilihan == 4) {
            System.out.print("Masukkan jari jari : ");
            double jari_jari = data.nextInt();

            System.out.print("Masukkan tinggi : ");
            double tinggi = data.nextInt();

            System.out.println("Volume Tabung : " + Math.PI * jari_jari * jari_jari * tinggi);
        } else {
            System.out.println("Pilihan tidak ditemukan");
        }

    }
}

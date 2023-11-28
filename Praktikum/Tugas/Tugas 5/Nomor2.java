/*
* Buat program dengan berbagai method, inti dari program ini adalah
* menyelesaikan tabung, mulai dari luas alas, keliling alas, luas tabung, dan
* volume tabung. Gunakan method-method untuk menyelesaikannya. Dalam
* fungsi main, akan diminta inputan berupa jari-jari dan tinggi.
*/

import java.util.Scanner;

public class Nomor2 {
    static double luasAlas(double r, double t) {
        return Math.PI * Math.pow(r, 2);
    }

    static double kelilingAlas(double r, double t) {
        return 2 * Math.PI * r;
    }

    static double luasTabung(double r, double t) {
        return 2 * Math.PI * r * (r + t);
    }

    static double volumeTabung(double r, double t) {
        return Math.PI * Math.pow(r, 2) * t;
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        double r = 0, t = 0;
        do {
            System.out.print("Masukkan jari-jari : ");
            r = data.nextDouble();

            System.out.print("Masukkan tinggi : ");
            t = data.nextDouble();

            if (r < 0 || t < 0)
                System.out.println("Angka yang diberikan harus berupa bilangan positif");
        } while (r < 0 || t < 0);

        data.close();

        double volume = volumeTabung(r, t);
        double luasPermukaan = luasTabung(r, t);
        double luasAlas = luasAlas(r, t);
        double kelilingAlas = kelilingAlas(r, t);

        String kalimat = "\nProgram mengoperasi rumus bangun ruang tabung" +
                "\nVolume tabung :" + volume +
                "\nLuas permukaan tabung :" + luasPermukaan +
                "\nLuas alas tabung :" + luasAlas +
                "\nKeliling alas tabung :" + kelilingAlas;

        System.out.println(kalimat);
    }
}
package Praktikum;

import java.util.Scanner;

public class Pertemuan5_latihan4 {
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
        } while (r < 0 || t < 0);

        data.close();

        System.out.println("Rumus dari volume tabung adalah : " + volumeTabung(r, t));

    }
}

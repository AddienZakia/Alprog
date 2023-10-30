package Praktikum;

import java.util.Scanner;

public class Pertemuan3 {
    public static void main(String[] args) {
        System.out.print("Masukkan nilai bilangan diantara 0 hingga 100 : ");
        Scanner baca = new Scanner(System.in);

        int bilangan = baca.nextInt();
        if (bilangan > 100)
            System.out.println("Nilai terlalu besar");
        if (bilangan < 0)
            System.out.println("nilai terlalu kecil");
        if (bilangan >= 0 && bilangan <= 100)
            System.out.println("Nilai bilangan sesuai");
    }
}

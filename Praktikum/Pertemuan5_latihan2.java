package Praktikum;

public class Pertemuan5_latihan2 {

    public static boolean lebihBesar(int a, int b) {
        if (a > b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int angka1 = 24;
        int angka2 = 12;
        System.out.println("Apakah angka 1 lebih besar dari angka 2 ? " + lebihBesar(angka1, angka2));
    }
}

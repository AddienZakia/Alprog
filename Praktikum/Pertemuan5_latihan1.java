package Praktikum;

public class Pertemuan5_latihan1 {
    private static void methodTakBerparameter() {
        System.out.println("Ini method tak berparameter");
    }

    private static void methodBerparameter(String s) {
        System.out.println("Hello " + s);
    }

    public static void main(String[] args) {
        System.out.println("Menjalankan method");
        // methodTakBerparameter();
        methodBerparameter("fernando");
    }
}

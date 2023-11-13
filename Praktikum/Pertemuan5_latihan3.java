package Praktikum;

public class Pertemuan5_latihan3 {

    public static int fibonacci(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    public static void main(String[] args) {
        int sukuKe = 5;
        System.out.println("Suku ke " + sukuKe + " dari deret fibonacci adalah " + fibonacci(sukuKe));
    }
}

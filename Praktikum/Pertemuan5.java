package Praktikum;

public class Pertemuan5 {
    public static void main(String[] args) {

        int x = 35;
        int y = 4;
        int dummy = y;
        mulai: while (true) {
            if (y > x) {
                System.out.println("Nilai kelipatan y yang mendekati x adalah " + y);
                break mulai;
            }
            y += dummy;
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2)
                continue;
            System.out.println("i = " + i);
        }
    }
}

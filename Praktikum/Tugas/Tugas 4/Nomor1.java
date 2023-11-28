import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {

        /*
         * Buatlah program yang meminta inputan berupa integer positif. Kemudian
         * program akan menentukan apakah inputan tersebut bilangan prima atau tidak
         */
        Scanner data = new Scanner(System.in);

        int num = 0;

        do {
            System.out.print("Masukkan angka bilangan : ");
            num = data.nextInt();

            if (num < 0) {
                System.out.println("\nAngka bilangan yang diberi harus berupa bilangan positif\n");
            }

        } while (num < 0);

        data.close();

        if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println(num + " merupakan bilangan prima");
        } else if (num > 1 && num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            System.out.println(num + " bukan merupakan bilangan prima");
        } else {
            System.out.println(num + " merupakan bilangan prima");
        }

    }
}

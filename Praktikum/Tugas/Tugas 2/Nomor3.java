import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {

        /*
         *
         * Buatlah program yang meminta inputan berupa tiga kata, kemudian print atau
         * display tiga kata tersebut dengan urutan kata kedua, pertama, dan ketiga
         * 
         */

        String a, b, c;
        Scanner data = new Scanner(System.in);

        System.out.println("Berikan 3 Kata di bawah ini :");
        a = data.next();
        b = data.next();
        c = data.next();

        data.close();

        System.out.println(b + " " + a + " " + c);
    }
}

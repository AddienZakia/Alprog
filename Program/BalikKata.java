import java.util.Scanner;

public class BalikKata {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Kata asli : ");
        String kata = data.nextLine();

        char ch;
        String balik = "";

        for (int i = 0; i < kata.length(); i++) {
            ch = kata.charAt(i);
            balik = ch + balik;
        }

        System.out.println("Balik " + balik);
    }
}

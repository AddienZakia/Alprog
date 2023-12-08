import java.util.Scanner;

public class String_praktek {
    public static void main(String_praktek[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Enter kota 1 : ");
        String kota1 = data.nextLine();

        System.out.print("Enter kota 2 : ");
        String kota2 = data.nextLine();

        System.out.println("kota 1 : " + kota1.length());
        System.out.println("kota 2 : " + kota2.length());
    }
}

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {

        /*
         *
         * Buatlah program yang meminta inputan berupa suhu(int) dalam Celcius
         * kemudian print atau display suhu dalam Reamur, Fahrenheit, dan Kelvin.
         * 
         */

        double celcius, fahrenheit, kelvin, reamur;
        Scanner data = new Scanner(System.in);

        System.out.print("Berikan suhu celcius : ");
        celcius = data.nextDouble();

        data.close();

        fahrenheit = (9.0 / 5) * celcius + 32;
        kelvin = celcius + 273.15;
        reamur = (4.0 / 5) * celcius;

        String kata = "Konversi suhu" +
                "\nSuhu Celcius : " + celcius +
                "\nSuhu Fahrenheit : " + fahrenheit +
                "\nSuhu Kelvin : " + kelvin +
                "\nSuhu Reamur : " + reamur;

        System.out.println();
        System.out.println(kata);
    }
}
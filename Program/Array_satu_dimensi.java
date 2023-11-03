public class Array_satu_dimensi {
    public static void main(String[] args) {

        // Contoh array
        int[] array = { 1, 23, 17, 4, 5, 100 };

        // Cara ngeprint array
        System.out.println("Data ke-1 = " + array[0]);
        System.out.println("Data ke-2 = " + array[1]);
        System.out.println("Data ke-3 = " + array[2]);
        System.out.println("Data ke-4 = " + array[3]);
        System.out.println("Data ke-5 = " + array[4]);
        System.out.println("Data ke-6 = " + array[5]);

        // Cara ngeprint array menggunakan for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println("Data ke-" + (i + 1) + " = " + array[i]);
        }

        // Cara ngeprint array dari awal hingga akhir dan sebaliknya
        for (int i = 0; i < array.length; i++) {
            System.out.println("Data ke-" + (i + 1) + " = " + array[i]);
        }

        System.out.println(" ");

        for (int i = 5; i >= 0; i--) {
            System.out.println("Data ke-" + (i + 1) + " = " + array[i]);
        }

        // Cara print nilai max/terbesar yang ada di array
        double[] data = { 3, 10, 15, 6, 100, 1, 4, 5.0 };

        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i])
                max = data[i];
        }
        System.out.println(max);
    }
}

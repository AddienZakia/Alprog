import java.util.Arrays;

public class urutan {
    public static void main(String_praktek[] args) {

        // geser ke kiri
        int[] a = { 1, 2, 3, 4, 5 };

        int temp = a[0];

        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }

        a[a.length - 1] = temp;

        System.out.println(Arrays.toString(a));

        // geser ke kanan
        int[] ax = { 1, 2, 3, 4, 5 };

        int tmp = ax[ax.length - 1];

        for (int i = ax.length - 1; i >= 1; i--) {
            ax[i] = ax[i - 1];
        }

        ax[0] = tmp;

        System.out.println(Arrays.toString(ax));

    }
}

public class Method {

    static void x(int i, int num) {
        for (int j = 0; j < i; j++) {
            System.err.print(num + " ");
            num *= 2 + j;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            x(i, 2);
            i++;
        }
    }
}

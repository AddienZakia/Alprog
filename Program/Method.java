public class Method {

    static void method(int i, int num) {
        for (int j = 0; j < i; j++) {
            System.err.print(num + " ");
            num *= 2 + j;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            method(i, 2);
            i++;
        }
    }
}

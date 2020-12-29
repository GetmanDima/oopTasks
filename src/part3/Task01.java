package part3;

public class Task01 {

    public static void main(String[] args) {
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));
    }

    private static int solutions(int a, int b, int c) {
        int d = b * b - 4 * a * c;

        if (d > 0) {
            return 2;
        } else if (d == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

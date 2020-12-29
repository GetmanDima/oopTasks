package part4;

public class Task06 {

    public static void main(String[] args) {
        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(4));
    }

    private static int bugger(int n) {
        int l = 0;

        while (n >= 10) {
            int k = n;
            int s = 1;

            while (k > 0) {
                s *= k % 10;
                k /= 10;
            }

            n = s;
            l++;
        }

        return l;
    }
}

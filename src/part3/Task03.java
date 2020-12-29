package part3;

public class Task03 {

    public static void main(String[] args) {
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));
    }

    private static boolean checkPerfect(int x) {
        int sum = 0;

        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }

        return x == sum;
    }
}

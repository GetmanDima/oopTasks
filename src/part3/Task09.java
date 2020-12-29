package part3;

public class Task09 {

    public static void main(String[] args) {
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));
    }

    private static int nextPrime(int n) {

        while (!isPrime(n)) {
            n++;
        }

        return n;
    }

    private static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return n > 1;
    }
}

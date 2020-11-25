package part2;

public class Task06 {

    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(12));
    }

    private static int Fibonacci(int n) {
        n += 1;
        int x = 1;
        int y = 0;

        for (int i = 0; i < n; i++)
        {
            x += y;
            y = x - y;
        }

        return y;
    }
}

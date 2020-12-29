package part3;

public class Task10 {

    public static void main(String[] args) {
        System.out.println(rightTriangle(3, 4, 5));
        System.out.println(rightTriangle(145, 105, 100));
        System.out.println(rightTriangle(70, 130, 110));
    }

    private static boolean rightTriangle(int a, int b, int c) {
        return (a * a == b * b + c * c) ||
                (b * b == a * a + c * c) ||
                (c * c == a * a + b * b);
    }
}

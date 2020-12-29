package part4;

public class Task09 {

    public static void main(String[] args) {
        System.out.println(trouble(1222345, 12345));
        System.out.println(trouble(666789, 12345667));
        System.out.println(trouble(33789, 12345337));
    }

    public static boolean trouble(long a, long b) {
        String n1 = String.valueOf(a);
        String n2 = String.valueOf(b);

        for (int i = 0; i < 10; i++) {
            int findIdx1 = n1.indexOf(String.valueOf(i).repeat(3));
            int findIdx2 = n2.indexOf(String.valueOf(i).repeat(2));

            if (findIdx1 != -1 && findIdx2 != -1) {
                return true;
            }
        }

        return false;
    }
}

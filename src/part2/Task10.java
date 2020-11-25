package part2;

public class Task10 {

    public static void main(String[] args) {
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
        System.out.println(boxSeq(3));
        System.out.println(boxSeq(4));
        System.out.println(boxSeq(5));
        System.out.println(boxSeq(6));
    }

    private static int boxSeq(int step) {
        return (step / 2) * 2 + (step % 2) * 3;
    }
}

package part2;

public class Task05 {

    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
    }

    private static int getDecimalPlaces(String number) {
        int pointIndex = number.indexOf('.');

        if (pointIndex == -1) {
            return 0;
        }

        return number.length() - pointIndex - 1;
    }
}

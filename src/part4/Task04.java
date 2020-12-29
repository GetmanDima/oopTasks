package part4;

public class Task04 {

    public static void main(String[] args) {
        double[] arr = {9, 17, 30, 1.5};
        System.out.println(overTime(arr));

        double[] arr2 = {16, 18, 30, 1.8};
        System.out.println(overTime(arr2));

        double[] arr3 = {13.25, 15, 30, 1.58};
        System.out.println(overTime(arr3));
    }

    private static String overTime(double[] arr) {
        double begin = arr[0];
        double end = arr[1];
        double cost = arr[2];
        double factor = arr[3];

        double salary = (Math.min(end, 17) - begin) * cost + cost * factor * Math.max(0, (end - 17));
        return "$" + ((double) Math.round(salary * 100) /  100);
    }
}

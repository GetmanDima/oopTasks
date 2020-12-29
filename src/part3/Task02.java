package part3;

public class Task02 {

    public static void main(String[] args) {
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));
    }

    private static int findZip(String str) {
        int firstFind = str.indexOf("zip");

        if (firstFind == -1) {
            return -1;
        } else {
            return str.indexOf("zip", firstFind + 1);
        }
    }
}

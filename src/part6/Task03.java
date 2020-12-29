package part6;

public class Task03 {

    public static void main(String[] args) {
        System.out.println(validColor("rgb(0,0,0)"));
        System.out.println(validColor("rgb(0,,0)"));
        System.out.println(validColor("rgb(255,256,255)"));
        System.out.println(validColor("rgba(0,0,0,0.123456789)"));
    }

    private static boolean validColor(String color) {
        // Получаем контент в скобках
        String s = color.substring(color.indexOf("(") + 1, color.indexOf(")"));
        String[] parts = s.split(",");

        // Если пробел после rgb(a)
        if (color.contains(" ("))
            return false;

        // Проверка корректности количества чисел цвета
        if (color.contains("rgba") && parts.length != 4)
            return false;
        else if (color.contains("rgb(") && parts.length != 3)
            return false;

        // Если в аргументе целое число
        int num = 0;
        // Если в аргументе double число
        double dec = 0;

        for (String value : parts) {
            if (value.equals(""))
                return false;
            if (value.contains(".")) {
                dec = Double.parseDouble(value);
            } else {
                num = Integer.parseInt(value);
            }

            if (!color.contains("rgba") && value.contains(".")) {
                return false;
            }

            if (num < 0 || num > 255) {
                return false;
            }

            if (color.contains("rgba") &&
                    (value.contains(".") && dec > 1.0 ||
                            (value.contains(".") && dec < 0))) {
                return false;
            }
        }

        return true;
    }
}

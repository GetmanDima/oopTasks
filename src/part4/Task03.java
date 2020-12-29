package part4;

public class Task03 {

    public static void main(String[] args) {
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));
        System.out.println(toCamelCase("is_modal_open"));
        System.out.println(toSnakeCase("getColor"));
    }

    private static String toCamelCase(String str) {
        boolean isUpperCase = false;
        StringBuilder camelCaseStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_') {
                isUpperCase = true;
                continue;
            }

            if (isUpperCase) {
                camelCaseStr.append(Character.toUpperCase(str.charAt(i)));
                isUpperCase = false;
                continue;
            }

            camelCaseStr.append(str.charAt(i));
        }

        return camelCaseStr.toString();
    }

    private static String toSnakeCase(String str) {
        StringBuilder snakeCaseStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                snakeCaseStr.append("_" + Character.toLowerCase(str.charAt(i)));
                continue;
            }

            snakeCaseStr.append(str.charAt(i));

        }

        return snakeCaseStr.toString();
    }
}

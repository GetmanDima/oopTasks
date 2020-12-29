package part6;

public class Task09 {

    private static int a = 4;

    public static void main(String[] args) {
        System.out.println(formula("6 * 4 = 24"));
        System.out.println(formula("18 / 17 = 2"));
        System.out.println(formula("16 * 10 = 160 = 14 + 120"));
    }

    private static boolean formula(String str) {

        String[] equations = str.split("=");

        for (int i = 0; i < equations.length-1; i++) {
            if (calc(equations[i]) != calc(equations[i+1])) {
                return false;
            }
        }

        return true;
    }

    private static int calc(String str) {
        str = str.replaceAll("[()]", "");
        str = str.replaceAll(" ", "");

        if(str.equals("a")) {
            return a;
        }

        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String[] tokens = str.split("\\*", 2);

            if (tokens.length > 1) {
                return calc(tokens[0]) * calc(tokens[1]);
            }

            tokens = str.split("/", 2);

            if (tokens.length > 1) {
                return calc(tokens[0]) / calc(tokens[1]);
            }

            tokens = str.split("\\+", 2);

            if (tokens.length > 1) {
                return calc(tokens[0]) + calc(tokens[1]);
            }

            tokens = str.split("-", 2);

            if (tokens.length > 1) {
                return calc(tokens[0]) - calc(tokens[1]);
            }

            return 0;
        }
    }
}

package part5;

public class Task07 {

    public static void main(String[] args) {
        System.out.println(numToEng(0));
        System.out.println(numToEng(18));
        System.out.println(numToEng(126));
        System.out.println(numToEng(909));
    }

    private static String numToEng(int n) {
        final String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        final String[] tensWith = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"};

        String s = "";

        // Если 0, то zero
        if (n == 0) {
            return ones[0];
        }

        // Если больше 100. Прибавляем сотни. Если % 100 != 0 то добавляем пробел для десятков
        if (n >= 100) {
            s += ones[n / 100] + " hundred";

            n = n % 100;

            if (n != 0) {
                s += " ";
            }
        }

        // Если > 20, то берем из tens. Иначе если больше 10 и меньше 20, то берем из tensWith
        if (n >= 20) {
            s += tens[n / 10];

            n = n % 10;

            if (n != 0) {
                s += " ";
            }
        }
        else
            if (n >= 10) {
                s += tensWith[n % 10];
                n = 0;
            }

        // Прибавляем единицы
        if (n > 0) {
            s += ones[n];
        }

        return s;
    }
}

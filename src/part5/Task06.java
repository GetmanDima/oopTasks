package part5;

public class Task06 {

    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123456L));
        System.out.println(validateCard(1234567890123452L));
    }

    private static boolean validateCard(long num) {
        String str = String.valueOf(num);
        
        if (str.length() >= 14 && str.length() <= 19) {
            // Получаем последнюю цифру
            int lastDigit = Integer.parseInt(str.substring(str.length() - 1));

            // Удаляем последний символ из строки
            str = str.substring(0, str.length() - 1);

            StringBuilder strBuild = new StringBuilder(str);
            // Переворачиваем строку
            str = strBuild.reverse().toString();

            long sum = 0;

            for (int i = 0; i < str.length(); i++) {
                // Получаем цифру
                int n = Integer.parseInt("" + (str.charAt(i)));
                int f = n;

                // Проверка четности позициии
                if ((i + 1) % 2 != 0) {
                    f = n * 2;

                    // Если больше 10, то f = сумме двух цифр
                    if (f >= 10) {
                        int rest = f / 10;

                        f = f % 10;
                        f = f + rest;
                    }
                }

                // Прибавляем получившееся число к сумме
                sum += f;
            }

            // Если 10 - последняя цифра sum == lastDigit, то true.
            return (10 - ((int) sum % 10)) == lastDigit;
        }

        return false;
    }
}

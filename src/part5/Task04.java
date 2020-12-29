package part5;

public class Task04 {

    public static void main(String[] args) {
        System.out.println(sumDigProd(16, 28));
        System.out.println(sumDigProd(0));
        System.out.println(sumDigProd(1, 2, 3, 4, 5, 6));
    }

    private static int sumDigProd(int... n) {
        int sum = 0;

        // Складываем все числа
        for (int i : n) {
            sum += i;
        }

        // Пока больше 9 (то есть больше 1 цифры)
        while (sum > 9) {
            int mul = 1;

            // Умножаем все цифры
            while (sum > 0) {
                mul *= (sum % 10);
                sum /= 10;
            }

            // Присваиваем сумме результат произвдения
            sum = mul;
        }

        return sum;
    }
}

package part5;

public class Task10 {

    public static void main(String[] args) {
        System.out.println(hexLattice(1));
        System.out.println(hexLattice(7));
        System.out.println(hexLattice(19));
        System.out.println(hexLattice(21));
    }

    private static String hexLattice(int n) {
        // Количество строк в одной половине + центральная строка
        int i = 0;
        // Является ли число центрированным шестиугольным
        boolean isHexLattice = false;

        // Проверка на то что число является центрированным шестиугольным
        // Вычисляем количесто строк в одной половине
        while (3 * i * (i + 1) + 1 <= n) {
            if (3 * i * (i + 1) + 1 == n) {
                isHexLattice = true;
                break;
            }

            i++;
        }
        // Еще прибавляем центральную строку
        i++;

        StringBuilder str = new StringBuilder();

        if (isHexLattice) {
            // Количество o
            int l = i;
            // Количество начальных пробелов
            int m = i;
            StringBuilder subStr;

            for (int j = 0; j < 2 * i - 1; j++) {
                str.append("\n");
                subStr = new StringBuilder();

                // Добавляем начальные пробелы
                for (int k = 1; k < m; k++) {
                    subStr.append(" ");
                }

                str.append(subStr);

                // Добавляем o
                for (int k = 0; k < l; k++) {
                    str.append(" o");
                }

                str.append(subStr).append(" ");

                l += (j < i - 1) ? 1 : -1;
                m += (j < i - 1) ? -1 : 1;
            }

            return str.toString();
        }

        return "Invalid";
    }
}

package part6;

public class Task01 {

    public static void main(String[] args) {
        System.out.println(bell(1));
        System.out.println(bell(2));
        System.out.println(bell(3));
    }

    private static int bell(int n) {
        int[] row = new int[n];

        row[0] = 1;

        // Вычисляем для каждого элемента количество подмножеств и сохраняем в массиве
        // previous хранит предыдущее значение в массиве
        // Количество элементов каждого подмножества вычисляемтся на основе количества подмножеств
        // для предыдущего числа.
        for (int i = 1; i < n; i++) {
            int previous = row[0];
            row[0] = row[i - 1];

            for (int j = 1; j <= i; j++) {
                int curr = row[j];
                row[j] = row[j - 1] + previous;
                previous = curr;
            }
        }

        // возвращаем количество подмножество для требуемого n
        return row[n - 1];
    }
}

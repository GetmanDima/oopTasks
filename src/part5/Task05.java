package part5;

import java.util.Arrays;

public class Task05 {

    public static void main(String[] args) {
        String[] arr1 = new String[] {"toe", "ocelot", "maniac"};
        String[] arr2 = new String[] {"many", "carriage", "emit", "apricot", "animal"};
        String[] arr3 = new String[] {"hoops", "chuff", "bot", "bottom"};

        System.out.println(Arrays.toString(sameVowelGroup(arr1)));
        System.out.println(Arrays.toString(sameVowelGroup(arr2)));
        System.out.println(Arrays.toString(sameVowelGroup(arr3)));
    }

    public static String[] sameVowelGroup(String[] words) {
        // Количество элементов в результирующем массиве
        int count = 0;

        // Получаем гласные в первом слове
        String vow = words[0].replaceAll("[^aeiou]","");

        // Проходимся по словам
        // Цель цикла получить размерность результирующего массива
        for (String word : words) {
            // Оставляем в слове только гласные.
            // Потом заменям все гласные, которые были в первом слове на пустой символ.
            // Если ничего не осталось то увеличиваем count
            if (word.replaceAll("[^aeiou]", "")
                    .replaceAll("[" + vow + "]", "")
                    .length() == 0) {
                count++;
            }
        }

        // Результирующий массив
        String[] res = new String[count];
        int k = 0;

        // Тот же самый цикл. Только уже заполняем массив res
        for (String word : words) {
            if (word.replaceAll("[^aeiou]", "")
                    .replaceAll("[" + vow + "]", "")
                    .length() == 0) {
                res[k] = word;
                k++;
            }
        }

        return res;
    }
}

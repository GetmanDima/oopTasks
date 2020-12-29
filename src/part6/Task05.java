package part6;

import java.util.Arrays;

public class Task05 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHashTags("How the Avocado Became the Fruit of the Global Trade")));
        System.out.println(Arrays.toString(getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year")));
        System.out.println(Arrays.toString(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")));
        System.out.println(Arrays.toString(getHashTags("Visualizing Science")));
    }

    private static String[] getHashTags(String str) {
        // Удаляем запятые.
        // Разбиваем на слова по пробелам.
        str = str.replaceAll(",", "");
        String[] strArr = str.split(" ");

        int maxNum = 0;
        int pos = 0;

        String longestWord = "";
        StringBuilder hashes = new StringBuilder();

        // Если количество слов меньше 3, то каждое слово - хэштег
        // Иначе находим три самых длинных слова и делаем из них хэштеги
        if (strArr.length < 3) {
            for (String word:strArr) {
                hashes.append("#").append(word.toLowerCase()).append(",");
            }
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < strArr.length; j++) {
                    if (strArr[j].length() != maxNum) {
                        if (strArr[j].length() >= maxNum) {
                            maxNum = strArr[j].length();
                            longestWord = strArr[j].toLowerCase();
                            pos = j;
                        }
                    }
                }

                strArr[pos] = " ";
                hashes.append("#").append(longestWord).append(",");
                maxNum = 0;

            }
        }

        String[] res = hashes.toString().split(",");

        return res;
    }
}

package part6;

public class Task02 {

    public static void main(String[] args) {
        System.out.println(translateWord("flag"));
        System.out.println(translateWord("Apple"));
        System.out.println(translateWord("button"));
        System.out.println(translateWord(""));
    }

    private static String translateWord(String word) { // Слово
        if (word.length() == 0) {
            return "";
        }

        char firstChar = word.charAt(0);

        // если первая буква не гласная
        if (isVowel(firstChar, false)) {
            return word + "yay";
        }

        // Если все же гласная то
        // Доходим до следующей гласной
        int i = 1;
        for (; i < word.length(); i++) {
            if (isVowel(word.charAt(i), true)) {
                break;
            }
        }

        // Если в верхнем регистре
        if (Character.isUpperCase(firstChar)) {
            // Если следующей гласной так и не оказалось
            if (i == word.length()) {
                return word + "ay";
            }
            // Если индекс следующей гласной есть, то обрезаем часть строки до гласной
            // и прибавляем в конце
            return Character.toUpperCase(word.charAt(i)) + word.substring(i + 1)
                    + Character.toLowerCase(firstChar) + word.substring(1, i)
                    + "ay";
        }

        // Если в нижнем регистре
        return word.substring(i) + word.substring(0, i) + "ay";
    }

    // Проверка на то что символ гласный
    private static boolean isVowel(char c, boolean isYVowel) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            case 'y', 'Y' -> isYVowel;
            default -> false;
        };
    }
}

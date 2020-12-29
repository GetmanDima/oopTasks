package part6;

public class Task07 {

    public static void main(String[] args) {
        System.out.println(longestNonrepeatingSubstring("abcabcbb"));
        System.out.println(longestNonrepeatingSubstring("aaaaaa"));
        System.out.println(longestNonrepeatingSubstring("abcde"));
        System.out.println(longestNonrepeatingSubstring("abcda"));
    }

    private static String longestNonrepeatingSubstring(String str) {
        // Конечная строка
        String res = "";
        // Текущая последовательность неповторяющихся символов
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            for (int j = i; j < str.length(); j++){
                // Если не символ еще не повторялся, то он прибавляется
                // иначе происходит проверка размерности temp и res.
                // Если размерность res меньше то ему присвоится temp.
                if (!temp.toString().contains(String.valueOf(str.charAt(j)))) {
                    temp.append(str.charAt(j));
                } else {
                    if(temp.length() > res.length()) {
                        res = temp.toString();
                    }

                    temp = new StringBuilder();
                    j = str.length();
                }
            }
        }

        return res;
    }
}

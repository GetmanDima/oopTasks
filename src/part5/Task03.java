package part5;

public class Task03 {

    public static void main(String[] args) {
        System.out.println(canComplete("butl", "beautiful"));
        System.out.println(canComplete("butlz", "beautiful"));
        System.out.println(canComplete("tulb", "beautiful"));
        System.out.println(canComplete("bbutl", "beautiful"));
    }

    private static boolean canComplete(String str, String word) {
        // Количество совпадений str и word
        int count = 0;
        // Для перемещения по str
        int j = 0;

        for (int i = 0; i < word.length(); i++){
            if (str.charAt(j) == word.charAt(i)) {
                count++;
                j++;
            }
        }

        // true, если количество совпадений равно длине str
        return count == str.length();
    }
}

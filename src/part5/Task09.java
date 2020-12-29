package part5;

public class Task09 {

    public static void main(String[] args) {
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(correctTitle("sansa stark, lady of winterfell."));
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));
    }

    private static String correctTitle(String str) {
        str = " " + str.toLowerCase();

        // Делаем каждое слово в строке в нижнем регистре, с первым заглавным символом
        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '-') {
                str = str.substring(0, i + 1) +
                        str.substring(i + 1, i + 2).toUpperCase() +
                        str.substring(i + 2);
            }
        }

        // Приводим ключевые слова полностью к нижнему регистру
        str = str.replaceAll("And ","and ")
                .replaceAll("The ", "the ")
                .replaceAll("The", "the")
                .replaceAll("Of ", "of ")
                .replaceAll("In ","in ")
                .trim();

        return str;
    }
}

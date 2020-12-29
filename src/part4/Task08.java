package part4;

public class Task08 {

    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println(doesRhyme("Sam I am!", "Green eggs and HAM."));
        System.out.println(doesRhyme("You are off to the races", "a splendid day."));
        System.out.println(doesRhyme("and frequently do?", "you gotta move."));
    }

    private static boolean doesRhyme(String str1, String str2) {
        String[] strArr1 = str1.split(" ");
        String[] strArr2 = str2.split(" ");

        String lastWord1 = strArr1[strArr1.length - 1].toLowerCase();
        String lastWord2 = strArr2[strArr2.length - 1].toLowerCase();

        int vowelsCount1 = 0;
        int vowelsCount2 = 0;

        for (int i = 0; i < lastWord1.length(); i++) {
            if (lastWord1.charAt(i) == 'a' ||
                    lastWord1.charAt(i) == 'e' ||
                    lastWord1.charAt(i) == 'i' ||
                    lastWord1.charAt(i) == 'o' ||
                    lastWord1.charAt(i) == 'u' ||
                    lastWord1.charAt(i) == 'y')
            vowelsCount1++;
        }

        for (int i = 0; i < lastWord2.length(); i++) {
            if (lastWord2.charAt(i) == 'a' ||
                    lastWord2.charAt(i) == 'e' ||
                    lastWord2.charAt(i) == 'i' ||
                    lastWord2.charAt(i) == 'o' ||
                    lastWord2.charAt(i) == 'u' ||
                    lastWord2.charAt(i) == 'y')
            vowelsCount2++;
        }

        if (vowelsCount1 == vowelsCount2) {

            for (int i = 0; i < lastWord1.length(); i++) {
                if (lastWord1.charAt(i) == 'a' ||
                        lastWord1.charAt(i) == 'e' ||
                        lastWord1.charAt(i) == 'i' ||
                        lastWord1.charAt(i) == 'o' ||
                        lastWord1.charAt(i) == 'u' ||
                        lastWord1.charAt(i) == 'y') {
                    boolean state = true;

                    for (int j = 0; j < lastWord2.length(); j++) {

                        if (lastWord1.charAt(i) == lastWord2.charAt(j)) {
                            state = false;
                        }
                    }

                    if (state) {
                        return false;
                    }
                }
            }

            return true;
        }

        return false;
    }
}

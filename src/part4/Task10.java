package part4;

public class Task10 {

    public static void main(String[] args) {
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", '$'));
        System.out.println(countUniqueBooks("ZZABCDEF", 'Z'));
    }

    public static int countUniqueBooks(String str, char ch) {
        int k = 0;
        int start = str.indexOf(ch) + 1;
        int end = str.indexOf(ch, start);

        while (end != -1) {
            for (int i = start; i < end; i++) {
                boolean state = true;

                for (int j = start; j < i; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        state = false;
                    }
                }

                if (state) {
                    k++;
                }
            }

            if (end + 1 < str.length()) {
                start = str.indexOf(ch, end + 1) + 1;
            } else {
                start = -1;
            }

            if (start == -1) {
                end = -1;
            } else {
                end = str.indexOf(ch, start);
            }
        }

        return k;
    }
}

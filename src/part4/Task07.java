package part4;

public class Task07 {

    public static void main(String[] args) {
        System.out.println(toStarShorthand("abbccc"));
        System.out.println(toStarShorthand("77777geff"));
        System.out.println(toStarShorthand("abc"));
        System.out.println(toStarShorthand(""));
    }

    private static String toStarShorthand(String str) {
        StringBuilder res = new StringBuilder("");

        if (str.length() > 0) {
            res.append(str.charAt(0));
        }
        
        int k = 1;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                k++;
            } else {
                if (k > 1) {
                    res.append("*");
                    res.append(k);
                }

                res.append(str.charAt(i));
                k = 1;
            }
        }

        if (k > 1) {
            res.append("*");
            res.append(k);
        }

        return res.toString();
    }
}

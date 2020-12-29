package part4;

import java.util.ArrayList;

public class Task02 {

    public static void main(String[] args) {
        System.out.println(split("()()()"));
        System.out.println(split("((()))"));
        System.out.println(split("((()))(())()()(()())"));
        System.out.println(split("((())())(()(()()))"));
    }

    private static ArrayList<String> split(String str) {
        int leftBrackets = 0;
        int rightBrackets = 0;
        String sub = "";
        ArrayList<String> brackets = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                leftBrackets++;
            } else {
                rightBrackets++;
            }

            sub += str.charAt(i);

            if (leftBrackets == rightBrackets) {
                brackets.add(sub);
                sub = "";
                leftBrackets = 0;
                rightBrackets = 0;
            }
        }

        return brackets;
    }
}

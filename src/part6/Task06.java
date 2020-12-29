package part6;

import java.util.ArrayList;

public class Task06 {

    public static void main(String[] args) {
        System.out.println(ulam(4));
        System.out.println(ulam(9));
        System.out.println(ulam(206));
    }

    private static int ulam(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);

        int i, j;

        for (i = 3, j = 2; j < n; i++) {
            int count = 0;

            for (int k = 0; k < arr.size() - 1; k++) {
                for (int l = k + 1; l < arr.size(); l++) {
                    if (arr.get(k) + arr.get(l) == i) {
                        count++;
                    }

                    if (count > 1) {
                        break;
                    }
                }

                if (count > 1) {
                    break;
                }
            }

            if (count == 1) {
                arr.add(i);
                j++;
            }
        }

        return i - 1;
    }
}

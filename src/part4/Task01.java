package part4;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String str = in.nextLine();
        in.close();

        String[] words = str.trim().split(" ");

        int l = 0;

        for (String word : words) {
            l += word.length();

            if (l > k) {
                System.out.print("\n" + word + " ");
                l = word.length();
                continue;
            }

            System.out.print(word + " ");
        }
    }
}

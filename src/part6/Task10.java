package part6;

public class Task10 {

    public static void main(String[] args) {
        System.out.println(palindromeDescendant(11211230));
        System.out.println(palindromeDescendant(13001120));
        System.out.println(palindromeDescendant(23336014));
        System.out.println(palindromeDescendant(11));
    }

    private static boolean palindromeDescendant(int num) {
        while (num > 9) {
            if (isSymmetrical(num)) {
                return true;
            }

            num = getSumOfDigits(num);
        }

        return false;
    }

    // Проверяет число на симметрию с разных концов
    private static boolean isSymmetrical(int num) {
        int reverseNum = 0;
        int n = num;

        if (n < 0) {
            n = n * -1;
        }

        while (n != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + n % 10;
            n = n / 10;
        }

        return reverseNum == num;
    }

    // Складывает каждую цифру числа со следующей цифрой, при этом объединяя в одно число
    // Такие числа позже построчно складываются и преобразуются к int
    private static int getSumOfDigits(int n) {
        String iString = Integer.toString(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iString.length() - 1; i += 2) {
            int i1 = Integer.parseInt(Character.toString(iString.charAt(i)));
            int i2 = Integer.parseInt(Character.toString(iString.charAt(i+1)));
            int num = i1 + i2;

            sb.append(Integer.toString(num));
        }

        return Integer.parseInt(sb.toString());
    }
}

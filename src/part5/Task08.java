package part5;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;


public class Task08 {

    public static void main(String[] args) {
        System.out.println(getSha256Hash("password123"));
        System.out.println(getSha256Hash("Fluffy@home"));
        System.out.println(getSha256Hash("Hey dude!"));
    }

    private static String getSha256Hash(String base) {
        try {
            // Делаем hash из строки. Он записывается в массив hash
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();

            // Перевод в 16-тиричную систему исчисления
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);

                if (hex.length() == 1) {
                    hexString.append('0');
                }

                hexString.append(hex);
            }

            // Переводим StringBuilder в строку
            return hexString.toString();
        }
        catch(Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}

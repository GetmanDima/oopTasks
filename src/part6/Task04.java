package part6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Task04 {

    public static void main(String[] args) {
        String[] arr1 = {};
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2", arr1));

        String[] arr2 = {"b"};
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2", arr2));

        String[] arr3 = {"b"};
        System.out.println(stripUrlParams("https://edabit.com", arr3));
    }

    private static String stripUrlParams(String url, String[] paramsToStrip) {

        // Проверяем, будут ли GET параметры
        if (!url.contains("?"))
            return url;

        // Массив, который будет содержать два элемента в виде строк.
        String[] parts = url.split("\\?");
        // Первый элемент - это первая половина входящего URL-адреса, вплоть до вопросительного знака.
        // И второй элемент - это вторая половина входящего URL-адреса после вопросительного знака
        // Первая половина адреса
        StringBuilder sb = new StringBuilder(parts[0]);

        // Параметры (разбиваются символом &
        String[] params = parts[1].split("&");

        // для хранения параметров по имени (ключ) и значению
        HashMap<String, String> map = new HashMap<>();

        for (String param : params) {
            String[] pair = param.split("=");
            map.put(pair[0], pair[1]);
        }

        // Если передается несколько элементов с одинаковым названием, нам нужен set, чтобы
        // хранить только одно название и одно значение
        LinkedHashSet<String> strip = new LinkedHashSet<>();

        if(paramsToStrip != null) {
            strip.addAll(Arrays.asList(paramsToStrip));
        }

        sb.append("?");
        int k = 1;

        // Оставляем все кроме указанных параметров
        for(String key : map.keySet()) {
            if(!strip.contains(key))
            {
                if(k > 1)
                    sb.append("&");
                sb.append(key).append("=").append(map.get(key));
                k++;
            }
        }

        return sb.toString();
    }
}

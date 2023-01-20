import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fundamentals {
    public String[] mexicanWave(String str){
        String[] strings = IntStream.range(0, str.length())
                .mapToObj(x -> new StringBuilder(str).replace(x, x + 1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                .filter(x -> x.equals(str))
                .toArray(String[]::new);

        return strings;
    }


    public String[] wave(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            list.add(str.substring(0,i)+ Character.toUpperCase(ch)+str.substring(i+1));
        }
        return list.toArray(new String[0]);
    }
    public static String longest(String s1,String s2){
        String s = s1 + s2;
StringBuilder stringBuilder = new StringBuilder();
        IntStream sorted = s.chars().distinct().sorted();
        sorted.forEach(e->stringBuilder.append((char) e));
        String s3 = stringBuilder.toString();
        System.out.println(s3);


        return s;
    }
}

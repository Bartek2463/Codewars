import javax.swing.text.html.parser.Parser;
import java.lang.reflect.Array;
import java.nio.charset.CharsetDecoder;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fundamentals {
    public String[] mexicanWave(String str) {
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
            list.add(str.substring(0, i) + Character.toUpperCase(ch) + str.substring(i + 1));
        }
        return list.toArray(new String[0]);
    }

    public static String longest(String s1, String s2) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = s1 + s2;
        s.chars().sorted().distinct().forEach(e -> stringBuilder.append((char) e));

        return stringBuilder.toString();
    }

    public static int[] sortArray(int[] array) {
        PrimitiveIterator.OfInt iterator = IntStream.of(array).filter(value -> value % 2 == 0).sorted().iterator();

        int[] ints = IntStream.of(array).map(t -> t % 2 == 1 ? t : iterator.nextInt()).toArray();
        for (Integer number : ints) {
            System.out.println(number);
        }

        return ints;

    }


    public static String rangeExtraction(int[] arr) {

        int len = arr.length;
        int idx1=0;
        int idx2=0;
        while (idx1 < len) {
            while (++idx2 < len && arr[idx2] - arr[idx2 - 1] == 1);
            if (idx2 - idx1 > 2) {
                System.out.printf("%s-%s,", arr[idx1], arr[idx2 - 1]);
                idx1 = idx2;
            } else {
                for (; idx1 < idx2; idx1++)
                    System.out.printf("%s,", arr[idx1]);
            }
        }


        return "";
    }

    public static String encode(String word) {
        String s = word.toLowerCase();
        String result = "";

        for (int i=0;i<s.length();++i){
            char c = s.charAt(i);
            result+=s.indexOf(c)==s.lastIndexOf(c)?"(":")";
            System.out.println(s.lastIndexOf(c));
        }
        System.out.println(result);
        return result;
    }
    public static  String encodeStream(String wordl){
        String collect  = wordl.toLowerCase()
                .chars()
                .mapToObj(t -> wordl.indexOf(t) == wordl.lastIndexOf(t) ? "(" : ")")
                .collect(Collectors.joining());
        System.out.println(collect);

        return collect;

    }


}

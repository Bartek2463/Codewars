import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
}

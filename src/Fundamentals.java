import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fundamentals {
    public String[] mexicanWave(String str){

        StringBuilder stringBuilder = new StringBuilder(str);

        String[] strings = IntStream.range(0, str.length())
                .mapToObj(x -> new StringBuilder(str).replace(x, x + 1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                .filter(x -> x.equals(str))
                .toArray(String[]::new);

        return strings;
    }
}

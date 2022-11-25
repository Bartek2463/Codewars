import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fundamentals {
    public String[] mexicanWave(String str){

        Stream<String> stringStream = IntStream.range(0, str.length())
                .mapToObj(x -> new StringBuilder(str).replace(x, x + 1, String.valueOf(str.charAt(x)).toUpperCase()).toString());
        List<String> collect = stringStream.collect(Collectors.toList());

        System.out.println(collect);

        return null;
    }
}

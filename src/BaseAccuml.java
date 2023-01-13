import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BaseAccuml {

    public static String accum (String x){


        String[] split = x.split("");
        String collect = IntStream.range(0, split.length).mapToObj(i -> split[i].toUpperCase() + split[i].toLowerCase().repeat(i))
                .collect(Collectors.joining(""));
        System.out.println(collect);


        IntStream.range(0,split.length).mapToObj(i-> split[i].toUpperCase()+split[i].toLowerCase().repeat(i))
                .collect(Collectors.joining("-"));

        return null;
    }
}

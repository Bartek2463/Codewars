package old;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BaseAccuml {

    public static String accum(String x) {

        String[] split = x.split("");
        String collect = IntStream.range(0, split.length)
                .mapToObj(i -> split[i].toUpperCase() + split[i].toLowerCase().repeat(i))
                .collect(Collectors.joining("-"));
        System.out.println(collect);
        return collect;
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;


        switch (humanYears) {
            default:
                catYears = 4 * humanYears - 2;
                dogYears = 4 * humanYears;
            case 2:
                catYears += 15;
                dogYears += 15;
            case 1:
                catYears += 9;
                dogYears += 9;
        }

        return new int[]{humanYears, catYears, dogYears};
    }

    public static int square(int n) {
         return n*n;
    }

}
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CharProblem {

    public static int howOld(final String herOld){

        String s = herOld.replaceAll("[^0-9]", "");
       return Integer.parseInt(s);

    }
}


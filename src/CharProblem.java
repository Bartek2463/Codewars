import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CharProblem {

    public static int howOld(final String herOld){

    return Character.getNumericValue(herOld.charAt(0));

    }

    public static String correct(String string){

       return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }
}


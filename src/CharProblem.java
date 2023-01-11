import java.util.Arrays;
import java.util.stream.IntStream;

public class CharProblem {

    public static int howOld(final String herOld){

    return Character.getNumericValue(herOld.charAt(0));

    }

    public static String correct(String string){

       return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }

    public int stray(int[]numbers){

      Arrays.sort(numbers);
      return numbers[0]==numbers[1]?numbers[numbers.length-1]: numbers[0];
    }
}


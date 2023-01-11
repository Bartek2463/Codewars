public class CharProblem {

    public static int howOld(final String herOld){

    return Character.getNumericValue(herOld.charAt(0));

    }

    public static String correct(String string){

       return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }

    public int stray(int[]numbers){

        for (Integer number: numbers) {
            System.out.println(number);
        }
        return 0;
    }
}


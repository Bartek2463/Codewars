package fighters;

import java.util.Arrays;

public class PigLatin {
    public static String pigIt(String str) {

        String $2$1ay = str.replaceAll("(\\w)(\\w*)", "$2$1ay");
        System.out.println($2$1ay);
        return $2$1ay;
    }

    public static int[] solution(int[] arr1) {
        Arrays.sort(arr1);
        for (Integer sort : arr1) {
            System.out.println(sort);
        }

        int maxdisize = arr1[arr1.length - 1] - arr1[0];
        int minsize = arr1[1] - arr1[0];

        return new int[]{minsize, maxdisize};
    }
}

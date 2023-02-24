package jump;

import java.util.Arrays;

public class Solution {

    public static double solution(int[] arr1, int[] arr2) {

        double dif = 0;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println((Math.pow((arr1[i] - arr2[i]), 2)));
        }
        return dif / arr1.length;
    }

}

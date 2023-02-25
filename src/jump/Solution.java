package jump;

public class Solution {

    public static double solution(int[] arr1, int[] arr2) {

        int dns = 0;
        for (int i = 0; i < arr1.length; i++) {
            dns += Math.pow(Math.abs(arr1[i] - arr2[i]), 2);
        }
        System.out.println(dns / arr1.length);
        return dns / arr1.length;
    }


    public static String rot13(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {

            char c = message.charAt(i);
            if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            stringBuilder.append(c);

        }

        String s = stringBuilder.toString();
        System.out.println(s);
        return s;
    }
}

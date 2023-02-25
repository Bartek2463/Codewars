package old;

public class FristNonConsecutive {
    public static void main(String[] args) {
     //   System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
     solution("samurai", "mu");
    }

    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                return array[i];
            }
        }
        return null;
    }
    public static boolean solution(String str,String ending){

        boolean b = str.endsWith(ending);
        boolean b1 = str.startsWith(ending);
        System.out.println(b1);
        System.out.println(b);


        return true;
    }
}
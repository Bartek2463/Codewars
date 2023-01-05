public class FristNonConsecutive {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
    }

    static Integer find(final int[] array) {
        int findnumber = 0;
        for (int i = 0; i < array.length - 1; i++) {
            findnumber = array[i + 1] - array[i];
            if (findnumber > 1) {
                return array[i + 1];
            }

        }
        return null;
    }
}
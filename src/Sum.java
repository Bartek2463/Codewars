import java.util.stream.IntStream;

public class Sum {
    public static void main(String[] args) {
        System.out.println(GetSum(10, 2));
    }

    public static int GetSum(int a, int b) {
        int c = 0;
        for(int i = Math.min(a,b);i<=Math.max(a,b);i++){
            c=+i;
        }
        return a==b?a:c;
    }
}

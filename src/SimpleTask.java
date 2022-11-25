import java.util.Arrays;
import java.util.stream.IntStream;

public class SimpleTask {

    public String makeComplement(String dna) {

        return dna.replace("A", "Z")
                .replace("T", "A")
                .replace("Z", "T")
                .replace("G", "Z")
                .replace("C", "G")
                .replace("Z", "C");
    }

    public int sum(int[]numbers){
        int sum = 0;
        if (numbers==null||numbers.length==1||numbers.length==0){
            sum=0;
        }else {
            int min = Arrays.stream(numbers).min().getAsInt();
            int max = Arrays.stream(numbers).max().getAsInt();
            sum = Arrays.stream(numbers).sum() - min - max;
        }
        System.out.println(sum);
            return sum;
        }
}
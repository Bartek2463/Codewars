import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    public int sum(int[] numbers) {
        int sum = 0;
        if (numbers == null || numbers.length == 1 || numbers.length == 0) {
            sum = 0;
        } else {
            int min = Arrays.stream(numbers).min().getAsInt();
            int max = Arrays.stream(numbers).max().getAsInt();
            sum = Arrays.stream(numbers).sum() - min - max;
        }
        System.out.println(sum);
        return sum;
    }

    /**
     * Mexican Wave
     */
    public String[] mexicanWave(String str) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            list.add(str.substring(0, i) + Character.toUpperCase(ch) + str.substring(i + 1));
        }

        return list.toArray(new String[0]);
    }

}


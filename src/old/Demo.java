package old;

import java.util.*;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(20, 30);
        intStream.forEach(System.out::println);
    }
}
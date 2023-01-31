import java.util.Arrays;
import java.util.stream.IntStream;

public class FindDivisor {
    public static long numberOfDivison(int n) {
   long counter=0;
   for(int i=1;i<=n;i++){
       if(n%i==0){
           counter++;
       }
   }
return counter;
    }
    public static int findSmallestInt(int[]args){
        Arrays.sort(args);
    return args[0];
    }
}

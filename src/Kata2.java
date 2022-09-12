/**
 * return word turn around
 */
public class Kata2 {
    public static void main(String[] args) {
        System.out.println(turnAround("Java"));
    }
    public static String turnAround(String input){
        return  new StringBuilder(input).reverse().toString();
    }
}

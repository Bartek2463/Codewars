import java.util.Arrays;
import java.util.regex.Matcher;

public class Banjo {
    public static void main(String[] args) {

     //   areYouPlayingBanjo("ricy");
fakeBin("9123456789");

    }

    public static String areYouPlayingBanjo(String name) {

        return name.startsWith("R") || name.startsWith("r") ? name + "plays banjo" : name + "does not play banjo";
    }

    public static String[] stringToArray(String s){

        return  s.split(" ");

    }
    public static String fakeBin(String numberString){

        String s = numberString.replaceAll("[0-4]", "0");
        return s.replaceAll("[^0]", "1");
    }

}
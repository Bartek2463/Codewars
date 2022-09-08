/**
 * You are going to be given a word. Your job is to return the middle character of the word.
 * If the word's length is odd, return the middle character. If the word's length is even,
 * return the middle 2 characters.
 */


public class Kata1 {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
    }

    public static String getMiddle(String word) {

        String s="";
        if (word.length() % 2 == 0) {


            s = word.substring(word.length()/2-1,word.length()/2+1);
        } else {
             s = String.valueOf(word.charAt(word.length()/2));
        }
        return s;

    }

}
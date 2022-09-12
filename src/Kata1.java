/**
 * You are going to be given a word. Your job is to return the middle character of the word.
 * If the word's length is odd, return the middle character. If the word's length is even,
 * return the middle 2 characters.
 */


public class Kata1 {
    public static void main(String[] args) {
        System.out.println(getMiddle("qwertyui"));
    }

    public static String getMiddle(String word) {
        int length = word.length();
        System.out.println(length);
        return (word.length()%2==0)?word.substring(length/2-1,length/2+1):String.valueOf(word.charAt(length/2));
    }

}
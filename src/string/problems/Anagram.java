package string.problems;
import java.util.Arrays;
/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    String mary, army, cat, act;

    String x = "cat";
    String y = "act";
    boolean i = Anagram.isAnagram(x,y);

        if (i==true){
            System.out.println("\""+x+"\" and \""+y+"\" is Anagram.");
        }else{System.out.println(x+" and "+y+" is not Anagram.");}

    }

    public static boolean isAnagram(String v1, String v2) {

        if (v1.length() != v2.length()) {
            return false;
        }
        v1 = v1.toUpperCase();
        v2 = v2.toUpperCase();
        char[] p1 = v1.toCharArray();
        Arrays.sort(p1);
        char[] p2 = v2.toCharArray();
        Arrays.sort(p2);

        return Arrays.equals(p1, p2);
    }
}
